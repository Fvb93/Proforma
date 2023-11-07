package assignation;

import java.util.Scanner;

public class ExpBooleenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb1,mod;

		System.out.println("Bonjour, voici un programme qui détermine si un nombre rempli certaines conditions");
		System.out.println("Veillez saisir un nombre : ");
		nb1 = new Scanner(System.in).nextInt();

		System.out.println("Premier test : votre nombres en compris entre 5 et 10 ");
		System.out.println("Réponse : "+(nb1<10 && nb1>5));
		
		System.out.println("Deuxième test : votre nombres en compris entre 5 et 99 et différent de 10  ");		
		System.out.println("Réponse : "+((nb1<99 && nb1>5) && nb1!=10));
		
		System.out.println("Troisième test : votre nombres n'est pas compris entre 6 et 85 ");
		System.out.println("Réponse : "+!(nb1<85 && nb1>6));
		
		System.out.println("Quatrième test : votre nombres en compris entre 1 et 18 ou entre 65 et 90 ");
		System.out.println("Réponse : "+((nb1<18 && nb1>1)||(nb1<90 && nb1>65)));
		
		mod = nb1%400;
		System.out.println("Cinquième test : votre nombres est une année bissextile ");
		System.out.println("Réponse : "+(mod==0));
		
		System.out.println("A bientôt");
	}

}