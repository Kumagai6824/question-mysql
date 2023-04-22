DROP TABLE IF EXISTS hellos;

CREATE TABLE hellos (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO hellos (id, name) VALUES (1, "kumagai");
INSERT INTO hellos (id, name) VALUES (2, "suzuki");
