DROP TABLE IF EXISTS user;

CREATE TABLE user (
  UID INT AUTO_INCREMENT  PRIMARY KEY,
  FIRST_NAME VARCHAR(250) NOT NULL,
  LAST_NAME VARCHAR(250) NOT NULL,
  EMAIL VARCHAR(250) DEFAULT NULL,
  DOB DATE DEFAULT NULL
);

insert into user (UID,FIRST_NAME,LAST_NAME,EMAIL)
values(1001,'Sunila','Verma','gvghv@gcgh.com');

insert into user (UID,FIRST_NAME,LAST_NAME)
values(10002,'Ravi', 'Verma');