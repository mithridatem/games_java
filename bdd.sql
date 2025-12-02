-- Création de la base de données games
CREATE DATABASE IF NOT EXISTS java_games  CHARSET utf8mb4;
USE java_games;

-- Création des tables
CREATE TABLE IF NOT EXISTS console(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
`name` VARCHAR(50) UNIQUE NOT NULL,
manufacturer VARCHAR(50) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS game(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
title VARCHAR(50) NOT NULL,
`type` VARCHAR(50) NOT NULL,
publish_at DATE,
id_console INT NOT NULL
)ENGINE=InnoDB;

-- Contraintes de clé étrangére
ALTER TABLE game
ADD CONSTRAINT fk_publish_console
FOREIGN KEY(id_console)
REFERENCES console(id)
ON DELETE CASCADE;

-- 1.2 Requêtes de mise à jour :
-- INSERT des consoles
INSERT INTO console(`name`, manufacturer) VALUES
('PlayStation 5', 'Sony'),
('Nintendo Switch', 'Nintendo'),
('Xbox Series X', 'Microsoft'),
('Steam Deck', 'Valve');
