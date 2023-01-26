-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.27-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para ticketsystem
DROP DATABASE IF EXISTS `ticketsystem`;
CREATE DATABASE IF NOT EXISTS `ticketsystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `ticketsystem`;

-- Copiando estrutura para tabela ticketsystem.chamados
DROP TABLE IF EXISTS `chamados`;
CREATE TABLE IF NOT EXISTS `chamados` (
  `chamados_id` int(4) unsigned NOT NULL AUTO_INCREMENT,
  `chamados_categoria` int(1) NOT NULL,
  `chamados_prioridade` int(1) NOT NULL,
  `chamados_desc` varchar(512) NOT NULL,
  `chamados_data` varchar(50) NOT NULL DEFAULT '',
  `chamados_hora` varchar(50) NOT NULL DEFAULT '',
  `chamados_users_id` int(4) unsigned NOT NULL,
  `chamados_mensagens` longtext DEFAULT NULL,
  PRIMARY KEY (`chamados_id`),
  KEY `chamados_users_fk1` (`chamados_users_id`),
  CONSTRAINT `chamados_users_fk1` FOREIGN KEY (`chamados_users_id`) REFERENCES `users` (`users_id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela ticketsystem.chamados: ~5 rows (aproximadamente)
REPLACE INTO `chamados` (`chamados_id`, `chamados_categoria`, `chamados_prioridade`, `chamados_desc`, `chamados_data`, `chamados_hora`, `chamados_users_id`, `chamados_mensagens`) VALUES
	(1, 1, 1, 'asd', '25/01/2023', '15:25:50', 1, NULL),
	(26, 2, 1, 'asd', '26/01/2023', '14:10:10', 1, NULL),
	(27, 1, 1, 'asd sad', '26/01/2023', '14:10:21', 1, NULL),
	(28, 1, 1, 'asd sad', '26/01/2023', '14:13:24', 1, NULL),
	(29, 1, 1, 'asdv', '26/01/2023', '14:14:05', 1, NULL);

-- Copiando estrutura para tabela ticketsystem.users
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `users_id` int(4) unsigned NOT NULL AUTO_INCREMENT,
  `users_name` varchar(32) NOT NULL,
  `users_login` varchar(16) NOT NULL,
  `users_pass` varchar(16) NOT NULL,
  `users_admin` binary(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`users_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela ticketsystem.users: ~0 rows (aproximadamente)
REPLACE INTO `users` (`users_id`, `users_name`, `users_login`, `users_pass`, `users_admin`) VALUES
	(1, 'admin', 'admin', 'admin', _binary 0x31);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
