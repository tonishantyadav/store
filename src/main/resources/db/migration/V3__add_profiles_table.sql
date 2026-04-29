CREATE TABLE store.profiles (
	id BIGINT auto_increment NOT NULL,
	bio varchar(255) NULL,
	phone_number varchar(255) NULL,
	date_of_birth varchar(255) NULL,
	loyalty_points INT UNSIGNED DEFAULT 0 NOT NULL,
	user_id BIGINT NULL,
	CONSTRAINT profiles_pk PRIMARY KEY (id),
	CONSTRAINT profiles_users_FK FOREIGN KEY (user_id) REFERENCES store.users(id) ON DELETE CASCADE ON UPDATE CASCADE
);