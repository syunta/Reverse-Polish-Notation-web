# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table calc (
  id                        bigint not null,
  input_data                varchar(255),
  output_data               varchar(255),
  constraint pk_calc primary key (id))
;

create sequence calc_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists calc;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists calc_seq;

