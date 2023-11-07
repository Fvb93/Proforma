package Découverte;

import java.util.Scanner;

public class LessSaisies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom, prénom;
		byte age;
		int nbrPasJour;
		double compteBanque;
		boolean enForme;
		char lettrePréférée;
		System.out.println("Bonjour");
		System.out.print("Quel est votre prénom ? ");
		prénom = new Scanner(System.in).nextLine();   //saisir prénom
		
		System.out.print(prénom+" et quel est ton nom ? ");
		nom = new Scanner(System.in).nextLine();
		
		System.out.print("Quel est ton âge ? ");
		age = new Scanner(System.in).nextByte();	
		
		System.out.print("Quel est le montant de ton compte en banque ? ");
		compteBanque = new Scanner(System.in).nextDouble();	
		
		System.out.print("Es-tu en forme ? ");
		enForme = new Scanner(System.in).nextBoolean();	
		
		System.out.print("Quel est ta lettre préférée ? ");
		lettrePréférée = new Scanner(System.in).nextLine().charAt(0);
		
		System.out.println("Tu t'appeles "+prénom+" "+nom);
		System.out.println("Tu as "+age+ " ans");
		System.out.println("Ton compte est de "+compteBanque+" euros");
		System.out.println("Tu as répondu "+enForme+" à la question es-tu en forme ?");
		System.out.println("Et ta lettre préférée est "+lettrePréférée+". Merci champion !");
	}

}
