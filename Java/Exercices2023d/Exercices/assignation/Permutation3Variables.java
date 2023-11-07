package assignation;

import java.util.Scanner;

public class Permutation3Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb1, nb2, nb3, a = 0;

		System.out.println("Bonjour, voici un programme qui va permuter la valeur de trois variables");
		System.out.println("Veillez saisir trois nombres : ");
		nb1 = new Scanner(System.in).nextInt();
		nb2 = new Scanner(System.in).nextInt();
		nb3 = new Scanner(System.in).nextInt();

		System.out.println("Votre premier nombre est : "+nb1);
		System.out.println("Votre second nombre est : "+nb2);
		System.out.println("Votre troisième nombre est : "+nb3);
		
		System.out.println();

		a = nb1;
		nb1 = nb2;
		nb2 = nb3;
		nb3 = a;	
		
		
		System.out.println("Votre premier nombre devient : "+nb1);
		System.out.println("Votre second nombre devient : "+nb2);
		System.out.println("Votre troisième nombre devient : "+nb3);
		
		
		System.out.println("A bientôt");
	}
}

