/*
Navicat MySQL Data Transfer

Source Server         : docker_xll
Source Server Version : 50724
Source Host           : 192.168.80.131:3306
Source Database       : xc

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-05 17:42:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_address`
-- ----------------------------
DROP TABLE IF EXISTS `tb_address`;
CREATE TABLE `tb_address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) DEFAULT NULL COMMENT '用户ID',
  `province_id` varchar(10) DEFAULT NULL COMMENT '省',
  `city_id` varchar(10) DEFAULT NULL COMMENT '市',
  `town_id` varchar(10) DEFAULT NULL COMMENT '县/区',
  `mobile` varchar(255) DEFAULT NULL COMMENT '手机',
  `address` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `contact` varchar(255) DEFAULT NULL COMMENT '联系人',
  `is_default` varchar(1) DEFAULT NULL COMMENT '是否是默认 1默认 0否',
  `notes` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_date` timestamp NULL DEFAULT NULL COMMENT '创建日期',
  `alias` varchar(50) DEFAULT NULL COMMENT '别名',
  `country_id` varchar(10) DEFAULT NULL COMMENT '国家',
  `postalcode` varchar(20) DEFAULT NULL COMMENT '邮编',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1135747038697254913 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_address
-- ----------------------------
INSERT INTO `tb_address` VALUES ('59', 'lijialong', null, null, null, '13900112222', '金燕龙办公楼', '李嘉诚', '0', null, null, null, null, null);
INSERT INTO `tb_address` VALUES ('60', 'lijialong', null, null, null, '13700221122', '修正大厦', '李佳红', '0', null, null, null, null, null);
INSERT INTO `tb_address` VALUES ('61', 'lijialong', null, null, null, '13301212233', '中腾大厦', '李佳星', '0', null, null, null, null, null);
INSERT INTO `tb_address` VALUES ('62', 'zhaoliu', null, null, null, null, '西直门', '赵三', '1', null, null, null, null, null);
INSERT INTO `tb_address` VALUES ('63', 'lijialong', null, null, null, '11011011', '永春武馆', '李小龙', null, null, null, '家里', null, null);
INSERT INTO `tb_address` VALUES ('64', 'lijialong', null, null, null, '999111', '咏春武馆总部', '叶问', '1', null, null, '师爷家', null, null);
INSERT INTO `tb_address` VALUES ('65', '夕立立', null, null, null, '18872427726', '吉首大学张家界校区', '刘仕琦', '1', null, null, '学校', null, null);
INSERT INTO `tb_address` VALUES ('66', '夕立立', null, null, null, '123456789', '武汉', '戈项兴', '0', null, '2019-03-05 18:04:30', '学校', null, null);
INSERT INTO `tb_address` VALUES ('67', '夕立立', null, null, null, '1234567890', '湖北省钟祥一中', '龚傲雪', '0', null, '2019-03-05 18:08:06', '学校', null, null);
INSERT INTO `tb_address` VALUES ('1135740124810735616', null, '1', '1', '1', '1', '1', '1', '1', null, null, null, '1', '1');
INSERT INTO `tb_address` VALUES ('1135742071273984000', '1133636022178017280', '湖南省', '张家界市', '永定区', '188872427726', '吉首大学张家界校区', '大哥', '1', null, '2019-06-04 10:56:26', null, '中国', '431900');
INSERT INTO `tb_address` VALUES ('1135747000097075200', '1133636022178017280', '1', '1', '1', '1', '1', '1', '1', null, '2019-06-04 11:16:01', null, '1', '1');
INSERT INTO `tb_address` VALUES ('1135747038697254912', '1133636022178017280', '2', '2', '2', '2', '2', '2', '0', null, '2019-06-04 11:16:10', null, '2', '2');
