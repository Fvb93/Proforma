package alternatives;

import java.util.Scanner;

public class MajoritéPension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;

		System.out.println("Bonjour, voici un programme qui détermine le nomnbre d'année pour être majeure ou pensionné");
		System.out.print("Quel votre âge ? ");
		age = new Scanner(System.in).nextInt();

		if (age<18) {
			System.out.println("Dans "+(18-age)+" ans tu seras enfin un majeur. Par contre tu devras attendre au minmum "+(65-age)+" ans avant d'être pensionné");
		}
		else {
			if (age==18) {
				System.out.println("Vous venez d'être majeure, bravo à vous la vie d'adulte. Par contre vous allez devoir attendre au minmum "+(65-age)+" ans avant d'être pensionné");
			}
			else {
				if (age>=65) {
					System.out.println("Bien essayé mais la pension est déjà atteinte, bon repos ! ");
				}
				else {
					System.out.println("Vous avez eu votre majorité depuis "+(age-18)+" ans et vous allez être pensionné au minimum dans "+(65-age)+" ans.");
				}
			}
		}

	}
}