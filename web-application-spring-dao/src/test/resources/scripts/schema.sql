CREATE TABLE if NOT EXISTS `user_profile`  (
  `uid` int(11) NOT NULL COMMENT 'user id',
  `name` varchar(64) NOT NULL COMMENT 'user name',
  `biological_sex` char(1) NOT NULL COMMENT 'M for mail and F for female',
  `local_limit` int(11) NOT NULL COMMENT 'limit'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user profile';