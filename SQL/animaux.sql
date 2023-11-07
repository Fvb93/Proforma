CREATE DATABASE Animaux CHARACTER SET 'utf8mb4';
USE Animaux; 

CREATE TABLE animaux (
	a_id INT PRIMARY KEY AUTO_INCREMENT,
    a_espece VARCHAR(100) NOT NULL,
    a_genre ENUM('M','F') NOT NULL,
    a_ddn DATETIME NOT NULL,
	a_nom VARCHAR(100) NOT NULL,
    a_note TEXT 
);

INSERT INTO animaux (a_espece, a_genre, a_ddn, a_nom, a_note) 
	VALUES 
		("chat","M","2009-05-14 06:42:00","Boucan",NULL),
		("chat","F","2006-05-19 16:06:00","Callune",NULL),
		("chat","F","2009-05-14 06:45:00","Boule",NULL),
		("chat","F","2008-04-20 03:26:00","Zara",NULL),
		("chat","F","2007-03-12 12:00:00","Milla",NULL),
		("chat","F","2006-05-19 15:59:00","Feta",NULL),
		("chat","F","2008-04-20 03:20:00","Bilba","Sourde de l'oreille droite à 80%"),
		("chat","F","2007-03-12 11:54:00","Cracotte",NULL),
		("chat","F","2006-05-19 16:16:00","Cawette",NULL),
		("tortue","F","2007-04-01 18:17:00","Nikki",NULL),
		("tortue","F","2009-03-24 08:23:00","Tortilla",NULL),
		("tortue","F","2009-03-26 01:24:00","Scroupy",NULL),
		("tortue","F","2006-03-15 14:56:00","Lulla",NULL),
		("tortue","F","2008-03-15 12:02:00","Dana",NULL),
		("tortue","F","2009-05-25 19:57:00","Cheli",NULL),
		("tortue","F","2007-04-01 03:54:00","Chicaca",NULL),
		("tortue","F","2006-03-15 14:26:00","Redbul","Insomniaque"),
		("tortue","M","2007-04-02 01:45:00","Spoutnik",NULL),
		("tortue","M","2008-03-16 08:20:00","Bubulle",NULL),
		("tortue","M","2008-03-15 18:45:00","Relou","Surpoids"),
		("tortue","M","2009-05-25 18:54:00","Bulbizard",NULL),
		("perroquet","M","2007-03-04 19:36:00","Safran",NULL),
		("perroquet","M","2008-02-20 02:50:00","Gingko",NULL),
		("perroquet","M","2009-03-26 08:28:00","Bavard",NULL),
		("perroquet","F","2009-03-26 07:55:00","Parlotte",NULL);

INSERT INTO animaux (a_espece, a_genre, a_ddn, a_nom, a_note) 
	VALUES 
		('chien', 'F', '2008-02-20 15:45:00' , 'Canaille', NULL),
		('chien', 'F','2009-05-26 08:54:00'  , 'Cali', NULL),
		('chien', 'F','2007-04-24 12:54:00' , 'Rouquine', NULL),
		('chien', 'F','2009-05-26 08:56:00' , 'Fila', NULL),
		('chien', 'F','2008-02-20 15:47:00' , 'Anya', NULL),
		('chien', 'F','2009-05-26 08:50:00' ,'Louya' , NULL),
		('chien', 'F', '2008-03-10 13:45:00','Welva' , NULL),
		('chien', 'F','2007-04-24 12:59:00' ,'Zira' , NULL),
		('chien', 'F', '2009-05-26 09:02:00','Java' , NULL),
		('chien', 'M','2007-04-24 12:45:00' ,'Balou' , NULL),
		('chien', 'M','2008-03-10 13:43:00' ,'Pataud' , NULL),
		('chien', 'M','2007-04-24 12:42:00' , 'Bouli', NULL),
		('chien', 'M', '2009-03-05 13:54:00','Zoulou' , NULL),
		('chien', 'M','2007-04-12 05:23:00' ,'Cartouche' , NULL),
		('chien', 'M', '2006-05-14 15:50:00', 'Zambo', NULL),
		('chien', 'M','2006-05-14 15:48:00' ,'Samba' , NULL),
		('chien', 'M', '2008-03-10 13:40:00','Moka' , NULL),
		('chien', 'M', '2006-05-14 15:40:00','Pilou' , NULL),
		('chat', 'M','2009-05-14 06:30:00' , 'Fiero', NULL),
		('chat', 'M','2007-03-12 12:05:00' ,'Zonko', NULL),
		('chat', 'M','2008-02-20 15:45:00' , 'Filou', NULL),
		('chat', 'M','2007-03-12 12:07:00' , 'Farceur', NULL),
		('chat', 'M','2006-05-19 16:17:00' ,'Caribou' , NULL),
		('chat', 'M','2008-04-20 03:22:00' , 'Capou', NULL),
		('chat', 'M','2006-05-19 16:56:00' , 'Raccou', 'Pas de queue depuis la naissance');
        
