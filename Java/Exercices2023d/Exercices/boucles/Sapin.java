package boucles;

import java.util.Scanner;

public class Sapin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb,comptl,comptc;

		System.out.println("Bonjour, voici qui un programme qui dessine un sapin ");
		System.out.print("Entrez la grandeur du sapin : ");
		nb = new Scanner(System.in).nextInt();

		for (comptl=1;comptl<=nb;comptl++) {			//sapin
			for (comptc=1;comptc<=(2*nb-1);comptc++) {
				if(comptc<=(nb-comptl) ||  (comptc>=(nb+comptl))) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (comptl=1;comptl<=nb;comptl++) {			//demi-sapin
			for (comptc=1;comptc<=nb;comptc++) {
				if(comptl>=comptc) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (comptl=1;comptl<=nb;comptl++) {			//losange
			for (comptc=1;comptc<=(2*nb-1);comptc++) {
				if(comptc<=(nb-comptl) ||  (comptc>=(nb+comptl))) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (comptl=nb-1;comptl>0;comptl--) {
			for (comptc=1;comptc<=(2*nb-1);comptc++) {
				if(comptc<=(nb-comptl) ||  (comptc>=(nb+comptl))) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (comptl=1;comptl<=nb;comptl++) {			//3 demi-sapins
			for (comptc=1;comptc<=2*nb+nb+3;comptc++) {
				if(comptl>=comptc || (comptl>comptc%(nb+2)) || (comptl>comptc%(2*nb)+nb)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Au revoir");

				//version Isabelle

    for(int i=1; i<=nb; i++) {  // i pour le nb de ligne
        for( int j=nb-i; j>0;j--) { // pour les espaces
         System.out.print(" ");
        }
        for (int e=1; e<=(i*2)-1;e++) { // pour les étoiles
            System.out.print("*");
        }
        System.out.println();
    }
    for( int j=(nb-2); j>=1;j--) { // pour postionner le tronc
         System.out.print(" ");
        }
    System.out.println("| |");
}
}
