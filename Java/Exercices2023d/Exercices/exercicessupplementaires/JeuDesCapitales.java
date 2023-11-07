package exercicessupplementaires;

import java.util.Random;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class JeuDesCapitales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] tabCapitales={ {"Allemagne ", "Berlin"}, { "Autriche ", "Vienne"}, { "Belgique ", "Bruxelles"},
				{ "Bulgarie ", "Sofia"}, { "Chypre ", "Nicosie"}, { "Croatie ", "Zagreb"}, { "Danemark ", "Copenhague"}, {
					"Espagne ", "Madrid"}, { "Estonie ", "Tallinn"}, { "Finlande ", "Helsinki"}, { "France ", "Paris"}, { "Grèce", "Athènes"}, { "Hongrie ", "Budapest"}, { "Irlande ", "Dublin"}, 
				{ "Italie ", "Rome"}, { "Lettonie ","Riga"}, { "Lituanie ", "Vilnius"}, { "Luxembourg ", "Luxembourg"}, 
				{ "Malte ", "La Valette"}, { "PaysBas ", "Amsterdam"}, { "Pologne ", "Varsovie"}, { "Portugal ", "Lisbonne"}, { "République tchèque ","Prague"}, 
				{ "Roumanie ", "Bucarest"}, { "Slovaquie ", "Bratislava"}, { "Slovénie ", "Ljubljana"}, { "Suède ", "Stockholm"}} ;
		int i=0;
		int choix; 	//choix du menu
		int choixj; //choix des joueurs pour cash carré ou duo
		int al;	// pays tirés aléatoirement
		int aleatoire; // capitales tirées aléatoirement
		String rep; // réponse de l'utilisateur
		boolean []t = new boolean [27]; // permet de lister les pays par tirages (déjà tirés ou non)
		boolean []t1 = new boolean [27]; // idem pour les capitakes
		Random r = new Random ();
		int cpt=0;
		int bonnereponse = 0;
		int bonnereponsej1=0, bonnereponsej2=0;
		boolean sortie=false;
		String joueur1 = null;
		String joueur2 = null;

		bonjour.bonjour("va vous faire jouer avec des capitales européennes");

		for (i=0;i<t.length;i++) { // initialise mon tableau en faux (faux = non connu) pour chaque valeur 
			t[i]=false;
		}

		do {  // permet de revenir au menu
			System.out.println("Menu\t\n\n1. Etudier\n2. Tester\n3. Jouer\n4. Quitter\n");
			choix=saisie.entier("choix. Taper le nombre correspondant.");
			System.out.println();

			switch (choix) { // choix du menu
			case 1: // Etudier
				System.out.println("Taper # lorsque vous voulez quitter\n");
				do { 
					do { // permet de ne pas reprendre un pays déjà utilisé
						al=r.nextInt(27);
						sortie=true; // si sortie reste vrai, tout les pays sont connus
						for (i=0;i<t.length;i++) { // initialise mon tableau en faux (faux = non connu) pour chaque valeur 
							if (t[i]==false) { // si un pays n'est pas connu, je continue
								sortie=false; 
							}
						}		
					} while (t[al]==true && sortie==false);
					if (sortie==false) {		
						System.out.println("Quelle est la capitale de ce pays : "+tabCapitales[al][0]);
						rep=saisie.String("réponse");

						switch (rep) {
						case "?":
							System.out.println("La bonne réponse était :"+tabCapitales[al][1]+"\n");
							break;
						case "#":
							choix=5;
							break;
						default :
							if (!rep.equalsIgnoreCase(tabCapitales[al][1])) {
								System.out.println("La bonne réponse est "+tabCapitales[al][1]+"\n");
							}
							else {
								System.out.println("Bonne réponse !\n");
								t[al]=true;
							}
						}
					} else {
						System.out.println("Vous avez étudiez toutes les capitales, bien joué !\n\nRetour au menu principal\n\n");
						choix=5;
					}
				} while (choix!=5);
			case 2: // Tester
				System.out.println("Je vais vous proposer 10 pays au hasard.\nTaper # lorsque vous voulez quitter\n");
				do { 
					do { // permet de ne pas reprendre un pays déjà utilisé
						al=r.nextInt(27);		
					} while (t[al]==true);
					if (cpt<10) {
						System.out.println("Question "+(cpt+1));
						System.out.println("Quelle est la capitale de ce pays : "+tabCapitales[al][0]);
						rep=saisie.String("réponse");

						switch (rep) {
						case "?":
							System.out.println("La bonne réponse était :"+tabCapitales[al][1]+"\n");
							t[al]=true;
							break;
						case "#":
							choix=5;
							break;
						default :
							if (!rep.equalsIgnoreCase(tabCapitales[al][1])) {
								System.out.println("La bonne réponse est "+tabCapitales[al][1]+"\n");
								t[al]=true;
							}
							else {
								System.out.println("Bonne réponse !\n");
								t[al]=true;
								bonnereponse++;
							}
						}
					} else {
						System.out.println("Vous avez "+bonnereponse+" bonnes réponses sur 10\n");
						choix=5;
					}
					cpt++;
				} while (choix!=5);
				break;
			case 3: // Jouer
				joueur1=saisie.String("prénom joueur 1");
				joueur2=saisie.String("prénom joueur 2");
				System.out.println();

				System.out.println("Bienvenue "+joueur1+" et "+joueur2+" à ce grand jeu ! \n");
				do { 
					do { // permet de ne pas reprendre un pays déjà utilisé
						al=r.nextInt(27);		
					} while (t[al]==true);
					if (cpt<20) {
						if (cpt%2==0) {
							System.out.println("**********************************************************************\t");
							System.out.println(joueur1+" c'est à vous de jouer !\n");
							System.out.println("Question "+((cpt/2)+1));
							System.out.println("Quelle est la capitale de ce pays : "+tabCapitales[al][0]);
							System.out.println("Taper :\n1 pour cash.\n2 pour carré\n3 pour duo");
							do {
								choixj=saisie.entier("choix");
							} while (choixj<1 || choixj>3);

							switch(choixj) { 
							case 1:
								rep=saisie.String("réponse");
								switch (rep) {
								case "?":
									System.out.println("La bonne réponse était :"+tabCapitales[al][1]+"\n");
									t[al]=true;
									break;
								default :
									if (!rep.equalsIgnoreCase(tabCapitales[al][1])) {
										System.out.println("La bonne réponse est "+tabCapitales[al][1]+"\n");
										t[al]=true;
									}
									else {
										System.out.println("Bonne réponse !\n");
										t[al]=true;
										bonnereponsej1=bonnereponsej1+5;
									}
								}
								break;
							case 2:
								System.out.println();
								switch (cpt%4) { // indique la bonne réponse à des endroits différents 
								case 0:	
									for (i=0;i<t1.length;i++) { // initialise mon tableau en faux (faux = non connu) pour chaque valeur 
										t1[i]=false;
									}
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									System.out.println(tabCapitales[al][1]);
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									System.out.println();
									break;
								case 1 :
									for (i=0;i<t1.length;i++) { // initialise mon tableau en faux (faux = non connu) pour chaque valeur 
										t1[i]=false;
									}
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[al][1]);
									System.out.println(tabCapitales[aleatoire][1]);
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									System.out.println();
									break;	
								case 2 :
									for (i=0;i<t1.length;i++) { // initialise mon tableau en faux (faux = non connu) pour chaque valeur 
										t1[i]=false;
									}
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									System.out.println(tabCapitales[al][1]);
									System.out.println();
									break;
								case 3 :
									for (i=0;i<t1.length;i++) { // initialise mon tableau en faux (faux = non connu) pour chaque valeur 
										t1[i]=false;
									}
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[aleatoire][1]);
									do {  // choisi une capitale unique
										aleatoire=r.nextInt(27);								
									} while (t[aleatoire]==true);	
									System.out.println(tabCapitales[al][1]);
									System.out.println(tabCapitales[aleatoire][1]);
									System.out.println();
									break;
								}
									rep=saisie.String("réponse");
									switch (rep) {
									case "?":
										System.out.println("La bonne réponse était :"+tabCapitales[al][1]+"\n");
										t[al]=true;
										break;
									default :
										if (!rep.equalsIgnoreCase(tabCapitales[al][1])) {
											System.out.println("La bonne réponse est "+tabCapitales[al][1]+"\n");
											t[al]=true;
										}
										else {
											System.out.println("Bonne réponse !\n");
											t[al]=true;
											bonnereponsej1=bonnereponsej1+3;
										}
									}
									break;
								case 3 :

								}
							} 
							else {
								System.out.println("**********************************************************************\t");
								System.out.println(joueur2+" c'est à vous de jouer !\n");
								System.out.println("Question "+((cpt/2)+1));
								System.out.println("Quelle est la capitale de ce pays : "+tabCapitales[al][0]);
								System.out.println("Taper :\n1 pour cash.\n2 pour carré\n3 pour duo");
								do {
									choixj=saisie.entier("choix");
								} while (choixj<1 || choixj>3);

								switch(choixj) { 
								case 1:
									rep=saisie.String("réponse");
									switch (rep) {
									case "?":
										System.out.println("La bonne réponse était :"+tabCapitales[al][1]+"\n");
										t[al]=true;
										break;
									default :
										if (!rep.equalsIgnoreCase(tabCapitales[al][1])) {
											System.out.println("La bonne réponse est "+tabCapitales[al][1]+"\n");
											t[al]=true;
										}
										else {
											System.out.println("Bonne réponse !\n");
											t[al]=true;
											bonnereponsej2=bonnereponsej2+5;
										}
									}
									break;
								case 2:
									System.out.println();
									switch (cpt%4) {
									case 0:
										System.out.println(tabCapitales[al][1]);
										System.out.println(tabCapitales[al][1]);
										System.out.println(tabCapitales[al][1]);
										System.out.println(tabCapitales[al][1]);
									}
									rep=saisie.String("réponse");
									switch (rep) {
									case "?":
										System.out.println("La bonne réponse était :"+tabCapitales[al][1]+"\n");
										t[al]=true;
										break;
									default :
										if (!rep.equalsIgnoreCase(tabCapitales[al][1])) {
											System.out.println("La bonne réponse est "+tabCapitales[al][1]+"\n");
											t[al]=true;
										}
										else {
											System.out.println("Bonne réponse !\n");
											t[al]=true;
											bonnereponsej2=bonnereponsej2+3;
										}
									}
									break;
								case 3 :

								}
							}  
						}
						else {
							System.out.println(joueur1+" vous avez "+bonnereponsej1+" points");
							System.out.println(joueur2+" vous avez "+bonnereponsej2+" points\n");
							if (bonnereponsej1==bonnereponsej2){
								System.out.println("Egalité ! Il faut impérativement rejouer afin de vous départager !");
							}
							if (bonnereponsej1>bonnereponsej2) {
								System.out.println(joueur1+" est une machine, il a écrasé "+joueur2+" !");
							} 
							else {
								System.out.println(joueur2+" est une machine, il a écrasé "+joueur1+" \n!");
							}
							choix=5;
						}
						cpt++;
					} while (choix!=5);
					break;
				case 4: // Quitter
					System.out.println("Au revoir !");
					break;
				default:
					System.out.println("Erreur d'encodage, veillez recommencer");
					choix=5;
				}
			} while (choix==5);
		}
	}