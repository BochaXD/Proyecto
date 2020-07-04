
CREATE TABLE Lugar (
                codigo_inne INTEGER NOT NULL,
                Provincia VARCHAR(20) NOT NULL,
                CONSTRAINT lugar_pk PRIMARY KEY (codigo_inne)
);


CREATE TABLE Categoria (
                categoria VARCHAR(30) NOT NULL,
                                Alta VARCHAR NOT NULL,
                Ambito VARCHAR(50) NOT NULL,
                codigo_inne INTEGER NOT NULL
);


CREATE TABLE Test (
                codigo_inne INTEGER NOT NULL,
                Test_realizados INTEGER NOT NULL,
                Test_Positivos INTEGER NOT NULL,
                aislamiento INTEGER NOT NULL
                fecha DATE NOT NULL,
);


ALTER TABLE Test ADD CONSTRAINT lugar_test_fk
FOREIGN KEY (codigo_inne)
REFERENCES Lugar (codigo_inne)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Categoria ADD CONSTRAINT lugar_categoria_fk
FOREIGN KEY (codigo_inne)
REFERENCES Lugar (codigo_inne)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
