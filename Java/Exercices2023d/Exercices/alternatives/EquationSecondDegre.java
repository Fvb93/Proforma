package alternatives;

import java.util.Scanner;

public class EquationSecondDegre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		double delta;

		System.out.println("Bonjour, voici un programme résoud une équation du second degré du type ax²+bx+c = 0");
		System.out.print("Quelle est la valeur de a : ");
		a = new Scanner(System.in).nextInt();

		System.out.print("Quelle est la valeur de b : ");
		b = new Scanner(System.in).nextInt();

		System.out.print("Quelle est la valeur de c : ");
		c = new Scanner(System.in).nextInt();

		delta = Math.pow(b, 2)-4*a*c;
		if (a==0 && b==0 && c==0) {	
			System.out.println("Votre équation est indéterminée, toute les valeurs sont possibles");
		}
		else { if (a==0 && b==0) {
			System.out.println("Votre équation est impossible, la valeur de a et de b ne doivent pas être toutes les deux égal à 0 ");
		}
		else {	
			if (a==0) {
				System.out.println("Votre équation est du premier degré et la solution de votre équation est "+(double)-b/a);
			}
			else {	
				if (delta<0) {
					System.out.println("Votre équation est impossible et ne contient aucune solution");
				}		
				else {	
					System.out.println("Votre équation admet deux solution : "+((-b+Math.sqrt(delta))/(2*a))+" et "+((-b-Math.sqrt(delta))/(2*a)));
				}			
				System.out.println("A bientôt");
			}
		}
		}
	}
}
