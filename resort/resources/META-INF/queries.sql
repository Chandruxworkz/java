CREATE TABLE `resort`.`resort_info` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `checkInTime` DATETIME NOT NULL,
  `checkOutTime` DATETIME NOT NULL,
  `createdBy` VARCHAR(45) NOT NULL,
  `createDate` DATETIME NOT NULL,
  `updateDate` DATETIME NOT NULL,
  `owner` VARCHAR(45) NOT NULL,
  `pricePerDay` DOUBLE NOT NULL,
  PRIMARY KEY (`id`));
