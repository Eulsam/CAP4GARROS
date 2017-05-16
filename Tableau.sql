



CREATE TABLE Joueurs (
	IdJoueur INTEGER PRIMARY KEY AUTO_INCREMENT,
	Nom VARCHAR(100),
	Prenom VARCHAR(100),
	Sexe VARCHAR(50),
	Nation VARCHAR(50),
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
CREATE TABLE Arbitres (
	IdArbitre INTEGER PRIMARY KEY AUTO_INCREMENT,
	Nom VARCHAR(100),
	Prenom VARCHAR(100),
	Nation VARCHAR(50),
	Niveau VARCHAR(10),
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE Courts (
	IdCourt INTEGER PRIMARY KEY AUTO_INCREMENT,
	Nom VARCHAR(100),
  Numero INTEGER(10),
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
 
 CREATE TABLE Organisateurs (
	IdOrganisateur INTEGER PRIMARY KEY AUTO_INCREMENT,
	Nom VARCHAR(100),
  MotDePasse VARCHAR(100),
  Version INTEGER(10)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
/******** Insertion des Organisateurs *****/ 
 
INSERT INTO Organisateurs(Nom,MotDePasse) VALUES ('organisateur','organisateur');