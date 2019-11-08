insert  into `post`(post_id, post_desc, post_date) values (1,'Vacay Time!', CURDATE());
insert into `comment`(comment_id, comments, post_id) values (1, 'A nice picture', 1);