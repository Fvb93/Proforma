package Tableaux;

import java.util.Scanner;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		boolean palindrome = true;

		bonjour.bonjour("vous demande d'entrer un mot et de vérifier si celui-ci est un palindrome ");

		System.out.println("Entrez votre mot");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char[]tabCar=s.toCharArray();

		for (int i=0;i<tabCar.length/2 && palindrome;i++) {
			if (tabCar[i]!=tabCar[tabCar.length-i-1]) {
				palindrome=false;
			}
		}
		System.out.println(s +(!palindrome?"n":"") + " est "+ (palindrome==false?"pas":"") + "un palindrome !");
	}
}


