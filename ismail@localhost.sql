--opdracht 1
CREATE TABLE medewerkers_kopie AS
SELECT * FROM medewerkers;

ALTER TABLE medewerkers_kopie 
ADD geslacht VARCHAR(2); 

ALTER Table medewerkers_kopie 
add constraint geslacht_check CHECK(geslacht in ('M', 'V'));

--opdracht 2

create sequence afd_nr start with 20 INCREMENT by 10;

INSERT INTO afdelingen(ANR,NAAM,LOCATIE,HOOFD) 
VALUES(afd_nr.NEXTVAL, 'Mustafa','Utrecht', '3522');

INSERT INTO afdelingen(ANR,NAAM,LOCATIE,HOOFD) 
VALUES(afd_nr.NEXTVAL, 'Ismail','DeMeern', '3453');

INSERT INTO afdelingen(ANR,NAAM,LOCATIE,HOOFD) 
VALUES(afd_nr.NEXTVAL, 'Test1','Utrecht', '3532');

INSERT INTO afdelingen(ANR,NAAM,LOCATIE,HOOFD) 
VALUES(afd_nr.NEXTVAL, 'Test2','Utrecht', '3542');

--opdracht 3

CREATE TABLE historische adressentabel(
    POSTCODE VARCHAR(6)constraint validatie CHECK(POSTCODE like '[0-9]{4}[A_Z]{2}'),
    HUISNUMMER INT,
    INGANGSDATUM DATE, NOT NULL,
    EINDDATUM    DATE constraint validatiedatum CHECK(EINDDATUM>=INGANGSDATUM),
    TELEFOON NUMBER(10) UNIQUE,
    MED_MNR int NOT NULL,
    PRIMARY KEY (POSTCODE, HUISNUMMER),
    FOREIGN KEY (MED_MNR) REFERENCES MEDEWERKERS(MNR),
);

