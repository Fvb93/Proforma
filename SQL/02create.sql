-- Création d'une table "users"
CREATE TABLE users  (
u_id INT PRIMARY KEY AUTO_INCREMENT,
u_prenom VARCHAR(250) NOT NULL,
u_nom VARCHAR(250) NOT NULL,
u_email VARCHAR(250) NOT NULL UNIQUE,
u_newsletter ENUM('oui','non') DEFAULT 'non',
u_ddn DATE NOT NULL,
u_cotisation DECIMAL(5,2),
u_ville VARCHAR(250) NOT NULL
);

CREATE TABLE editors (
e_id INT AUTO_INCREMENT,
e_prenom VARCHAR(250) NOT NULL ,
e_nom VARCHAR(250) NOT NULL,
e_email VARCHAR(250),
UNIQUE (e_email),
-- UNIQUE (e_nom,e_prenom,e_email),
PRIMARY KEY (e_id)
);

-- Supprimer une table
DROP TABLE users;
-- Afficher les colonnes
SHOW COLUMNS FROM users;
-- Ajouter un nouveau champ
ALTER TABLE users ADD COLUMN u_sexe ENUM("h","f","a")NOT NULL;
ALTER TABLE users ADD COLUMN u_civil VARCHAR(50) NOT NULL AFTER u_ddn;
-- Modifier le nom d'un champ
ALTER TABLE users CHANGE u_gebre u_genre ENUM("h","f","a")NOT NULL;
-- Supprimer une colonne
ALTER TABLE users DROP COLUMN u_civil;
-- Changer le nom d'une table
ALTER TABLE users RENAME admins;
-- Insertion des données
INSERT INTO users 
VALUES (1,"Fabian","Van Buggenhout","test@test.be",default, "1993-03-31","h",400,"Lierneux");
INSERT INTO users (u_prenom, u_nom, u_email, u_ddn, u_genre, u_ville) 
VALUES ("Fabian","Van Buggenhout","tfeefet@test.be", "1993-03-31","h","Lierneux"),
	   ("Fan","Van Bugout","tvdvvefecfet@test.be", "1993-03-31","h","Lierneux");
SELECT*FROM users;
-- Effacer un enregistrement
DELETE FROM users WHERE u_id=2;
-- Modifier un enregistrement
UPDATE users 
	SET u_email="steph@tsd.be" 
	Where u_id=2;
UPDATE users 
	SET u_email="steph@tsd.be", u_cotisation=200 
	Where u_id=2;
    
-- Sélectionner des champs en particulier
SELECT u_id, u_nom, u_nom, u_ville 
	FROM users;

-- Ordre d'affichage
SELECT u_id, u_prenom, u_nom, u_ville 
	FROM users
    ORDER BY u_nom;
    
    -- Limiter les résultats d'affichage
SELECT u_id, u_prenom, u_nom, u_ville 
	FROM users
    ORDER BY u_nom
    LIMIT 2; 
    
    -- Les deux premiers résultats à partir du second
    SELECT u_id, u_prenom, u_nom, u_ville 
	FROM users
    ORDER BY u_nom
    LIMIT 2 OFFSET 1; 
    
    -- Ne pas afficher les doublons
    SELECT DISTINCT u_ville
		FROM users;
        
	-- Affiche le nombre total de villes différentes
     SELECT COUNT(DISTINCT u_ville)
		FROM users; 
    
    -- nom de la ville et nombre de fois présente dans la table
     SELECT u_ville,COUNT(u_ville) AS "Nombre habitants"
		FROM users
        GROUP BY u_ville;
        
        
        