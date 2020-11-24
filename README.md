# Study for SpringBoot & MyBatis

## 1、HomePage

  [http://localhost:8080](http://localhost:8080/)

## 2、DataBase and tools
- Oracle 11g
- PL/SQL Developer 11.2

## 3、How to run ?
- Modify this file `application.properties`
   - spring.datasource.druid.url=jdbc:oracle:thin:@localhost:1521:ORACLEDB
   - spring.datasource.druid.username=(your database name)
   - spring.datasource.druid.password=(your database pwd)
- Use the PL/SQL Developer to import `mybatis_oracle.sql` to your database.