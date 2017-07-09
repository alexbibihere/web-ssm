/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2017-07-09 11:41:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_article
-- ----------------------------
DROP TABLE IF EXISTS `tbl_article`;
CREATE TABLE `tbl_article` (
  `id` int(32) NOT NULL,
  `title` varchar(255) DEFAULT NULL COMMENT '文章标题',
  `author` varchar(128) NOT NULL COMMENT '作者',
  `content` longtext COMMENT '文章内容',
  `read_num` int(32) NOT NULL COMMENT '阅读数量',
  `comment_num` int(32) NOT NULL COMMENT '评论数量',
  `category_id` varchar(32) NOT NULL COMMENT '文章所属分类id',
  `user_id` varchar(32) NOT NULL COMMENT '作者id、tbl_user里id',
  `isDeleted` tinyint(2) unsigned DEFAULT NULL COMMENT '是否删除：物理删除。 1-删除，0未删除',
  `create_time` timestamp NOT NULL DEFAULT '1971-01-01 00:00:00' COMMENT '记录创建时间',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  PRIMARY KEY (`id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
