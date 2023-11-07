package alternatives;

import java.util.Scanner;

public class CompareDix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;

		System.out.println("Bonjour, voici un programme qui donne la somme et la différence de deux nombre losqu'ils sont plus grand ou égaux à 10 sinon il calcule leur produit");
		System.out.println("Veillez saisir la valeur du premier et du deuxième nombre : ");
		a = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();

		if (a>=10 && b>=10 && a>=b) {	
			System.out.println("La somme des deux nombres est : "+(a+b));
			System.out.println("La différence des deux nombres est : "+(a-b));
		}
		else {
			if (a>=10 && b>=10 && a<b) {	
				System.out.println("La somme des deux nombres est : "+(a+b));
				System.out.println("La différence des deux nombres est : "+(b-a));
			}

			else {
				System.out.println("Le produit des deux nombres est : "+(a*b));
			}	
		}
		System.out.println("A bientôt");
	}
}