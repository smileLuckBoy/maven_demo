# maven_demo
SSM（Spring + Spring MVC + Mybatis）框架整合，工程结构采用Maven，集成了slf4j、org.mybatis.generator等一系列常用的工具

1. 修改数据库相关配置jdbc.properties
2. 执行TabInit.sql脚本，初始化测试环境
3. 部署至Tomcat，访问路径：http://localhost:8080/maven//emplayee.do?method=showEmplayeeInfo
