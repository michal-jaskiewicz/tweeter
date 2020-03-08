CREATE TABLE IF NOT EXISTS `TB_USER`
(
    `US_ID` INT AUTO_INCREMENT,
    `US_USERNAME` VARCHAR (25) NOT NULL,
    `US_PASSWORD` VARCHAR (25) NOT NULL,
    PRIMARY KEY (`US_ID`)
);
CREATE TABLE IF NOT EXISTS `TB_ARTICLE`
(
    `AR_ID` INT AUTO_INCREMENT,
    `AR_USER_ID` INT NOT NULL,
    `AR_CONTENT` VARCHAR (1000) NOT NULL,
    FOREIGN KEY fk_user_id (AR_USER_ID)
    REFERENCES TB_USER(US_ID)
    ON UPDATE CASCADE
    ON DELETE RESTRICT,
    PRIMARY KEY (`AR_ID`)
)