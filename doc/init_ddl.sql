-- Host: 127.0.0.1    Database: testdb
-- ------------------------------------------------------
-- Server version	5.7.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_regulate_config`
--

DROP TABLE IF EXISTS `t_regulate_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_regulate_config` (
  `Fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `Fchannel_id` int(8) NOT NULL DEFAULT '-1' COMMENT '渠道ID',
  `Fpriority` int(8) NOT NULL DEFAULT '-1' COMMENT '优先级',
  `Factive_flag` int(2) NOT NULL DEFAULT '1' COMMENT '是否生效：1-是，0否',
  `Fdel_flag` int(2) NOT NULL DEFAULT '0' COMMENT '逻辑删除标记：1-是，0否',
  `Fmod_count` int(8) NOT NULL DEFAULT '0' COMMENT '历史累计改动次数',
  `Fhash` varchar(32) NOT NULL DEFAULT '' COMMENT '该管控渠道的哈希',
  `Fcreate_user` varchar(32) NOT NULL DEFAULT '' COMMENT '创建人',
  `Fcreate_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `Fmodify_user` varchar(32) NOT NULL DEFAULT '' COMMENT '修改人',
  `Fmodify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `Fmodify_desc` varchar(32) DEFAULT '' COMMENT '修改详情',
  PRIMARY KEY (`Fid`),
  KEY `idx_modify_time` (`Fmodify_time`),
  KEY `idx_channel_id` (`Fchannel_id`,`Fdel_flag`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='管控配置';
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-28 11:36:50
