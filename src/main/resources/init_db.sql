CREATE SCHEMA IF NOT EXISTS `taxi_service` DEFAULT CHARACTER SET utf8;
USE `taxi_service`;

CREATE TABLE `manufacturers` (
                                        `id` BIGINT(11) NOT NULL AUTO_INCREMENT,
                                        `name` VARCHAR(225) NOT NULL,
                                        `country` VARCHAR(225) NOT NULL,
                                        `is_deleted` TINYINT NOT NULL DEFAULT 0,
                                        PRIMARY KEY (`id`));

CREATE TABLE `drivers` (
                                        `id` bigint NOT NULL AUTO_INCREMENT,
                                        `name` varchar(225) DEFAULT NULL,
                                        `license_number` varchar(225) DEFAULT NULL,
                                        `is_deleted` tinyint DEFAULT '0',
                                        PRIMARY KEY (`id`));



