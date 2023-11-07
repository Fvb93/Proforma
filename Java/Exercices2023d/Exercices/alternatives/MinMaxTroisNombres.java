package alternatives;

import java.util.Scanner;

public class MinMaxTroisNombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb1, nb2, nb3;

		System.out.println("Bonjour, voici un programme qui compare trois nombres");
		System.out.println("Veillez saisir les trois nombres ");
		nb1 = new Scanner(System.in).nextInt();
		nb2 = new Scanner(System.in).nextInt();
		nb3 = new Scanner(System.in).nextInt();

		if (nb1==nb2 && nb1==nb3) {	
			System.out.println("Vos trois nombres sont identiques");
		}
		else {
			if (nb1>=nb2 && nb1>=nb3) {	
				System.out.println("Le nombre le plus grand est : "+nb1);
			}
			else {
				if (nb2>=nb1 && nb2>=nb3) {	
					System.out.println("Le nombre le plus grand est : "+nb2);
				}
				else {
					System.out.println("Le nombre le plus grand est : "+nb3);
				}

			}
			if (nb1<=nb2 && nb1<=nb3) {	
				System.out.println("Le nombre le plus petit est : "+nb1);
			}
			else {
				if (nb2<=nb1 && nb2<=nb3) {	
					System.out.println("Le nombre le plus petit est : "+nb2);
				}
				else {
					System.out.println("Le nombre le plus petit est : "+nb3);
				}
			}
		}
		System.out.println("A bientôt");
	}

}
