package alternatives;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;

		System.out.println("Bonjour, voici un programme qui résoud une équation du type ax + b = 0");
		System.out.println("Veillez saisir la valeur de a et de b : ");
		a = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();

		if (a==0 && b==0) {	
			System.out.println("Votre équation est indéterminée, toute les valeurs sont possibles");
		}
		else { if (a==0) {
			System.out.println("Votre équation est impossible, la valeur de a doit toujours être différente de 0");
		}
		else {	
			System.out.println("La solution de votre équation est "+(double)-b/a);
		}
			System.out.println("A bientôt");
		}
	}
}


