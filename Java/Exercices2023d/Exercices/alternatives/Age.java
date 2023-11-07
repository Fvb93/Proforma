package alternatives;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jour,mois,annee,jourj,moism,anneea;

		System.out.println("Bonjour, voici un programme qui détermine précisémment votre âge à partir de dates données en nombre");
		System.out.print("Quelle est votre jour de naissance ? ");
		jour = new Scanner(System.in).nextInt();

		System.out.print("Quelle est mois de naissance ? ");
		mois = new Scanner(System.in).nextInt();
		
		System.out.print("Quelle est votre année de naissance ? ");
		annee = new Scanner(System.in).nextInt();

		System.out.print("Quelle est le jour actuel ? ");
		jourj = new Scanner(System.in).nextInt();

		System.out.print("Quelle est le mois actuel ? ");
		moism = new Scanner(System.in).nextInt();
		
		System.out.print("Quelle est l'année actuelle ? ");
		anneea = new Scanner(System.in).nextInt();

		if (annee>anneea) {
			System.out.println("Vous êtes dans le futur, wow");
		}
		else {
			if (jourj>=jour && mois>=moism) {
				System.out.println("Vous avez "+(anneea-annee)+" ans "+(mois-moism)+" mois et "+(jourj-jour)+" jours ");
			}
			else {
				if (jourj>jour) {
					System.out.println("LA FLEMME DE CONTINUER ");
				}
			}
		}
		
	}
}
	