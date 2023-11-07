package Découverte;

public class LesTypesDesDonnées {

	public static void main(String[] args) {
		// 8 types de données primaires

		// les entiers 
		byte nb1; //-128 à 127
		short nb2; //-32768 à 32767
		int nb3; //+-2.10^9 
		long nb4; //+-9.10^18 

		// les rationnels 
		float nb5; // 7 à 8 chiffres significatifs
		double nb6; // 15 chiffres significatifs
		nb6 = 3.6;

		// les caractères
		char lettre; //1 et 1 seul caractère
		lettre = 'd';
		lettre = ' '; // un espace comme caractère

		// booléen
		boolean ok; // true ou false
		ok = true;

		// Il existe une infinité de type de données classe
		String unePhrase;
		unePhrase = "Il va faire tout noir !";
				System.out.println(unePhrase);
				System.out.println(unePhrase.toUpperCase());


	}

}
