-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema light_test
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema light_test
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `light_test` DEFAULT CHARACTER SET utf8 ;
USE `light_test` ;

-- -----------------------------------------------------
-- Table `light_test`.`bearings_industrial_d`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `light_test`.`bearings_industrial_inner_diameter` (
  `d_inner_diameter` VARCHAR(255) NOT NULL,
  `num` INT NULL,
  PRIMARY KEY (`d_inner_diameter`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `light_test`.`bearings_industrial`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `light_test`.`bearings_industrial` (
  `id` VARCHAR(255) NULL,
  `url` VARCHAR(255) NULL,
  `model` VARCHAR(250) NOT NULL,
  `type_en` VARCHAR(245) NOT NULL,
  `type_ru` VARCHAR(200) NOT NULL,
  `subtype_en` VARCHAR(255) NOT NULL,
  `subtype_ru` VARCHAR(45) NULL,
  `manufacturer_en` VARCHAR(255) NOT NULL,
  `manufacturer_ru` VARCHAR(200) NULL,
  `country_en` VARCHAR(255) NOT NULL,
  `country_ru` VARCHAR(200) NULL,
  `basic_dynamic_load_rating` INT NOT NULL,
  `basic_static_load_rating` INT NOT NULL,
  `fatique_load_limit` INT NOT NULL,
  `reference_speed` INT NOT NULL,
  `limiting_speed` INT NOT NULL,
  `d_inner_diameter` INT NOT NULL,
  `D_outer_diameter` INT NOT NULL,
  `B_width` INT NOT NULL,
  `weight` VARCHAR(45) NOT NULL,
  `temperature_work` VARCHAR(45) NOT NULL,
  `guarantee` VARCHAR(45) NOT NULL,
  `price` INT NULL,
  `photo1` VARCHAR(245) NULL,
  `photo2` VARCHAR(245) NULL,
  `photo3` VARCHAR(245) NULL,
  `photo4` VARCHAR(245) NULL,
  `photo5` VARCHAR(245) NULL,
  `description_en` TEXT NULL,
  `description_ru` TEXT NULL,
  `video1` VARCHAR(255) NULL,
  PRIMARY KEY (`model`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `light_test`.`bearings_industrial_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `light_test`.`bearings_industrial_type` (
  `type` VARCHAR(255) NOT NULL,
  `num` INT NULL,
  PRIMARY KEY (`type`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `light_test`.`bearings_industrial_D`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `light_test`.`bearings_industrial_outer_diameter` (
  `d_outer_diameter` VARCHAR(255) NOT NULL,
  `num` INT NULL,
  PRIMARY KEY (`d_outer_diameter`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `light_test`.`bearings_industrial_B`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `light_test`.`bearings_industrial_width` (
  `B_width` VARCHAR(255) NOT NULL,
  `num` INT NULL,
  PRIMARY KEY (`B_width`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `light_test`.`bearings_industrial_manufacturer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `light_test`.`bearings_industrial_manufacturer` (
  `manufacturer` VARCHAR(255) NOT NULL,
  `num` INT NULL,
  PRIMARY KEY (`manufacturer`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `light_test`.`bearings_industrial_country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `light_test`.`bearings_industrial_country` (
  `country` VARCHAR(255) NOT NULL,
  `num` INT NULL,
  PRIMARY KEY (`country`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `light_test`.`bearings_industrial_subtype`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `light_test`.`bearings_industrial_subtype` (
  `subtype` VARCHAR(255) NOT NULL,
  `num` INT NULL,
  PRIMARY KEY (`subtype`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `light_test`.`bearings_industrial_d`
-- -----------------------------------------------------
START TRANSACTION;
USE `light_test`;
INSERT INTO `light_test`.`bearings_industrial_inner_diameter` (`d_inner_diameter`, `num`) VALUES ('d<=100', NULL);
INSERT INTO `light_test`.`bearings_industrial_inner_diameter` (`d_inner_diameter`, `num`) VALUES ('100<d<=200', NULL);
INSERT INTO `light_test`.`bearings_industrial_inner_diameter` (`d_inner_diameter`, `num`) VALUES ('200<d<=300', NULL);
INSERT INTO `light_test`.`bearings_industrial_inner_diameter` (`d_inner_diameter`, `num`) VALUES ('300<d<=400', NULL);
INSERT INTO `light_test`.`bearings_industrial_inner_diameter` (`d_inner_diameter`, `num`) VALUES ('400<d<=500', NULL);
INSERT INTO `light_test`.`bearings_industrial_inner_diameter` (`d_inner_diameter`, `num`) VALUES ('500<d', NULL);

COMMIT;

-- -----------------------------------------------------
-- Data for table `light_test`.`bearings_industrial_D`
-- -----------------------------------------------------
START TRANSACTION;
USE `light_test`;
INSERT INTO `light_test`.`bearings_industrial_outer_diameter` (`D_outer_diameter`, `num`) VALUES ('D<=100', NULL);
INSERT INTO `light_test`.`bearings_industrial_outer_diameter` (`D_outer_diameter`, `num`) VALUES ('100<D<=200', NULL);
INSERT INTO `light_test`.`bearings_industrial_outer_diameter` (`D_outer_diameter`, `num`) VALUES ('200<D<=300', NULL);
INSERT INTO `light_test`.`bearings_industrial_outer_diameter` (`D_outer_diameter`, `num`) VALUES ('300<D<=400', NULL);
INSERT INTO `light_test`.`bearings_industrial_outer_diameter` (`D_outer_diameter`, `num`) VALUES ('400<D<=500', NULL);
INSERT INTO `light_test`.`bearings_industrial_outer_diameter` (`D_outer_diameter`, `num`) VALUES ('500<D', NULL);

COMMIT;

-- -----------------------------------------------------
-- Data for table `light_test`.`bearings_industrial_B`
-- -----------------------------------------------------
START TRANSACTION;
USE `light_test`;
INSERT INTO `light_test`.`bearings_industrial_width` (`B_width`, `num`) VALUES ('B<=100', NULL);
INSERT INTO `light_test`.`bearings_industrial_width` (`B_width`, `num`) VALUES ('100<B<=200', NULL);
INSERT INTO `light_test`.`bearings_industrial_width` (`B_width`, `num`) VALUES ('200<B<=300', NULL);
INSERT INTO `light_test`.`bearings_industrial_width` (`B_width`, `num`) VALUES ('300<B<=400', NULL);
INSERT INTO `light_test`.`bearings_industrial_width` (`B_width`, `num`) VALUES ('400<B<=500', NULL);
INSERT INTO `light_test`.`bearings_industrial_width` (`B_width`, `num`) VALUES ('500<B', NULL);

COMMIT;

-- -----------------------------------------------------
-- Data for table `light_test`.`bearings_industrial_type`
-- -----------------------------------------------------
START TRANSACTION;
USE `light_test`;
INSERT INTO `light_test`.`bearings_industrial_type` (`type`, `num`) VALUES ('Roller bearings', NULL);
INSERT INTO `light_test`.`bearings_industrial_type` (`type`, `num`) VALUES ('Ball bearings', NULL);

COMMIT;

-- -----------------------------------------------------
-- Data for table `light_test`.`bearings_industrial_subtype`
-- -----------------------------------------------------
START TRANSACTION;
USE `light_test`;
INSERT INTO `light_test`.`bearings_industrial_subtype` (`subtype`, `num`) VALUES ('Cylindrical roller bearings', NULL);
INSERT INTO `light_test`.`bearings_industrial_subtype` (`subtype`, `num`) VALUES ('Needle roller bearings', NULL);
INSERT INTO `light_test`.`bearings_industrial_subtype` (`subtype`, `num`) VALUES ('Spherical roller bearings', NULL);
INSERT INTO `light_test`.`bearings_industrial_subtype` (`subtype`, `num`) VALUES ('Tapered roller bearings', NULL);
INSERT INTO `light_test`.`bearings_industrial_subtype` (`subtype`, `num`) VALUES ('Deep groove ball bearings', NULL);
INSERT INTO `light_test`.`bearings_industrial_subtype` (`subtype`, `num`) VALUES ('Angular contact ball bearings', NULL);
INSERT INTO `light_test`.`bearings_industrial_subtype` (`subtype`, `num`) VALUES ('Thrust ball bearings', NULL);
INSERT INTO `light_test`.`bearings_industrial_subtype` (`subtype`, `num`) VALUES ('Self-aligning ball bearings', NULL);

COMMIT;

-- -----------------------------------------------------
-- Data for table `light_test`.`bearings_industrial_manufacturer`
-- -----------------------------------------------------
START TRANSACTION;
USE `light_test`;
INSERT INTO `light_test`.`bearings_industrial_manufacturer` (`manufacturer`, `num`) VALUES ('SKF', NULL);
INSERT INTO `light_test`.`bearings_industrial_manufacturer` (`manufacturer`, `num`) VALUES ('FAG', NULL);
INSERT INTO `light_test`.`bearings_industrial_manufacturer` (`manufacturer`, `num`) VALUES ('SNR', NULL);

COMMIT;

-- -----------------------------------------------------
-- Data for table `light_test`.`bearings_industrial_country`
-- -----------------------------------------------------
START TRANSACTION;
USE `light_test`;
INSERT INTO `light_test`.`bearings_industrial_country` (`country`, `num`) VALUES ('Germany', NULL);
INSERT INTO `light_test`.`bearings_industrial_country` (`country`, `num`) VALUES ('Japan', NULL);
INSERT INTO `light_test`.`bearings_industrial_country` (`country`, `num`) VALUES ('USA', NULL);
INSERT INTO `light_test`.`bearings_industrial_country` (`country`, `num`) VALUES ('Russia', NULL);

COMMIT;