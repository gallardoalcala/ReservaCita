create table RES_CITA (
	ID_CITA INTEGER not null primary key,
	ID_CLIENTE INTEGER,
	F_FECHA DATE null,
	T_DESCRIPCION VARCHAR(75) null
);