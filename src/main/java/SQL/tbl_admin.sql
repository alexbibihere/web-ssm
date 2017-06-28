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
-- Table structure for tbl_admin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_admin`;
CREATE TABLE `tbl_admin` (
  `id` int(50) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_admin
-- ----------------------------
INSERT INTO `tbl_admin` VALUES ('1', 'admin', '1', '1131');
INSERT INTO `tbl_admin` VALUES ('2', 'alex', '3', '12');
INSERT INTO `tbl_admin` VALUES ('3', 'alex', '4', '3');
INSERT INTO `tbl_admin` VALUES ('4', 'alex', '5', '2');
INSERT INTO `tbl_admin` VALUES ('5', 'alex', '7', '2');
