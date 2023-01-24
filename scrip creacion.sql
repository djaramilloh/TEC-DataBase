-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema msoo
-- -----------------------------------------------------
 DROP SCHEMA IF EXISTS `msoo` ;
-- -----------------------------------------------------
-- Schema msoo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `msoo` DEFAULT CHARACTER SET latin1 ;
USE `msoo` ;

-- -----------------------------------------------------
-- Table `msoo`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `msoo`.`Clientes` (
  `idClie` INT NOT NULL AUTO_INCREMENT,
  `cedula` VARCHAR(10) NOT NULL,
  `nombres` VARCHAR(30) NOT NULL,
  `mail` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`idClie`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `msoo`.`Paquetes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `msoo`.`Paquetes` (
  `idPaq` INT(11) NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(10) NOT NULL,
  `descripcion` VARCHAR(20) NOT NULL,
  `dimensiones` VARCHAR(10) NOT NULL,
  `peso` INT(11) NOT NULL,
  `idClie` INT NOT NULL,
  PRIMARY KEY (`idPaq`),
  UNIQUE INDEX `Codigo_UNIQUE` (`codigo` ASC),
  INDEX `fk_Paquetes_Clientes1_idx` (`idClie` ASC),
  CONSTRAINT `fk_Paquetes_Clientes1`
    FOREIGN KEY (`idClie`)
    REFERENCES `msoo`.`Clientes` (`idClie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `msoo`.`Estados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `msoo`.`Estados` (
  `idEst` INT NOT NULL AUTO_INCREMENT,
  `desEstado` VARCHAR(45) NOT NULL,
  `fecha` DATE NULL,
  `idPaq` INT(11) NOT NULL,
  PRIMARY KEY (`idEst`),
  INDEX `fk_Estados_Paquetes_idx` (`idPaq` ASC),
  CONSTRAINT `fk_Estados_Paquetes`
    FOREIGN KEY (`idPaq`)
    REFERENCES `msoo`.`Paquetes` (`idPaq`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `msoo`.`Direcciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `msoo`.`Direcciones` (
  `idDir` INT NOT NULL AUTO_INCREMENT,
  `calle1` VARCHAR(45) NOT NULL,
  `calle2` VARCHAR(45) NOT NULL,
  `num` VARCHAR(10) NOT NULL,
  `idClie` INT NOT NULL,
  PRIMARY KEY (`idDir`),
  INDEX `fk_Direcciones_Clientes1_idx` (`idClie` ASC),
  CONSTRAINT `fk_Direcciones_Clientes1`
    FOREIGN KEY (`idClie`)
    REFERENCES `msoo`.`Clientes` (`idClie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


