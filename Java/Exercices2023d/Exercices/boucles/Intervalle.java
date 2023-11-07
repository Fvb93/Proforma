package boucles;

import java.util.Scanner;

public class Intervalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb1,nb2,somme=0;

		System.out.println("Bonjour, voici un programme qui calcule la somme des nombres entiers compris dans l'intervalle de deux nombres donnés y compris ceux-ci");
		do {
			System.out.print("Entrez un nombre plus grand que 0 : ");
			nb1 = new Scanner(System.in).nextInt();
		} while (nb1<=0);

		do {
			System.out.print("Entrez un deuxième nombre plus grand que 0: ");
			nb2 = new Scanner(System.in).nextInt();
		} while (nb2<=0);

		if (nb1==nb2) {
			System.out.println("Vos deux nombres sont identiques, impossible de calculer l'intervalle");
		}
		else {
			somme = nb1+nb2;
			do {
				if (nb1-nb2==1 || nb2-nb1==1) {
					System.out.println("La somme est de : "+somme);	
					nb1=nb2;
				}
				else if (nb1>nb2) {
					nb1--;
					somme = somme + nb1;	
				}
				else {
					nb2--;
					somme = somme + nb2;
				}
			} while (nb1!=nb2);
		}	
		System.out.print("Au revoir");
	}
}
