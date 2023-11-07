package boucles;

import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nbr,somme=0;
		int compt=0;

		System.out.println("Bonjour, voici un programme qui lit une série de nombre et calcule leur moyenne.");
		System.out.println("Indiquer 0 pour terminer le programme ");
		System.out.print("Entrez un nombre : ");
		nbr = new Scanner(System.in).nextInt();

		while (nbr!=0) {
			somme = somme+nbr;
			compt++;
			System.out.print("Entrez un nombre : ");
			nbr = new Scanner(System.in).nextInt();
		}
		if (compt==0) {
			System.out.print("Au revoir");
		}
		else {
			System.out.print("La moyenne de vos nombres est de  : "+(somme/compt));
		}
	}
}

