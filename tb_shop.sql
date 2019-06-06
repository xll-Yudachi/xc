/*
Navicat MySQL Data Transfer

Source Server         : docker_xll
Source Server Version : 50724
Source Host           : 192.168.80.131:3306
Source Database       : xc

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-05 17:43:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_shop`
-- ----------------------------
DROP TABLE IF EXISTS `tb_shop`;
CREATE TABLE `tb_shop` (
  `id` varchar(20) CHARACTER SET utf8 NOT NULL,
  `seller_id` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `shop_name` varchar(256) CHARACTER SET utf8 DEFAULT NULL,
  `province_id` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `city_id` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `town_id` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `brief` varchar(10000) CHARACTER SET utf8 DEFAULT NULL,
  `image` varchar(256) CHARACTER SET utf8 DEFAULT NULL,
  `legal_person_card_id` varchar(256) CHARACTER SET utf8 DEFAULT NULL,
  `license_number` varchar(256) CHARACTER SET utf8 DEFAULT NULL,
  `status` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tb_shop
-- ----------------------------
INSERT INTO `tb_shop` VALUES ('1', '1133636309148102656', '测试商家', '湖南', '张家界', '永定区', '这是测试店铺的简介', null, '123456', '123456', '2');
INSERT INTO `tb_shop` VALUES ('1135924999283134464', '1133636309148102656', '测试店铺5', '湖南', '张家界', '永定', '这是测试店铺5简介', 'C:\\fakepath\\5bc037edN204f29b3.jpg', '123456', '654321', '1');
INSERT INTO `tb_shop` VALUES ('1135925352414171136', '1133636309148102656', '测试店铺6', '湖南', '张家界', '永定', '这是测试店铺6的简介', 'C:\\fakepath\\TB2C6e1e98mpuFjSZFMXXaxpVXa_!!73251842.jpg', '111', '222', '1');
INSERT INTO `tb_shop` VALUES ('1135925644111237120', '1133636309148102656', '测试店铺7', '湖南', '张家界', '永定', '这是测试店铺7的简介', 'C:\\fakepath\\TB2BiYTnG8lpuFjy0FpXXaGrpXa_!!73251842.jpg', '111', '222', '1');
INSERT INTO `tb_shop` VALUES ('2', '1133636309148102656', '测试商家2', '湖南', '张家界', '永定区', '这是测试店铺简介2', null, '654321', '654321', '1');
INSERT INTO `tb_shop` VALUES ('3', '1133636309148102656', '测试商家3', '湖南', '张家界', '永定区', '这是测试店铺简介3', null, '111111', '111111', '0');
INSERT INTO `tb_shop` VALUES ('4', '1133636309148102656', '测试商家4', '湖南', '张家界', '永定区', '这是测试简介4', null, '666666', '666666', '3');
