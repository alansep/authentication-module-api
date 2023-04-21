CREATE TABLE `roles` (
  `id` varchar(36) PRIMARY KEY,
  `name` varchar(50) NOT NULL
);

CREATE TABLE `users` (
	`id` varchar(36) PRIMARY KEY,
	`username` varchar(20) NOT NULL,
	`password` varchar(45) NOT NULL,
	`enabled` boolean NOT NULL default true);

CREATE TABLE `user_roles` (
	`id` varchar(36) PRIMARY KEY,
	`user_id` varchar(36) NOT NULL,
	`role_id` varchar(36) NOT NULL,
	FOREIGN KEY (user_id) REFERENCES users(id),
	FOREIGN KEY (role_id) REFERENCES roles(id));