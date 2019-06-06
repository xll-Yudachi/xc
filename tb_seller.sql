/*
Navicat MySQL Data Transfer

Source Server         : docker_xll
Source Server Version : 50724
Source Host           : 192.168.80.131:3306
Source Database       : xc

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-05 17:42:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_seller`
-- ----------------------------
DROP TABLE IF EXISTS `tb_seller`;
CREATE TABLE `tb_seller` (
  `seller_id` varchar(100) NOT NULL COMMENT '用户ID',
  `name` varchar(80) DEFAULT NULL COMMENT '公司名',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '店铺名称',
  `password` varchar(128) DEFAULT NULL COMMENT '密码',
  `email` varchar(40) DEFAULT NULL COMMENT 'EMAIL',
  `mobile` varchar(11) DEFAULT NULL COMMENT '公司手机',
  `telephone` varchar(50) DEFAULT NULL COMMENT '公司电话',
  `status` varchar(1) DEFAULT '0' COMMENT '状态',
  `address_detail` varchar(100) DEFAULT NULL COMMENT '详细地址',
  `linkman_name` varchar(50) DEFAULT NULL COMMENT '联系人姓名',
  `linkman_qq` varchar(13) DEFAULT NULL COMMENT '联系人QQ',
  `linkman_mobile` varchar(11) DEFAULT NULL COMMENT '联系人电话',
  `linkman_email` varchar(40) DEFAULT NULL COMMENT '联系人EMAIL',
  `license_number` varchar(20) DEFAULT NULL COMMENT '营业执照号',
  `tax_number` varchar(20) DEFAULT NULL COMMENT '税务登记证号',
  `org_number` varchar(20) DEFAULT NULL COMMENT '组织机构代码',
  `address` varchar(20) DEFAULT NULL COMMENT '公司地址',
  `logo_pic` varchar(100) DEFAULT NULL COMMENT '公司LOGO图',
  `brief` varchar(2000) DEFAULT NULL COMMENT '简介',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建日期',
  `legal_person` varchar(40) DEFAULT NULL COMMENT '法定代表人',
  `legal_person_card_id` varchar(25) DEFAULT NULL COMMENT '法定代表人身份证',
  `bank_user` varchar(50) DEFAULT NULL COMMENT '开户行账号名称',
  `bank_name` varchar(100) DEFAULT NULL COMMENT '开户行',
  PRIMARY KEY (`seller_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_seller
-- ----------------------------
INSERT INTO `tb_seller` VALUES ('1133589730630307840', '卖家', null, '1', null, '18872427725', null, null, null, null, null, '18872427726', null, null, null, null, null, null, null, '2019-05-29 12:23:48', null, null, null, null);
INSERT INTO `tb_seller` VALUES ('1133636309148102656', '卖家密码隐藏', '测试商家', '$2a$10$D1Dn8K8H1KXvQxlR8ujVue6jrZWn9zbM1401ZlvMY6K7rp/joZJ7.', null, '18872427726', null, null, null, null, null, '18872427726', null, null, null, null, null, null, '这是测试店铺的简介', '2019-05-29 15:28:53', 'xll', '420881199908170052', '4224316458754159', '中国建设银行');
INSERT INTO `tb_seller` VALUES ('alibaba', '杭州阿里巴巴股份科技有限公司', '阿里金融', 'mayun', null, null, '400-860-8608', '1', '中国杭州市滨江区网商路699号滨江新园区(310052)', '马云', '452419829', '18872427726', '452419829@qq.com', '111111', '222222', '333333', null, null, null, '2019-02-06 17:31:37', '马云', '420881199908170052', '4224316458754159', '中国建设银行');
INSERT INTO `tb_seller` VALUES ('baidu', '百度公司', '百度商店', '123456', null, null, '4004004400', '1', '西二旗小胡同', '李彦宏', '123456', '1390000111', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_seller` VALUES ('huawei', '华为公司', '华为旗舰店', 'e10adc3949ba59abbe56e057f20f883e', null, null, '010-0101010', '1', '西直门', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_seller` VALUES ('itcast', '传智播客集团', '传智播客', '123456', null, null, '010-88888888', '1', '北京市昌平区建材城西路金燕龙办公楼', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_seller` VALUES ('itheima', '黑马程序员', '黑马程序员', '123456', null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_seller` VALUES ('milu', 'ml', '麋鹿森林', '$2a$10$odtIF8rtJg.QpCQnNnqAbuaMlRJWdU9eqit6mf5T8r3MOMj/UC5Vy', null, null, '123', '1', '123', '123', '123', '123', '123', '123', '123', '123', null, null, null, '2019-02-10 17:09:34', '123', '123', '123', '中国银行');
INSERT INTO `tb_seller` VALUES ('qiandu', '千度公司', '千度商店', '$2a$10$uXL58WhPW/Nl.fScwezXN.BOm6xbM8TzkTxDYz55NqM5fkWjBvjpy', null, null, '8008008800', '1', '西三旗', '李倩渡', '1231234', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_seller` VALUES ('xiaomi', '小米科技有限责任公司', '小米旗舰店', '$2a$10$ggOfPMAcgO2ZrmYzZh3nt.hi76ToblbeC.AMR7sOu.GfFOz8r4bnC', null, null, '400-100-5678', '1', '北京市海淀区清河中街68号 华润五彩城写字楼', '李先生', '307315255', '18872427726', 'lilei@xiaomi.com', '111111', '222222', '333333', null, null, null, '2019-02-07 22:46:31', '雷军', '420881199908170052', '123456789', '中国银行');
INSERT INTO `tb_seller` VALUES ('xll', null, 'xll', '$2a$10$VlYaukQDr8csiyToPSqEveZ8Wt5RSDzocCOUol0IPiB1ZxkTaHHPe', null, null, null, '2', null, null, null, null, null, null, null, null, null, null, null, '2019-02-07 22:47:56', null, null, null, null);
INSERT INTO `tb_seller` VALUES ('yijia', '宜家公司', '宜家', '$2a$10$48L/s1R4aD1StL.sZF6u1uHGOllesyDkHK8KzWbAIGZplfwKsdwlC', null, null, '4004004400', '1', '西直门大街', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
