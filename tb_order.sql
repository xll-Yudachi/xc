/*
Navicat MySQL Data Transfer

Source Server         : docker_xll
Source Server Version : 50724
Source Host           : 192.168.80.131:3306
Source Database       : xc

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-05 17:42:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `order_id` varchar(128) COLLATE utf8_bin NOT NULL COMMENT '订单id',
  `payment` decimal(20,2) DEFAULT NULL COMMENT '实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分',
  `payment_type` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '支付类型，1、在线支付，2、货到付款',
  `post_fee` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分',
  `status` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '订单创建时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '订单更新时间',
  `payment_time` timestamp NULL DEFAULT NULL COMMENT '付款时间',
  `consign_time` timestamp NULL DEFAULT NULL COMMENT '发货时间',
  `end_time` timestamp NULL DEFAULT NULL COMMENT '交易完成时间',
  `close_time` timestamp NULL DEFAULT NULL COMMENT '交易关闭时间',
  `shipping_name` varchar(10000) COLLATE utf8_bin DEFAULT NULL COMMENT '物流名称',
  `shipping_code` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '物流单号',
  `user_id` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '用户id',
  `buyer_message` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '买家留言',
  `buyer_nick` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '买家昵称',
  `buyer_rate` varchar(2) COLLATE utf8_bin DEFAULT NULL COMMENT '买家是否已经评价',
  `receiver_area_name` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '收货人地区名称(省，市，县)街道',
  `receiver_mobile` varchar(12) COLLATE utf8_bin DEFAULT NULL COMMENT '收货人手机',
  `receiver_zip_code` varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT '收货人邮编',
  `receiver` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '收货人',
  `expire` timestamp NULL DEFAULT NULL COMMENT '过期时间，定期清理',
  `invoice_type` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '发票类型(普通发票，电子发票，增值税发票)',
  `source_type` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端',
  `seller_id` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '商家ID',
  `shipping_content` varchar(10000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `create_time` (`create_time`),
  KEY `buyer_nick` (`buyer_nick`),
  KEY `status` (`status`),
  KEY `payment_type` (`payment_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES ('1', null, '1', null, '0', '2017-08-24 20:42:25', '2017-08-24 20:42:25', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('10', '266.64', '1', null, '0', '2017-08-24 21:01:11', '2017-08-24 21:01:11', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('11', '299.97', '1', null, '0', '2017-08-24 21:01:11', '2017-08-24 21:01:11', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('12', '3.00', '1', null, '0', '2017-08-24 21:05:56', '2017-08-24 21:05:56', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('13', '266.64', '1', null, '0', '2017-08-24 21:05:56', '2017-08-24 21:05:56', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('14', '299.97', '1', null, '0', '2017-08-24 21:05:56', '2017-08-24 21:05:56', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('15', '3.00', '1', null, '0', '2017-08-24 23:07:38', '2017-08-24 23:07:38', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('16', '266.64', '1', null, '0', '2017-08-24 23:07:38', '2017-08-24 23:07:38', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('17', '299.97', '1', null, '0', '2017-08-24 23:07:38', '2017-08-24 23:07:38', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('18', '177.76', '1', null, '1', '2017-08-25 11:59:03', '2017-08-25 11:59:03', null, null, null, null, null, null, 'lijialong', null, null, null, null, null, null, null, null, null, null, 'yijia', null);
INSERT INTO `tb_order` VALUES ('19', '2.00', '1', null, '1', '2017-08-25 11:59:03', '2017-08-25 11:59:03', null, null, null, null, null, null, 'lijialong', null, null, null, null, null, null, null, null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('2', null, '1', null, '0', '2017-08-24 20:44:03', '2017-08-24 20:44:03', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('20', '177.76', '1', null, '1', '2017-08-25 11:59:03', '2017-08-25 11:59:03', null, null, null, null, null, null, 'lijialong', null, null, null, null, null, null, null, null, null, null, 'yijia', null);
INSERT INTO `tb_order` VALUES ('21', '177.76', '1', null, '1', '2017-08-25 23:26:10', '2017-08-25 23:26:10', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('22', '2.00', '1', null, '1', '2017-08-25 23:26:11', '2017-08-25 23:26:11', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('23', '177.76', '1', null, '1', '2017-08-25 23:26:11', '2017-08-25 23:26:11', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('24', '2.00', '1', null, '1', '2017-08-25 23:28:10', '2017-08-25 23:28:10', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('25', '1.00', '1', null, '1', '2017-08-25 23:49:18', '2017-08-25 23:49:18', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('26', '0.01', '1', null, '1', '2017-08-26 00:06:31', '2017-08-26 00:06:31', null, null, null, null, null, null, 'lijialong', null, null, null, '修正大厦', '13700221122', null, '李佳红', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('27', '0.01', '1', null, '1', '2017-08-26 00:10:13', '2017-08-26 00:10:13', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('28', '0.01', '1', null, '1', '2017-08-26 00:17:53', '2017-08-26 00:17:53', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('29', '0.01', '1', null, '1', '2017-08-26 00:19:56', '2017-08-26 00:19:56', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('3', '3.00', '1', null, '0', '2017-08-24 20:46:10', '2017-08-24 20:46:10', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('30', '0.01', '1', null, '1', '2017-08-26 00:37:47', '2017-08-26 00:37:47', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('31', '0.02', '1', null, '1', '2017-08-26 00:37:47', '2017-08-26 00:37:47', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('32', '0.02', '1', null, '2', '2017-08-26 00:41:13', '2017-08-26 00:41:13', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('33', '0.01', '1', null, '2', '2017-08-26 00:41:14', '2017-08-26 00:41:14', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('34', '0.01', '1', null, '1', '2017-08-26 11:57:26', '2017-08-26 11:57:26', null, null, null, null, null, null, 'lijialong', null, null, null, null, null, null, null, null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('35', '0.01', '1', null, '1', '2017-08-26 12:21:39', '2017-08-26 12:21:39', null, null, null, null, null, null, 'lijialong', null, null, null, null, null, null, null, null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('36', '0.01', '1', null, '1', '2017-08-26 12:34:46', '2017-08-26 12:34:46', null, null, null, null, null, null, 'lijialong', null, null, null, null, null, null, null, null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('37', '0.01', '1', null, '2', '2017-08-26 12:47:44', '2017-08-26 12:47:44', null, null, null, null, null, null, 'lijialong', null, null, null, null, null, null, null, null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('38', '0.02', '1', null, '2', '2017-08-26 12:47:44', '2017-08-26 12:47:44', null, null, null, null, null, null, 'lijialong', null, null, null, null, null, null, null, null, null, null, 'yijia', null);
INSERT INTO `tb_order` VALUES ('4', '266.64', '1', null, '0', '2017-08-24 20:46:11', '2017-08-24 20:46:11', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('5', '299.97', '1', null, '0', '2017-08-24 20:46:11', '2017-08-24 20:46:11', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('6', '3.00', '1', null, '0', '2017-08-24 20:46:40', '2017-08-24 20:46:40', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('7', '266.64', '1', null, '0', '2017-08-24 20:46:40', '2017-08-24 20:46:40', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('774471538854535217', '285.60', '1', '0', '2', '2019-06-05 17:29:52', '2019-06-05 17:29:52', '2019-06-05 17:29:52', '2019-06-05 17:29:52', '2019-06-05 17:29:52', null, '订单号：774471538854535217', '774471538854535217', '1133636022178017280', null, '买家密码隐藏', null, null, null, null, null, null, null, '2', null, '澳洲燕麦1000g{2罐送杯勺}牛奶麦片.早餐代餐麦片.冲饮麦片 谷家出品 2019春季新款女装上衣棉麻风文艺衬衣 宽松长袖亚麻衬衫 ');
INSERT INTO `tb_order` VALUES ('8', '299.97', '1', null, '0', '2017-08-24 20:46:40', '2017-08-24 20:46:40', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('838510278739283962', '940.80', '1', '0', '2', '2019-06-05 17:36:02', '2019-06-05 17:36:02', '2019-06-05 17:36:02', '2019-06-05 17:36:02', '2019-06-05 17:36:02', null, '订单号：838510278739283962', '838510278739283962', '1133636022178017280', null, '买家密码隐藏', null, null, null, null, null, null, null, '2', null, '澳洲燕麦1000g{2罐送杯勺}牛奶麦片.早餐代餐麦片.冲饮麦片 谷家出品 2019春季新款女装上衣棉麻风文艺衬衣 宽松长袖亚麻衬衫 ');
INSERT INTO `tb_order` VALUES ('854731015547991626', '3277.00', '1', '0', '2', '2019-06-03 16:46:47', '2019-06-03 16:46:47', '2019-06-03 16:46:47', '2019-06-03 16:46:47', '2019-06-03 16:46:47', null, '订单号：854731015547991626', '854731015547991626', '1133636022178017280', null, '买家密码隐藏', null, null, null, null, null, null, null, '2', '1133636309148102656', '赫本风露肩雪纺连衣裙女春秋2019流行中长款仙女裙收腰衬衫裙子 2019春季新款女装韩版雪纺衬衫半身裙两件套百搭显瘦连衣裙套装女 2019早春新款中长款过膝不规则网纱短袖连衣裙女装显瘦仙女蛋糕裙 赫本风长款牛仔连衣裙女春秋韩版系带收腰衬衫裙a字长裙牛仔裙子 红色连衣裙女春秋长袖2019流行假两件内搭衬衫裙韩版显瘦百褶裙子 ');
INSERT INTO `tb_order` VALUES ('9', '3.00', '1', null, '0', '2017-08-24 21:01:10', '2017-08-24 21:01:10', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, null, null, null);
INSERT INTO `tb_order` VALUES ('918159799198212096', '400.00', '1', null, '1', '2017-10-12 01:02:09', '2017-10-12 01:02:09', null, null, null, null, null, null, 'lijialong', null, null, null, '咏春武馆总部', '999111', null, '叶问', null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('918334996291301376', '2004.00', '2', null, '1', '2017-10-12 12:38:19', '2017-10-12 12:38:19', null, null, null, null, null, null, 'lijialong', null, null, null, '永春武馆', '11011011', null, '李小龙', null, null, '2', 'qiandu', null);
INSERT INTO `tb_order` VALUES ('918334996698148864', '1798.00', '2', null, '1', '2017-10-12 12:38:19', '2017-10-12 12:38:19', null, null, null, null, null, null, 'lijialong', null, null, null, '永春武馆', '11011011', null, '李小龙', null, null, '2', 'yijia', null);
INSERT INTO `tb_order` VALUES ('918773289399160832', '200.00', '1', null, '1', '2017-10-13 17:39:56', '2017-10-13 17:39:56', null, null, null, null, null, null, 'lijialong', null, null, null, '永春武馆', '11011011', null, '李小龙', null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('918780408353546240', '0.01', '1', null, '2', '2017-10-13 18:08:14', '2017-10-13 18:08:14', null, null, null, null, null, null, 'lijialong', null, null, null, '永春武馆', '11011011', null, '李小龙', null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('918806410454654976', '0.01', '1', null, '2', '2017-10-13 19:51:33', '2017-10-13 19:51:33', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('918833485639081984', '0.01', '1', null, '1', '2017-10-13 21:39:08', '2017-10-13 21:39:08', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('918835712441212928', '0.01', '1', null, '2', '2017-10-13 21:47:59', '2017-10-13 21:47:59', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, null, 'qiandu', null);
INSERT INTO `tb_order` VALUES ('919055624854081536', '0.01', '1', null, '1', '2017-10-14 12:21:50', '2017-10-14 12:21:50', null, null, null, null, null, null, 'lijialong', null, null, null, '中腾大厦', '13301212233', null, '李佳星', null, null, '2', 'qiandu', null);
INSERT INTO `tb_order` VALUES ('919059760869863424', '0.02', '1', null, '2', '2017-10-14 12:38:16', '2017-10-14 12:38:16', null, null, null, null, null, null, 'lijialong', null, null, null, '金燕龙办公楼', '13900112222', null, '李嘉诚', null, null, '2', 'qiandu', null);
