create table RES_CITA (
	ID_CITA INTEGER not null primary key,
	ID_CLIENTE INTEGER,
	F_FECHA DATE null,
	T_DESCRIPCION VARCHAR(75) null
);

create table RES_DIAS_FESTIVOS (
	ID_FESTIVO INTEGER not null primary key,
	F_FECHA_FFESTIVO DATE null
);

create table RES_DIAS_LIBRES (
	T_DIA VARCHAR(75) not null primary key,
	B_LIBRE INTEGER
);

create table RES_DIA_FESTIVO (
	ID_FESTIVO INTEGER not null primary key,
	F_FECHA_FFESTIVO DATE null
);

create table RES_DIA_LIBRE (
	ID_LIBRE INTEGER not null primary key,
	T_DIA VARCHAR(75) null,
	B_LIBRE INTEGER,
	T_CODIGO_DIA VARCHAR(75) null
);

create table RES_HORARIO_TRABAJO (
	ID_HORARIO INTEGER not null primary key,
	T_HORA_INICIO VARCHAR(75) null,
	T_HORA_FIN VARCHAR(75) null,
	T_HORA_INICIO_TARDE VARCHAR(75) null,
	T_HORA_FIN_TARDE VARCHAR(75) null,
	N_DURACION_CITAS INTEGER
);