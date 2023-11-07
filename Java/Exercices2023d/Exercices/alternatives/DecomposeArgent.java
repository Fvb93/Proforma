package alternatives;

import java.util.Scanner;

public class DecomposeArgent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;

		System.out.println("Bonjour, voici un programme décompose une somme d'argent");
		System.out.println("Veillez saisir le montant désiré : ");
		a = new Scanner(System.in).nextInt();

		System.out.println("Le nombre de billet(s) de 500 est de : "+(a/500));
		a = a%500;

		System.out.println("Le nombre de billet(s) de 200 est de : "+(a/200));
		a = a%200;

		System.out.println("Le nombre de billet(s) de 100 est de : "+(a/100));
		a = a%100;

		System.out.println("Le nombre de billet(s) de 50 est de : "+(a/50));
		a = a%50;

		System.out.println("Le nombre de billet(s) de 20 est de : "+(a/20));
		a = a%20;

		System.out.println("Le nombre de billet(s) de 10 est de : "+(a/10));
		a = a%10;

		System.out.println("Le nombre de billet(s) de 5 est de : "+(a/5));
		a = a%5;

		System.out.println("Le nombre de pièce(s) de 2 est de : "+(a/2));
		a = a%2;

		System.out.println("Le nombre de pièce(s) de 1 est de : "+a);
		a = a%1;

	System.out.println("A bientôt");
}
}