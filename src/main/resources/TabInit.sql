CREATE TABLE `employee` (
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '雇员id',
    `name` VARCHAR(32) DEFAULT NULL COMMENT '姓名',
    `sex` CHAR(1) NOT NULL COMMENT '性别',
    `age` INT(3) NOT NULL COMMENT '年龄',
    `department` VARCHAR(10) NOT NULL COMMENT '部门',
    `salary` DECIMAL(10 , 2 ),
    PRIMARY KEY (`id`)
)  DEFAULT CHARSET=UTF8;


insert into employee values(3,'网民','1',10,'2',100.3123);