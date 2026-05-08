CREATE TABLE store.wishlist (
	id BIGINT auto_increment NOT NULL,
	user_id BIGINT NOT NULL,
	product_id BIGINT NOT NULL,
	CONSTRAINT wishlist_pk PRIMARY KEY (id),
	CONSTRAINT wishlist_users_FK FOREIGN KEY (user_id) REFERENCES store.users(id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT wishlist_product_FK FOREIGN KEY (product_id) REFERENCES store.product(id) ON DELETE CASCADE ON UPDATE CASCADE
);