package exercicessupplementaires;

public class colonel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Le colonel Charles Renard a dit, le premier janvier 1867, « Cette année, le jour de mon anniversaire, mon âge sera égal à la somme des chiffres de l’année de ma naissance. » En quelle année est-il né ?");
		int annee;
		
	for (annee=1700;annee<=1867;annee++) {
	if ((1867-annee) == (1 + (annee%1000-annee%100)/100 + (annee%100-annee%10)/10 + annee%10)) {
		System.out.println(annee+ " ");
	}
}
	}
}
