prompt PL/SQL Developer Export Tables for user SCOTT@ORACLEDB
prompt Created by Administrator on 2020年11月25日
set feedback off
set define off

prompt Creating MYBATIS...
create table MYBATIS
(
  id   NUMBER(6) not null,
  name VARCHAR2(50) not null,
  sex  VARCHAR2(6) default '男'
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table MYBATIS
  add primary key (ID)
  using index
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table MYBATIS
  add check ( sex in ('男','女'));
alter table MYBATIS
  add check ( sex in ('男','女'));

prompt Disabling triggers for MYBATIS...
alter table MYBATIS disable all triggers;
prompt Loading MYBATIS...
insert into MYBATIS (id, name, sex)
values (100038, 'test', '男');
insert into MYBATIS (id, name, sex)
values (100001, 'user0001', '女');
insert into MYBATIS (id, name, sex)
values (100002, 'user003', '男');
insert into MYBATIS (id, name, sex)
values (100022, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100023, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100024, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100025, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100026, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100027, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100028, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100029, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100030, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100031, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100032, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100033, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100034, 'user', '男');
insert into MYBATIS (id, name, sex)
values (100019, 'user0002', '男');
insert into MYBATIS (id, name, sex)
values (100000, 'NULL', '女');
insert into MYBATIS (id, name, sex)
values (100020, 'user0003', '男');
insert into MYBATIS (id, name, sex)
values (100018, 'user0001', '男');
insert into MYBATIS (id, name, sex)
values (100035, 'user0001', '女');
commit;
prompt 21 records loaded
prompt Enabling triggers for MYBATIS...
alter table MYBATIS enable all triggers;

set feedback on
set define on
prompt Done
