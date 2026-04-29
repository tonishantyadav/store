CREATE TABLE store.tags (
	id BIGINT auto_increment NOT NULL,
	name varchar(255) NOT NULL,
	CONSTRAINT tags_pk PRIMARY KEY (id)
);

CREATE TABLE store.user_tags (
	user_id BIGINT NOT NULL,
	tag_id BIGINT NOT NULL,
	CONSTRAINT user_tags_users_FK FOREIGN KEY (user_id) REFERENCES store.users(id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT user_tags_tags_FK FOREIGN KEY (tag_id) REFERENCES store.tags(id) ON DELETE CASCADE ON UPDATE CASCADE
);