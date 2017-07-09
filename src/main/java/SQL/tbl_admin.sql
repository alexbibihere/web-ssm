/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2017-07-09 11:48:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_admin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_admin`;
CREATE TABLE `tbl_admin` (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `create_time` timestamp NULL DEFAULT '1991-01-01 00:00:00' COMMENT '创建时间',
  `modified_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_admin
-- ----------------------------
INSERT INTO `tbl_admin` VALUES ('1', '严德广', 'iods1', '1991-01-01 00:00:00', '2017-07-09 11:44:35');
INSERT INTO `tbl_admin` VALUES ('3', 'alex2123', '12', '1991-01-01 00:00:00', '2017-07-09 11:45:42');
INSERT INTO `tbl_admin` VALUES ('4', 'alex123', '12123', '1991-01-01 00:00:00', '2017-07-09 11:45:56');
INSERT INTO `tbl_admin` VALUES ('5', '12312', '12', '1991-01-01 00:00:00', '2017-07-09 11:46:00');
INSERT INTO `tbl_admin` VALUES ('7', '12312312asd', '12', '1991-01-01 00:00:00', '2017-07-09 11:46:04');
INSERT INTO `tbl_admin` VALUES ('8', 'teste3', '12ijoij', '1991-01-01 00:00:00', '2017-07-09 11:46:08');
INSERT INTO `tbl_admin` VALUES ('9', '92', '123', '1991-01-01 00:00:00', '2017-07-09 11:46:10');
INSERT INTO `tbl_admin` VALUES ('10', 'alex2', '12', '1991-01-01 00:00:00', '2017-07-09 11:46:13');
INSERT INTO `tbl_admin` VALUES ('11', 'alex1', '12', '1991-01-01 00:00:00', '2017-07-09 11:46:16');
INSERT INTO `tbl_admin` VALUES ('12', 'alexa', '12', '1991-01-01 00:00:00', '2017-07-09 11:46:18');
INSERT INTO `tbl_admin` VALUES ('13', 'alexq', '12', '1991-01-01 00:00:00', '2017-07-09 11:46:21');
