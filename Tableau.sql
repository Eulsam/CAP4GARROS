#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Joueur
#------------------------------------------------------------

CREATE TABLE Joueur(
        Sexe Varchar (25) NOT NULL ,
        id   Int NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Arbitre
#------------------------------------------------------------

CREATE TABLE Arbitre(
        id       Int NOT NULL ,
        id_Matchs Int NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne
#------------------------------------------------------------

CREATE TABLE Personne(
        id           int (11) Auto_increment  NOT NULL ,
        Nom          Varchar (250) NOT NULL ,
        Prenom       Varchar (250) NOT NULL ,
        Nationnalite Varchar (250) NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Court
#------------------------------------------------------------

CREATE TABLE Court(
        id       int (11) Auto_increment  NOT NULL ,
        Nom      Varchar (250) NOT NULL ,
        Numero   Int NOT NULL ,
        id_Matchs Int NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Match
#------------------------------------------------------------

CREATE TABLE Matchs(
        id              int (11) Auto_increment  NOT NULL ,
        Tour            Int NOT NULL ,
        Calendrier      Date NOT NULL ,
        HeureDebut      Time NOT NULL ,
        HeureFin        Time NOT NULL ,
        ResultatEquipe1 Varchar (20) ,
        ResultatEquipe2 Varchar (20) ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Organisateurs
#------------------------------------------------------------

CREATE TABLE Organisateurs(
        id         int (11) Auto_increment  NOT NULL ,
        Nom        Varchar (100) NOT NULL ,
        MotDePasse Varchar (100) NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: PARTICIPER
#------------------------------------------------------------

CREATE TABLE PARTICIPER(
        id       Int NOT NULL ,
        id_Matchs Int NOT NULL ,
        PRIMARY KEY (id ,id_Matchs )
)ENGINE=InnoDB;

ALTER TABLE Joueur ADD CONSTRAINT FK_Joueur_id FOREIGN KEY (id) REFERENCES Personne(id);
ALTER TABLE Arbitre ADD CONSTRAINT FK_Arbitre_id FOREIGN KEY (id) REFERENCES Personne(id);
ALTER TABLE Arbitre ADD CONSTRAINT FK_Arbitre_id_Matchs FOREIGN KEY (id_Match) REFERENCES Matchs(id);
ALTER TABLE Court ADD CONSTRAINT FK_Court_id_Matchs FOREIGN KEY (id_Match) REFERENCES Matchs(id);
ALTER TABLE PARTICIPER ADD CONSTRAINT FK_PARTICIPER_id FOREIGN KEY (id) REFERENCES Personne(id);
ALTER TABLE PARTICIPER ADD CONSTRAINT FK_PARTICIPER_id_Matchs FOREIGN KEY (id_Match) REFERENCES Matchs(id);