SELECT* -- Les animaux nés avant 2008
	FROM animaux
		WHERE a_ddn < '2008-01-01 00:00:00';
    
SELECT* -- Tous les animaux, sauf les chats
	FROM animaux
		WHERE a_espece!='chat';

SELECT* -- Tous les animaux pour lesquelles il n’y a pas de commentaire
	FROM animaux
		WHERE a_note IS NULL;
    
SELECT* -- Animaux qui sont, soit nés après 2008, soit des chats mâles ou femelles (mais dans le cas des femelles, elles doivent être nées avant juin 2007)
	FROM animaux
		WHERE a_ddn > '2008-01-01 00:00:00' OR (a_espece='chat' AND a_genre='M') OR (a_espece='chat' AND a_genre='F' AND a_ddn < '2007-06-01 00:00:00');
        
SELECT* -- Trier les chiens du plus vieux au plus jeune
	FROM animaux
		WHERE a_espece="chien"
			ORDER BY a_ddn;
            
SELECT* -- Trier les chiens, premièrement par genre (en affichant d’abord les femelles, puis les mâles), et ensuite par nom selon l’ordre alphabétique
	FROM animaux
		WHERE a_espece="chien" 
			ORDER BY a_genre DESC,a_nom ASC;
    
SELECT*  -- Afficher les animaux nés entre le 5 janvier 2008 et le 23 mars 2009
	FROM animaux
		WHERE a_ddn
			BETWEEN '2008-01-05 00:00:00' AND  '2009-03-23 00:00:00';

SELECT*  -- Afficher les animaux qui s’appellent Moka, Bilba, Tortilla, Balou, Dana, Redbul ou Gingko
	FROM animaux
		WHERE a_nom IN ("Moka" ,"Bilba" ,"Tortilla" ,"Balou" ,"Dana" ,"Redbul" ,"Ginko");
			
SELECT COUNT(DISTINCT a_espece)  -- Afficher une liste des espèces d’animaux (en éliminant les doublons)
	FROM animaux;

SELECT*  -- Afficher les 5 derniers animaux nés
	FROM animaux
		WHERE a_ddn
			ORDER BY a_ddn DESC
				LIMIT 5;	

SELECT*  -- Afficher les animaux dont le nom comportent un «Lu»
	FROM animaux
		WHERE a_nom
			LIKE "%lu%";
    
SELECT a_espece AS "Espèces", GROUP_CONCAT(DISTINCT a_nom) AS "Nom"  -- Afficher les noms de l'ensemble des animaux, regroupé par espèce
	FROM animaux
		GROUP BY  a_espece;  
    
-- SELECT a_nom,a_espece="chat" AS "chat", a_espece="chien" AS "chien", a_espece="tortue" AS "tortue", a_espece="perroquet" AS "perroquet"  -- Afficher les noms de l'ensemble des animaux, regroupé par espèce
	-- FROM animaux
    -- GROUP BY a_espece;


   
    
    
    