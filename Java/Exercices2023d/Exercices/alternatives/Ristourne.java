package alternatives;

import java.util.Scanner;

public class Ristourne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, nbe;

		System.out.println("Bonjour, voici un programme qui détermine la ristourne d'un magasin ");
		System.out.print("Quel est le montant de vos achats ? ");
		a = new Scanner(System.in).nextInt();
		
		System.out.print("Combien d'enfants avez-vous ? ");
		nbe = new Scanner(System.in).nextInt();

		if (a>50 && nbe>=3) {	
			System.out.println("Votre ristourne est de 10%");			}
			else {
				if (a>100) {	
					System.out.println("Votre ristourne est de 10%");
					}
					else {
						System.out.println("Votre ristourne est de 5%");
					}	
			}	
		System.out.println("A bientôt");
	}
}