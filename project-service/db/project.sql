CREATE TABLE erchat.project (
                                id char(36) NOT NULL,
                                project_name varchar(50) NOT NULL,
                                project_desc varchar(100) NULL,
                                create_user char(36) NOT NULL,
                                create_time datetime NOT NULL,
                                update_time datetime NOT NULL,
                                CONSTRAINT project_PK PRIMARY KEY (id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci
COMMENT='项目信息';
