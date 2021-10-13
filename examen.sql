
CREATE DATABASE unifin;
USE unifin;



CREATE TABLE c_cupones (
                id_cupon INT AUTO_INCREMENT NOT NULL,
                restaurante VARCHAR(50) NOT NULL,
                rfc VARCHAR(25) NOT NULL,
                descripcion VARCHAR(50) NOT NULL,
                fecha_caducidad DATE NOT NULL,
                PRIMARY KEY (id_cupon)
);


CREATE TABLE c_usuarios (
                id_usuario INT AUTO_INCREMENT NOT NULL,
                nombre VARCHAR(45) NOT NULL,
                apellidos VARCHAR(50) NOT NULL,
                mail VARCHAR(50) NOT NULL,
                password VARCHAR(15) NOT NULL,
                id_usuario_referido INT,
                PRIMARY KEY (id_usuario)
);


CREATE TABLE ta_usuario_cupon (
                id_cupon INT NOT NULL,
                id_usuario INT NOT NULL,
                is_utilizado BOOLEAN NOT NULL,
                PRIMARY KEY (id_cupon, id_usuario)
);


ALTER TABLE ta_usuario_cupon ADD CONSTRAINT c_cupones_ta_usuario_cupon_fk
FOREIGN KEY (id_cupon)
REFERENCES c_cupones (id_cupon)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE ta_usuario_cupon ADD CONSTRAINT c_usuarios_ta_usuario_cupon_fk
FOREIGN KEY (id_usuario)
REFERENCES c_usuarios (id_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE c_usuarios ADD CONSTRAINT c_usuarios_c_usuarios_fk
FOREIGN KEY (id_usuario_referido)
REFERENCES c_usuarios (id_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION;