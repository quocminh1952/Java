	CREATE DATABASE IF NOT EXISTS student_tracker;
	use student_tracker;
	--
	-- Table structure for table 'student'
	DROP TABLE IF EXISTS student;

	create table student (
		id int not null AUTO_INCREMENT,
		first_name varchar(45) DEFAULT NULL,
		last_name varchar(45) DEFAULT NULL,
		email varchar(45) DEFAULT NULL,
		PRIMARY KEY (id)
	)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;
    