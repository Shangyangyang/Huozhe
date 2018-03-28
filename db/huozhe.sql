SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS consume_avg;
DROP TABLE IF EXISTS consume_detail;
DROP TABLE IF EXISTS consume_option;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE consume_avg
(
	-- 主键
	id varchar(32) NOT NULL COMMENT '主键',
	-- 用户主键
	user_id varchar(32) COMMENT '用户主键',
	-- 日均消费
	avg_consume decimal(10,2) COMMENT '日均消费',
	-- 创建者
	create_user varchar(32) COMMENT '创建者',
	-- 创建时间
	create_date datetime COMMENT '创建时间',
	-- 更新者
	update_user varchar(32) COMMENT '更新者',
	-- 更新时间
	update_date datetime COMMENT '更新时间',
	-- 删除标志
	del_flag varchar(2) COMMENT '删除标志',
	PRIMARY KEY (id)
);


CREATE TABLE consume_detail
(
	-- 主键
	id varchar(32) NOT NULL COMMENT '主键',
	-- 用户主键
	user_id varchar(32) COMMENT '用户主键',
	-- 选择主键
	option_id varchar(32) COMMENT '选择主键',
	-- 金额
	money decimal(10,2) COMMENT '金额',
	-- 创建者
	create_user varchar(32) COMMENT '创建者',
	-- 创建时间
	create_date datetime COMMENT '创建时间',
	-- 更新者
	update_user varchar(32) COMMENT '更新者',
	-- 更新时间
	update_date datetime COMMENT '更新时间',
	-- 删除标志
	del_flag varchar(2) COMMENT '删除标志',
	PRIMARY KEY (id)
);


CREATE TABLE consume_option
(
	-- 主键
	id varchar(32) NOT NULL COMMENT '主键',
	-- 名称
	name varchar(50) COMMENT '名称',
	-- 计时单位
	date_unit varchar(2) COMMENT '计时单位',
	-- 计时单位默认选项
	date_default varchar(2) COMMENT '计时单位默认选项',
	-- 类型归属
	type varchar(2) COMMENT '类型归属',
	-- 状态
	state varchar(2) COMMENT '状态',
	-- 创建者
	create_user varchar(32) COMMENT '创建者',
	-- 创建时间
	create_date datetime COMMENT '创建时间',
	-- 更新者
	update_user varchar(32) COMMENT '更新者',
	-- 更新时间
	update_date datetime COMMENT '更新时间',
	-- 删除标志
	del_flag varchar(2) COMMENT '删除标志',
	PRIMARY KEY (id)
);


CREATE TABLE user
(
	-- 主键
	id varchar(32) NOT NULL COMMENT '主键',
	-- 昵称
	name varchar(50) COMMENT '昵称',
	-- 微信唯一主键
	wx_id varchar(64) COMMENT '微信唯一主键',
	-- 用户状态
	state varchar(2) COMMENT '用户状态',
	-- 最近一次登录时间
	last_login datetime COMMENT '最近一次登录时间',
	-- 创建者
	create_user varchar(32) COMMENT '创建者',
	-- 创建时间
	create_date datetime COMMENT '创建时间',
	-- 更新者
	update_user varchar(32) COMMENT '更新者',
	-- 更新时间
	update_date datetime COMMENT '更新时间',
	-- 删除标志
	del_flag varchar(2) COMMENT '删除标志',
	PRIMARY KEY (id)
);



