package boucles;

import java.util.Scanner;

public class Choix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choix1, choix2, choix3=1;
		String genre="monsieur",moment="bonjour";


		System.out.println("Bonjour, voici un programme qui propose et vérifie les choix de l'utilisateur ");

		do  {
			System.out.println("Faites votre choix parmis les propositions suivantes en indiquant son numéro ");
			System.out.println("1. Mademoiselle ");
			System.out.println("2. Madame ");
			System.out.println("3. Monsieur ");

			System.out.print("Quel est votre choix ? ");	
			choix1 = new Scanner(System.in).nextInt();
			while (choix1!=1 && choix1 !=2 && choix1 !=3) {
				System.out.println("Erreur d'encodage ? ");	
				System.out.print("Quel est votre choix ? ");	
				choix1 = new Scanner(System.in).nextInt();
			}

			System.out.println("Faites votre choix parmis les propositions suivantes en indiquant son numéro ");
			System.out.println("1. Matin ");
			System.out.println("2. Après-midi ");
			System.out.println("3. Soirée ");

			System.out.print("Quel est votre choix ? ");	
			choix2 = new Scanner(System.in).nextInt();
			while (choix2!=1 && choix2!=2 && choix2!=3) {
				System.out.println("Erreur d'encodage ? ");	
				System.out.print("Quel est votre choix ? ");	
				choix2 = new Scanner(System.in).nextInt();
			}

			System.out.println("Voulez-vous continuer ? ");	
			System.out.println("1. Oui ? ");	
			System.out.println("2. Non ? ");	
			System.out.print("Quel est votre choix ? ");
			choix3 = new Scanner(System.in).nextInt();

			while (choix3!=1 && choix3 !=2) {
				System.out.println("Erreur d'encodage ? ");	
				System.out.print("Quel est votre choix ? ");	
				choix3 = new Scanner(System.in).nextInt();
			}

			switch (choix1) {
			case 1 : 
				genre = "Mademoiselle";
				break;
			case 2 : 
				genre = "Madame";
				break;
			case 3 : 
				genre = "Monsieur";
			}

			switch (choix2) {
			case 1 : 
				moment = "Bonjour";
				break;
			case 2 : 
				moment = "Bonne après-midi";
				break;
			case 3 : moment = "Bonsoir";
			}
			System.out.println(moment +" "+genre);
		}
		while (choix3==1);

		System.out.print("Au revoir");
	}
}

