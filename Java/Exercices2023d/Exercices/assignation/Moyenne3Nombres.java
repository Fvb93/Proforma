package assignation;

import java.util.Scanner;

public class Moyenne3Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb1, nb2, nb3;

		System.out.println("Bonjour, voici un programme qui détermine la moyenne de trois nombres entiers");
		System.out.println("Veillez saisir les trois nombres : ");
		nb1 = new Scanner(System.in).nextInt();
		nb2 = new Scanner(System.in).nextInt();
		nb3 = new Scanner(System.in).nextInt();

		System.out.println("La moyenne de vos trois nombres est de : "+(double)(nb1+nb2+nb3)/3);
		System.out.println("A bientôt");
	}

}
