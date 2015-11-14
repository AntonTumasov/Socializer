CREATE DATABASE socializer;

CREATE TABLE socializer.users ( 
	login                varchar(100)  NOT NULL  ,
	pass                 varchar(100)  NOT NULL  ,
	settings             blob    ,
	CONSTRAINT pk_users PRIMARY KEY ( login )
 ) engine=InnoDB;

ALTER TABLE socializer.users COMMENT 'Таблица пользователей';

ALTER TABLE socializer.users MODIFY login varchar(100)  NOT NULL   COMMENT 'Логин пользователя';

ALTER TABLE socializer.users MODIFY pass varchar(100)  NOT NULL   COMMENT 'Пароль пользователя.(TODO make it encrypted)';

ALTER TABLE socializer.users MODIFY settings blob     COMMENT 'Настройки пользователя(JSON)';

CREATE TABLE socializer.vk ( 
	login                varchar(100)  NOT NULL  ,
	page_url             varchar(300)  NOT NULL  ,
	vk_token             varchar(500)   DEFAULT NULL ,
	CONSTRAINT pk_vk PRIMARY KEY ( login ),
	CONSTRAINT fk_vk FOREIGN KEY ( login ) REFERENCES socializer.users( login ) ON DELETE CASCADE ON UPDATE RESTRICT
 ) engine=InnoDB;

ALTER TABLE socializer.vk COMMENT 'Таблица с данными.';

ALTER TABLE socializer.vk MODIFY page_url varchar(300)  NOT NULL   COMMENT 'Ссылка на страничку пользователя';

ALTER TABLE socializer.vk MODIFY vk_token varchar(500)   DEFAULT NULL  COMMENT 'VK token';

CREATE TABLE socializer.instagram ( 
	login                varchar(100)  NOT NULL  ,
	page_url             varchar(300)  NOT NULL  ,
	instagram_token      varchar(500)   DEFAULT NULL ,
	CONSTRAINT pk_vk_0 PRIMARY KEY ( login ),
	CONSTRAINT fk_instagram FOREIGN KEY ( login ) REFERENCES socializer.users( login ) ON DELETE CASCADE ON UPDATE RESTRICT
 );

ALTER TABLE socializer.instagram COMMENT 'Таблица с instagram данными.';

ALTER TABLE socializer.instagram MODIFY page_url varchar(300)  NOT NULL   COMMENT 'Ссылка на страничку пользователя';

ALTER TABLE socializer.instagram MODIFY instagram_token varchar(500)   DEFAULT NULL  COMMENT 'Instagram token';

