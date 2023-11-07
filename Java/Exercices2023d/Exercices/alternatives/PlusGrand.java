package alternatives;

import java.util.Scanner;

public class PlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int nb1, nb2;

		System.out.println("Bonjour, voici un programme qui compare deux nombres entiers");
		System.out.println("Veillez saisir les deux nombres : ");
		nb1 = new Scanner(System.in).nextInt();
		nb2 = new Scanner(System.in).nextInt();

		if (nb1>nb2) {
			System.out.println(nb1+" est plus grand que "+nb2);
		}
		else {
			if (nb1==nb2) {
				System.out.println(nb1+" est égal à "+nb2);
			}
			else {
				System.out.println(nb1+" est plus petit que "+nb2);

			}	

		}
		System.out.println("A bientôt");
	}

}
