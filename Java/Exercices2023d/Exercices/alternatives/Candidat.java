package alternatives;

import java.util.Scanner;

public class Candidat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		String prenom, nom;

		System.out.println("Bonjour, voici un programme qui indique la formation qui vous est destinée");
		System.out.print("Veillez indiquer votre prénom : ");
		prenom = new Scanner(System.in).nextLine();

		System.out.print("Veillez indiquer votre nom : ");
		nom = new Scanner(System.in).nextLine();

		System.out.println("Veillez indiquer votre âge : ");
		age = new Scanner(System.in).nextInt();


		if (prenom.equalsIgnoreCase("isabelle")) {
			System.out.println("Pas selectionnée");

		}
		else {
			if (age<20 || age>50) {
				System.out.println("Vous n'êtes pas concerné");
			}
			else {
				if (age>=20 && age<=30 && age!=25 && age!=26) {
					System.out.println("Formation A");
				}
				else {
					if (age>=31 && age<=50 && !(age>=40 && age<=47)) {
						System.out.println("Formation B");
					}
					else {
						System.out.println("Formation C");
					}
				}	

			}
			System.out.println("A bientôt");
		}

	}
}