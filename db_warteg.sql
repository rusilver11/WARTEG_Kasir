/*
SQLyog Community v12.4.0 (64 bit)
MySQL - 10.1.26-MariaDB : Database - s2uas
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`s2uas` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `s2uas`;

/*Table structure for table `c_user` */

DROP TABLE IF EXISTS `c_user`;

CREATE TABLE `c_user` (
  `id_user` char(5) NOT NULL,
  `lvl_user` char(15) DEFAULT NULL,
  `unm_user` varchar(25) DEFAULT NULL,
  `pw_user` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `c_user` */

insert  into `c_user`(`id_user`,`lvl_user`,`unm_user`,`pw_user`) values 
('IU001','Admin','admin','admin'),
('IU002','Owner','udngrbn','udngrbn'),
('IU003','Cashier','kasir','kasir'),
('IU004','Owner','derris','derris');

/*Table structure for table `detail_transaction` */

DROP TABLE IF EXISTS `detail_transaction`;

CREATE TABLE `detail_transaction` (
  `kode_tr` char(8) NOT NULL,
  `unm_user` varchar(25) DEFAULT NULL,
  `amount` int(8) DEFAULT NULL,
  `payment` int(8) DEFAULT NULL,
  `cashback` int(8) DEFAULT NULL,
  `dt` date NOT NULL,
  PRIMARY KEY (`kode_tr`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detail_transaction` */

insert  into `detail_transaction`(`kode_tr`,`unm_user`,`amount`,`payment`,`cashback`,`dt`) values 
('KT001','kasir',17000,20000,3000,'2018-06-05'),
('KT002','',12000,15000,3000,'2018-06-05'),
('KT003','',1000,2000,1000,'2018-06-05'),
('KT004','',1000,2000,1000,'2018-06-05'),
('KT005','',11000,60000,49000,'2018-06-05'),
('KT006','',5000,6000,1000,'2018-06-05'),
('KT007','kasir',1500,2000,500,'2018-06-05'),
('KT008','kasir',24000,30000,6000,'2018-06-05');

/*Table structure for table `ms_employe` */

DROP TABLE IF EXISTS `ms_employe`;

CREATE TABLE `ms_employe` (
  `nip_emply` char(10) NOT NULL,
  `pos_emply` varchar(30) DEFAULT NULL,
  `nm_emply` varchar(30) DEFAULT NULL,
  `gender_emply` char(8) DEFAULT NULL,
  `date_emply` date DEFAULT NULL,
  `phn_emply` char(30) DEFAULT NULL,
  `adrs_emply` tinytext,
  PRIMARY KEY (`nip_emply`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ms_employe` */

insert  into `ms_employe`(`nip_emply`,`pos_emply`,`nm_emply`,`gender_emply`,`date_emply`,`phn_emply`,`adrs_emply`) values 
('17010001','Director','Derris','Male','2018-03-21','081662233','New York City'),
('17010002','HRD','panjoel','Male','1999-09-22','082199933','Balowerti jl raya'),
('17010003','Chef','Junet','Male','2018-06-12','0812333332','Randuwe omah'),
('17010004','Cashier','Alfan','Female','1998-06-21','082367575','Bucel City'),
('17010005','Cashier','Verdymas','Male','1998-06-21','08217776544','Gg.Kecil');

/*Table structure for table `ms_food` */

DROP TABLE IF EXISTS `ms_food`;

CREATE TABLE `ms_food` (
  `id_food` char(5) NOT NULL,
  `nm_food` varchar(35) NOT NULL,
  `ktgry_food` varchar(10) NOT NULL,
  `prc_food` int(8) NOT NULL,
  PRIMARY KEY (`id_food`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ms_food` */

insert  into `ms_food`(`id_food`,`nm_food`,`ktgry_food`,`prc_food`) values 
('IF001','Rujak Cingur','Dessert',5000),
('IF002','Es Teh','Drink',1000),
('IF003','Ote Ote','Snack',1000),
('IF005','Nasigoreng','Food',8000),
('IF008','Teh Hangat','Drink',2000),
('IF009','Jeruk Hangat','Drink',2000),
('IF010','Onde Onde','Snack',1000),
('IF011','Pisang Goreng','Snack',1500),
('IF012','Es Teler','Dessert',4000),
('IF013','Bakso','Food',6000),
('IF014','Sate','Food',7000),
('IF015','Perkedel','Snack',1500),
('IF016','Ayam Geprek','Food',20000),
('IF017','kolak','Dessert',4000);

/*Table structure for table `tr_transaction` */

DROP TABLE IF EXISTS `tr_transaction`;

CREATE TABLE `tr_transaction` (
  `id_transaction` int(8) NOT NULL AUTO_INCREMENT,
  `kode_tr` char(5) NOT NULL,
  `Menu` varchar(35) NOT NULL,
  `Category` varchar(10) NOT NULL,
  `Price` int(8) NOT NULL,
  `Qty` int(5) NOT NULL,
  `Amount` int(8) NOT NULL,
  `dt` date DEFAULT NULL,
  PRIMARY KEY (`id_transaction`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `tr_transaction` */

insert  into `tr_transaction`(`id_transaction`,`kode_tr`,`Menu`,`Category`,`Price`,`Qty`,`Amount`,`dt`) values 
(1,'KT001','Jeruk Hangat','Drink',2000,2,4000,'2018-06-05'),
(2,'KT001','Nasigoreng','Food',8000,1,8000,'2018-06-05'),
(3,'KT001','Ote Ote','Snack',1000,1,1000,'2018-06-05'),
(4,'KT001','Es Teler','Dessert',4000,1,4000,'2018-06-05'),
(5,'KT002','Bakso','Food',6000,2,12000,'2018-06-05'),
(6,'KT003','Ote Ote','Snack',1000,1,1000,'2018-06-05'),
(7,'KT004','Es Teh','Drink',1000,1,1000,'2018-06-05'),
(8,'KT005','Es Teler','Dessert',4000,2,8000,'2018-06-05'),
(9,'KT005','Onde Onde','Snack',1000,3,3000,'2018-06-05'),
(10,'KT006','Rujak Cingur','Dessert',5000,1,5000,'2018-06-05'),
(11,'KT007','Perkedel','Snack',1500,1,1500,'2018-06-05'),
(12,'KT008','kolak','Dessert',4000,3,12000,'2018-06-05'),
(13,'KT008','Bakso','Food',6000,2,12000,'2018-06-05');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
