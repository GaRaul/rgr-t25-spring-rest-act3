DROP table IF EXISTS caja;
DROP table IF EXISTS almacen;

create table almacen(
    codigo int auto_increment primary key,
    lugar varchar(250),
    capacidad int);

create table caja(
	num_referencia int auto_increment primary key,
    contenido varchar(250),
    valor int,
    codigo_almacen int,
	foreign key (codigo_almacen) references almacen(codigo) on delete cascade on update cascade);

insert into almacen (lugar, capacidad)values('almacen 1', 100);
insert into almacen (lugar, capacidad)values('almacen 2', 200);
insert into almacen (lugar, capacidad)values('almacen 3', 300);
insert into almacen (lugar, capacidad)values('almacen 4', 400);
insert into almacen (lugar, capacidad)values('almacen 5', 500);

insert into caja (contenido, valor, codigo_almacen) values ('Manoplas',11, 1);
insert into caja (contenido, valor, codigo_almacen) values ('Comida',23, 1);
insert into caja (contenido, valor, codigo_almacen) values ('Botellas',43, 2);
insert into caja (contenido, valor, codigo_almacen) values ('Teclados',52, 3);
insert into caja (contenido, valor, codigo_almacen) values ('Papel',112, 4);
insert into caja (contenido, valor, codigo_almacen) values ('Pastillas',31, 5);
