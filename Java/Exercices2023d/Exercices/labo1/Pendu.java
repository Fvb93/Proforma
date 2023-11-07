package labo1;

import java.util.Random;
import java.util.Scanner;


public class Pendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String []t= {"trigone","hurluberlu","acronyme"}; // Vecteur contenant les 3 mots de départ
		Random r = new Random (); 
		String mot; // Mot à rechercher
		int choixaleatoire; 
		int choixrejouer = 0;
		int cpterreur=0; // Compteur de mauvaises réponses
		int cptjuste=0; // Compteur qui vérifie si une lettre a bien été trouvée
		boolean fin; // Permet de mettre fin au jeu si l'utilisateur à trouver toutes les lettres du mot
		char lettre=' '; // Lettre choisie par l'utilisateur
		boolean ok; // Permet de vérifier la saisie de l'utilisateur
		char[]t2; // Vecteur de départ de l'utilisateur 
		System.out.println("\tBienvenue au jeu du pendu !\n"); // Introduction
		do { // Permet de jouer puis de rejouer si nécessaire
			choixaleatoire=r.nextInt(t.length); // Le programme tire aléatoirement la position d'un des 3 mots

			mot=t[choixaleatoire]; // Assigne mot au mot correspond
			char[]t1; // Création d'un vecteur de char avec le mot choisi aléatoirement
			t1=mot.toCharArray(); // Permet de transformer le mot correspondant en un vecteur de caractère
			t2=mot.toCharArray(); // Idem avec le vecteur de l'utilisateur

			
			for (int i=0;i<t2.length;i++) { // Rempli le vecteur de l'utilisateur avec des _
				t2[i]='_';
			}

		do { // Boucle d'une partie
			fin=true; // Réinitialise fin pour permettre de sortir de la boucle si toute les lettres sont trouvées par l'utilisateur
			do { // Boucle qui permet de vérifier la saisie de l'utilisateur
				ok=true;
				try{
					System.out.print("\nEntrez la lettre choisie : ");
					lettre=(new Scanner(System.in)).nextLine().toLowerCase().charAt(0);
				}
				catch (java.lang.StringIndexOutOfBoundsException e) {  // si String vide débordement de vecteur
					System.out.println("Erreur d'encodage, veillez recommencer");
					ok=false;
				}
				if(lettre<61 || lettre>122) { // code ascii de a et de z
					System.out.println("Erreur d'encodage, veillez recommencer");
					ok=false;
				}
			}while (!ok);


			
			for (int i=0;i<t1.length;i++) {
				if (t1[i]==lettre) { // Si la lettre correspond avec une de celle du mot
					t2[i]=lettre; // Assigne la lettre dans le vecteur de l'utilisateur	
				cptjuste++;
				}
			
				
				System.out.print(t2[i]+(i==t1.length-1?"\n ":" ")); // Permet d'afficher l'état d'avancement du vecteur de l'utilisateur
			}
			if (cptjuste==0) { // Si aucune lettre n'a été trouvée, le compteur d'erreur augmente
				cpterreur++;
			}
			cptjuste=0; // Réinitialise le compteur de lettre juste

			switch (cpterreur) { // Dessine le pendu en fonction du nombre d'erreurs comises
			case 0:
				System.out.println("__________\n|/         |\n|\n|\n|\n|\n|\n|"); // Dessin du pendu pour aucunne erreur
				break;
			case 1:
				System.out.println("__________\n|/         |\n|         (_)\n|\n|\n|\n|\n|"); // Dessin du pendu pour 1 erreur
				break;
			case 2:
				System.out.println("__________\n|/         |\n|         (_)\n|          |\n|          |\n|\n|\n|"); // Dessin du pendu pour 2 erreurs
				break;
			case 3:
				System.out.println("__________\n|/         |\n|        (°o°)\n|          |\n|          |\n|\n|\n|"); // Dessin du pendu pour 3 erreurs
				break;
			case 4:
				System.out.println("__________\n|/         |\n|        (°o°)\n|          |\n|          |\n|         / \\ \n|\n|"); // Dessin du pendu pour 4 erreurs
				break;
			case 5:
				System.out.println("__________\n|/         |\n|        (*_*)\n|          |\n|         /|\\\n|         / \\ \n|\n|"); // Dessin du pendu pour 5 erreurs et fin de la partie
				System.out.println("         PENDU\n");
				System.out.println("\tLe mot a deviné était :"+mot+"\n");
				break;
			}
			
			for (int i=0;i<t2.length;i++) { // Permet de vérifier si toute les lettres ont été trouvées ou non 
				if (t1[i]!=t2[i]) {
					fin=false;
				}
			}
			
		if (fin) { // Permet d'afficher un message de félicitation en indiquant le nombre d'erreur(s)
			System.out.println("Félicitation ! Vous avez gagné en commetant "+cpterreur+" erreur"+(cpterreur<2?".\n":"s.\n"));

		}
		} while (cpterreur<5 && fin==false); 

			System.out.println("Voulez-vous rejouer? \nTaper 1 pour rejouer sinon taper un autre nombre.\n");
			do { // Permet de vérifier si la saisie est bien un nombre
				try {
					ok=true;
					System.out.println("Entrez votre choix :");
					choixrejouer=new Scanner(System.in).nextInt();
				}
				catch(java.util.InputMismatchException e) {
					System.out.println("Erreur d'encodage");
					ok=false;
				}
			} while(!ok);			
			
			cpterreur=0; // Permet de réinitialiser le dessin
		} while(choixrejouer==1) ; // Rejoue si le joueur à taper 1
		System.out.println("Je vous souhaite une bonne journée.\nAu revoir !");
	}
}
