package boucles;

import java.util.Scanner;

public class Chiffre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbr;

		System.out.println("Bonjour, voici un programme qui force à encoder 0,1,2 ou 3 ");
		System.out.print("Entrez un nomnbre : ");
		nbr = new Scanner(System.in).nextInt();
		
		while (nbr<0 || nbr>3) {
			System.out.println("Recommencer");
			System.out.print("Entrez un nomnbre : ");
			nbr = new Scanner(System.in).nextInt();
		}
		System.out.print("Au revoir");
	}
}
