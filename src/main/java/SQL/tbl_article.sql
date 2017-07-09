/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2017-07-09 13:24:04
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
  `isDeleted` tinyint(2) unsigned DEFAULT NULL COMMENT '是否删除：物理删除。 1-删除，0未删除',
  `create_time` timestamp NOT NULL DEFAULT '1971-01-01 00:00:00' COMMENT '记录创建时间',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_article
-- ----------------------------
INSERT INTO `tbl_article` VALUES ('1', '我的第一篇博客', '严德广', '几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨啊撒大声地', '0', '0', '', null, '1971-01-01 00:00:00', '2017-07-09 13:21:48');
INSERT INTO `tbl_article` VALUES ('2', '我的第一篇博客', '严德广', '几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨啊撒大声地', '0', '0', '', null, '1971-01-01 00:00:00', '2017-07-09 13:21:48');
INSERT INTO `tbl_article` VALUES ('3', '我的第一篇博客', '严德广', '几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨啊撒大声地', '0', '0', '', null, '1971-01-01 00:00:00', '2017-07-09 13:21:48');
INSERT INTO `tbl_article` VALUES ('4', '我的第一篇博客', '严德广', '几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨啊撒大声地', '0', '0', '', null, '1971-01-01 00:00:00', '2017-07-09 13:21:48');
INSERT INTO `tbl_article` VALUES ('5', '我的第一篇博客', '严德广', '几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨几天你玩我阿尔加入阿里为了家人来我家鳄梨啊撒大声地', '0', '0', '', null, '1971-01-01 00:00:00', '2017-07-09 13:21:48');
