package labo1;

import java.util.Scanner;

import fonctions.tab;

public class Puissance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t[][]= new int [6][7]; // Tableau de 6 lignes et 7 colonnes
		int rejouer=0;
		int cpt=0; // Compteur de tour joué dans l'ensemble
		boolean ok=true; //Permet de sortir de mes boucles
		int nb=0; // Colonne choisie pour placer un pion

		for (int i=0;i<t.length;i++) { // Remplis les matrices de valeur 0
			for (int j=0;j<t[0].length;j++) {
				t[i][j]=0;
			}
		}

		System.out.println("\tBienvenue au jeu puissance 4 !\n"); // Introduction
		do { // Permet de rejouer ou non
		
			do { // Boucle du jeu
			for (int i=0;i<t.length;i++) { // Affiche le plateau de jeu. 
			for (int j=0;j<t[0].length;j++) {
				if (j==0) { // Pour afficher la barre de gauche (question d'esthétique)
					System.out.print((t[i][j]==0?"| _ | ":"")+(t[i][j]==1?"| O | ":"")+(t[i][j]==-1?"| X | ":""));
				}
				else {
					System.out.print((t[i][j]==0?"_ | ":"")+(t[i][j]==1?"O | ":"")+(t[i][j]==-1?"X | ":"")+(j==(t[0].length)-1?"\n\n":""));
				}
			}
		}
		
			if (cpt%2==0) { // Joueur 1. La valeur de ses jetons vaux 1 et affiche O
				System.out.println("Joueur 1, c'est à vous de jouer !\n");
				cpt++;
				
				do { // Boucle qui permet de vérifier si la saisie de l'utilisateur est bien le numéro d'une colonne
						System.out.println("Entrez le numéro de la colonne où vous désirez insérer votre jeton : ");
						nb=new Scanner(System.in).nextInt();
					if (nb<0 || nb>8) {
						System.out.println("Erreur d'encodage\n");
					}
				} while(nb<=0 || nb>8);
				
				for (int i=t.length-1;i>0 && ok;i--) { // Boucle pour placer le jeton du joueur 1
						if (t[i][nb-1]==0) {  // Vérifier si un jeton est déjà placé ou non
							t[i][nb-1]=1;
							ok=false;
						}
					}
				}
			
			
			else { // Joueur 2. La valeur de ses jetons vaut -1 et affiche X
				System.out.println("Joueur 2, c'est à vous de jouer !\n");
				cpt++;
				
				do { // Boucle qui permet de vérifier la saisie de l'utilisateur
					try {
						ok=true;
						System.out.println("Entrez le numéro de la colonne où vous désirez insérer votre jeton : ");
						nb=new Scanner(System.in).nextInt();
					}
					catch(java.util.InputMismatchException e) {
						System.out.println("Votre nombre n'est pas entier, veillez recommencer");
						ok=false;
					}
				} while(!ok);
				
				for (int i=t.length-1;i>0 && ok;i--) { // Boucle pour placer le jeton du joueur 2
						if (t[i][nb-1]==0) {  // Vérifier si un jeton est déjà placé ou non
							t[i][nb-1]=-1;
							ok=false;
						}
				}
			}
			} while (nb!=100);	
		} while (rejouer==1);
	}
}
