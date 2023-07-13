CREATE TABLE user_entity
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    nickname    VARCHAR(20) NOT NULL,
    email       VARCHAR(50) NOT NULL,
    imageUrl    VARCHAR(100),
    password    VARCHAR(100) NOT NULL,
    provider    VARCHAR(20),
    providerId  VARCHAR(50)
);