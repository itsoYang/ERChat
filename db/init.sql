CREATE TABLE ERChat.project( id char(36) NOT NULL, project_name varchar(50) NOT NULL, project_desc varchar(100) NULL, create_user char(36) NOT NULL, create_time datetime NOT NULL, update_time datetime NOT NULL, CONSTRAINT project_PK PRIMARY KEY (id)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='项目信息';

CREATE TABLE ERChat.diagram( id char(36) NOT NULL, project_id char(36) NOT NULL, name varchar(100) NOT NULL, visibility smallint NOT NULL, create_user char(36) NOT NULL, create_time datetime NOT NULL, update_time datetime NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='ER图信息';

CREATE TABLE ERChat.`user`( `id` char(36) COLLATE utf8_bin NOT NULL, `nickname` varchar(50) COLLATE utf8_bin NOT NULL, `password` varchar(100) COLLATE utf8_bin DEFAULT NULL, `avatar` varchar(100) COLLATE utf8_bin DEFAULT NULL, `phone` varchar(15) COLLATE utf8_bin DEFAULT NULL, `create_time` datetime DEFAULT NULL, `update_time` datetime DEFAULT NULL, PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;

INSERT INTO ERChat.`user`(id, nickname, password, avatar, phone, create_time, update_time) VALUES('bea0dd84-fecd-4cb1-94c6-fc3fa7295cba', 'ERChat', '$2a$10$MrOqjidIh0JnaXy/d8yx5ucZCh24pY0DkHdtuKjm.tSb/XsqlgFRS', NULL, NULL, '2024-12-16 17:30:32', '2024-12-16 17:30:32');