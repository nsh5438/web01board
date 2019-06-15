use web03board;

drop table if exists post;
drop table if exists user;

create table user
(
    id      integer primary key auto_increment,
    account varchar(100) not null unique,
    password varchar(100),
    username varchar(100),
    email varchar(50) not null unique ,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) default charset utf8mb4 engine = InnoDB;


create table post (
    id integer primary key auto_increment,
    user_id bigint,
    title varchar(100),
    content text,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) default charset utf8mb4 engine = InnoDB;
