/* DDL */
CREATE DATABASE fs08test;
ALTER DATABASE fs08test RENAME TO fs08;
DROP DATABASE fs08test;

CREATE TABLE IF NOT EXISTS citta (
	id_citta serial NOT NULL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	provincia VARCHAR NOT NULL,
	regione VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS utenti (
	id serial NOT NULL, 
	nome CHARACTER VARYING NOT NULL,
	cognome CHARACTER VARYING NOT NULL,
	email CHARACTER VARYING NOT NULL UNIQUE,
	citta_id INT8 NOT NULL,
	CONSTRAINT id_Utente_PK PRIMARY KEY (id),
	CONSTRAINT utenti_citta_FK FOREIGN KEY (citta_id) REFERENCES citta (id_citta) ON DELETE CASCADE ON UPDATE CASCADE
);

TRUNCATE utenti;
TRUNCATE citta cascade;

ALTER TABLE utenti ADD cf VARCHAR NOT NULL UNIQUE;
ALTER TABLE utenti DROP COLUMN cf;
ALTER TABLE utenti RENAME COLUMN nome TO name;

DROP TABLE utenti;
DROP TABLE citta;

/* DML */

INSERT INTO citta(nome, provincia, regione) VALUES ('Roma', 'Roma', 'Lazio');
INSERT INTO citta(nome, provincia, regione) VALUES ('Milano', 'Milano', 'Lombardia');
INSERT INTO citta(nome, provincia, regione) VALUES ('Pomezia', 'Roma', 'Lazio');
INSERT INTO citta(nome, provincia, regione) VALUES ('Frosinone', 'Frosinone', 'Lazio');
INSERT INTO utenti(nome, cognome, email, citta_id) VALUES ('Mario', 'Rossi', 'm.rossi@gmail.com',1);
INSERT INTO utenti(nome, cognome, email, citta_id) VALUES ('Giuseppe', 'Verdi', 'g.verdi@gmail.com',2);
INSERT INTO utenti(nome, cognome, email, citta_id) VALUES ('Francesca', 'Neri', 'f.neri@gmail.com',3);
INSERT INTO utenti(nome, cognome, email, citta_id) VALUES ('Antonio', 'Bianchi', 'a.bianchi@gmail.com',1);

UPDATE utenti SET cognome = 'Nerina'  WHERE id = 3;

DELETE FROM utenti WHERE id = 9;
DELETE FROM citta WHERE provincia = 'Roma';

/* DQL */

SELECT * FROM citta;
SELECT * FROM utenti;
SELECT nome, cognome FROM utenti WHERE id = 3;
SELECT nome FROM citta WHERE regione = 'Lazio' AND provincia = 'Roma';
SELECT * FROM utenti WHERE email LIKE '%.com';
SELECT * FROM utenti WHERE email LIKE 'f%.com';
SELECT * FROM utenti WHERE email LIKE '_.%.com';

SELECT u.nome AS nome_utente, u.cognome, c.nome AS nome_citta, c.provincia, c.regione 
	FROM utenti AS u INNER JOIN citta AS c
	ON c.id_citta = u.citta_id;
	
SELECT u.nome AS nome_utente, u.cognome, c.nome AS nome_citta, c.provincia, c.regione 
	FROM utenti AS u LEFT JOIN citta AS c
	ON c.id_citta = u.citta_id;
	
SELECT u.nome AS nome_utente, u.cognome, c.nome AS nome_citta, c.provincia, c.regione 
	FROM utenti AS u RIGHT JOIN citta AS c
	ON c.id_citta = u.citta_id;
	
SELECT u.nome AS nome_utente, u.cognome, c.nome AS nome_citta, c.provincia, c.regione 
	FROM utenti AS u INNER JOIN citta AS c
	ON c.id_citta = u.citta_id;
	
SELECT * FROM citta ORDER BY nome ASC;
SELECT DISTINCT provincia FROM citta;
SELECT provincia, count(*) FROM citta GROUP BY provincia;
SELECT MAX(id_citta) FROM citta;
SELECT MIN(id_citta) FROM citta;
SELECT AVG(id_citta) FROM citta;


SELECT * FROM citta WHERE provincia IN ('Roma', 'Napoli');
SELECT * FROM citta;
SELECT id_citta FROM citta WHERE regione = 'Lazio';
SELECT * FROM utenti WHERE citta_id IN (SELECT id_citta from citta WHERE regione = 'Lazio');
SELECT COUNT(*) FROM utenti WHERE citta_id IN (SELECT id_citta from citta WHERE regione = 'Lazio');