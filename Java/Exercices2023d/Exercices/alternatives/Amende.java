package alternatives;

import java.util.Scanner;

public class Amende {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lim, vit, diff, amende;

		System.out.println("Bonjour, voici un programme qui détermine le montant d'une amende de vitesse");
		System.out.print("Quelle est la limitation de vitesse ");
		lim = new Scanner(System.in).nextInt();

		System.out.print("Quelle est votre vitesse ? ");
		vit = new Scanner(System.in).nextInt();

		diff = vit - lim;

		if (diff<=0) {
			System.out.println("Bravo, vous respectez bien les limitations de vitesse");
		}
		else {
			if (diff>0 && diff<=20) {
				System.out.println("Amende de 50€");
			}
			else {
				if (diff>20 && diff<=30) {
					System.out.println("Amende de 100€");
				}
				else {
					if (diff>30 && diff<=50) {
						System.out.println("Amende de 200€");
					}
					else {
						System.out.println("Retrait de permis");
					}

				}

			}
		}
	}
}