-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: flyaway
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `carrier`
--

DROP TABLE IF EXISTS `carrier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carrier` (
  `cid` int NOT NULL,
  `c_name` varchar(30) NOT NULL,
  `fid` int NOT NULL,
  PRIMARY KEY (`cid`),
  KEY `fid` (`fid`),
  CONSTRAINT `carrier_ibfk_1` FOREIGN KEY (`fid`) REFERENCES `flights` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flights` (
  `m_sd_id` int NOT NULL,
  `c_id` int NOT NULL,
  `fprice` double(10,2) NOT NULL,
  `arrival_time_to_destination` varchar(20) DEFAULT NULL,
  `departure_from_source_time` varchar(20) DEFAULT NULL,
  `available` varchar(20) NOT NULL,
  `f_id` int NOT NULL,
  PRIMARY KEY (`f_id`),
  KEY `m_sd_id` (`m_sd_id`),
  KEY `c_id` (`c_id`),
  CONSTRAINT `flights_ibfk_1` FOREIGN KEY (`m_sd_id`) REFERENCES `master_s_d` (`sd_id`),
  CONSTRAINT `flights_ibfk_2` FOREIGN KEY (`c_id`) REFERENCES `carrier` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `name` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `username` varchar(40) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `role` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `master_s_d`
--

DROP TABLE IF EXISTS `master_s_d`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `master_s_d` (
  `source` varchar(30) NOT NULL,
  `destination` varchar(40) NOT NULL,
  `sd_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`sd_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passenger` (
  `p_name` varchar(30) NOT NULL,
  `p_sex` varchar(10) NOT NULL,
  `user_name` varchar(40) NOT NULL,
  `p_age` int unsigned NOT NULL,
  `p_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`p_id`),
  KEY `user_name` (`user_name`),
  CONSTRAINT `passenger_ibfk_1` FOREIGN KEY (`user_name`) REFERENCES `login` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tickets` (
  `flight_id` int NOT NULL,
  `u_name` varchar(40) NOT NULL,
  `date_of_travel` varchar(30) NOT NULL,
  `date_of_booking` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `tid` int NOT NULL AUTO_INCREMENT,
  `p_age` int unsigned NOT NULL,
  `p_name` varchar(30) NOT NULL,
  `p_sex` varchar(10) NOT NULL,
  `payment_status` varchar(20) NOT NULL,
  PRIMARY KEY (`tid`),
  KEY `flight_id` (`flight_id`),
  KEY `u_name` (`u_name`),
  CONSTRAINT `tickets_ibfk_1` FOREIGN KEY (`flight_id`) REFERENCES `flights` (`f_id`),
  CONSTRAINT `tickets_ibfk_2` FOREIGN KEY (`u_name`) REFERENCES `login` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-27 20:26:30
