/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001


*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', 'admin', '1');
INSERT INTO `tbl_user` VALUES ('2', 'user', '1');
INSERT INTO `tbl_user` VALUES ('3', '1', '1');
INSERT INTO `tbl_user` VALUES ('4', 'yan', 'deguang');
INSERT INTO `tbl_user` VALUES ('5', 'yan', 'deguang');
INSERT INTO `tbl_user` VALUES ('6', 'admin1', '1');
INSERT INTO `tbl_user` VALUES ('7', '我的账号', '123');
INSERT INTO `tbl_user` VALUES ('8', 'adminjni', '1');
INSERT INTO `tbl_user` VALUES ('9', 'adminjni', '1');
INSERT INTO `tbl_user` VALUES ('10', 'alex', '123');
INSERT INTO `tbl_user` VALUES ('11', 'order', '123');
INSERT INTO `tbl_user` VALUES ('12', 'myname', '12');
INSERT INTO `tbl_user` VALUES ('13', 'myname', '1');
INSERT INTO `tbl_user` VALUES ('14', '123', '13');
INSERT INTO `tbl_user` VALUES ('15', 'admin123', '1');
INSERT INTO `tbl_user` VALUES ('16', 'admin123', '1');
INSERT INTO `tbl_user` VALUES ('17', 'admin123', '1');
INSERT INTO `tbl_user` VALUES ('18', 'admin13', '1s');
INSERT INTO `tbl_user` VALUES ('19', 'adminq', '1');
