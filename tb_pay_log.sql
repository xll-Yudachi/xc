/*
Navicat MySQL Data Transfer

Source Server         : docker_xll
Source Server Version : 50724
Source Host           : 192.168.80.131:3306
Source Database       : xc

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-05 17:42:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_pay_log`
-- ----------------------------
DROP TABLE IF EXISTS `tb_pay_log`;
CREATE TABLE `tb_pay_log` (
  `out_trade_no` varchar(30) NOT NULL COMMENT '支付订单号',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建日期',
  `pay_time` timestamp NULL DEFAULT NULL COMMENT '支付完成时间',
  `total_fee` decimal(20,0) DEFAULT NULL COMMENT '支付金额（分）',
  `user_id` varchar(50) DEFAULT NULL COMMENT '用户ID',
  `transaction_id` varchar(30) DEFAULT NULL COMMENT '交易号码',
  `trade_state` varchar(1) DEFAULT NULL COMMENT '交易状态',
  `order_list` varchar(200) DEFAULT NULL COMMENT '订单编号列表',
  `pay_type` varchar(1) DEFAULT NULL COMMENT '支付类型',
  `seller_id` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`out_trade_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pay_log
-- ----------------------------
INSERT INTO `tb_pay_log` VALUES ('201708261157265358046058', '2017-08-26 11:57:26', null, '1', 'lijialong', null, '0', '34', '1', null);
INSERT INTO `tb_pay_log` VALUES ('201708261221397410698125', '2017-08-26 12:21:39', null, '1', 'lijialong', null, '0', '35', '1', null);
INSERT INTO `tb_pay_log` VALUES ('201708261234474784646997', '2017-08-26 12:34:47', null, '1', 'lijialong', null, '0', '36', '1', null);
INSERT INTO `tb_pay_log` VALUES ('201708261247443132289031', '2017-08-26 12:47:44', '2017-08-26 12:48:22', '3', 'lijialong', '4009852001201708268336481082', '1', '37,38', '1', null);
INSERT INTO `tb_pay_log` VALUES ('854731015547991626', '2019-06-03 16:46:47', '2019-06-03 16:46:47', '3277', '1133636022178017280', '4009852001201708268336481022', '1', '854731015547991626', '1', '1133636309148102656');
INSERT INTO `tb_pay_log` VALUES ('918773291320152064', '2017-10-13 17:39:57', null, '20000', 'lijialong', null, '0', '918773289399160832', '1', null);
INSERT INTO `tb_pay_log` VALUES ('918780410236788736', '2017-10-13 18:08:14', '2017-10-13 18:09:36', '1', 'lijialong', '4200000028201710137833806033', '1', '918780408353546240', '1', null);
INSERT INTO `tb_pay_log` VALUES ('918806410983137280', '2017-10-13 19:51:33', '2017-10-13 19:51:47', '1', 'lijialong', '4200000013201710137859270000', '1', '918806410454654976', '1', null);
INSERT INTO `tb_pay_log` VALUES ('918833486129815552', '2017-10-13 21:39:08', null, '1', 'lijialong', null, '0', '918833485639081984', '1', null);
INSERT INTO `tb_pay_log` VALUES ('918835712999055360', '2017-10-13 21:47:59', '2017-10-13 21:49:28', '1', 'lijialong', '4200000018201710137883338612', '1', '918835712441212928', '1', null);
INSERT INTO `tb_pay_log` VALUES ('919055625042825216', '2017-10-14 12:21:50', null, '1', null, null, '0', '919055624854081536', '1', null);
INSERT INTO `tb_pay_log` VALUES ('919059761058607104', '2017-10-14 12:38:16', '2017-10-14 12:38:24', '2', 'lijialong', '4200000005201710147980202916', '1', '919059760869863424', '1', null);
