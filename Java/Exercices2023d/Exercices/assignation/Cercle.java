package assignation;

import java.util.Scanner;

public class Cercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;

		System.out.println("Bonjour, voici un programme qui détermine la circonférence d'un cercle et l'aire d'un disque");
		System.out.println("Veillez saisir la valeur du rayon : ");

		r = new Scanner(System.in).nextDouble();

		System.out.println("La circonférence du cercle vaut : "+(2*Math.PI*r));
		System.out.println("L'aire du disque vaut : "+(Math.PI*(int) Math.pow(r, 2)));		
		System.out.println("A bientôt");
	}

}
