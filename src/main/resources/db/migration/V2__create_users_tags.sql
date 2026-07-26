CREATE TABLE users_tags (
    user_id BIGINT NOT NULL,
    tag_id  BIGINT NOT NULL,
    PRIMARY KEY (user_id, tag_id),
    CONSTRAINT fk_users_tags_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_users_tags_tag  FOREIGN KEY (tag_id)  REFERENCES tags(id)
);