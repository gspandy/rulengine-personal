package com.personal.rulengine.mamager.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.personal.rulengine.common.utils.JsonUtils;
import com.personal.rulengine.mamager.controller.result.ResultInfo;
import com.personal.rulengine.mamager.controller.result.ResultInfoUtil;
import com.personal.rulengine.mamager.controller.result.ResultSuccessInfo;
import com.personal.rulengine.server.api.ITestEntityService;


/**
 * TestEntityController测试类
 * 
 * @author LiuBao
 * @version 1.0.0
 * @Date 2016年3月24日
 * 
 */
public class TestEntityControllerTest extends BaseTestController {

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    @Autowired
    private ITestEntityService iTestEntityService;

    @Test
    public void testGetTotalCount() throws Exception {
        String uuid="C29DE4EE-15DE-44FB-AD39-6314CF1341E5";
        Map<String, String> params = new HashMap<>();
        params.put("uuid", uuid);
        
        long totalCount = iTestEntityService.getTotalCount();
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("totalCount", totalCount);
        ResultInfo setSuccessInfo = ResultInfoUtil.setSuccessInfo(totalCount);

        mockMvc.perform(
                post("/test/getTotalCount/0?uuid="+uuid).header("content-type",
                        CONTENT_TYPE_JSON).content(JsonUtils.toJson(params)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(CONTENT_TYPE_JSON))
                .andExpect(content().encoding(CONTENT_ENCODE))
                .andExpect(content()
                .string(JsonUtils.toJson(((ResultSuccessInfo)setSuccessInfo).getResult())));
                //.string(JsonUtils.toJson(totalCount)));
        Assert.assertTrue(true);
    }
    
    /**
     * 方式三
     */
    @Test
    public void testUploadFileController3() throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("key", "value");
        String fileField="file";
        String fileName="record.txt";
        String fileType="text/plain";
        //String fileType="application/octet-stream";
        String filePath="D:\\temp\\record.txt";
        
        //头 
        String boundaryBegin = BOUNDARY; 
        //中 
        StringBuffer resSB = new StringBuffer(); 
        resSB.append("--"+boundaryBegin);
        
        resSB.append("\r\n");
        resSB.append("Content-Disposition: form-data; name=")
                .append("source").append("\r\n").append("\r\n")
                .append("-1").append("\r\n")
                .append("--")
                .append(boundaryBegin).append("\r\n"); 

        //尾 
        String boundaryEnd = "\r\n--" + BOUNDARY + "--\r\n"; 
        
        resSB.append("Content-Disposition: form-data; name=")
                 .append(fileField).append("; filename=")
                 .append(fileName).append("\r\n").append("Content-Type: ")
                 .append(fileType).append("\r\n\r\n");
        
        //读取文件上传到服务器
        File file=new File(filePath);
        FileInputStream fileInputStream=new FileInputStream(file);
        byte[]bytes=new byte[1024];
        int numReadByte=0;
        while ((numReadByte = fileInputStream.read(bytes, 0, 1024)) > 0) {
            //out.write(bytes, 0, numReadByte);
            resSB.append(new String(bytes,0, numReadByte));
        }
        
        fileInputStream.close();
        //3.最后写结尾 
        resSB.append(boundaryEnd);
        resSB.append(boundaryEnd);
		
        mockMvc.perform(post("/record/upload_txt_file/0")
                    .header("content-type", CONTENT_TYPE_FILE)
                    .header("Charsert", "UTF-8")
                    .content(resSB.toString().getBytes("UTF-8")))
                        .andExpect(status().isOk())
                        .andExpect(content().contentType("application/json"))
                        .andExpect(content().encoding(CONTENT_ENCODE))
                        .andExpect(content().string(new SuccessResultMatcher()));
        Assert.assertTrue(true);
    }
    

    
}


class SuccessResultMatcher extends BaseMatcher<String> {
    
    @Override
    public boolean matches(Object item) {
        String response = (String) item;
        assertNotNull(response);
        assertTrue(StringUtils.isNotEmpty(response));

        ResultSuccessInfo resultSuccessInfo = JsonUtils.fromJson(
                ResultSuccessInfo.class, response);

        assertNotNull(resultSuccessInfo);
        assertEquals("0", resultSuccessInfo.getErrorCode());

        Object resultObj = resultSuccessInfo.getResult();

        assertNotNull(resultObj);
        return true;
    }

    @Override
    public void describeTo(Description description) {
        description.appendValue(String.class);
    }
}
