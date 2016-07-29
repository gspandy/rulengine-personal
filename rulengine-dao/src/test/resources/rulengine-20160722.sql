/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50542
Source Host           : localhost:3306
Source Database       : rulengine

Target Server Type    : MYSQL
Target Server Version : 50542
File Encoding         : 65001

Date: 2016-07-22 21:31:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_active_rule
-- ----------------------------
DROP TABLE IF EXISTS `t_active_rule`;
CREATE TABLE `t_active_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '关联主键',
  `rule_id` int(11) NOT NULL COMMENT '规则条件编号',
  `activity_id` int(11) NOT NULL COMMENT '所属活动配置',
  `logic_mark` varchar(16) NOT NULL DEFAULT '1' COMMENT '逻辑符号(1：&&，2：|| )',
  `var_value` varchar(256) DEFAULT NULL COMMENT '变量取值',
  `order_id` tinyint(4) DEFAULT '1' COMMENT '排序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=328 DEFAULT CHARSET=utf8 COMMENT='活动规则条件关联表';

-- ----------------------------
-- Records of t_active_rule
-- ----------------------------
INSERT INTO `t_active_rule` VALUES ('5', '2', '4', '1', '4', '1');
INSERT INTO `t_active_rule` VALUES ('42', '1', '2', '1', '80000', '2');
INSERT INTO `t_active_rule` VALUES ('43', '23', '2', '1', '1,20201', '1');
INSERT INTO `t_active_rule` VALUES ('44', '3', '2', '1', '0', '1');
INSERT INTO `t_active_rule` VALUES ('47', '3', '1', '1', '80000', '2');
INSERT INTO `t_active_rule` VALUES ('48', '23', '1', '1', '1,20201', '1');
INSERT INTO `t_active_rule` VALUES ('88', '2', '8', '1', '402', '1');
INSERT INTO `t_active_rule` VALUES ('89', '2', '7', '1', '401', '1');
INSERT INTO `t_active_rule` VALUES ('91', '2', '6', '1', '201', '1');
INSERT INTO `t_active_rule` VALUES ('141', '2', '15', '1', '30305', '1');
INSERT INTO `t_active_rule` VALUES ('142', '2', '11', '1', '30308', '1');
INSERT INTO `t_active_rule` VALUES ('143', '24', '11', '1', '1', '2');
INSERT INTO `t_active_rule` VALUES ('144', '2', '13', '1', '30308', '1');
INSERT INTO `t_active_rule` VALUES ('145', '24', '13', '1', '3', '2');
INSERT INTO `t_active_rule` VALUES ('148', '27', '32', '1', '40000', '1');
INSERT INTO `t_active_rule` VALUES ('149', '26', '32', '1', '49999', '2');
INSERT INTO `t_active_rule` VALUES ('150', '2', '32', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('151', '27', '31', '1', '30000', '1');
INSERT INTO `t_active_rule` VALUES ('152', '26', '31', '1', '39999', '2');
INSERT INTO `t_active_rule` VALUES ('153', '2', '31', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('154', '27', '30', '1', '20000', '1');
INSERT INTO `t_active_rule` VALUES ('155', '26', '30', '1', '29999', '2');
INSERT INTO `t_active_rule` VALUES ('156', '2', '30', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('157', '27', '29', '1', '10000', '1');
INSERT INTO `t_active_rule` VALUES ('158', '26', '29', '1', '19999', '2');
INSERT INTO `t_active_rule` VALUES ('159', '2', '29', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('160', '27', '28', '1', '5001', '1');
INSERT INTO `t_active_rule` VALUES ('161', '26', '28', '1', '9999', '2');
INSERT INTO `t_active_rule` VALUES ('162', '2', '28', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('163', '27', '27', '1', '1001', '1');
INSERT INTO `t_active_rule` VALUES ('164', '26', '27', '1', '5000', '2');
INSERT INTO `t_active_rule` VALUES ('165', '2', '27', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('166', '27', '26', '1', '501', '1');
INSERT INTO `t_active_rule` VALUES ('167', '26', '26', '1', '1000', '2');
INSERT INTO `t_active_rule` VALUES ('168', '2', '26', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('169', '27', '25', '1', '401', '1');
INSERT INTO `t_active_rule` VALUES ('170', '26', '25', '1', '500', '2');
INSERT INTO `t_active_rule` VALUES ('171', '2', '25', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('172', '27', '24', '1', '301', '1');
INSERT INTO `t_active_rule` VALUES ('173', '26', '24', '1', '400', '2');
INSERT INTO `t_active_rule` VALUES ('174', '2', '24', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('175', '27', '23', '1', '201', '1');
INSERT INTO `t_active_rule` VALUES ('176', '26', '23', '1', '300', '2');
INSERT INTO `t_active_rule` VALUES ('177', '2', '23', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('178', '27', '22', '1', '101', '1');
INSERT INTO `t_active_rule` VALUES ('179', '26', '22', '1', '200', '2');
INSERT INTO `t_active_rule` VALUES ('180', '2', '22', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('181', '27', '21', '1', '51', '1');
INSERT INTO `t_active_rule` VALUES ('182', '26', '21', '1', '100', '2');
INSERT INTO `t_active_rule` VALUES ('183', '2', '21', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('184', '27', '20', '1', '41', '1');
INSERT INTO `t_active_rule` VALUES ('185', '26', '20', '1', '50', '2');
INSERT INTO `t_active_rule` VALUES ('186', '2', '20', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('187', '27', '19', '1', '31', '1');
INSERT INTO `t_active_rule` VALUES ('188', '26', '19', '1', '40', '2');
INSERT INTO `t_active_rule` VALUES ('189', '2', '19', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('190', '27', '18', '1', '21', '1');
INSERT INTO `t_active_rule` VALUES ('191', '26', '18', '1', '30', '2');
INSERT INTO `t_active_rule` VALUES ('192', '2', '18', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('193', '27', '17', '1', '11', '1');
INSERT INTO `t_active_rule` VALUES ('194', '26', '17', '1', '20', '2');
INSERT INTO `t_active_rule` VALUES ('195', '2', '17', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('199', '27', '16', '1', '1', '1');
INSERT INTO `t_active_rule` VALUES ('200', '26', '16', '1', '10', '2');
INSERT INTO `t_active_rule` VALUES ('201', '2', '16', '1', '30303', '3');
INSERT INTO `t_active_rule` VALUES ('209', '28', '34', '1', 'RZHY', '1');
INSERT INTO `t_active_rule` VALUES ('210', '28', '35', '1', 'CXBAO', '1');
INSERT INTO `t_active_rule` VALUES ('211', '28', '36', '1', 'GZCXH', '1');
INSERT INTO `t_active_rule` VALUES ('212', '28', '37', '1', 'ACBX', '1');
INSERT INTO `t_active_rule` VALUES ('213', '28', '38', '1', 'GCNF', '1');
INSERT INTO `t_active_rule` VALUES ('214', '28', '39', '1', 'CARNO', '1');
INSERT INTO `t_active_rule` VALUES ('215', '28', '40', '1', 'SCXF', '1');
INSERT INTO `t_active_rule` VALUES ('216', '28', '41', '1', 'SCPJ', '1');
INSERT INTO `t_active_rule` VALUES ('217', '28', '42', '1', 'GXQTX', '1');
INSERT INTO `t_active_rule` VALUES ('218', '28', '43', '1', 'XYRZ', '1');
INSERT INTO `t_active_rule` VALUES ('219', '28', '44', '1', 'MRQD', '1');
INSERT INTO `t_active_rule` VALUES ('220', '28', '45', '1', 'CZDTW', '1');
INSERT INTO `t_active_rule` VALUES ('221', '28', '46', '1', 'CZDHD', '1');
INSERT INTO `t_active_rule` VALUES ('222', '28', '47', '1', 'SPPJ', '1');
INSERT INTO `t_active_rule` VALUES ('226', '1', '10', '1', '100000', '1');
INSERT INTO `t_active_rule` VALUES ('227', '3', '10', '1', '0', '2');
INSERT INTO `t_active_rule` VALUES ('228', '2', '10', '1', '20201', '3');
INSERT INTO `t_active_rule` VALUES ('229', '3', '9', '1', '100000', '1');
INSERT INTO `t_active_rule` VALUES ('230', '2', '9', '1', '20201', '2');
INSERT INTO `t_active_rule` VALUES ('231', '28', '50', '1', 'CXBAO', '1');
INSERT INTO `t_active_rule` VALUES ('232', '28', '51', '1', 'GZCXH', '1');
INSERT INTO `t_active_rule` VALUES ('233', '2', '12', '1', '5', '1');
INSERT INTO `t_active_rule` VALUES ('234', '24', '12', '1', '2', '2');
INSERT INTO `t_active_rule` VALUES ('235', '2', '33', '1', '30320', '1');
INSERT INTO `t_active_rule` VALUES ('236', '28', '52', '1', 'CXBAO', '1');
INSERT INTO `t_active_rule` VALUES ('237', '28', '53', '1', 'GZCXH', '1');
INSERT INTO `t_active_rule` VALUES ('238', '29', '53', '1', '25', '2');
INSERT INTO `t_active_rule` VALUES ('239', '28', '54', '1', 'GZCXH', '1');
INSERT INTO `t_active_rule` VALUES ('240', '29', '54', '1', '26', '2');
INSERT INTO `t_active_rule` VALUES ('241', '28', '55', '1', 'GZCXH', '1');
INSERT INTO `t_active_rule` VALUES ('242', '29', '55', '1', '27', '2');
INSERT INTO `t_active_rule` VALUES ('243', '28', '56', '1', 'GZCXH', '1');
INSERT INTO `t_active_rule` VALUES ('244', '29', '56', '1', '28', '2');
INSERT INTO `t_active_rule` VALUES ('245', '28', '57', '1', 'GZCXH', '1');
INSERT INTO `t_active_rule` VALUES ('246', '29', '57', '1', '32', '2');
INSERT INTO `t_active_rule` VALUES ('247', '4', '49', '1', '1', '1');
INSERT INTO `t_active_rule` VALUES ('248', '28', '49', '1', 'CXHXF', '2');
INSERT INTO `t_active_rule` VALUES ('249', '28', '58', '1', 'GCS', '1');
INSERT INTO `t_active_rule` VALUES ('258', '28', '48', '1', 'TJXR', '1');
INSERT INTO `t_active_rule` VALUES ('259', '28', '61', '1', 'ZCS', '1');
INSERT INTO `t_active_rule` VALUES ('260', '31', '62', '1', '10000', '1');
INSERT INTO `t_active_rule` VALUES ('261', '32', '62', '1', '10000', '2');
INSERT INTO `t_active_rule` VALUES ('262', '31', '63', '1', '5000', '1');
INSERT INTO `t_active_rule` VALUES ('263', '32', '63', '1', '5000', '2');
INSERT INTO `t_active_rule` VALUES ('270', '31', '64', '1', '1000', '1');
INSERT INTO `t_active_rule` VALUES ('271', '32', '64', '1', '1000', '3');
INSERT INTO `t_active_rule` VALUES ('272', '28', '59', '1', 'CLB', '1');
INSERT INTO `t_active_rule` VALUES ('273', '2', '60', '1', '20205', null);
INSERT INTO `t_active_rule` VALUES ('274', '4', '60', '1', '1', null);
INSERT INTO `t_active_rule` VALUES ('275', '5', '60', '1', '474,473,476,475,478,477,461,479,462,463,464,465,467,470,468,471,469,472', null);
INSERT INTO `t_active_rule` VALUES ('276', '37', '67', '1', '5000', null);
INSERT INTO `t_active_rule` VALUES ('277', '34', '68', '1', '0003', null);
INSERT INTO `t_active_rule` VALUES ('278', '38', '68', '1', '5', null);
INSERT INTO `t_active_rule` VALUES ('279', '39', '68', '1', '4000', null);
INSERT INTO `t_active_rule` VALUES ('280', '40', '68', '1', '3000', null);
INSERT INTO `t_active_rule` VALUES ('281', '34', '69', '1', '0002', null);
INSERT INTO `t_active_rule` VALUES ('282', '2', '14', '2', '105', null);
INSERT INTO `t_active_rule` VALUES ('283', '39', '69', '1', '2000', null);
INSERT INTO `t_active_rule` VALUES ('284', '40', '69', '1', '1000', null);
INSERT INTO `t_active_rule` VALUES ('285', '34', '70', '1', '0001', null);
INSERT INTO `t_active_rule` VALUES ('286', '35', '70', '2', '8', null);
INSERT INTO `t_active_rule` VALUES ('287', '36', '70', '2', '5000', null);
INSERT INTO `t_active_rule` VALUES ('288', '37', '70', '1', '8000', null);
INSERT INTO `t_active_rule` VALUES ('300', '34', '72', '1', '0001', null);
INSERT INTO `t_active_rule` VALUES ('303', '34', '74', '1', '0003', null);
INSERT INTO `t_active_rule` VALUES ('312', '34', '77', '1', '0001', null);
INSERT INTO `t_active_rule` VALUES ('313', '2', '5', '1', '20205', null);
INSERT INTO `t_active_rule` VALUES ('314', '4', '5', '1', '1', null);
INSERT INTO `t_active_rule` VALUES ('315', '5', '5', '1', '571,570,531,530,535,534,533,532,539,574,575,538,572,537,573,536,578,579,576,577,580,582,581,540,542,541,544,543,546,545,548,583,547,584,585,549,586,558,559,556,557,554,555,552,553,550,551,560,524,569,565,566,529,567,568,561,526,562,525,563,528,564,527', null);
INSERT INTO `t_active_rule` VALUES ('321', '34', '71', '1', '0001', null);
INSERT INTO `t_active_rule` VALUES ('322', '35', '71', '2', '3', null);
INSERT INTO `t_active_rule` VALUES ('323', '36', '71', '2', '2000', null);
INSERT INTO `t_active_rule` VALUES ('324', '37', '71', '2', '3000', null);
INSERT INTO `t_active_rule` VALUES ('327', '34', '73', '1', '0002', null);

-- ----------------------------
-- Table structure for t_active_var_value
-- ----------------------------
DROP TABLE IF EXISTS `t_active_var_value`;
CREATE TABLE `t_active_var_value` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '变量值主键',
  `act_exec_id` int(11) NOT NULL COMMENT '活动执行编码',
  `stgy_var_id` int(11) NOT NULL COMMENT '关联策略变量编码',
  `var_value` varchar(256) NOT NULL COMMENT '活动变量值（填写到计算公式中的参数）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_act_exec_var` (`act_exec_id`,`stgy_var_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=190 DEFAULT CHARSET=utf8 COMMENT='活动变量值表（关联到策略找到对应的变量）';

-- ----------------------------
-- Records of t_active_var_value
-- ----------------------------
INSERT INTO `t_active_var_value` VALUES ('1', '4', '1', '100');
INSERT INTO `t_active_var_value` VALUES ('15', '22', '1', '8000');
INSERT INTO `t_active_var_value` VALUES ('17', '24', '2', '0.1');
INSERT INTO `t_active_var_value` VALUES ('36', '49', '9', '3');
INSERT INTO `t_active_var_value` VALUES ('37', '50', '9', '1');
INSERT INTO `t_active_var_value` VALUES ('39', '52', '9', '10');
INSERT INTO `t_active_var_value` VALUES ('67', '80', '9', '50000');
INSERT INTO `t_active_var_value` VALUES ('68', '81', '10', '3000');
INSERT INTO `t_active_var_value` VALUES ('69', '82', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('71', '86', '9', '100');
INSERT INTO `t_active_var_value` VALUES ('72', '87', '9', '200');
INSERT INTO `t_active_var_value` VALUES ('73', '88', '9', '300');
INSERT INTO `t_active_var_value` VALUES ('74', '89', '9', '400');
INSERT INTO `t_active_var_value` VALUES ('75', '90', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('76', '91', '9', '750');
INSERT INTO `t_active_var_value` VALUES ('77', '92', '9', '1000');
INSERT INTO `t_active_var_value` VALUES ('78', '93', '9', '2000');
INSERT INTO `t_active_var_value` VALUES ('79', '94', '9', '3000');
INSERT INTO `t_active_var_value` VALUES ('80', '95', '9', '4000');
INSERT INTO `t_active_var_value` VALUES ('81', '96', '9', '5000');
INSERT INTO `t_active_var_value` VALUES ('82', '97', '9', '6000');
INSERT INTO `t_active_var_value` VALUES ('83', '98', '9', '7000');
INSERT INTO `t_active_var_value` VALUES ('84', '99', '9', '8000');
INSERT INTO `t_active_var_value` VALUES ('85', '100', '9', '9000');
INSERT INTO `t_active_var_value` VALUES ('86', '101', '9', '10000');
INSERT INTO `t_active_var_value` VALUES ('88', '103', '9', '50000');
INSERT INTO `t_active_var_value` VALUES ('92', '107', '11', '3,7');
INSERT INTO `t_active_var_value` VALUES ('93', '108', '9', '1000');
INSERT INTO `t_active_var_value` VALUES ('94', '109', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('95', '110', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('96', '111', '9', '50');
INSERT INTO `t_active_var_value` VALUES ('97', '112', '9', '50');
INSERT INTO `t_active_var_value` VALUES ('98', '113', '9', '200');
INSERT INTO `t_active_var_value` VALUES ('99', '114', '9', '50');
INSERT INTO `t_active_var_value` VALUES ('100', '115', '9', '50');
INSERT INTO `t_active_var_value` VALUES ('101', '116', '9', '50');
INSERT INTO `t_active_var_value` VALUES ('102', '117', '9', '5');
INSERT INTO `t_active_var_value` VALUES ('103', '118', '9', '1');
INSERT INTO `t_active_var_value` VALUES ('104', '119', '9', '3');
INSERT INTO `t_active_var_value` VALUES ('105', '120', '9', '10');
INSERT INTO `t_active_var_value` VALUES ('108', '123', '9', '5000');
INSERT INTO `t_active_var_value` VALUES ('109', '124', '9', '10000');
INSERT INTO `t_active_var_value` VALUES ('110', '125', '9', '300');
INSERT INTO `t_active_var_value` VALUES ('111', '126', '9', '200');
INSERT INTO `t_active_var_value` VALUES ('112', '127', '9', '1500');
INSERT INTO `t_active_var_value` VALUES ('113', '128', '9', '50');
INSERT INTO `t_active_var_value` VALUES ('114', '129', '9', '600');
INSERT INTO `t_active_var_value` VALUES ('115', '130', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('116', '131', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('117', '132', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('118', '133', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('119', '134', '9', '500');
INSERT INTO `t_active_var_value` VALUES ('120', '135', '12', '1');
INSERT INTO `t_active_var_value` VALUES ('121', '136', '9', '5000');
INSERT INTO `t_active_var_value` VALUES ('126', '141', '9', '1000');
INSERT INTO `t_active_var_value` VALUES ('127', '142', '9', '10000');
INSERT INTO `t_active_var_value` VALUES ('128', '151', '9', '10000');
INSERT INTO `t_active_var_value` VALUES ('129', '154', '8', '1');
INSERT INTO `t_active_var_value` VALUES ('130', '155', '16', '0002');
INSERT INTO `t_active_var_value` VALUES ('131', '156', '16', '0001');
INSERT INTO `t_active_var_value` VALUES ('132', '157', '16', '0003');
INSERT INTO `t_active_var_value` VALUES ('144', '169', '15', '30345');
INSERT INTO `t_active_var_value` VALUES ('145', '170', '14', 'PRM17');
INSERT INTO `t_active_var_value` VALUES ('146', '171', '17', '1');
INSERT INTO `t_active_var_value` VALUES ('153', '178', '15', '30345');
INSERT INTO `t_active_var_value` VALUES ('154', '179', '14', 'PRM17');
INSERT INTO `t_active_var_value` VALUES ('155', '180', '17', '2');
INSERT INTO `t_active_var_value` VALUES ('179', '204', '16', '0001');
INSERT INTO `t_active_var_value` VALUES ('180', '205', '10', '34');
INSERT INTO `t_active_var_value` VALUES ('181', '206', '8', '1');
INSERT INTO `t_active_var_value` VALUES ('183', '208', '16', '0002');
INSERT INTO `t_active_var_value` VALUES ('187', '212', '15', '30345');
INSERT INTO `t_active_var_value` VALUES ('188', '213', '14', 'PRM17');
INSERT INTO `t_active_var_value` VALUES ('189', '214', '17', '1.5');

-- ----------------------------
-- Table structure for t_activity
-- ----------------------------
DROP TABLE IF EXISTS `t_activity`;
CREATE TABLE `t_activity` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '活动主键',
  `active_name` varchar(128) NOT NULL COMMENT '活动名称',
  `group_id` int(11) NOT NULL COMMENT '所属分组',
  `is_all_condition` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否任意条件（1：否，2：是）',
  `active_display` varchar(256) NOT NULL COMMENT '活动页面展示',
  `active_desc` varchar(256) DEFAULT NULL COMMENT '活动描述',
  `salience` int(11) NOT NULL DEFAULT '0' COMMENT '规则优先级',
  `valid_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '规则生效时间',
  `invalid_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '规则失效时间',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '规则状态（1：可用，2：不可用）',
  `unshelf_reason` varchar(256) DEFAULT NULL COMMENT '下线原因',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8 COMMENT='活动配置表';

-- ----------------------------
-- Records of t_activity
-- ----------------------------
INSERT INTO `t_activity` VALUES ('1', '订单完成获取积分', '1', '1', '', '旧规则下线', '0', '2015-11-27 18:46:25', '2030-08-27 16:00:00', '2', '2,');
INSERT INTO `t_activity` VALUES ('2', '订单完成获取固定积分', '1', '1', '', '在订单完成环节增加积分', '0', '2014-08-27 14:37:37', '2030-08-27 16:00:00', '2', '1,1,1,1,');
INSERT INTO `t_activity` VALUES ('4', '经销商评价获取固定积分', '1', '1', '积分获取规则（经销商评价）', '在经销商评价环节增加积分', '0', '2014-08-27 14:37:37', '2030-12-31 15:59:59', '2', '1,1,1,1,');
INSERT INTO `t_activity` VALUES ('5', '购买商品送与现金等倍积分', '1', '1', '', '购买商品送与现金等倍积分', '0', '2014-08-27 14:07:00', '2030-12-31 15:55:00', '1', '');
INSERT INTO `t_activity` VALUES ('6', '评论商品获取固定积分', '1', '1', '', '评论商品获取固定积分', '0', '2014-08-27 14:37:00', '2019-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('7', '车知道提问取固定积分', '1', '1', '', '车知道提问取固定积分', '0', '2014-08-27 14:37:00', '2019-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('8', '车知道回答取固定积分', '1', '1', '', '车知道回答取固定积分', '0', '2014-08-27 14:37:00', '2019-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('9', '整车订单金额＞10w获10000积分', '1', '1', '', '整车订单获取积分（订单金额>10w）', '0', '2014-08-27 14:37:00', '2019-12-31 16:00:00', '2', '');
INSERT INTO `t_activity` VALUES ('10', '整车订单金额≤10w获5000积分', '1', '1', '', '整车订单获取积分（订单金额≤10w）', '0', '2014-08-27 14:37:00', '2019-12-31 16:00:00', '2', '');
INSERT INTO `t_activity` VALUES ('11', '会员认证增加积分获取权益', '2', '1', '', '获取会员权限和增加500积分', '0', '2014-08-26 16:00:00', '2019-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('12', '车辆认证增加积分', '2', '1', '', '增加1500积分', '0', '2014-08-26 16:00:00', '2019-12-31 16:00:00', '2', '');
INSERT INTO `t_activity` VALUES ('13', '车享购车获取权益', '2', '1', '', '车享购车获取会员权益', '0', '2014-08-26 20:20:00', '2019-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('14', '邮箱绑定增加积分', '1', '1', '', '邮箱绑定增加100积分', '0', '2014-08-26 16:00:00', '2019-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('15', '购车赠送50000积分及3000基金', '3', '1', '', '购车赠送50000积分及3000基金', '1', '2015-11-10 15:51:54', '2030-12-31 15:55:00', '2', '7,7,');
INSERT INTO `t_activity` VALUES ('16', '车享号牌ID大于等于1小于等于10送50000积分', '108', '1', '', '车享号牌ID大于等于1小于等于10送50000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('17', '车享号牌ID大于等于11小于等于20送10000积分', '108', '1', '', '车享号牌ID大于等于11小于等于20送10000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('18', '车享号牌ID大于等于21小于等于30送9000积分', '108', '1', '', '车享号牌ID大于等于21小于等于30送9000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('19', '车享号牌ID大于等于31小于等于40送8000积分', '108', '1', '', '车享号牌ID大于等于31小于等于40送8000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('20', '车享号牌ID大于等于41小于等于50送7000积分', '108', '1', '', '车享号牌ID大于等于41小于等于50送7000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('21', '车享号牌ID大于等于51小于等于100送6000积分', '108', '1', '', '车享号牌ID大于等于51小于等于100送6000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('22', '车享号牌ID大于等于101小于等于200送5000积分', '108', '1', '', '车享号牌ID大于等于101小于等于200送5000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('23', '车享号牌ID大于等于201小于等于300送4000积分', '108', '1', '', '车享号牌ID大于等于201小于等于300送4000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('24', '车享号牌ID大于等于301小于等于400送3000积分', '108', '1', '', '车享号牌ID大于等于301小于等于400送3000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('25', '车享号牌ID大于等于401小于等于500送2000积分', '108', '1', '', '车享号牌ID大于等于401小于等于500送2000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('26', '车享号牌ID大于等于501小于等于1000送1000积分', '108', '1', '', '车享号牌ID大于等于501小于等于1000送1000积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('27', '车享号牌ID大于等于1001小于等于5000送750积分', '108', '1', '', '车享号牌ID大于等于1001小于等于5000送750积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('28', '车享号牌ID大于等于5001小于等于9999送500积分', '108', '1', '', '车享号牌ID大于等于5001小于等于9999送500积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('29', '车享号牌ID大于等于10000小于等于19999送400积分', '108', '1', '', '车享号牌ID大于等于10000小于等于19999送400积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('30', '车享号牌ID大于等于20000小于等于29999送300积分', '108', '1', '', '车享号牌ID大于等于20000小于等于29999送300积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('31', '车享号牌ID大于等于30000小于等于39999送200积分', '108', '1', '', '车享号牌ID大于等于30000小于等于39999送200积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('32', '车享号牌ID大于等于40000小于等于49999送100积分', '108', '1', '', '车享号牌ID大于等于40000小于等于49999送100积分', '1', '2014-11-19 16:00:00', '2014-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('33', '完善车辆信息（车牌号）送积分', '1', '1', '', '积分违章查询，完善车辆信息（车牌号），送50积分', '1', '2014-12-31 16:00:00', '2015-12-31 15:55:00', '1', '');
INSERT INTO `t_activity` VALUES ('34', '认证会员认证成功', '109', '1', '', '权益礼包2 权益包含：道路救援，活动资格，违章提醒99积分资格', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('35', '下载并登录车享宝APP', '109', '1', '', '送1000积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('36', '关注车享汇微信服务号', '109', '1', '', '送500积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('37', '登记爱车保险信息', '109', '1', '', '送500积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('38', '填写购车年份', '109', '1', '', '送50积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('39', '填写爱车车牌号', '109', '1', '', '送50积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('40', '首笔车享汇订单', '109', '1', '', '送200积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('41', '首次商品评价', '109', '1', '', '送50积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('42', '选定个性Q版头像', '109', '1', '', '送50积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('43', '邮箱验证', '109', '1', '', '送50积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('44', '每日签到', '109', '1', '', '5积分/次', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('45', '车知道提问', '109', '1', '', '1分/次', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('46', '车知道回答', '109', '1', '', '3分/次', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('47', '商品评价', '109', '1', '', '10积分/次', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('48', '推荐新会员', '109', '1', '', '每成功推荐一名认证会员入会，即可获赠：1000积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('49', '车享汇消费', '109', '1', '', '消费1元赠送1积分', '1', '2014-12-31 16:00:00', '2029-12-31 16:00:00', '1', '');
INSERT INTO `t_activity` VALUES ('50', '下载并登录车享宝APP（优先）', '109', '1', '', '送300积分', '2', '2015-03-11 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('51', '关注车享汇微信服务号（优先）', '109', '1', '', '送200积分', '2', '2015-03-11 16:00:00', '2029-12-31 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('52', '下载并登录车享宝APP（优先2）', '109', '1', '', '328活动积分翻倍，送600积分', '3', '2015-03-27 16:00:00', '2015-04-30 16:00:00', '1', null);
INSERT INTO `t_activity` VALUES ('53', '关注车享汇微信服务号(根据用户来源25)', '109', '1', '', '关注车享汇微信服务号(根据用户来源25)', '3', '2015-05-27 16:00:00', '2020-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('54', '关注车享汇微信服务号(根据用户来源26)', '109', '1', '', '关注车享汇微信服务号(根据用户来源26)', '3', '2015-05-27 16:00:00', '2020-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('55', '关注车享汇微信服务号(根据用户来源27)', '109', '1', '', '关注车享汇微信服务号(根据用户来源27)', '3', '2015-05-27 16:00:00', '2020-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('56', '关注车享汇微信服务号(根据用户来源28)', '109', '1', '', '关注车享汇微信服务号(根据用户来源28)', '3', '2015-05-27 16:00:00', '2020-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('57', '关注车享汇微信服务号(根据用户来源32)', '109', '1', '', '关注车享汇微信服务号(根据用户来源32)', '3', '2015-05-27 16:00:00', '2020-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('58', '车享328周年盛典送5000积分', '109', '1', '', '车享328周年盛典送5000积分', '1', '2015-03-27 16:00:00', '2020-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('59', '518购车送1万积分', '109', '1', '', '518购车送1万积分', '1', '2015-05-18 00:00:00', '2015-12-31 23:55:00', '1', '');
INSERT INTO `t_activity` VALUES ('60', '购买商品送与现金等倍积分(大众店中店)', '1', '1', '', '购买商品送与现金等倍积分(大众店中店)', '1', '2015-06-30 16:00:00', '2030-12-31 15:55:00', '2', '');
INSERT INTO `t_activity` VALUES ('61', '购车送积分', '109', '1', '', '购车送10000积分', '1', '2015-09-19 16:00:00', '2016-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('62', '当前累计公里数超过10000KM', '111', '1', '', '10000', '0', '2015-09-29 16:00:00', '2016-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('63', '当前累计公里数超过5000KM', '111', '1', '', '5000', '1', '2015-09-29 16:00:00', '2016-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('64', '当前累计是否超过1000KM', '111', '1', '', '1000', '2', '2015-09-30 00:00:00', '2016-12-31 23:55:00', '1', '');
INSERT INTO `t_activity` VALUES ('65', '当前上传公里数除10余数', '111', '0', '', '当前上传公里数获得余数', '3', '2015-09-29 16:00:00', '2016-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('66', '当前上传公里数获得积分值', '111', '0', '', '通过车享宝盒上传里程获得积分', '4', '2015-09-29 16:00:00', '2016-12-31 15:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('67', '金钻升级黑钻', '113', '1', '', '金钻升级黑钻', '1', '2015-11-20 00:00:00', '2020-12-31 23:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('68', '黑钻降级金钻', '113', '1', '', '黑钻降级金钻', '1', '2015-11-20 00:00:00', '2020-12-31 23:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('69', '金钻降级银钻', '113', '1', '', '金钻降级银钻', '1', '2015-11-20 00:00:00', '2020-12-31 23:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('70', '银钻升级黑钻', '113', '1', '', '银钻升级黑钻', '2', '2015-11-20 00:00:00', '2015-12-31 23:55:00', '1', null);
INSERT INTO `t_activity` VALUES ('71', '银钻升级金钻', '113', '1', '', '银钻升级金钻', '1', '2015-11-20 00:00:00', '2015-12-31 23:55:00', '1', '');
INSERT INTO `t_activity` VALUES ('72', '车享家银钻会员消费送积分', '114', '1', '', '车享家银钻会员消费送积分', '1', '2015-11-27 00:00:00', '2020-12-31 23:55:00', '1', '');
INSERT INTO `t_activity` VALUES ('73', '车享家金钻会员消费送积分', '114', '1', '', '车享家金钻会员消费送积分', '1', '2015-11-27 00:00:00', '2015-12-31 23:55:00', '1', '');
INSERT INTO `t_activity` VALUES ('74', '车享家黑钻会员消费送积分', '114', '1', '', '车享家黑钻会员消费送积分', '1', '2015-11-27 00:00:00', '2020-12-31 23:55:00', '1', '');
INSERT INTO `t_activity` VALUES ('77', 'xtay规则测试001', '117', '1', '', 'xtay规则测试001', '1', '2015-11-29 00:00:00', '2015-12-31 23:55:00', '1', '');

-- ----------------------------
-- Table structure for t_activity_execute
-- ----------------------------
DROP TABLE IF EXISTS `t_activity_execute`;
CREATE TABLE `t_activity_execute` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '活动执行主键',
  `activity_id` int(11) NOT NULL COMMENT '所属活动配置',
  `stgy_id` int(11) NOT NULL COMMENT '绑定执行策略',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_act_exec_stgy` (`activity_id`,`stgy_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=215 DEFAULT CHARSET=utf8 COMMENT='活动执行表';

-- ----------------------------
-- Records of t_activity_execute
-- ----------------------------
INSERT INTO `t_activity_execute` VALUES ('24', '1', '2');
INSERT INTO `t_activity_execute` VALUES ('22', '2', '1');
INSERT INTO `t_activity_execute` VALUES ('4', '4', '1');
INSERT INTO `t_activity_execute` VALUES ('206', '5', '3');
INSERT INTO `t_activity_execute` VALUES ('52', '6', '1');
INSERT INTO `t_activity_execute` VALUES ('50', '7', '1');
INSERT INTO `t_activity_execute` VALUES ('49', '8', '1');
INSERT INTO `t_activity_execute` VALUES ('124', '9', '1');
INSERT INTO `t_activity_execute` VALUES ('123', '10', '1');
INSERT INTO `t_activity_execute` VALUES ('82', '11', '1');
INSERT INTO `t_activity_execute` VALUES ('83', '11', '6');
INSERT INTO `t_activity_execute` VALUES ('127', '12', '1');
INSERT INTO `t_activity_execute` VALUES ('84', '13', '6');
INSERT INTO `t_activity_execute` VALUES ('80', '15', '1');
INSERT INTO `t_activity_execute` VALUES ('81', '15', '7');
INSERT INTO `t_activity_execute` VALUES ('103', '16', '1');
INSERT INTO `t_activity_execute` VALUES ('101', '17', '1');
INSERT INTO `t_activity_execute` VALUES ('100', '18', '1');
INSERT INTO `t_activity_execute` VALUES ('99', '19', '1');
INSERT INTO `t_activity_execute` VALUES ('98', '20', '1');
INSERT INTO `t_activity_execute` VALUES ('97', '21', '1');
INSERT INTO `t_activity_execute` VALUES ('96', '22', '1');
INSERT INTO `t_activity_execute` VALUES ('95', '23', '1');
INSERT INTO `t_activity_execute` VALUES ('94', '24', '1');
INSERT INTO `t_activity_execute` VALUES ('93', '25', '1');
INSERT INTO `t_activity_execute` VALUES ('92', '26', '1');
INSERT INTO `t_activity_execute` VALUES ('91', '27', '1');
INSERT INTO `t_activity_execute` VALUES ('90', '28', '1');
INSERT INTO `t_activity_execute` VALUES ('89', '29', '1');
INSERT INTO `t_activity_execute` VALUES ('88', '30', '1');
INSERT INTO `t_activity_execute` VALUES ('87', '31', '1');
INSERT INTO `t_activity_execute` VALUES ('86', '32', '1');
INSERT INTO `t_activity_execute` VALUES ('128', '33', '1');
INSERT INTO `t_activity_execute` VALUES ('107', '34', '8');
INSERT INTO `t_activity_execute` VALUES ('108', '35', '1');
INSERT INTO `t_activity_execute` VALUES ('109', '36', '1');
INSERT INTO `t_activity_execute` VALUES ('110', '37', '1');
INSERT INTO `t_activity_execute` VALUES ('111', '38', '1');
INSERT INTO `t_activity_execute` VALUES ('112', '39', '1');
INSERT INTO `t_activity_execute` VALUES ('113', '40', '1');
INSERT INTO `t_activity_execute` VALUES ('114', '41', '1');
INSERT INTO `t_activity_execute` VALUES ('115', '42', '1');
INSERT INTO `t_activity_execute` VALUES ('116', '43', '1');
INSERT INTO `t_activity_execute` VALUES ('117', '44', '1');
INSERT INTO `t_activity_execute` VALUES ('118', '45', '1');
INSERT INTO `t_activity_execute` VALUES ('119', '46', '1');
INSERT INTO `t_activity_execute` VALUES ('120', '47', '1');
INSERT INTO `t_activity_execute` VALUES ('141', '48', '1');
INSERT INTO `t_activity_execute` VALUES ('135', '49', '9');
INSERT INTO `t_activity_execute` VALUES ('125', '50', '1');
INSERT INTO `t_activity_execute` VALUES ('126', '51', '1');
INSERT INTO `t_activity_execute` VALUES ('129', '52', '1');
INSERT INTO `t_activity_execute` VALUES ('130', '53', '1');
INSERT INTO `t_activity_execute` VALUES ('131', '54', '1');
INSERT INTO `t_activity_execute` VALUES ('132', '55', '1');
INSERT INTO `t_activity_execute` VALUES ('133', '56', '1');
INSERT INTO `t_activity_execute` VALUES ('134', '57', '1');
INSERT INTO `t_activity_execute` VALUES ('136', '58', '1');
INSERT INTO `t_activity_execute` VALUES ('151', '59', '1');
INSERT INTO `t_activity_execute` VALUES ('153', '59', '4');
INSERT INTO `t_activity_execute` VALUES ('152', '59', '14');
INSERT INTO `t_activity_execute` VALUES ('154', '60', '3');
INSERT INTO `t_activity_execute` VALUES ('142', '61', '1');
INSERT INTO `t_activity_execute` VALUES ('143', '62', '14');
INSERT INTO `t_activity_execute` VALUES ('144', '63', '13');
INSERT INTO `t_activity_execute` VALUES ('150', '64', '12');
INSERT INTO `t_activity_execute` VALUES ('146', '65', '11');
INSERT INTO `t_activity_execute` VALUES ('147', '66', '10');
INSERT INTO `t_activity_execute` VALUES ('155', '68', '-83');
INSERT INTO `t_activity_execute` VALUES ('156', '69', '-83');
INSERT INTO `t_activity_execute` VALUES ('157', '70', '-83');
INSERT INTO `t_activity_execute` VALUES ('208', '71', '-83');
INSERT INTO `t_activity_execute` VALUES ('169', '72', '-82');
INSERT INTO `t_activity_execute` VALUES ('170', '72', '-81');
INSERT INTO `t_activity_execute` VALUES ('171', '72', '2');
INSERT INTO `t_activity_execute` VALUES ('212', '73', '-82');
INSERT INTO `t_activity_execute` VALUES ('213', '73', '-81');
INSERT INTO `t_activity_execute` VALUES ('214', '73', '2');
INSERT INTO `t_activity_execute` VALUES ('178', '74', '-82');
INSERT INTO `t_activity_execute` VALUES ('179', '74', '-81');
INSERT INTO `t_activity_execute` VALUES ('180', '74', '2');
INSERT INTO `t_activity_execute` VALUES ('204', '77', '-83');
INSERT INTO `t_activity_execute` VALUES ('205', '77', '7');

-- ----------------------------
-- Table structure for t_gift_item_bak
-- ----------------------------
DROP TABLE IF EXISTS `t_gift_item_bak`;
CREATE TABLE `t_gift_item_bak` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '赠品主键',
  `gift_name` varchar(128) NOT NULL COMMENT '赠品名称',
  `gift_price` decimal(12,4) NOT NULL DEFAULT '0.0000' COMMENT '赠品促销价',
  `gift_type` tinyint(4) NOT NULL DEFAULT '2' COMMENT '赠品类型（1：实物商品，2：优惠券，3：虚拟商品......）',
  `item_id` int(11) NOT NULL COMMENT '关联商品表',
  `gift_desc` varchar(256) DEFAULT NULL COMMENT '赠品描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='赠品配置表';

-- ----------------------------
-- Records of t_gift_item_bak
-- ----------------------------

-- ----------------------------
-- Table structure for t_rule_combination
-- ----------------------------
DROP TABLE IF EXISTS `t_rule_combination`;
CREATE TABLE `t_rule_combination` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '规则主键',
  `rule_name` varchar(64) NOT NULL COMMENT '规则名称',
  `cond_list` varchar(256) NOT NULL COMMENT '条件ID列表（条件ID之间用,分隔）',
  `logic_mark` tinyint(4) NOT NULL DEFAULT '1' COMMENT '逻辑连接符（1：与，2：或）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='规则组合表';

-- ----------------------------
-- Records of t_rule_combination
-- ----------------------------

-- ----------------------------
-- Table structure for t_rule_condition
-- ----------------------------
DROP TABLE IF EXISTS `t_rule_condition`;
CREATE TABLE `t_rule_condition` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '条件主键',
  `cond_name` varchar(128) DEFAULT NULL COMMENT '条件名称',
  `group_id` int(11) DEFAULT '0' COMMENT '所属分组',
  `dimension_id` int(11) NOT NULL COMMENT '维度编号',
  `comp_operate` varchar(16) NOT NULL COMMENT '比较操作符\n                        GT(">")=>大于\n                        GE(">=")=>不小于\n                        LT("<")=>小于\n                        LE("<=")=>不大于\n                        EQ("==")=>等于\n                        NE("!=")=>不等于\n                        CO',
  `is_variable` tinyint(4) NOT NULL DEFAULT '2' COMMENT '取值是否变量（1：是，2：否）',
  `dim_value` varchar(256) DEFAULT NULL COMMENT '维度比较值',
  `descript` varchar(256) DEFAULT NULL COMMENT '条件备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8 COMMENT='规则条件部分';

-- ----------------------------
-- Records of t_rule_condition
-- ----------------------------
INSERT INTO `t_rule_condition` VALUES ('-2', '假', '0', '5', '==', '2', '2', '假');
INSERT INTO `t_rule_condition` VALUES ('-1', '真', '0', '5', '==', '2', '1', '真');
INSERT INTO `t_rule_condition` VALUES ('1', '订单金额不大于多少元', '0', '1', '<=', '1', '', '订单金额不大于多少元');
INSERT INTO `t_rule_condition` VALUES ('2', '增加积分渠道等于哪个', '0', '3', '==', '1', '', '增加积分渠道等于哪个');
INSERT INTO `t_rule_condition` VALUES ('3', '订单金额大于多少元', '0', '1', '>', '1', '', '整车订单大于多少元');
INSERT INTO `t_rule_condition` VALUES ('4', '商品单价不小于多少元', '0', '4', '>=', '1', '', '商品单价不小于1元');
INSERT INTO `t_rule_condition` VALUES ('5', '商品类目包含于哪些', '0', '2', 'memberOf', '1', '', '商品类目包含于哪些');
INSERT INTO `t_rule_condition` VALUES ('23', '增加积分渠道包含于哪些', '1', '3', 'memberOf', '1', null, '增加积分渠道包含于');
INSERT INTO `t_rule_condition` VALUES ('24', '会员认证业务类别为哪个', '2', '58', '==', '1', null, '会员认证业务类别为哪个');
INSERT INTO `t_rule_condition` VALUES ('25', '交易渠道来源包含于哪些', '1', '59', 'memberOf', '1', null, '交易渠道来源包含于');
INSERT INTO `t_rule_condition` VALUES ('26', '车享号牌ID小于等于多少', '108', '60', '<=', '1', null, '车享号牌ID小于等于多少');
INSERT INTO `t_rule_condition` VALUES ('27', '车享号牌ID大于等于多少', '108', '60', '>=', '1', null, '车享号牌ID大于等于多少');
INSERT INTO `t_rule_condition` VALUES ('28', '会员任务编码等于', '109', '61', '==', '1', null, '');
INSERT INTO `t_rule_condition` VALUES ('29', '用户来源类型等于', '109', '62', '==', '1', null, '用户来源类型等于');
INSERT INTO `t_rule_condition` VALUES ('31', '当前累计公里数', '0', '65', '>=', '1', null, '当前累计公里数条件左值');
INSERT INTO `t_rule_condition` VALUES ('32', '上次累计公里数', '0', '64', '<', '1', null, '上次累计公里数条件左值');
INSERT INTO `t_rule_condition` VALUES ('33', 'itemPrice>', '0', '4', '>', '1', null, '商品单价>');
INSERT INTO `t_rule_condition` VALUES ('34', 'MemberLevel==', '0', '71', '==', '1', null, '会员等级==');
INSERT INTO `t_rule_condition` VALUES ('35', 'YearlyCount>=', '0', '67', '>=', '1', null, '年度消费次数>=');
INSERT INTO `t_rule_condition` VALUES ('36', 'YearlyAmount>=', '0', '68', '>=', '1', null, '年度消费总金额>=');
INSERT INTO `t_rule_condition` VALUES ('37', 'YearlyCharge>=', '0', '69', '>=', '1', null, '年度充值总金额>=');
INSERT INTO `t_rule_condition` VALUES ('38', 'YearlyCount<', '0', '67', '<', '1', null, '年度消费次数<');
INSERT INTO `t_rule_condition` VALUES ('39', 'YearlyAmount<', '0', '68', '<', '1', null, '年度消费总金额<');
INSERT INTO `t_rule_condition` VALUES ('40', 'YearlyCharge<', '0', '69', '<', '1', null, '年度充值总金额<');
INSERT INTO `t_rule_condition` VALUES ('41', 'userId>', '0', '57', '>', '1', null, '会员编号>');
INSERT INTO `t_rule_condition` VALUES ('42', 'psku==', '0', '74', '==', '1', null, '商品SKU码==');
INSERT INTO `t_rule_condition` VALUES ('43', 'MemberLevel>', '0', '71', '>', '1', null, '会员等级>');
INSERT INTO `t_rule_condition` VALUES ('44', 'ptype==', '0', '72', '==', '1', null, '商品所属类别==');

-- ----------------------------
-- Table structure for t_rule_dimension
-- ----------------------------
DROP TABLE IF EXISTS `t_rule_dimension`;
CREATE TABLE `t_rule_dimension` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '维度主键',
  `ds_name` varchar(128) NOT NULL COMMENT '维度名称',
  `field_name` varchar(128) NOT NULL COMMENT '维度属性名称',
  `variable_id` int(11) NOT NULL COMMENT '维度变量编码',
  `dim_cand_id` int(11) DEFAULT NULL COMMENT '维度取值',
  `descript` varchar(256) DEFAULT NULL COMMENT '维度备注',
  `group_id` int(11) NOT NULL COMMENT '所属分组',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_dim_name` (`ds_name`) USING BTREE,
  UNIQUE KEY `idx_dim_class_prop` (`field_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8 COMMENT='规则维度';

-- ----------------------------
-- Records of t_rule_dimension
-- ----------------------------
INSERT INTO `t_rule_dimension` VALUES ('1', '订单金额', 'orderAmount', '1', null, '订单总金额', '0');
INSERT INTO `t_rule_dimension` VALUES ('2', '车享汇商品类目', 'categoryID', '5', null, '车享汇商品类目', '1');
INSERT INTO `t_rule_dimension` VALUES ('3', '积分获取渠道', 'tradeChannel', '4', null, '积分获取交易渠道', '1');
INSERT INTO `t_rule_dimension` VALUES ('4', '商品单价', 'itemPrice', '1', null, '商品单价', '1');
INSERT INTO `t_rule_dimension` VALUES ('5', '真值维度', '_TRUE', '0', null, '真值维度', '-1');
INSERT INTO `t_rule_dimension` VALUES ('30', '用户登录次数', 'userLoginTwice', '6', null, '取venus接口配置-->维度回调取值类型', '1');
INSERT INTO `t_rule_dimension` VALUES ('57', '会员编号', 'userId', '64', null, '车享网会员用户ID', '0');
INSERT INTO `t_rule_dimension` VALUES ('58', '会员认证业务类别', 'rank', '66', null, '会员认证业务类别', '0');
INSERT INTO `t_rule_dimension` VALUES ('59', '交易渠道来源', 'tradeSource', '68', null, '交易渠道来源', '1');
INSERT INTO `t_rule_dimension` VALUES ('60', '车享号牌ID', 'cardRuleId', '64', null, '车享号牌ID', '108');
INSERT INTO `t_rule_dimension` VALUES ('61', '会员任务编码', 'TaskCode', '65', null, '会员任务编码', '109');
INSERT INTO `t_rule_dimension` VALUES ('62', '用户来源类型', 'userSourceType', '6', null, '用户来源类型', '109');
INSERT INTO `t_rule_dimension` VALUES ('64', '上次累计公里数', 'lastsumkilom', '64', null, '上次累计公里数', '0');
INSERT INTO `t_rule_dimension` VALUES ('65', '当前累计公里数', 'sumkilom', '64', null, '当前累计公里数', '0');
INSERT INTO `t_rule_dimension` VALUES ('66', '当前上传公里数', 'curkilom', '64', null, '当前上传公里数', '0');
INSERT INTO `t_rule_dimension` VALUES ('67', '车享家年度消费次数', 'YearlyCount', '6', null, '车享家年度消费次数', '0');
INSERT INTO `t_rule_dimension` VALUES ('68', '车享家年度消费金额', 'YearlyAmount', '1', null, '车享家年度消费金额', '0');
INSERT INTO `t_rule_dimension` VALUES ('69', '车享付充值金额', 'YearlyCharge', '1', null, '车享付充值金额', '0');
INSERT INTO `t_rule_dimension` VALUES ('70', '充值金额', 'chargeAmount', '1', null, '充值金额', '0');
INSERT INTO `t_rule_dimension` VALUES ('71', '车享会员等级', 'MemberLevel', '71', null, '车享会员等级', '0');
INSERT INTO `t_rule_dimension` VALUES ('72', '商品所属类别', 'ptype', '72', null, '商品所属类别', '0');
INSERT INTO `t_rule_dimension` VALUES ('73', '商品类别', 'ptype2', '73', null, '商品类别', '0');
INSERT INTO `t_rule_dimension` VALUES ('74', '商品SKU码', 'psku', '65', null, '商品SKU码', '0');
INSERT INTO `t_rule_dimension` VALUES ('75', '订单成交金额', 'ODAM', '1', null, '订单成交金额', '0');
INSERT INTO `t_rule_dimension` VALUES ('76', '订单成交次数', 'orderDealNumber', '6', null, '订单成交次数', '0');
INSERT INTO `t_rule_dimension` VALUES ('77', '订单成交累计金额', 'orderSUMAmount', '1', null, '订单成交累计金额', '0');
INSERT INTO `t_rule_dimension` VALUES ('78', '认证状态', 'certStatus', '75', null, '认证状态', '0');
INSERT INTO `t_rule_dimension` VALUES ('79', '订单商品是否评价', 'OCWEvaluation', '76', null, '订单商品是否评价', '0');
INSERT INTO `t_rule_dimension` VALUES ('80', '是否首次消费', 'ISConsumption', '76', null, '是否首次消费', '0');
INSERT INTO `t_rule_dimension` VALUES ('81', '订单渠道', 'orderChannel', '77', null, '订单渠道', '0');
INSERT INTO `t_rule_dimension` VALUES ('82', '订单来源', 'orderOrigin', '78', null, '订单来源', '0');
INSERT INTO `t_rule_dimension` VALUES ('83', '任务ID（名称）', 'taskID', '65', null, '任务ID（名称）', '0');
INSERT INTO `t_rule_dimension` VALUES ('84', '会员省份', 'memberProvinces', '65', null, '会员省份', '0');
INSERT INTO `t_rule_dimension` VALUES ('85', '会员城市', 'memberCity', '65', null, '会员城市', '0');
INSERT INTO `t_rule_dimension` VALUES ('86', '订单成交时间', 'orderDealTime', '79', null, '订单成交时间(右值:日期，生日当月，生日当日)', '0');
INSERT INTO `t_rule_dimension` VALUES ('87', '整车订单审核状态', 'AuditStatus', '74', null, '整车订单审核状态（需要确认其他业务的审核定义）', '0');
INSERT INTO `t_rule_dimension` VALUES ('89', '活动ID', 'activityId', '65', null, '活动ID', '0');
INSERT INTO `t_rule_dimension` VALUES ('90', '会员类型', 'userType', '80', null, '会员类型', '0');
INSERT INTO `t_rule_dimension` VALUES ('91', '供应商id', 'supplierId', '65', null, '供应商id', '0');

-- ----------------------------
-- Table structure for t_rule_group
-- ----------------------------
DROP TABLE IF EXISTS `t_rule_group`;
CREATE TABLE `t_rule_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '分组主键',
  `group_no` varchar(64) DEFAULT NULL,
  `group_name` varchar(128) NOT NULL COMMENT '分组名称',
  `descript` varchar(256) DEFAULT NULL COMMENT '分组描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=utf8 COMMENT='分组配置表';

-- ----------------------------
-- Records of t_rule_group
-- ----------------------------
INSERT INTO `t_rule_group` VALUES ('1', 'RULE_CREDIT001', '积分获取分组', '增加积分相关的规则引擎分组');
INSERT INTO `t_rule_group` VALUES ('2', 'RULE_RIGHT001', '权益获取分组', '为车主权益获取定义相关规则');
INSERT INTO `t_rule_group` VALUES ('3', 'RULE_ORDER001', '订单类相关规则', '订单类相关规则');
INSERT INTO `t_rule_group` VALUES ('108', 'RULE_FINALE', '收官之战', '增加收官之战的规则引擎分组');
INSERT INTO `t_rule_group` VALUES ('109', 'RULE_TASK', '会员任务体系分组', '会员任务体系分组的规则引擎分组');
INSERT INTO `t_rule_group` VALUES ('110', '001', '车享家测试', '车享家测试23而为rwer');
INSERT INTO `t_rule_group` VALUES ('111', 'RULE4CHEXIANGBAO', '车享宝公里积分攻略', '车享宝公里积分攻略');
INSERT INTO `t_rule_group` VALUES ('113', 'gradeEval', '会员升降级规则组', '会员升降级规则组');
INSERT INTO `t_rule_group` VALUES ('114', 'erewew', 'r压下压下', 'asdasdvx vc\n\n\n\n\n\n\n\n\nsdfssd\nsdf\ndfd\ns\nsffs');
INSERT INTO `t_rule_group` VALUES ('117', 'xtay001', 'xtay规则组测试01', 'xtay规则组测试01');

-- ----------------------------
-- Table structure for t_stgy_variable
-- ----------------------------
DROP TABLE IF EXISTS `t_stgy_variable`;
CREATE TABLE `t_stgy_variable` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '关联主键',
  `stgy_id` int(11) NOT NULL COMMENT '策略编码',
  `var_id` int(11) NOT NULL COMMENT '变量编码',
  `rel_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '关联类型（1：关联策略，2：关联规则条件）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='策略变量关联表';

-- ----------------------------
-- Records of t_stgy_variable
-- ----------------------------
INSERT INTO `t_stgy_variable` VALUES ('8', '3', '67', '1');
INSERT INTO `t_stgy_variable` VALUES ('9', '1', '2', '1');
INSERT INTO `t_stgy_variable` VALUES ('11', '8', '69', '1');
INSERT INTO `t_stgy_variable` VALUES ('12', '9', '3', '1');
INSERT INTO `t_stgy_variable` VALUES ('16', '7', '2', '1');
INSERT INTO `t_stgy_variable` VALUES ('17', '-81', '77', '1');
INSERT INTO `t_stgy_variable` VALUES ('18', '-82', '77', '1');
INSERT INTO `t_stgy_variable` VALUES ('19', '-83', '77', '1');

-- ----------------------------
-- Table structure for t_strategy
-- ----------------------------
DROP TABLE IF EXISTS `t_strategy`;
CREATE TABLE `t_strategy` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '策略主键',
  `stgy_name` varchar(64) NOT NULL COMMENT '策略名称',
  `group_id` int(11) NOT NULL COMMENT '所属分组',
  `stgy_type` tinyint(4) NOT NULL DEFAULT '10' COMMENT '策略类型\n            10：减金额【打折，直降，免运费等】\n            20：赠送积分【也可用于生成积分，供积分系统使用】\n            30：赠送实物商品【需要运送的实物货品】，\n            40：赠送虚拟商品【如41：购物券，42：优惠券，43：充值卡，44：彩票等】）',
  `stgy_expression` varchar(512) NOT NULL COMMENT '策略计算公式（对于减金额或者赠送积分时，需要提供计算金额或者积分数值的表达式【可用aviator实现】，对于赠送礼品，则提供对应礼品的编号）',
  `stgy_point` int(255) NOT NULL DEFAULT '0' COMMENT '策略表达式小数位',
  `stgy_point_round` int(255) NOT NULL DEFAULT '4' COMMENT '策略表达式小数位进位(0:向上,1:向下,4:四舍五入)',
  `stgy_exp_display` varchar(512) NOT NULL COMMENT '显示策略表达式（中文翻译的表达式内容），供配置界面显示',
  `descript` varchar(512) DEFAULT NULL COMMENT '策略表达式描述',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_strategy_name` (`stgy_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='促销策略表';

-- ----------------------------
-- Records of t_strategy
-- ----------------------------
INSERT INTO `t_strategy` VALUES ('-83', '会员升降级策略', '0', '83', '{77}', '0', '4', '会员升降级策略', '会员升降级策略');
INSERT INTO `t_strategy` VALUES ('-82', '积分投放二级渠道', '0', '82', '{77}', '0', '4', '积分投放二级渠道', '积分投放二级渠道');
INSERT INTO `t_strategy` VALUES ('-81', '积分投放一级渠道', '0', '81', '{77}', '0', '4', '积分投放一级渠道', '积分投放一级渠道');
INSERT INTO `t_strategy` VALUES ('1', '获取固定积分值', '0', '20', '{2}', '0', '0', '常量值（整数）', '获取固定积分数');
INSERT INTO `t_strategy` VALUES ('2', '获取订单完成积分', '0', '20', 'orderAmount * {3}', '1', '1', '订单金额 * 系数', '订单完成获取积分');
INSERT INTO `t_strategy` VALUES ('3', '购买商品赠送积分', '1', '20', 'itemPrice*{67}', '0', '1', '商品单价*固定值', '购买商品赠送积分');
INSERT INTO `t_strategy` VALUES ('4', '会员认证增加500积分', '0', '60', '3', '0', '4', '会员认证增加500积分', '');
INSERT INTO `t_strategy` VALUES ('5', '车辆认证增加1500积分', '0', '60', '4', '0', '4', '车辆认证增加1500积分', '');
INSERT INTO `t_strategy` VALUES ('6', '会员认证获取会员权益', '0', '60', '5', '0', '4', '会员认证获取会员权益', '');
INSERT INTO `t_strategy` VALUES ('7', '获取固定基金值', '0', '30', '{2}', '0', '1', '常量值（整数）', '获取固定基金值');
INSERT INTO `t_strategy` VALUES ('8', '获取会员权益', '0', '70', '{69}', '0', '4', '常量值（字符串）', '获取会员权益');
INSERT INTO `t_strategy` VALUES ('9', '商品单价送积分', '0', '20', 'itemPrice*{3}', '0', '1', '商品单价*系数', '');
INSERT INTO `t_strategy` VALUES ('10', '当前上传公里数获得积分数', '0', '20', 'curkilom/10', '0', '1', '当前上传公里数/10', '当前上传公里数获得积分数');
INSERT INTO `t_strategy` VALUES ('11', '当前上传公里数除10余数', '0', '20', 'curkilom-10*(curkilom/10)', '0', '1', '当前上传公里数-10*(当前上传公里数/10)', '当前上传公里数除10余数');
INSERT INTO `t_strategy` VALUES ('12', '用户满1000KM赠送100积分', '0', '20', '100', '0', '4', '100', '用户满1000KM赠送100积分');
INSERT INTO `t_strategy` VALUES ('13', '用户满5000KM赠送400积分', '0', '20', '400', '0', '4', '400', '用户满5000KM赠送400积分');
INSERT INTO `t_strategy` VALUES ('14', '用户满10000KM赠送500积分', '0', '20', '500', '0', '4', '500', '用户满10000KM赠送500积分');

-- ----------------------------
-- Table structure for t_test_entity
-- ----------------------------
DROP TABLE IF EXISTS `t_test_entity`;
CREATE TABLE `t_test_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `realKey` varchar(40) NOT NULL COMMENT '属性key',
  `realValue` varchar(40) NOT NULL COMMENT '属性value',
  `code` varchar(40) NOT NULL COMMENT '业务code',
  `description` varchar(255) DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '记录是否被删除（默认为false）',
  `createTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `modifyTime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_test_entity
-- ----------------------------
INSERT INTO `t_test_entity` VALUES ('3', 'liubao', 'userName', '20160715172458', null, '0', '2016-07-15 17:24:58', '2016-07-15 17:24:58');
INSERT INTO `t_test_entity` VALUES ('4', 'liubao', 'userName', '20160715174945', '我的描述信息...', '1', '2016-07-15 17:49:45', '2016-07-17 21:50:20');
INSERT INTO `t_test_entity` VALUES ('5', 'liubao0', 'userName0', '201607172145080', null, '0', '2016-07-17 21:45:08', '2016-07-17 21:45:08');
INSERT INTO `t_test_entity` VALUES ('6', 'liubao1', 'userName1', '201607172145081', null, '0', '2016-07-17 21:45:08', '2016-07-17 21:45:08');
INSERT INTO `t_test_entity` VALUES ('7', 'liubao2', 'userName2', '201607172145082', null, '0', '2016-07-17 21:45:08', '2016-07-17 21:45:08');
INSERT INTO `t_test_entity` VALUES ('8', 'liubao3', 'userName3', '201607172145083', null, '0', '2016-07-17 21:45:08', '2016-07-17 21:45:08');
INSERT INTO `t_test_entity` VALUES ('9', 'liubao4', 'userName4', '201607172145084', null, '0', '2016-07-17 21:45:08', '2016-07-17 21:45:08');
INSERT INTO `t_test_entity` VALUES ('10', 'liubao', 'userName', '20160717214724', null, '0', '2016-07-17 21:47:24', '2016-07-17 21:47:24');
INSERT INTO `t_test_entity` VALUES ('14', 'wife', 'wasalili', 'a1f02905798e497dbf754ef9e0931c39', null, '0', '2016-07-17 22:36:50', '2016-07-17 22:36:50');
INSERT INTO `t_test_entity` VALUES ('15', 'wife0', 'wasalili0', '6185636825b44055a855d3bf496eda4e', null, '0', '2016-07-21 23:21:26', '2016-07-21 23:21:26');
INSERT INTO `t_test_entity` VALUES ('16', 'wife1', 'wasalili1', '7ece73499c8a4ba383c3ade19170b3c0', null, '0', '2016-07-21 23:21:26', '2016-07-21 23:21:26');
INSERT INTO `t_test_entity` VALUES ('17', 'wife2', 'wasalili2', '166c3e08e511483c89f9e16926824ac7', null, '0', '2016-07-21 23:21:26', '2016-07-21 23:21:26');
INSERT INTO `t_test_entity` VALUES ('18', 'wife3', 'wasalili3', 'e84576ff9a6b4dd2969affbf3122077b', null, '0', '2016-07-21 23:21:26', '2016-07-21 23:21:26');
INSERT INTO `t_test_entity` VALUES ('19', 'wife4', 'wasalili4', 'fdf95723408f4ce08e39f46278a02112', null, '0', '2016-07-21 23:21:26', '2016-07-21 23:21:26');
INSERT INTO `t_test_entity` VALUES ('20', 'wife0', 'wasalili0', '777d6d5fc19e400698ad4f1d00e099a5', null, '0', '2016-07-21 23:27:20', '2016-07-21 23:27:20');
INSERT INTO `t_test_entity` VALUES ('21', 'wife1', 'wasalili1', '4cf9f86dc6f74f71826fc6187fb9b6aa', null, '0', '2016-07-21 23:27:20', '2016-07-21 23:27:20');
INSERT INTO `t_test_entity` VALUES ('22', 'wife2', 'wasalili2', '64fae5a0b97d4c0481b640a819dc5bb6', null, '0', '2016-07-21 23:27:20', '2016-07-21 23:27:20');
INSERT INTO `t_test_entity` VALUES ('23', 'wife3', 'wasalili3', '7566bbbf59e54efd959579ffc7e97169', null, '0', '2016-07-21 23:27:20', '2016-07-21 23:27:20');
INSERT INTO `t_test_entity` VALUES ('24', 'wife4', 'wasalili4', 'b3d34adeac0e41439f87a3395f0225ee', null, '0', '2016-07-21 23:27:20', '2016-07-21 23:27:20');
INSERT INTO `t_test_entity` VALUES ('25', 'wife0', 'wasalili0', '474389d733fe4e8c96031e7cca42176f', null, '0', '2016-07-21 23:29:14', '2016-07-21 23:29:14');
INSERT INTO `t_test_entity` VALUES ('26', 'wife1', 'wasalili1', 'a49a82b39d7a426f83ecdbef78704157', null, '0', '2016-07-21 23:29:14', '2016-07-21 23:29:14');
INSERT INTO `t_test_entity` VALUES ('27', 'wife2', 'wasalili2', '43ee2f05a90d49a4a11cc716b5f7d9ec', null, '0', '2016-07-21 23:29:14', '2016-07-21 23:29:14');
INSERT INTO `t_test_entity` VALUES ('28', 'wife3', 'wasalili3', '62759995660f4b719af8905cf1a26d79', null, '0', '2016-07-21 23:29:14', '2016-07-21 23:29:14');
INSERT INTO `t_test_entity` VALUES ('29', 'wife4', 'wasalili4', '2e6ac761510549a48a986d6b458a60ff', null, '0', '2016-07-21 23:29:14', '2016-07-21 23:29:14');
INSERT INTO `t_test_entity` VALUES ('30', 'wife0', 'wasalili0', 'e219786f43ac420486a74ad31b5f5bdd', null, '0', '2016-07-21 23:32:04', '2016-07-21 23:32:04');
INSERT INTO `t_test_entity` VALUES ('31', 'wife1', 'wasalili1', '7bdbc4e6c8b94ac798604ee11f17e420', null, '0', '2016-07-21 23:32:04', '2016-07-21 23:32:04');
INSERT INTO `t_test_entity` VALUES ('32', 'wife2', 'wasalili2', '16b5c5336aeb4925a72d82545f7154db', null, '0', '2016-07-21 23:32:04', '2016-07-21 23:32:04');
INSERT INTO `t_test_entity` VALUES ('33', 'wife3', 'wasalili3', '694910e4d85f457a89d92a0d24c7a260', null, '0', '2016-07-21 23:32:04', '2016-07-21 23:32:04');
INSERT INTO `t_test_entity` VALUES ('34', 'wife4', 'wasalili4', 'fb051ea64d594cedb0c3c05ab2864d7c', null, '0', '2016-07-21 23:32:04', '2016-07-21 23:32:04');
INSERT INTO `t_test_entity` VALUES ('35', 'wife0', 'wasalili0', 'b28b1b479fd94c7786a53ae5d2b1ee1a', null, '0', '2016-07-21 23:33:02', '2016-07-21 23:33:02');
INSERT INTO `t_test_entity` VALUES ('36', 'wife1', 'wasalili1', '259c5223916f416ab0a19cd50cda6f5e', null, '0', '2016-07-21 23:33:02', '2016-07-21 23:33:02');
INSERT INTO `t_test_entity` VALUES ('37', 'wife2', 'wasalili2', '1c53ef11ca5048e4a40992aa49cefa7b', null, '0', '2016-07-21 23:33:02', '2016-07-21 23:33:02');
INSERT INTO `t_test_entity` VALUES ('38', 'wife3', 'wasalili3', '1987e930e3434920b1962ab2d9655872', null, '0', '2016-07-21 23:33:02', '2016-07-21 23:33:02');
INSERT INTO `t_test_entity` VALUES ('39', 'wife4', 'wasalili4', 'dda44add837b4c1e8704c27957715e2e', null, '0', '2016-07-21 23:33:02', '2016-07-21 23:33:02');
INSERT INTO `t_test_entity` VALUES ('40', 'wife0', 'wasalili0', '572e4dcb2cad40ca93533789535f821c', null, '0', '2016-07-21 23:35:17', '2016-07-21 23:35:17');
INSERT INTO `t_test_entity` VALUES ('41', 'wife1', 'wasalili1', 'b920356d99674dd5a26dceb67e3f41cc', null, '0', '2016-07-21 23:35:17', '2016-07-21 23:35:17');
INSERT INTO `t_test_entity` VALUES ('42', 'wife2', 'wasalili2', '7ebb429d7b45414f8ac16e650a2b6241', null, '0', '2016-07-21 23:35:17', '2016-07-21 23:35:17');
INSERT INTO `t_test_entity` VALUES ('43', 'wife3', 'wasalili3', '872a75afaefa4fdb85354c3de458707c', null, '0', '2016-07-21 23:35:17', '2016-07-21 23:35:17');
INSERT INTO `t_test_entity` VALUES ('44', 'wife4', 'wasalili4', '76798ca30c2f4b48b7ed7e98faf9b619', null, '0', '2016-07-21 23:35:17', '2016-07-21 23:35:17');
INSERT INTO `t_test_entity` VALUES ('75', 'wife0', 'wasalili0', 'eb1f534aa62846a2b488b897974872b0', null, '0', '2016-07-22 00:10:25', '2016-07-22 00:10:25');
INSERT INTO `t_test_entity` VALUES ('76', 'wife1', 'wasalili1', '2e1a25c5138e4876bc7dda23cba59182', null, '0', '2016-07-22 00:10:25', '2016-07-22 00:10:25');
INSERT INTO `t_test_entity` VALUES ('77', 'wife2', 'wasalili2', '3ec01651138541d09d69ab641479c7f6', null, '0', '2016-07-22 00:10:25', '2016-07-22 00:10:25');
INSERT INTO `t_test_entity` VALUES ('78', 'wife3', 'wasalili3', '8a2e9380a9f34397b7ece0941014bef4', null, '0', '2016-07-22 00:10:25', '2016-07-22 00:10:25');
INSERT INTO `t_test_entity` VALUES ('79', 'wife4', 'wasalili4', '16601e44dcf740948ba50ba6d3a223c1', null, '0', '2016-07-22 00:10:25', '2016-07-22 00:10:25');

-- ----------------------------
-- Table structure for t_var_candidate
-- ----------------------------
DROP TABLE IF EXISTS `t_var_candidate`;
CREATE TABLE `t_var_candidate` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '候选值主键',
  `var_cand_name` varchar(256) DEFAULT NULL,
  `var_cand_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '候选值类型（1：JSON数据，2：sqlMap->sqlId，3：Venus接口调用）',
  `cand_value` varchar(512) NOT NULL COMMENT '候选值内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='表单元素可选值配置表';

-- ----------------------------
-- Records of t_var_candidate
-- ----------------------------
INSERT INTO `t_var_candidate` VALUES ('-83', '会员等级', '1', '{\"0003\":\"黑钻\",\"0002\":\"金钻\",\"0001\":\"银钻\",\"0000\":\"注册会员\"}');
INSERT INTO `t_var_candidate` VALUES ('1', '积分获取交易渠道（废）', '3', '1');
INSERT INTO `t_var_candidate` VALUES ('2', '商品类目列表', '3', '38');
INSERT INTO `t_var_candidate` VALUES ('24', '会员认证业务类列表', '1', '{\"1\":\"手机及爱车认证\",\"2\":\"车辆信息认证\",\"3\":\"车享购车认证\"}');
INSERT INTO `t_var_candidate` VALUES ('25', '积分渠道来源', '3', '37');
INSERT INTO `t_var_candidate` VALUES ('26', '有效期类型', '1', '{\"1\":\"订单有效期\",\"2\":\"车享码有效期\"}');
INSERT INTO `t_var_candidate` VALUES ('27', '车型库品牌列表', '3', '2');
INSERT INTO `t_var_candidate` VALUES ('29', '商品所属类别', '1', '{\"0001\":\"车享家\",\"0002\":\"整车\",\"0003\":\"车享汇\",\"0004\":\"别克商城\",\"0005\":\"二手车\",\"0006\":\"安飞士\"}');
INSERT INTO `t_var_candidate` VALUES ('30', '商品类别', '1', '{\"0001\":\"生活优品\",\"0002\":\"美容养护\",\"0003\":\"保险商品\"}');
INSERT INTO `t_var_candidate` VALUES ('31', '成功失败', '1', '{\"1\":\"成功\",\"2\":\"失败\"}');
INSERT INTO `t_var_candidate` VALUES ('32', '是否', '1', '{\"1\":\"是\",\"2\":\"否\"}');
INSERT INTO `t_var_candidate` VALUES ('33', '订单渠道', '1', '{\"1\":\"pc\",\"2\":\"微信\",\"3\":\"app\"}');
INSERT INTO `t_var_candidate` VALUES ('34', '订单来源', '1', '{\"0001\":\"车享家\",\"0002\":\"整车\",\"0003\":\"车享汇\",\"0004\":\"别克商城\",\"0005\":\"安飞士\",\"0006\":\"验车\"}');
INSERT INTO `t_var_candidate` VALUES ('35', '认证状态', '1', '{\"1\":\"未验证\",\"2\":\"验证中\",\"3\":\"已验证\",\"4\":\"验证未通过\"}');
INSERT INTO `t_var_candidate` VALUES ('36', '会员类型', '1', '{\"10\":\"注册会员\",\"11\":\"认证会员\"}');

-- ----------------------------
-- Table structure for t_variable
-- ----------------------------
DROP TABLE IF EXISTS `t_variable`;
CREATE TABLE `t_variable` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '变量主键',
  `var_label` varchar(128) NOT NULL COMMENT '变量名称',
  `var_type` tinyint(4) NOT NULL DEFAULT '2' COMMENT '变量类型（1：字符串，2：整形，3：长整形，4：浮点数，5：日期，6：日期时间）',
  `var_form_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '表单类型（1：text，2：textarea，3：radio，4：select，5：date，6：datetime）',
  `var_form_length` tinyint(4) DEFAULT '40' COMMENT '长度（对于areatext对应rows，对于select，radio，checkbox无效）',
  `var_dft_value` varchar(256) DEFAULT NULL COMMENT '表单默认值',
  `var_cand_id` int(11) DEFAULT '0' COMMENT '关联候选值表',
  `var_validator` varchar(256) DEFAULT NULL COMMENT '变量配置校验',
  `is_dimension` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否维度（1：是，2：否）',
  `configuration` varchar(256) DEFAULT NULL COMMENT '表单配置其它属性集',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8 COMMENT='规则变量配置表';

-- ----------------------------
-- Records of t_variable
-- ----------------------------
INSERT INTO `t_variable` VALUES ('1', '浮点数（维度）', '4', '1', '40', '', null, null, '1', '');
INSERT INTO `t_variable` VALUES ('2', '常量值（整数）', '2', '1', '40', '', null, null, '2', '');
INSERT INTO `t_variable` VALUES ('3', '系数', '4', '1', '40', '', null, null, '2', '');
INSERT INTO `t_variable` VALUES ('4', '积分获取渠道', '2', '4', null, '', '25', null, '1', '');
INSERT INTO `t_variable` VALUES ('5', '商品类目', '2', '7', null, '', '2', null, '1', '');
INSERT INTO `t_variable` VALUES ('6', '整数值（维度）', '2', '1', null, '', null, null, '1', '');
INSERT INTO `t_variable` VALUES ('63', '多选积分获取渠道', '2', '7', null, '', '25', null, '1', '');
INSERT INTO `t_variable` VALUES ('64', '长整型（维度）	', '3', '1', null, '', null, null, '1', '');
INSERT INTO `t_variable` VALUES ('65', '字符串（维度）	', '1', '1', null, '', null, null, '1', '');
INSERT INTO `t_variable` VALUES ('66', '会员认证业务类别', '1', '4', null, '', '24', null, '1', '');
INSERT INTO `t_variable` VALUES ('67', '固定值', '2', '1', null, '', null, null, '2', '');
INSERT INTO `t_variable` VALUES ('68', '交易渠道来源', '1', '7', null, '', '25', null, '1', '');
INSERT INTO `t_variable` VALUES ('69', '常量值（字符串）', '1', '1', '100', '', null, null, '2', '');
INSERT INTO `t_variable` VALUES ('71', '车享会员等级', '1', '4', null, '', '-83', null, '1', '');
INSERT INTO `t_variable` VALUES ('72', '商品所属类别', '1', '4', null, '', '29', null, '1', '');
INSERT INTO `t_variable` VALUES ('73', '商品类别', '1', '4', null, '', '30', null, '1', '');
INSERT INTO `t_variable` VALUES ('74', '整车订单审核状态', '1', '4', null, '', '31', null, '1', '');
INSERT INTO `t_variable` VALUES ('75', '认证状态', '1', '4', null, '', '35', null, '1', '');
INSERT INTO `t_variable` VALUES ('76', '是否', '1', '4', null, '', '32', null, '1', '');
INSERT INTO `t_variable` VALUES ('77', '订单渠道', '1', '4', null, '', '33', null, '1', '');
INSERT INTO `t_variable` VALUES ('78', '订单来源', '1', '4', null, '', '34', null, '1', '');
INSERT INTO `t_variable` VALUES ('79', '订单成交时间', '5', '5', null, '', null, null, '1', '');
INSERT INTO `t_variable` VALUES ('80', '会员类型', '2', '4', null, '', '36', null, '1', '');

-- ----------------------------
-- Table structure for t_venus_invoker_bak
-- ----------------------------
DROP TABLE IF EXISTS `t_venus_invoker_bak`;
CREATE TABLE `t_venus_invoker_bak` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `interface_name` varchar(32) NOT NULL COMMENT '接口描述',
  `invoke_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '接口调用类型（1：候选值，2：行为维度回调取值，3：执行策略）',
  `host_name` varchar(128) NOT NULL COMMENT '服务IP地址',
  `host_port` int(11) NOT NULL DEFAULT '16800' COMMENT '服务端口',
  `inter_name` varchar(128) NOT NULL COMMENT '接口名称',
  `method_name` varchar(128) NOT NULL COMMENT '方法名称',
  `time_out` int(11) DEFAULT '30' COMMENT '超时时间',
  `param_list` varchar(2000) DEFAULT NULL COMMENT '参数列表',
  `return_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '返回值类型',
  `key_field` varchar(64) DEFAULT NULL COMMENT '数据字段名称',
  `value_field` varchar(64) DEFAULT NULL COMMENT '描述字段名称',
  `descript` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='Venus接口调用配置表';

-- ----------------------------
-- Records of t_venus_invoker_bak
-- ----------------------------
INSERT INTO `t_venus_invoker_bak` VALUES ('1', '获取增加积分交易渠道（废）', '1', '10.32.188.61', '16800', 'AccountTradeService', 'getAllChannelForMap', '30', '{}', '2', '', '', null);
INSERT INTO `t_venus_invoker_bak` VALUES ('2', '获取汽车品牌列表', '1', '10.32.188.61', '16800', 'CarLib.BrandService', 'findAllBrands', '30', '{}', '2', 'velBrandId', 'velBrandChsName', null);
INSERT INTO `t_venus_invoker_bak` VALUES ('3', '会员认证增加500积分', '3', '10.32.188.61', '16800', 'AccountTradeService', 'addRuleEngine', '30', '{\"tradeContent\":\"成为认证会员\",\"userId\":\"{userId}\",\"tradeChannel\":\"{tradeChannel}\",\"refId\":\"{userId}\",\"tradeAmount\":500}', '7', '', '', null);
INSERT INTO `t_venus_invoker_bak` VALUES ('4', '车辆认证增加1500积分', '3', '10.32.188.61', '16800', 'AccountTradeService', 'addRuleEngine', '30', '{\"tradeContent\":\"车辆认证成功\",\"userId\":\"{userId}\",\"tradeChannel\":\"{tradeChannel}\",\"refId\":\"{userId}\",\"tradeAmount\":1500}', '7', '', 'sdfsdf ', null);
INSERT INTO `t_venus_invoker_bak` VALUES ('5', '会员认证获取会员权益', '3', '10.32.188.61', '16800', 'iVehicleMasterInterestsService', 'addiRuleRightByUserid', '30', '{\"rightid\":\"2,3,4,7,8\",\"userid\":\"{userId}\",\"rank\":\"{rank}\"}', '7', '', '', null);
INSERT INTO `t_venus_invoker_bak` VALUES ('37', '积分渠道来源', '1', '10.32.188.61', '16800', 'TCodeService', 'getTCodeListByType', '30', '{\"typeCode\":\"JFQDLY\"}', '1', 'codeValue', 'codeName', null);
INSERT INTO `t_venus_invoker_bak` VALUES ('38', '商品类目列表new', '1', '10.32.188.211', '16800', 'MdseAttrGroupService', 'queryAllTemplates', '30', '{}', '1', 'id', 'groupName', null);
