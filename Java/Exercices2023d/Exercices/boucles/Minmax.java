package boucles;

import java.util.Scanner;

public class Minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbr,petit,comptp=1,grand,comptg=1;

		System.out.println("Bonjour, voici un programme qui lit une série de nombre avec des informations concernant le plus petit et le plus grand nombre de la série. ");
		System.out.println("Indiquer 0 pour terminer le programme ");
		System.out.print("Entrez un nombre : ");
		nbr = new Scanner(System.in).nextInt();
		petit=nbr;
		grand=nbr;

		if (nbr==0) {
			System.out.print("Au revoir");
		}
		else {
			do {
				System.out.print("Entrez un nombre : ");
				nbr = new Scanner(System.in).nextInt();

				if (nbr!=0) {	
					if (nbr<petit) {
						petit = nbr;
						comptp =1;
					} else {
						if (nbr==petit) {
							comptp++;
						}
					}
					if (nbr>grand) {
						grand = nbr;
						comptg =1;
					} else {
						if (nbr==grand) {
							comptg++;
						}
					}
				}
			}
			while (nbr!=0);	

			System.out.println("Le plus petit nombre de la série est "+petit+" et il apparait "+comptp+" fois.");
			System.out.println("Le plus grand nombre de la série est "+grand+" et il apparait "+comptg+" fois.");
			System.out.print("Au revoir");
		}
	}
}


