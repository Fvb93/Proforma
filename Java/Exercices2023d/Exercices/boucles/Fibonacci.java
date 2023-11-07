package boucles;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int somme,sommea=1, sommeaa=0,compt;

		System.out.println("Bonjour, voici un programme qui affiche les 20 premiers nombres de la suite de Fibonacci.");


		for (compt=0;compt<18;compt++) {

			somme = sommea + sommeaa;
			sommeaa=sommea;
			sommea=somme;
			if (compt==0) {
				System.out.print("0  1  "+somme+"  ");		
			}
			else {
				System.out.print(somme+"  ");	
			}

		}
	}
}

