/*
Navicat MySQL Data Transfer

Source Server         : docker_xll
Source Server Version : 50724
Source Host           : 192.168.80.131:3306
Source Database       : xc

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-05 17:42:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_order_item`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order_item`;
CREATE TABLE `tb_order_item` (
  `id` varchar(20) COLLATE utf8_bin NOT NULL,
  `item_id` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '商品id',
  `goods_id` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT 'SPU_ID',
  `order_id` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '订单id',
  `title` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '商品标题',
  `price` decimal(20,2) DEFAULT NULL COMMENT '商品单价',
  `num` int(10) DEFAULT NULL COMMENT '商品购买数量',
  `total_fee` decimal(20,2) DEFAULT NULL COMMENT '商品总金额',
  `pic_path` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '商品图片地址',
  `seller_id` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `item_id` (`item_id`),
  KEY `order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_order_item
-- ----------------------------
INSERT INTO `tb_order_item` VALUES ('1', '19', '149187842867954', '3', '3G 6', '1.00', '3', '3.00', null, null, null);
INSERT INTO `tb_order_item` VALUES ('10', '19', '149187842867954', '12', '3G 6', '1.00', '3', '3.00', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('11', '18', '149187842867952', '13', '3G 6', '88.88', '3', '266.64', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('1135467853404094464', '1370132', '1370132', '854731015547991626', '赫本风露肩雪纺连衣裙女春秋2019流行中长款仙女裙收腰衬衫裙子', '198.00', '6', '1188.00', '//gd3.alicdn.com/imgextra/i3/14197825/O1CN01nY7Kj427ftic6nK1m_!!14197825.jpg_400x400.jpg', '沐乃衣女装', '2');
INSERT INTO `tb_order_item` VALUES ('1135467853504757760', '1370557', '1370557', '854731015547991626', '2019春季新款女装韩版雪纺衬衫半身裙两件套百搭显瘦连衣裙套装女', '658.00', '2', '1316.00', 'https://gd1.alicdn.com/imgextra/i4/377261732/O1CN01SGWeSs1OfIUUM1pKl_!!377261732.jpg_400x400.jpg', '毛夫人美衣定制', '2');
INSERT INTO `tb_order_item` VALUES ('1135467853525729280', '1369550', '1369550', '854731015547991626', '2019早春新款中长款过膝不规则网纱短袖连衣裙女装显瘦仙女蛋糕裙', '99.00', '1', '99.00', '//gd4.alicdn.com/imgextra/i1/3143300088/O1CN01NgMqbB1CWLLytIudM_!!3143300088.jpg_400x400.jpg', '大小姐的私人衣橱', '2');
INSERT INTO `tb_order_item` VALUES ('1135467853555089408', '1370126', '1370126', '854731015547991626', '赫本风长款牛仔连衣裙女春秋韩版系带收腰衬衫裙a字长裙牛仔裙子', '218.00', '2', '436.00', 'https://gd4.alicdn.com/imgextra/i1/14197825/O1CN01Fst5OJ27ftii8GCVp_!!14197825.jpg_400x400.jpg', '沐乃衣女装', '2');
INSERT INTO `tb_order_item` VALUES ('1135467853571866624', '1370125', '1370125', '854731015547991626', '红色连衣裙女春秋长袖2019流行假两件内搭衬衫裙韩版显瘦百褶裙子', '238.00', '1', '238.00', '//gd3.alicdn.com/imgextra/i2/14197825/O1CN01SX6BHb27fthc16SZE_!!14197825.jpg_400x400.jpg', '沐乃衣女装', '2');
INSERT INTO `tb_order_item` VALUES ('1136203494974316544', '1369531', '1369531', '774471538854535217', '澳洲燕麦1000g{2罐送杯勺}牛奶麦片.早餐代餐麦片.冲饮麦片', '28.80', '2', '57.60', '//gd1.alicdn.com/imgextra/i1/3579416077/O1CN01Aqq5WS1ulJP2OdNn2_!!3579416077.jpg_400x400.jpg', '锦魅铺子', null);
INSERT INTO `tb_order_item` VALUES ('1136203496048058368', '1369989', '1369989', '774471538854535217', '谷家出品 2019春季新款女装上衣棉麻风文艺衬衣 宽松长袖亚麻衬衫', '228.00', '1', '228.00', '//gd3.alicdn.com/imgextra/i1/63790814/O1CN010Y3Nhz1HsqsGdIJYW_!!63790814.jpg_400x400.jpg', '谷家出品 [每周二上新]', null);
INSERT INTO `tb_order_item` VALUES ('1136205024435658752', '1369531', '1369531', '838510278739283962', '澳洲燕麦1000g{2罐送杯勺}牛奶麦片.早餐代餐麦片.冲饮麦片', '28.80', '1', '28.80', '//gd1.alicdn.com/imgextra/i1/3579416077/O1CN01Aqq5WS1ulJP2OdNn2_!!3579416077.jpg_400x400.jpg', '锦魅铺子', null);
INSERT INTO `tb_order_item` VALUES ('1136205024645373952', '1369989', '1369989', '838510278739283962', '谷家出品 2019春季新款女装上衣棉麻风文艺衬衣 宽松长袖亚麻衬衫', '228.00', '4', '912.00', '//gd3.alicdn.com/imgextra/i1/63790814/O1CN010Y3Nhz1HsqsGdIJYW_!!63790814.jpg_400x400.jpg', '谷家出品 [每周二上新]', null);
INSERT INTO `tb_order_item` VALUES ('12', '17', '149187842867952', '14', '3G 5.5', '99.99', '3', '299.97', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('13', '19', '149187842867954', '15', '3G 6', '1.00', '3', '3.00', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('14', '18', '149187842867952', '16', '3G 6', '88.88', '3', '266.64', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('15', '17', '149187842867952', '17', '3G 5.5', '99.99', '3', '299.97', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('16', '18', '149187842867952', '18', '高端皮具护理 联通3G 6寸', '88.88', '2', '177.76', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('17', '19', '149187842867954', '19', '3G 6', '1.00', '2', '2.00', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('18', '18', '149187842867952', '20', '3G 6', '88.88', '2', '177.76', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('19', '18', '149187842867952', '21', '高端皮具护理 联通3G 6寸', '88.88', '2', '177.76', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('2', '18', '149187842867952', '4', '3G 6', '88.88', '3', '266.64', null, null, null);
INSERT INTO `tb_order_item` VALUES ('20', '19', '149187842867954', '22', '3G 6', '1.00', '2', '2.00', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('21', '18', '149187842867952', '23', '3G 6', '88.88', '2', '177.76', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('22', '19', '149187842867954', '24', '古董 移动3G 6寸', '1.00', '2', '2.00', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('23', '19', '149187842867954', '25', '古董 移动3G 6寸', '1.00', '1', '1.00', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('24', '19', '149187842867954', '26', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('25', '19', '149187842867954', '27', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('26', '19', '149187842867954', '28', '3G 6', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('27', '19', '149187842867954', '29', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('28', '19', '149187842867954', '30', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('29', '18', '149187842867952', '31', '高端皮具护理 联通3G 6寸', '0.02', '1', '0.02', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('3', '17', '149187842867952', '5', '3G 5.5', '99.99', '3', '299.97', null, null, null);
INSERT INTO `tb_order_item` VALUES ('30', '18', '149187842867952', '32', '高端皮具护理 联通3G 6寸', '0.02', '1', '0.02', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('31', '19', '149187842867954', '33', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('32', '19', '149187842867954', '34', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('33', '19', '149187842867954', '35', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('34', '19', '149187842867954', '36', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('35', '19', '149187842867954', '37', '古董 移动3G 6寸', '0.01', '1', '0.01', null, 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('36', '18', '149187842867952', '38', '高端皮具护理 联通3G 6寸', '0.02', '1', '0.02', null, 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('4', '19', '149187842867954', '6', '3G 6', '1.00', '3', '3.00', null, null, null);
INSERT INTO `tb_order_item` VALUES ('5', '18', '149187842867952', '7', '3G 6', '88.88', '3', '266.64', null, null, null);
INSERT INTO `tb_order_item` VALUES ('6', '17', '149187842867952', '8', '3G 5.5', '99.99', '3', '299.97', null, null, null);
INSERT INTO `tb_order_item` VALUES ('7', '19', '149187842867954', '9', '3G 6', '1.00', '3', '3.00', null, null, null);
INSERT INTO `tb_order_item` VALUES ('8', '18', '149187842867952', '10', '3G 6', '88.88', '3', '266.64', null, null, null);
INSERT INTO `tb_order_item` VALUES ('9', '17', '149187842867952', '11', '3G 5.5', '99.99', '3', '299.97', null, null, null);
INSERT INTO `tb_order_item` VALUES ('918159799198212097', '1369280', '149187842867960', '918159799198212096', '精品半身裙（秋款打折） 移动3G 16G', '200.00', '2', '400.00', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('918334996291301377', '1369280', '149187842867960', '918334996291301376', '精品半身裙（秋款打折） 移动3G 16G', '200.00', '8', '1600.00', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('918334996622651392', '1369281', '149187842867960', '918334996291301376', '精品半身裙（秋款打折） 移动3G 32G', '202.00', '2', '404.00', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('918334996698148865', '1369278', '1', '918334996698148864', '【联通合约惠机】小米 红米Note 增强版 象牙白 联通4G手机', '899.00', '2', '1798.00', 'http://img12.360buyimg.com/n1/s450x450_jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg', 'yijia', null);
INSERT INTO `tb_order_item` VALUES ('918773289399160833', '1369280', '149187842867960', '918773289399160832', '精品半身裙（秋款打折） 移动3G 16G', '200.00', '1', '200.00', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('918780408353546241', '1369280', '149187842867960', '918780408353546240', '精品半身裙（秋款打折） 移动3G 16G', '0.01', '1', '0.01', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('918806410454654977', '1369280', '149187842867960', '918806410454654976', '精品半身裙（秋款打折） 移动3G 16G', '0.01', '1', '0.01', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('918833485639081985', '1369280', '149187842867960', '918833485639081984', '精品半身裙（秋款打折） 移动3G 16G', '0.01', '1', '0.01', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('918835712441212929', '1369280', '149187842867960', '918835712441212928', '精品半身裙（秋款打折） 移动3G 16G', '0.01', '1', '0.01', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('919055624854081537', '1369280', '149187842867960', '919055624854081536', '精品半身裙（秋款打折） 移动3G 16G', '0.01', '1', '0.01', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
INSERT INTO `tb_order_item` VALUES ('919059760869863425', '1369280', '149187842867960', '919059760869863424', '精品半身裙（秋款打折） 移动3G 16G', '0.01', '2', '0.02', 'http://192.168.25.133/group1/M00/00/00/wKgZhVnGbYuAO6AHAAjlKdWCzvg253.jpg', 'qiandu', null);
