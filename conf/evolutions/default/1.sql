# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table dbase (
  id                        bigint not null,
  input                     varchar(255),
  constraint pk_dbase primary key (id))
;

create sequence dbase_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists dbase;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists dbase_seq;

