delete from msoo.estados;
delete from msoo.direcciones;
delete from msoo.clientes;
delete from msoo.paquetes;

-- insertar clientes
INSERT INTO `msoo`.`clientes` (`cedula`, `nombres`, `mail`) 
	VALUES ('1101', 'danilo jaramillo', 'djaramillo@utpl.edu.ec');
INSERT INTO `msoo`.`clientes` (`cedula`, `nombres`, `mail`) 
	VALUES ('1102', 'jorge lopez', 'jalopez2@utpl.edu.ec');
-- insertar sus direcciones  
INSERT INTO `msoo`.`direcciones` (`calle1`, `calle2`, `num`, `idClie`) 
	VALUES ('juan de salinas', '18 de noviembre', '01', 1);
INSERT INTO `msoo`.`direcciones` (`calle1`, `calle2`, `num`, `idClie`) 
	VALUES ('jose felix', '18 de noviembre', '02', 1);
INSERT INTO `msoo`.`direcciones` (`calle1`, `calle2`, `num`, `idClie`) 
	VALUES ('quito', 'sucre', '23', 2);
-- insertar paquetes    
INSERT INTO `msoo`.`paquetes` (`codigo`, `descripcion`, `dimensiones`, `peso`, `idClie`) 
	VALUES ('001', 'carton', '10x5', '300',1);
INSERT INTO `msoo`.`estados` (`desEstado`, `fecha`, `idPaq`) 
	VALUES ('Creacion', '2023-01-18', 1);

INSERT INTO `msoo`.`paquetes` (`codigo`, `descripcion`, `dimensiones`, `peso`, `idClie`) 
	VALUES ('00002', 'carta', '5x10', '30',1);
INSERT INTO `msoo`.`estados` (`desEstado`, `fecha`, `idPaq`) 
	VALUES ('Creacion', '2023-01-18', 2);
    
INSERT INTO `msoo`.`paquetes` (`codigo`, `descripcion`, `dimensiones`, `peso`, `idClie`) 
	VALUES ( '00003', 'carta', '5x10', '30',2);
INSERT INTO `msoo`.`estados` (`desEstado`, `fecha`, `idPaq`) 
	VALUES ('Creacion', '2023-01-18', 3);