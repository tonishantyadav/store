CREATE TABLE `categories` (
  `id` tinyint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `product` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `category_id` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `product_categories_FK` (`category_id`),
  CONSTRAINT `product_categories_FK` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);