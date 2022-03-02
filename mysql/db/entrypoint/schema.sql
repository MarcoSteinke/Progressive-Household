CREATE TABLE `db`.`receipt_dto` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(100) NOT NULL,
    `amount` DOUBLE NOT NULL,
    `local_date` DATE NOT NULL,
    `file_path` VARCHAR(200) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC));