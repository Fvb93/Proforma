package boucles;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbr, somme=0;
	
		System.out.println("Bonjour, voici un programme qui vous demander d'encoder des nombres. Dès que vous encoder 0, le programme se termine et affiche la somme totale des nombres encodés ");
		
		do {
			System.out.print("Entrez un nombre : ");
			nbr = new Scanner(System.in).nextInt();
		somme =somme+nbr;
		} while (nbr!=0);	
		
			System.out.println("La somme de vos nombres vaut "+somme);
	
		System.out.print("Au revoir");
	}
}

