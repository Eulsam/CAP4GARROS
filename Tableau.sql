/******** Creer la base rolandgarros  *****/
SET FOREIGN_KEY_CHECKS = 0; 
DROP TABLE IF EXISTS Joueur;
DROP TABLE IF EXISTS Arbitre;
DROP TABLE IF EXISTS Court;
DROP TABLE IF EXISTS Matchs;
DROP TABLE IF EXISTS Organisateur;
DROP TABLE IF EXISTS Organisateurs;
DROP TABLE IF EXISTS Participer;
DROP TABLE IF EXISTS Personne;



CREATE TABLE Joueur (
	IdJoueur INTEGER PRIMARY KEY AUTO_INCREMENT,
	Sexe VARCHAR(50),
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
CREATE TABLE Arbitre (
	IdArbitre INTEGER PRIMARY KEY AUTO_INCREMENT,
	Id_Matchs INTEGER(11),	
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE Court (
	IdCourt INTEGER PRIMARY KEY AUTO_INCREMENT,
	Nom VARCHAR(100),
  Numero INTEGER(10),
  Id_Matchs INTEGER(11),	
  EtatCourt VARCHAR(30), 
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE Matchs (
	IdMatch INTEGER PRIMARY KEY AUTO_INCREMENT,
	Equipe1 VARCHAR(100),
	Equipe2 VARCHAR(100),
	NomArbitre VARCHAR(100),
	PrenomArbitre VARCHAR(100),
	Court VARCHAR(50),
	Calendrier DATE,
	HeureDebut Time(6),
	HeureFin Time(6),
	Duree Float(50),
	ResultatEquipe1 VARCHAR(20),
  ResultatEquipe2 VARCHAR(20),
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 CREATE TABLE Organisateur (
	IdOrganisateur INTEGER PRIMARY KEY AUTO_INCREMENT,
	Nom VARCHAR(100),
  MotDePasse VARCHAR(100),
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 CREATE TABLE Participer (
	IdParticiper INTEGER PRIMARY KEY AUTO_INCREMENT,
	Id_Matchs INTEGER(11),	
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 CREATE TABLE Personne (
	IdPersonne INTEGER PRIMARY KEY AUTO_INCREMENT,
	Nom VARCHAR(100),
  Prenom VARCHAR(100),	
  Nationalite VARCHAR(100),
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
/******** Insertion des Organisateur *****/ 
 
INSERT INTO Organisateurs(Nom,MotDePasse) VALUES ('organisateur','organisateur');

/******** Insertion des Personne *****/ 

INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Dupont','Pierre', 'FRA');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Drupond','Jean', 'ALL');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Fupont','Paul', 'BEL');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Gros','Joe', 'SUI');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Liam','Nielsen', 'GRE');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Lupont','Jacques', 'SUI');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Du','Gland', 'BEL');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('No','No', 'FRA');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Le','Dude', 'USA');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Mi','Haou', 'CHI');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Cra','Kras', 'POL');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Jageare','Mick', 'GBR');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Tou','Looose', 'ESP');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Labroc','Louis', 'LUX');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Bon','Jean', 'MON');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Lou','Mi', 'AUS');
INSERT INTO Personne(Nom,Prenom,Nationalite) VALUES ('Enmai','Milou', 'BRA');



