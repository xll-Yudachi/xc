/*
Navicat MySQL Data Transfer

Source Server         : docker_xll
Source Server Version : 50724
Source Host           : 192.168.80.131:3306
Source Database       : xc

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-05 17:43:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` varchar(128) NOT NULL,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(128) NOT NULL COMMENT '密码，加密存储',
  `phone` varchar(20) DEFAULT NULL COMMENT '注册手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '注册邮箱',
  `created` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `updated` timestamp NULL DEFAULT NULL,
  `source_type` varchar(1) DEFAULT NULL COMMENT '会员来源：1:PC，2：H5，3：Android，4：IOS，5：WeChat',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `status` varchar(1) DEFAULT NULL COMMENT '使用状态（Y正常 N非正常）',
  `head_pic` varchar(150) DEFAULT NULL COMMENT '头像地址',
  `qq` varchar(20) DEFAULT NULL COMMENT 'QQ号码',
  `account_balance` decimal(10,0) DEFAULT NULL COMMENT '账户余额',
  `is_mobile_check` varchar(1) DEFAULT '0' COMMENT '手机是否验证 （0否  1是）',
  `is_email_check` varchar(1) DEFAULT '0' COMMENT '邮箱是否检测（0否  1是）',
  `sex` varchar(1) DEFAULT '0' COMMENT '性别，1男，2女',
  `user_level` int(11) DEFAULT NULL COMMENT '会员等级',
  `points` int(11) DEFAULT NULL COMMENT '积分',
  `experience_value` int(11) DEFAULT NULL COMMENT '经验值',
  `birthday` timestamp NULL DEFAULT NULL COMMENT '生日',
  `last_login_time` timestamp NULL DEFAULT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1133399587764047872', 'cs1', '11', '12345678', null, '2019-05-28 23:48:14', '2019-05-28 23:48:14', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2019-05-28 23:48:14');
INSERT INTO `tb_user` VALUES ('1133570919025897472', 'cs4', '1', '18872427724', null, '2019-05-29 11:09:02', '2019-05-29 11:09:02', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, '2019-05-29 11:09:02');
INSERT INTO `tb_user` VALUES ('1133572335119372288', '123', '1', '15807447903', null, '2019-05-29 11:14:40', '2019-05-29 11:14:40', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, '2019-05-29 11:14:40');
INSERT INTO `tb_user` VALUES ('1133589603706474496', '买家', '1', '18872427722', null, '2019-05-29 12:23:17', '2019-05-29 12:23:17', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, '2019-05-29 12:23:17');
INSERT INTO `tb_user` VALUES ('1133636022178017280', '买家密码隐藏', '$2a$10$uiwlo/BePE67h7lPK3vdhONMrwJgF5WIsqXFgGA/2iJT3PX4STcoe', '18872427726', '452419829@qq.com', '2019-05-29 15:27:44', '2019-05-29 15:27:44', '1', null, '吴正威', null, null, '452419829', '452419829', null, null, '男', null, null, null, '1999-09-19 08:00:00', '2019-05-29 15:27:44');
INSERT INTO `tb_user` VALUES ('16', '夕立立', 'e10adc3949ba59abbe56e057f20f883e', '18872427725', null, '2019-03-02 16:56:31', '2019-03-02 16:56:31', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('17', '沈旖旎', '49988cfedcf69b35df78900954c6c302', '15274452010', null, '2019-03-02 19:54:39', '2019-03-02 19:54:39', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('18', '刘仕琦', '49988cfedcf69b35df78900954c6c302', '15274452010', null, '2019-03-02 20:06:56', '2019-03-02 20:06:56', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('19', 'xll', 'e10adc3949ba59abbe56e057f20f883e', '18872427723', null, '2019-03-03 12:49:12', '2019-03-03 12:49:12', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
