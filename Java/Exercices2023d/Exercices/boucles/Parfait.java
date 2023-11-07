package boucles;

import java.util.Scanner;

public class Parfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb=0, somme, div;

		System.out.println("Bonjour, voici qui un programme qui détermine les nombres parfait inférieurs à 4000 ");

		for (nb=1;nb<=4000;nb++) {
			somme=1;
			div=2;
			while (div<Math.sqrt(nb)) {
				if (nb%div==0) {
					somme=somme+div+(nb/div);
				}
				div++;
			}
			if(div==Math.sqrt(nb)) {
				somme=somme+div;
			}
			if (somme==nb) {
				System.out.println(nb);
			}
		}
		System.out.print("Au revoir");
	}
}
