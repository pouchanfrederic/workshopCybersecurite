CREATE TABLE IF NOT EXISTS `global_info` (
  `email_envoye` int(10) NOT NULL,
  `connection_recup` int(10) NOT NULL
);
CREATE TABLE IF NOT EXISTS `info_envoye` (
  `id` int(10) NOT NULL,
  `email` varchar(45) NOT NULL UNIQUE,
  `date` datetime NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `info_recupere` (
  `id` int(11) NOT NULL,
  `identifiant` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `ip_adress` varchar(16) DEFAULT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`id`)
);
