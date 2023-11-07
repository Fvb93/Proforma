package alternatives;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choix, nb1, nb2;

		System.out.println("Bonjour, voici un programme qui opère sur les deux nombres de votre choix");
		System.out.print("Taper 1 pour l'addition, 2 pour la soustraction, 3 pour la multiplication et 4 pour la division : ");
		choix = new Scanner(System.in).nextInt();

		System.out.print("Quelle est votre premier nombre ? ");
		nb1 = new Scanner(System.in).nextInt();

		System.out.print("Quelle est votre deuxième nombre ? ");
		nb2 = new Scanner(System.in).nextInt();

		if (choix==1) {
			System.out.println(nb1+" + "+nb2+" = "+(nb1+nb2));
		}
		else {
			if (choix==2) {
				System.out.println(nb1+" - "+nb2+" = "+(nb1-nb2));
			}
			else {
				if (choix==3) {
					System.out.println(nb1+" . "+nb2+" = "+(nb1*nb2));
				}
				else {
					if (choix==4 && nb2!=0) {
						System.out.println(nb1+" / "+nb2+" = "+((double)nb1/nb2));
					}
					else {
						if (choix==4 && nb2==0) {
							System.out.println("On ne peut pas diviser par 0 !");
						}
						else {
							System.out.println("Erreur de choix d'opération");
						}

					}

				}
			}
		}
	}
}