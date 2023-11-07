CREATE DATABASE proforma_art_four CHARACTER SET 'utf8mb4';

USE proforma_art_four;

CREATE TABLE fournisseurs(
	four_num char(5) primary key,
	four_nom varchar(25) not null unique,
	four_adresse varchar(50),
	four_cp smallint check (four_cp > 0),
	four_date date check (four_date <= SYSDATE())
);

INSERT INTO fournisseurs VALUES('F0001','Dubois SA', 'rue du puits perdu, 58', 4020, '1950/01/01');
INSERT INTO fournisseurs VALUES('F0002','les libraires réunis', 'avenue de la boule, 54', 1000, '1978/08/15');
INSERT INTO fournisseurs VALUES('F0003','IMPRIMAT', 'rue du pont, 45', 4400, '1995/09/02');
INSERT INTO fournisseurs VALUES('F0004','Mac Gregor', 'rue haute, 54', 1000, '1987/08/01');
INSERT INTO fournisseurs VALUES('F0005','Bureautique 2000', 'rue du bassin, 254', 4000, '1996/01/01');

CREATE TABLE articles (
	art_num char(8) primary key,
	art_nom varchar(30) not null,
	art_coul varchar(20),
	art_stock integer,
	art_seuil integer,
	art_pa integer not null,
	art_four char(5),
	index(art_four),
	foreign key (art_four) references fournisseurs (four_num)
);

INSERT INTO articles VALUES('A01','agrafeuse','ROUGE',10,2,229,'F0004');
INSERT INTO articles VALUES('A02','calculatrice','NOIR',5,20,635,'F0001');
INSERT INTO articles VALUES('A03','perforatrice','BLANC',3,2,230,'F0004');
INSERT INTO articles VALUES('A04','lampe de bureau', 'ROUGE',3,10,349,'F0005');
INSERT INTO articles VALUES('A05','Stylo','BLANC',30,20,39,'F0005');
INSERT INTO articles VALUES('A06','STYLO','BLEU',30,10,49,'F0005');
INSERT INTO articles VALUES('A07','3 stylos','VERT',19,10,99,'F0005');
INSERT INTO articles VALUES('A08','bloc de feuilles quadrillées', default,7,12,70,'F0003');
INSERT INTO articles VALUES('A09','bloc de feuilles lignées',default,11,11,85,'F0003');
INSERT INTO articles VALUES('A10','classeur 10 cm','GRIS',21,30,50,'F0002');
INSERT INTO articles VALUES('A11','classeur 5 cm','Noir',19,30,50,'F0002');
INSERT INTO articles VALUES('A12','crayon','ROUGE',95,10,35,'F0002');
INSERT INTO articles VALUES('A13','marqueur','VERT',90,10,35,'F0002');
INSERT INTO articles VALUES('A14','marqueur','BLEU',80,10,35,'F0002');
INSERT INTO articles VALUES('A15','crayon','NOIR',45,10,35,'F0002');

 SELECT*
 FROM articles;
-- 1. Afficher les numéros, noms, couleurs et prix d'achat des articles qui ne sont pas verts
-- et qui ont un prix d'achat compris entre 10 et 100 euro.
-- Cette liste sera ordonnée selon l'ordre alphabétique inverse des noms d'articles.
-- (à noms égaux, par ordre croissant des n° d'articles)
SELECT art_num, art_nom, art_coul, art_pa
    FROM articles
    WHERE art_coul !="vert" AND (art_pa BETWEEN 10 AND 100)
		ORDER BY art_nom DESC, art_num ASC;

-- 2. Lister les numéros, noms, quantités en stock et quantités "seuil" des articles qui doivent être commandés.
-- C'est-à-dire les articles dont la quantité en stock est inférieure à la quantité "seuil".
SELECT art_num, art_nom, art_stock, art_seuil
    FROM articles
    WHERE art_stock < art_seuil;

-- 3. Lister, par ordre alphabétique, les noms des fournisseurs dont le numéro de la rue est 54.
SELECT four_nom, four_adresse
    FROM fournisseurs
		WHERE four_adresse LIKE "% 54%"
			ORDER BY four_nom ASC;

-- 4. Afficher les noms, couleurs et prix d'achat
-- des articles de couleur rouge dont le prix est inférieur à 75 euro
-- et ceux dont la couleur est omise.
-- Cette liste sera ordonnée selon l'ordre croissant des numéros d'articles.
SELECT  art_nom, art_coul, art_pa
    FROM articles
		WHERE (art_coul ="rouge" AND art_pa <75) OR art_coul IS NULL
			ORDER BY art_num ASC;

-- 5. Lister les noms des fournisseurs
-- dont le nom contient au minimum 2 E
-- et qui ont un code postal égal à 1000.
SELECT four_nom
    FROM fournisseurs
		WHERE four_nom LIKE "%e%e%" AND four_cp=1000;

-- 6. Afficher le nom des articles,
-- la différence entre la quantité en stock et la quantité seuil
-- des articles qui sont sous le seuil minimum (q stock < q seuil).
-- Cette liste sera ordonnéé selon l'ordre croisant des n° d'articles.
SELECT  art_nom, art_stock - art_seuil AS "Différence", art_seuil AS "A commander"
    FROM articles
		WHERE art_stock < art_seuil
			ORDER BY art_num ASC;

-- 7. Afficher les articles de couleur rouge,
-- dont la quantité en stock dépasse la quantité seuil
-- et qui n’ont pas de C dans leur nom.
SELECT* 
    FROM articles
		WHERE art_coul="rouge" AND art_stock>art_seuil AND art_nom NOT LIKE "%c%" ;
	
-- 8. Afficher les différentes couleurs disponibles pour tous le stylos.
SELECT  art_coul
    FROM articles
		WHERE art_nom="stylo";

-- 9. Afficher les articles qui ont comme fournisseur :
-- F0001, F0002 ou F0003.
SELECT  art_nom
    FROM articles
		WHERE art_four IN ("F0001", "F0002", "F0003");

-- 10. Afficher toutes les informations concernant
-- les fournisseurs qui ont été créé́s avant 1990
-- et dont le code postal n’est ni 1000, ni 4000.
SELECT*
    FROM fournisseurs
		WHERE  four_date<"1990/01/01" AND four_cp!=1000 AND four_cp!=4000;
	
-- 11. Pour les articles dont la couleur est spécifiéé, afficher de manière concaténéé
-- le nom (première lettre en majuscule, le reste en minuscule),
-- " de couleur :",
-- et la couleur (toutes les lettres en minuscule).
SELECT GROUP_CONCAT(UPPER(LEFT(art_nom,1)),LOWER(SUBSTRING(art_nom,2))," de couleur ", LOWER(art_coul)) AS "Infos"
	FROM articles
		WHERE art_coul IS NOT NULL
        GROUP BY art_nom;

-- 12. Lister le nombre d’années d’existence des fournisseurs.
SELECT (DATE_FORMAT(SYSDATE(),"%Y") - DATE_FORMAT(four_date, "%Y")) AS "Nombres d'années d'existences"
 FROM fournisseurs;
 
-- 13. Afficher le nombre d’articles de noms différents.


-- 14. Afficher la quantité totale pour les articles de noms différents.


-- 15. Afficher le prix moyen, le prix minimum, le prix maximum des articles.


-- 16. Afficher le prix global total
-- des différents articles qui se trouvent en stock.


-- 17. Donner le nombre total d'articles rouges
-- qui ont un prix d'achat inférieur à 100 euro.


-- 18. Donner la liste des prix maximaux, des prix minimaux , des prix moyens
-- et des nombres de couleurs différentes existant pour les articles qui portent le même nom.
