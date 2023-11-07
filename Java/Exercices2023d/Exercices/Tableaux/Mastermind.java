package Tableaux;

import java.util.Random;
import java.util.Scanner;

import fonctions.bonjour;
import fonctions.saisie;

public class Mastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choixd; // choix de la difficulté
		int choixj; // choix du nombre de joueurs
		char s = 0; // lette représentant les couleurs
		char [] t = new char [4]; // tableau représentant les couleurs à deviner
		char [] t2 = new char [4]; // tableau représentant les couleurs choisies par le joueurs
		int[] t3 = new int [4]; // tableau intermédiaire pour représenter les couleurs à deviner
		int cpt=0; // compteur de tentatives
		int cpt2=1; // compteur pour ne pas avoir 2 fois la même couleur dans la version difficile
		int ok=0; // compteur de couleur placée au bon endroit
		Random r = new Random (); //selection aléatoire des couleurs


		bonjour.bonjour("va vous faire jouer au  Mastermind. \n\nIl y a une version facile où les couleurs sont présentes une et une seule fois et une version difficile où les couleurs peuvent être répétées.");
		choixd=saisie.entier("choix\n  \nTaper 1 pour la version facile. \nTaper 2 pour la version difficile \n\nQuel est votre choix ");
		while (choixd!=1 && choixd!=2) { 
			System.out.println("Erreur d'encodage, veillez recommencer");
			choixd=saisie.entier("choix\n  \nTaper 1 pour la version facile. \nTaper 2 pour la version difficile \n\nQuel est votre choix ");
		}
		System.out.println();

		System.out.println("Désirez-vous jouer seul ou à 2 joueurs ?");
		choixj=saisie.entier("choix\n \nTaper 1 pour jouer contre l'ordinateur. \nTaper 2 pour jouer à deux \n\nQuel est votre choix ");
		while (choixj!=1 && choixj!=2) {
			System.out.println("Erreur d'encodage, veillez recommencer");
			choixj=saisie.entier("choix\n \nTaper 1 pour jouer contre l'ordinateur. \nTaper 2 pour jouer à deux \n\nQuel est votre choix ");
		}

		System.out.println("Vous devez choisir 4 couleurs parmi les 8 couleurs suivantes : rouge, jaune, bleu, orange, vert,blanc, violet, rose. \n\nJoueur 1 : veillez indiquer votre choix de couleur.\n");
		System.out.println("Taper :\nR pour rouge \nJ pour jaune\nB pour bleu\nO pour orange\nV pour vert\nC pour blanc\nT pour violet\nS pour rose\n");

		if (choixj==1) { //version à un joueur
			if (choixd==1) { //version facile
				for (int i=0;i<t3.length;i++) {
					t3[i]= r.nextInt(7);
				}
				for (int i=0;i<t3.length;i++) {
					while (i<t3.length-cpt2) {
						if (t3[i]==t3[t3.length-cpt2]) {
							t3[i]=r.nextInt(7);
							i=0;
						}
						cpt2++;	 							} 
					cpt2=1;
				}	

				for (int i=0;i<t.length;i++) {
					switch (t3[i]) {
					case 0:
						t[i]='r';
						break;
					case 1:
						t[i]='j';
						break;
					case 2:
						t[i]='b';
						break;
					case 3:
						t[i]='o';
						break;
					case 4:
						t[i]='v';
						break;
					case 5:
						t[i]='c';
						break;
					case 6:
						t[i]='t';
						break;
					case 7:
						t[i]='s';
						break;
					}	
				} 
			}
			else { //version difficile
				for (int i=0;i<t3.length;i++) {
					t3[i]= r.nextInt(7);
				}
				for (int i=0;i<t.length;i++) {
					switch (t3[i]) {
					case 0:
						t[i]='r';
						break;
					case 1:
						t[i]='j';
						break;
					case 2:
						t[i]='b';
						break;
					case 3:
						t[i]='o';
						break;
					case 4:
						t[i]='v';
						break;
					case 5:
						t[i]='c';
						break;
					case 6:
						t[i]='t';
						break;
					case 7:
						t[i]='s';
						break;
					}	
				} 	
			}
		}
		else {  //version à deux joueurs
			if (choixd==1) { //version facile
				for (int i=0;i<t.length;i++) {
					System.out.println("Entrez votre choix "+(i+1) +" :");
					s=saisie.saisieChar();
					t[i]=s;
				}	
				for (int i=0;i<t.length;i++) {
					while (i<t.length-cpt2) {
						if (t[i]==t[t.length-cpt2]) {
							System.out.println("Vous avez utilisé plusieurs fois la même couleur, ce n'est pas autorisé dans la version facile, veillez choisir en une autre pour la position "+(i+1));
							s=saisie.saisieChar();
							t[i]=s;
							i=0;
						}
						cpt2++;	
					} 
					cpt2=1;
				}			
			}
			else { //version difficile
				for (int i=0;i<t.length;i++) {
					System.out.println("Entrez votre choix "+(i+1) +" :");
					s=saisie.saisieChar();
					t[i]=s;
				}
			}
			System.out.println("\n\nVotre combinaison est : \n");
			for (int i=0;i<t.length;i++) {
				System.out.print((t[i]=='r'?"Rouge\t":"")+(t[i]=='j'?"Jaune\t":"")+(t[i]=='b'?"Bleu\t":"")+(t[i]=='o'?"Orange\t":"")+(t[i]=='v'?"Vert\t":"")+(t[i]=='c'?"Blanc\t":"")+(t[i]=='t'?"Violet\t":"")+(t[i]=='s'?"Rose\t":""));
			}
			System.out.println();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			System.out.println("Joueur 2, c'est à vous de jouer. \nVous devez déterminer la combinaison des 4 couleurs dans l'ordre parmis les couleurs suivantes en maximum 12 tentatives:");
			System.out.println("Taper :\nR pour rouge \nJ pour jaune\nB pour bleu\nO pour orange\nV pour vert\nC pour blanc\nT pour violet\nS pour rose\n");
		} 
		do {
			for (int i=0;i<t.length;i++) {
				System.out.println("Entrez votre choix "+(i+1) +" :");
				s=saisie.saisieChar();
				t2[i]=s;
			}
			ok=0;
			cpt++;
			for (int i=0;i<t.length;i++) {
				if (t2[i]==t[i]) {
					ok++;
				}
			}
			if (ok==4) {
				System.out.println("Bravo ! Vous avez deviné la combinaison en "+cpt+" tentative"+(cpt>1?"s":""));
			}
			else {
				System.out.println("Vous avez "+ok+" couleur"+(ok>1?"s":"")+" bien placée"+(ok>1?"s":"")+" et "+(4-ok)+" couleur"+((4-ok)>1?"s":"")+" mal placée"+((4-ok)>1?"s":"")+". Tentative numéro "+cpt+"\n");
			}
		}
		while (cpt<12 && ok!=4);

		if (cpt==12) {
			System.out.println("Malheureusement, vous n'avez pas réussi à trouver la combinaison en maximum 12 tentatives...\n\n");
			System.out.println("La combinaison était ");
			for (int i=0;i<t.length;i++) {
				System.out.print((t[i]=='r'?"Rouge\t":"")+(t[i]=='j'?"Jaune\t":"")+(t[i]=='b'?"Bleu\t":"")+(t[i]=='o'?"Orange\t":"")+(t[i]=='v'?"Vert\t":"")+(t[i]=='c'?"Blanc\t":"")+(t[i]=='t'?"Violet\t":"")+(t[i]=='s'?"Rose\t":""));
			}
		}
	}
}
