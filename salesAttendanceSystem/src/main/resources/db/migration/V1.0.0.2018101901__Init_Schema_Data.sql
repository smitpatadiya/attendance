CREATE TABLE User (
  id bigint(20) NOT NULL,
  username varchar(25) NOT NULL,
  password varchar(75) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO User (id, username, password) VALUES (1, 'hendi', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu');
INSERT INTO User (id, username, password) VALUES (2, 'sasuke', '$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK');
INSERT INTO User (id, username, password) VALUES (3, 'naruto', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu');
INSERT INTO User (id, username, password) VALUES (4, 'sakura', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu');


-- hendi / password
-- sasuke / password
-- naruto / password
-- sakura / password