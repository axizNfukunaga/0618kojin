CREATE DATABASE fukunaga_kojin;

CREATE TABLE users(
user_id VARCHAR(10) PRIMARY KEY,
user_nic VARCHAR(10),
password VARCHAR(10),
rank_id VARCHAR(50)
);
INSERT INTO users VALUES('same','�T��','samesame','1');
INSERT INTO users VALUES('neko','�l�R','nekoneko','2');
INSERT INTO users VALUES('tori','�g��','toritori','3');

CREATE TABLE ranks(
rank_id VARCHAR(50) PRIMARY KEY,
rank VARCHAR(50)
);
INSERT INTO ranks VALUES('1','����');
INSERT INTO ranks VALUES('2','���L��');
INSERT INTO ranks VALUES('3','�L��');

CREATE TABLE posts(
post_id SERIAL PRIMARY KEY,
user_id VARCHAR(10),
contents VARCHAR(100),
browsing_point VARCHAR(300),
date DATE,
genre_id VARCHAR(50)
);
INSERT INTO posts(user_id,contents,browsing_point,date,genre_id) VALUES('1','�T�����񂾂��`',100,'2018-06-14','2');
INSERT INTO posts(user_id,contents,browsing_point,date,genre_id) VALUES('2','�l�R���񂾂��`',200,'2018-06-16','2');
INSERT INTO posts(user_id,contents,browsing_point,date,genre_id) VALUES('3','�g�����񂾂��`',2300,'2018-06-18','2');

CREATE TABLE genres(
genre_id VARCHAR(50) PRIMARY KEY,
genre VARCHAR(50)
);
INSERT INTO genres VALUES('1','�r�W�l�X');
INSERT INTO genres VALUES('2','�');
INSERT INTO genres VALUES('3','�|�\');


