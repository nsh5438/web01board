insert into user(account, password, username, email) values
('user2','1234','test1','user2@dgsw.hs.kr'),
('user3','1234','test1','user3@dgsw.hs.kr'),
('user4','1234','test1','user4@dgsw.hs.kr'),
('user5','1234','test1','user5@dgsw.hs.kr'),
('user6','1234','test1','user6@dgsw.hs.kr');

insert into post(user_id, title, content) values
(1,'title 1','content 1'),
(1,'title 2','content 2'),
(1,'title 3','content 3'),
(2,'title 1','content 1'),
(2,'title 2','content 2'),
(2,'title 3','content 3');