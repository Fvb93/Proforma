package boucles;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int nbr,compt;

		System.out.println("Bonjour, voici un programme qui détermine la table d'un nombre donné ");
		System.out.print("Entrez un nomnbre : ");
		nbr = new Scanner(System.in).nextInt();
		compt = 1;
		
		while (compt<=10) {
			System.out.print(compt*nbr+ " ");
			compt ++;
		}
	}
}
