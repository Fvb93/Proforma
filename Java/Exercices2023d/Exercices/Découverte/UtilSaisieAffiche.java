package Découverte;

import java.util.Scanner;

public class UtilSaisieAffiche {
	public static void bienvenueDansMonBeauProgramme() {
		System.out.println("***************************");
		System.out.println("******* Bienvenue *********");
		System.out.println("***************************");
		System.out.println("\n***************************");
		System.out.println("**   Isabelle Detrixhe   **");
		System.out.println("***************************");
	}
	public static void fin() {
		System.out.println("***************************");
		System.out.println("*********f***i***n*********");
		System.out.println("***************************");
	}
	
	public static void afficheSomme(int nb1, int nb2) {
		System.out.println(nb1 + "+" + nb2 + "=" + (nb1+nb2));
	}

	public static void debutProg( String nom   ) {
		System.out.println("\nVoici le programme :");
		System.out.println(nom);
	}
	public static boolean recommenceOuiNon() {
		String rep;
		do {
			System.out.println("voulez-vous recommencer ? (oui/non)");
			rep=new Scanner(System.in).nextLine();
		}while(! rep.equalsIgnoreCase("oui") && !rep.equalsIgnoreCase("non"));
		if(rep.equalsIgnoreCase("oui"))
			return true;
		else
			return false;
	
	}
	public static int saisieInt() {
		boolean ok;
		int nb=0;
		do {
			try {
				ok=true;
				System.out.println("Entrez un nombre entier svp :");
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("un nombre entier !!!!!!!!!!!!!!!!!");
				ok=false;
			}
		}while( !ok);
		return nb;
	}
}

