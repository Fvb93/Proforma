package assignation;

import java.util.Scanner;

public class Calculs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb1,nb2;
		System.out.println("Bonjour, voici un programme qui détermine la somme, la différence et le produit de deux nomnbres entiers");
		System.out.println("Veillez saisir deux nombres :");

		nb1 = new Scanner(System.in).nextInt();
		nb2 = new Scanner(System.in).nextInt();

		System.out.println("La somme de vos deux nombres est de : "+(nb1+nb2));
		System.out.println("La différence de vos deux nombres est de : "+(nb1-nb2));
		System.out.println("Le produit de vos deux nombres est de : "+(nb1*nb2));
		System.out.println("A bientôt");
	}

}
