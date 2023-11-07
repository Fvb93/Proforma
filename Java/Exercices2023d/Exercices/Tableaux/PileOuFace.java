package Tableaux;

import java.util.Random;

import fonctions.bonjour;
import fonctions.saisie;

public class PileOuFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choix; 	// choix du menu
		int choixpf; // choix de pile ou face par l'utilisateur
		int choixal; // choix aléatoire de pile ou de face
		int nbf=0; // nombre de piles
		int nb=0; // nombre de parties
		int vic=0; // nombre de victoires
		int svic=0; // représente la série de victoires enchainées
		int svicm=0; // représente la plus grande série de victoires enchainées
		Random r = new Random (); // pile ou face au hasard

		bonjour.bonjour("va vous faire jouer à pile ou face. Taper le nombre désiré affiché dans le menu");


		do {
			System.out.println("Menu\t\n\n1. Réinitialiser les statistiques\n2. Jouer\n3. Afficher les statistiques\n4. Quitter le programme\n");
			choix=saisie.entier("choix");
			switch (choix) {
			case 1:
				if (nb==0) {
					System.out.println("Vous devez au moins jouer une partie pour réinitialiser les statistiques\n");
					choix=5;
				}
				else {
					nb=0;
					nbf=0;
					vic=0;
					svic=0;
					svic=0;
					choix=5;
				}
				break;
			case 2:
				do {
					choixpf=saisie.entier("choix. Taper 1 pour pile. Taper 2 pour face.");
				} while (choixpf!=1 && choixpf!=2);
				
				choixal=r.nextInt(2)+1; // Tirage aléatoire pile ou face
				nb++;  // Nombre de partie augmenté
				
				if (choixal==2) { // Permet de calculer le nombre de pile
					nbf=nbf+1; 
				}
				
				System.out.println("Lancer de pièce !!!!!! Résultat : "+(choixal==1?"Pile":"Face"));
				if (choixpf==choixal) {
					System.out.println("Bravo ! Vous avez trouvé la bonne réponse.");
					vic=vic+1;
					svic=svic+1;
					if (svicm<svic) {
						svicm=vic;
					}
				}
				else { // Erreur donc réinitialisation de la série de victoire
					System.out.println("Dommage.. Vous n'avez pas trouvé la bonne réponse.");
					svic=0;
				}

				choix=5;
				break;
			case 3:
				if (nb==0) {
					System.out.println("Vous devez au moins jouer une partie pour obtenir des statistiques\n");
					choix=5;
				}
				else {
					System.out.println("Pourcentage de réussite : "+((vic*100)/nb)+"%");
					System.out.println("Pourcentage d'échec : "+(((nb-vic)*100)/nb)+"%");
					System.out.println("Nombre de parties jouées : "+nb);
					System.out.println("Pourcentage de piles : "+((((nb-nbf)*100)/nb))+"%");
					System.out.println("Pourcentage de faces : "+((nbf*100)/nb)+"%");
					System.out.println("La plus grande série de tentative réussie : "+svicm+"\n");
					choix=5;
				}
				break;
			case 4: 
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Erreur d'encodage, veillez recommencer");
				choix=5;
			}
		} while (choix==5);

	}
}
