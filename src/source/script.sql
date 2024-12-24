CREATE SCHEMA `almacen` ;

CREATE TABLE `almacen`.`producto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `categoria` ENUM('ALIMENTICIO', 'HIGIENE', 'LIMPIEZA', 'OCIO', 'PAPELERIA', 'DEPORTE', 'ENFERMERIA', 'TECNOLOGIA') NOT NULL,
  `precio` DECIMAL(7,2) NULL,
  `stock` INT NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('1', 'Plátano', 'ALIMENTICIO', '0.5', '321');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('2', 'Queso', 'ALIMENTICIO', '1.25', '150');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('3', 'Cable HDMI', 'TECNOLOGIA', '12', '76');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('4', 'Lapiz', 'PAPELERIA', '1', '230');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('5', 'Libreta', 'PAPELERIA', '4.5', '160');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('6', 'Agua Oxigenada', 'ENFERMERIA', '8.25', '55');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('7', 'Jamon Serrano', 'ALIMENTICIO', '35', '40');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('8', 'Lego', 'OCIO', '16', '145');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('9', 'Champu', 'HIGIENE', '7', '220');
INSERT INTO `almacen`.`producto` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('1', 'Camara', 'TECNOLOGIA', '150', '78');
 
