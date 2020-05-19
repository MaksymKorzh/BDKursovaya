DROP TABLE IF EXISTS `author`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `role` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `users` values
	(1,'oiuiouio','sanjoyd.cse@gmail.com','pass1',0),
	(2,'Mitun Deb','sanjoyd.cse@gmail.com','pass2',1),
	(3,'Lovely Banik','sanjoyd.cse@gmail.com','pass2',1),
	(4,'Lovely Banik','sanjoyd.cse@gmail.com','pass2',0);
