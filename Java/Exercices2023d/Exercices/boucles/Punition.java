package boucles;

import java.util.Scanner;

public class Punition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int compt1, compt2;
		
		System.out.println("Bonjour, voici qui un programme qui affiche les tables de multiplication des nombres de 1 à 20 ");
		for (compt1=1;compt1<=10;compt1++) {
			System.out.println("");	
			for (compt2=1;compt2<=10;compt2++) {		
			System.out.print(compt1*compt2+"\t");	
		}
		}
		System.out.println(" ");	
		System.out.print("Au revoir");
	}
}
