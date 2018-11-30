-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: land
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `complaint`
--

DROP TABLE IF EXISTS `complaint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `complaint` (
  `id` bigint(20) NOT NULL,
  `date` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaint`
--

LOCK TABLES `complaint` WRITE;
/*!40000 ALTER TABLE `complaint` DISABLE KEYS */;
/*!40000 ALTER TABLE `complaint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (4,'VASQUEZ','Alberto',''),(6,'martinez','angela','3057613573'),(8,'PEREZ','CARLOS','mobile 786-271-9486 casa 305-685-2774'),(10,'FERNANDEZ','CARLOS ','3053220544'),(12,'PUERTO RICO','CARMEN',''),(14,'MENDEZ','DANIEL ',''),(16,'RAMOS','DAIMY',''),(18,'','EDI',''),(20,'','ERID',''),(22,'','ENEDINA',''),(24,'','FERMIN DE OCA',''),(26,'GONZALEZ','FRANK',''),(28,'','GLADIS',''),(30,'','JUAN ',''),(32,'CARVO','JORGE','7862509882'),(34,'OLIVERA','JOSE ',''),(36,'','KATTY',''),(38,'CHACON','LUISA ',''),(40,'CHACON','LUISA',''),(42,'','LUIS VECINO',''),(44,'PRIETO','LUIS ',''),(46,'','LETICIA',''),(48,'','MATI',''),(52,'','ALEGRA MIMI',''),(54,'','MARITZA',''),(56,'PRENTON','MIGDALIA ',''),(60,'','MIKE ',''),(62,'','MILLY',''),(64,'RODRIGUEZ','NORA ',''),(66,'','NEIDA',''),(73,'','RAMIRO',''),(71,'SALAZAR','OLIVIA',''),(75,'','RAUL',''),(79,'ESPINOSA','ROGELIO ','');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (81),(81),(81),(81);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pet`
--

DROP TABLE IF EXISTS `pet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pet` (
  `name` varchar(20) DEFAULT NULL,
  `owner` varchar(20) DEFAULT NULL,
  `species` varchar(20) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `death` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pet`
--

LOCK TABLES `pet` WRITE;
/*!40000 ALTER TABLE `pet` DISABLE KEYS */;
/*!40000 ALTER TABLE `pet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yard`
--

DROP TABLE IF EXISTS `yard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yard` (
  `id` bigint(20) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `datedone` datetime DEFAULT NULL,
  `frequencesummer` int(11) DEFAULT NULL,
  `frequencewinter` int(11) DEFAULT NULL,
  `streetandnumber` varchar(255) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKi2ntavu6aw1wmypyrsv966enj` (`customer_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yard`
--

LOCK TABLES `yard` WRITE;
/*!40000 ALTER TABLE `yard` DISABLE KEYS */;
INSERT INTO `yard` VALUES (1,'hilaeah',NULL,NULL,NULL,'196 eats 41 st',NULL),(5,'hialeah','2018-11-06 00:00:00',15,20,'18 st w',4),(7,'hialeah','2018-11-15 00:00:00',15,20,'12 ave 36 str',6),(9,'HIALEAH','2018-10-18 00:00:00',15,20,'EAST 43 STREET',8),(11,'HIALEAH','2018-11-15 00:00:00',15,20,'423 W 14 ST',10),(13,'HIALEAH','2018-11-05 00:00:00',15,20,'10 AVE',12),(15,'MIAMI ','2018-11-08 00:00:00',15,20,'81 STREET',14),(17,'','2018-11-13 00:00:00',15,20,'225 W 33 STREET',16),(19,'HIEALEH','2018-11-29 00:00:00',15,20,'WEST 30TH STREET',18),(21,'HIALEAH','2018-11-02 00:00:00',15,20,'1745 NW 57 ST',20),(23,'HIALEAH','2018-10-27 00:00:00',15,20,'685 W 60 STREET',22),(25,'MIAMI BEACH','2018-12-15 00:00:00',15,20,'605 EUCLIDES ST',24),(27,'MIAMI SHORES','2018-11-14 00:00:00',15,20,'NE MIAMI AVE',26),(29,'HIALEAH','2018-10-24 00:00:00',15,20,'8031 W 16 AVE',28),(31,'HIALEAH','2018-11-01 00:00:00',15,20,'W 30TH STREET ',30),(33,'MIAMI','2018-11-22 00:00:00',15,20,'SW 24TH STREET',32),(35,'','2018-11-05 00:00:00',15,20,'1140 W 25TH STREET',34),(37,'MIAMI SHORES','2018-10-26 00:00:00',15,20,'135 STREET N MIAMI AVE',36),(39,'HIALEAH','2018-11-15 00:00:00',15,20,'1220 W 37TH STREET',38),(41,'HIALEAH','2018-11-15 00:00:00',15,20,'1220 W 37TH ST',40),(43,'HIALEAH','2018-11-03 00:00:00',15,21,'194 EAST 41 STREET',42),(45,'HIALEAH','2018-11-15 00:00:00',15,20,'295 W 30 STREET',44),(47,'BAY HARBOR ISLANDS','2018-11-22 00:00:00',15,20,'1271 98TH STREET',46),(49,'MIAMI','2018-10-26 00:00:00',15,20,'NE MIAMI AVE',48),(53,'HIALEAH','2018-11-29 00:00:00',15,20,'EAST 10AVE',52),(55,'','2018-11-15 00:00:00',15,20,'11221 NW 62 CT',54),(57,'','2018-11-21 00:00:00',15,20,'37 STREET',56),(61,'BAY HARBOR ISLANDS','2018-11-28 00:00:00',15,20,'9700 EAST BAY HARBOR DR',60),(63,'HIALEAH','2018-11-17 00:00:00',15,20,'699 E 19 STREET',62),(65,'HIALEAH','2018-11-09 00:00:00',15,20,'914 W 72 STREET',64),(67,'HIALEAH','2018-11-30 00:00:00',15,20,'41TH STREET',66),(74,'HIALEAH','2018-11-22 00:00:00',15,20,'714 E 52 STREET',73),(72,'MIAMI','2018-11-22 00:00:00',15,20,'335 SW 24 STREET',71),(76,'HIALEAH','2018-11-13 00:00:00',15,20,'19TH STREET',75),(80,'HIALEAH','2018-11-01 00:00:00',15,20,'12 AVE 37TH STREET',79);
/*!40000 ALTER TABLE `yard` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-30  2:46:57
