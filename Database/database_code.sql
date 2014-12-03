SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema project
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `project` ;
USE `project` ;

-- -----------------------------------------------------
-- Table `project`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`users` (
  `idusers` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`idusers`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`login` (
  `iduser` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`iduser`),
  CONSTRAINT `uIdFKU`
    FOREIGN KEY (`iduser`)
    REFERENCES `project`.`users` (`idusers`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`missions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`missions` (
  `idmissions` INT NOT NULL AUTO_INCREMENT,
  `score` INT NULL,
  `start_date` DATETIME NULL,
  `final_date` DATETIME NULL,
  PRIMARY KEY (`idmissions`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`reports`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`reports` (
  `idreports` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `significance` VARCHAR(45) NULL,
  `photo` BLOB NULL,
  `idmissions` INT NULL,
  `status` ENUM('solved','open','reopen','check pending') NULL,
  PRIMARY KEY (`idreports`),
  INDEX `rIdFKM_idx` (`idmissions` ASC),
  CONSTRAINT `rIdFKM`
    FOREIGN KEY (`idmissions`)
    REFERENCES `project`.`missions` (`idmissions`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`users_has_reports`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`users_has_reports` (
  `users_idusers` INT NOT NULL,
  `reports_idreports` INT NOT NULL,
  PRIMARY KEY (`users_idusers`, `reports_idreports`),
  INDEX `fk_users_has_reports_reports1_idx` (`reports_idreports` ASC),
  INDEX `fk_users_has_reports_users1_idx` (`users_idusers` ASC),
  CONSTRAINT `fk_users_has_reports_users1`
    FOREIGN KEY (`users_idusers`)
    REFERENCES `project`.`users` (`idusers`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_users_has_reports_reports1`
    FOREIGN KEY (`reports_idreports`)
    REFERENCES `project`.`reports` (`idreports`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`DublicateReports`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`DublicateReports` (
  `reportIdSource` INT NOT NULL,
  `reportIdDublicate` INT NOT NULL,
  PRIMARY KEY (`reportIdSource`, `reportIdDublicate`),
  INDEX `rIdDb_idx` (`reportIdDublicate` ASC),
  CONSTRAINT `rIdFKS`
    FOREIGN KEY (`reportIdSource`)
    REFERENCES `project`.`reports` (`idreports`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `rIdFKDb`
    FOREIGN KEY (`reportIdDublicate`)
    REFERENCES `project`.`reports` (`idreports`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`categories` (
  `idCategories` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  PRIMARY KEY (`idCategories`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`comment` (
  `idcomment` INT NOT NULL AUTO_INCREMENT,
  `idreports` INT NULL,
  `idusers` INT NULL,
  `text` TEXT NULL,
  PRIMARY KEY (`idcomment`),
  INDEX `cIdFKR_idx` (`idreports` ASC),
  INDEX `cIdFKU_idx` (`idusers` ASC),
  CONSTRAINT `cIdFKR`
    FOREIGN KEY (`idreports`)
    REFERENCES `project`.`reports` (`idreports`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `cIdFKU`
    FOREIGN KEY (`idusers`)
    REFERENCES `project`.`users` (`idusers`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`missionCategories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`missionCategories` (
  `missId` INT NOT NULL,
  `catId` INT NOT NULL,
  PRIMARY KEY (`missId`, `catId`),
  INDEX `cIdFK_idx` (`catId` ASC),
  CONSTRAINT `missIdFK`
    FOREIGN KEY (`missId`)
    REFERENCES `project`.`missions` (`idmissions`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `catIdFK`
    FOREIGN KEY (`catId`)
    REFERENCES `project`.`categories` (`idCategories`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project`.`reportCategories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project`.`reportCategories` (
  `rId` INT NOT NULL,
  `cId` INT NOT NULL,
  PRIMARY KEY (`rId`, `cId`),
  INDEX `cIdFK_idx` (`cId` ASC),
  CONSTRAINT `rIdFK`
    FOREIGN KEY (`rId`)
    REFERENCES `project`.`reports` (`idreports`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `cIdFK`
    FOREIGN KEY (`cId`)
    REFERENCES `project`.`categories` (`idCategories`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
