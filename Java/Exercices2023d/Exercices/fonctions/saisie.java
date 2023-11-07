package fonctions;

import java.util.Scanner;

public class saisie {
	public static int entier(String rep) {
		int nb=0;
		boolean ok;

		do {
			try {
				ok=true;
				System.out.println("Entrez votre "+rep+" : ");
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("Votre nombre n'est pas entier, veillez recommencer");
				ok=false;
			}
		} while(!ok);
		return nb;
	}

	public static char saisieChar() {

		char lettre=' ';
		boolean ok;
		do{
			ok=true;
			try{
				System.out.println("Entrez la lettre choisie");
				lettre=(new Scanner(System.in)).nextLine().toLowerCase().charAt(0);
			}
			catch (java.lang.StringIndexOutOfBoundsException e) {  // si String vide débordement de tableau
				System.out.println("Erreur d'encodage, veillez recommencer");
				ok=false;
			}
			if(lettre<61 || lettre>122) { // code ascii de a et de z
				System.out.println("Erreur d'encodage, veillez recommencer");
				ok=false;
			} 


				//char r = 'r'; // uniquement pour mon programme mastermind
				//char j = 'j';
			//	char b = 'b';
				//char o = 'o';
				//char v = 'v';
				//char c = 'c';
				//char t = 't';
				//char s = 's';
				//if (lettre !=r && lettre !=j && lettre !=b && lettre !=o && lettre !=v && lettre !=c && lettre !=t && lettre !=s ) {
					//System.out.println("Erreur d'encodage, veillez recommencer");
				//	ok=false;
				//}
			
		}while (!ok);
		return lettre;
	}


public static String String(String rep) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Veuillez saisir votre "+rep+" :");
	String mot = sc.nextLine();
	return mot;
}
}
