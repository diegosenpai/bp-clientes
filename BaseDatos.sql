drop table if exists cliente cascade
drop sequence if exists cliente_seq
create sequence cliente_seq start with 1 increment by 50
create table cliente (edad integer, estado boolean not null, id bigint not null, contrasenia varchar(255), direccion varchar(255), genero varchar(255), id_cliente varchar(255), identificacion varchar(255), nombre varchar(255), telefono varchar(255), primary key (id)