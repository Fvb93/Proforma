package boucles;

import java.util.Scanner;

public class PPCMetPGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb1,nb11,nb2,nb22,ppcm,pgcd=1,reste;

		System.out.println("Bonjour, voici qui un programme qui détermine le PGCD et le PPCM de deux nombres ");
		System.out.print("Entrez un nombre : ");
		nb1 = new Scanner(System.in).nextInt();

		System.out.print("Entrez un nombre : ");
		nb2 = new Scanner(System.in).nextInt();

		nb11=nb1;
		nb22=nb2;
		do {
			reste=nb11%nb22;
			if (reste!=0 ){
				nb11=nb22;
				nb22=reste;
			}
			else {
				pgcd=nb22;
			}
		} while (reste!=0);

		ppcm=((nb1*nb2)/pgcd);

		System.out.println("Le PGCD de vos deux nombres est "+pgcd+" et leur PPCM est "+ppcm);	
		System.out.print("Au revoir");
	}
}

