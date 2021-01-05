create database adminManager;

use adminManager;

DROP TABLE IF EXISTS `employeeinfo`;
CREATE TABLE `employeeinfo` (
  `eno` int(10) NOT NULL auto_increment,
  `name` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `onboardat` datetime DEFAULT NULL,
  `education` varchar(10) DEFAULT NULL,
  `wedding` varchar(2),
  `updatedat` datetime DEFAULT NULL,
  `depno` int(10) NOT NULL,
  `stano` int(10) NOT NULL,
  PRIMARY KEY (`eno`)
)CHARACTER SET='utf8'; 