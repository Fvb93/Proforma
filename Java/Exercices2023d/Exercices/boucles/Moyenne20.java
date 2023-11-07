package boucles;

import java.util.Scanner;

public class Moyenne20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb1;
		float somme=0;
		int compt1=1;
		int compt2=0;

		System.out.println("Bonjour, voici un programme qui vous demander d'encoder 20 nombre et qui calculera la moyenne de ceux compris entre 10 et 20");
		do {
			System.out.print("Entrez un nombre : ");
			nb1 = new Scanner(System.in).nextInt();
			compt1++;
			if (nb1>=10 && nb1<=20) {
				somme=somme+nb1;
				compt2++;
			}
		} while (compt1<=20);
		
		if (compt2==0) {
			System.out.println("Vous avez saisis aucun nombre entre 10 et 20.");
		}
		else {
			System.out.println("La moyenne des nombres compris entre 10 et 20 est de : "+(somme/compt2));
		}
		System.out.print("Au revoir");
	}
}
