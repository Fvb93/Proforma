package Découverte;

public class LesOpérateursJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nb1 = 2, nb2 = 10, nb3;
double nb4 = 0.5;
String reponse;

		// Opérateurs mathématiques

		nb3 = nb1 + nb2;									// Somme
		nb3 = nb1 - nb2;									// Différence
		nb3 = nb1 * nb2;    								// Multiplication
		nb3 = nb1 / nb2; 									// Attention Division entière
		System.out.println((double)nb1 / nb2);	 			// Division rationnelle (transtypage ou casting)
		
		// Le modulo
		
		nb3 = nb1 % nb2;
		
		// La puissance
		
		nb3 = (int) Math.pow(3, 2); 						// 3 exposant 2 La fonction renvoie automatiquement un double
		Math.sqrt(3);										// Racine carrée	
		System.out.println(Math.PI);						// Pi (les constantes sont toujours écrites en majuscule)
		
		// Opérateurs d'assignation
		
		nb3 = 89; 
		nb3 = nb3 + 12;
		nb3+=12;											// Ecriture identique à la précédente. Fonctionne avec toutes les OPERATIONS MATH
	
		// Incrémentation et décrémentation
		
		nb1 = 1;
		nb1 = nb1 + 1;
		nb1 += 1;											// L'écriture précédente et suivante sont identiques. L'incrémentation est toujours de +1							
		nb1++;												// Identique pour la décrémentation avec nb1--;
		
		// Opérateurs de comparaison
		
		System.out.println("nb1 est égal à 2 ? "+(nb1==2)); // Vérifier l'égalité ==
		System.out.println("nb1 est inférieur ou égal à 2 ? "+(nb1<=2));	// "=" toujours en deuxième position
		System.out.println("nb1 est strictement inférieur à 2 ? "+(nb1<2));	// Même principe pour la supériorité
		System.out.println("nb1 est différente de 2 ? "+(nb1!=2));
		
		// String (comparaison)								// ! La comparaison classique ne fonctionne uniquement qu'avec des numérique
		
			// Egalité
		
		reponse = "Il fait soleil";
		System.out.println("réponse=dédé ? "+reponse.equals("dédé"));
		System.out.println("réponse=dédé ? "+reponse.equals("il fait soleil"));	 // Faux car importance des majuscules et minuscules
		System.out.println("réponse=dédé ? "+reponse.equalsIgnoreCase("il fait SOLEIL")); // ignore l'importance des majuscules et minuscules
		
			// Différence
		
		System.out.println("réponse=dédé ? "+!reponse.equalsIgnoreCase("il pleut"));
		
		// Opérateurs booléens
		
			// ET											// & (évaluation longue, continue quoiqu'il arrive)  && (évalutation courte)
		
		System.out.println(nb1<10 && nb1>0); 				// L'évaluation courte permet de s'arrêter dès qu'on condition n'est pas respectée
		
			// OU											// |, || même principe
		
		System.out.println(nb1<0 || nb1>10);
		
			// OU Exclussif									// ^ appelé xor
		
		System.out.println(nb1<0 ^ nb1>10);					// L'un ou l'autre MAIS pas les deux 
		
			// NOT											// !
		
		System.out.println(!(nb1<0 || nb1>10));
		System.out.println(nb1>0 && nb1<10);				// L'expression précédente est identique
	}

}
 