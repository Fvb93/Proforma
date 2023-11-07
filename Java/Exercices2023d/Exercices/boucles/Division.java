package boucles;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb1=0,nb2=0;
		int  compt=0;
		boolean ok=true;

		System.out.println("Bonjour, voici un programme qui effectue la division entière de deux nombres entiers sans utiliser l'instruction /");
		do {	
			try {
				ok=true;
				System.out.print("Entrez un nombre : ");
				nb1 = new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.print("Votre nombre n'est pas entier, veillez recommencer");
				ok=false;
			}
		}
		while (!ok);

		do {	
			try {
				ok=true;
				System.out.print("Entrez un nombre : ");
				nb2 = new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.print("Votre nombre n'est pas entier, veillez recommencer");
				ok=false;
			}
		}
		while (!ok);

		while (nb2*compt + nb2 <= nb1) {
			compt++;
		}

		System.out.println("La division entière de "+nb1+" par "+nb2+" donne : "+nb2+" . "+compt+" + "+(nb1%nb2));
		System.out.print("Au revoir");
	}
}

