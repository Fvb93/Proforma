package alternatives;

import java.util.Scanner;

public class AvantApres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jour, mois, annee;

		System.out.println("Bonjour, voici un programme va déterminer a date de la veille et celle du lendemain d'une date donnée : ");
		System.out.print("Quel est le jour souhaité ? ");
		jour = new Scanner(System.in).nextInt();

		System.out.print("Quelle est le mois souhaité ? ");
		mois = new Scanner(System.in).nextInt();

		System.out.print("Quelle est l'année souhaitée en 4 chiffres ? ");
		annee = new Scanner(System.in).nextInt();

		if (jour>1 && jour<30 && mois!=2) {	// Jours compris entre 2 et 29 (février non inclus)
			System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
			System.out.println("Le jour avant est le "+(jour-1)+" / "+mois+" / "+annee);
			System.out.println("Le jour après est le "+(jour+1)+" / "+mois+" / "+annee);
		}
		else {
			if (jour==1 &&  (mois==2 || mois==4 || mois==6 || mois==8 || mois==9 || mois==11)) { // jour 1 et Le mois précédent est de 31 jours
				System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
				System.out.println("Le jour avant est le 31 / "+(mois-1)+" / "+annee);
				System.out.println("Le jour après est le "+(jour+1)+" / "+mois+" / "+annee);
			}
			else {
				if (jour==1 && mois==1) { // Le 1er janvier
					System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
					System.out.println("Le jour avant est le 31 / 12 / "+(annee-1));
					System.out.println("Le jour après est le "+(jour+1)+" / "+mois+" / "+annee);
				}
				else {
					if (jour==1 && (mois==5 || mois==7 || mois==10 || mois==12)) { // jour 1 et le mois précédent est de 30 jours
						System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
						System.out.println("Le jour avant est le 30 / "+(mois-1)+" / "+annee);
						System.out.println("Le jour après est le "+(jour+1)+" / "+mois+" / "+annee);
					}
					else {
						if (jour==1 && mois==3 && (annee%400==0)) { // jour 1 et 29 février
							System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
							System.out.println("Le jour avant est le 29 / 02 / "+annee);
							System.out.println("Le jour après est le "+(jour+1)+" / "+mois+" / "+annee);
						}
						else {
							if (jour==1 && mois==3 && (annee%400!=0)) { // jour 1 et 28 février
								System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
								System.out.println("Le jour avant est le 28 / 02 / "+annee);
								System.out.println("Le jour après est le "+(jour+1)+" / "+mois+" / "+annee);
							}
							else {
								if (jour==28 && mois==2 && (annee%400!=0)) { // 28 février
									System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
									System.out.println("Le jour avant est le "+(jour-1)+" / "+mois+" / "+annee);
									System.out.println("Le jour après est le 01 / "+(mois+1)+" / "+annee);
								}
								else {
									if (jour==29 && mois==2 && (annee%400==0)) { // 29 février
										System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
										System.out.println("Le jour avant est le "+(jour-1)+" / "+mois+" / "+annee);
										System.out.println("Le jour après est le 01 / "+(mois+1)+" / "+annee);
									}
									else {
										if (jour==30 && (mois==4 || mois==6 || mois==9 || mois==11)) { // jour 30 mois à 30 jours
											System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
											System.out.println("Le jour avant est le "+(jour-1)+" / "+mois+" / "+annee);
											System.out.println("Le jour après est le 01 / "+(mois+1)+" / "+annee);
										}
										else {
											if (jour==30 && (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10)) { // jour 30 mois à 31 jours
												System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
												System.out.println("Le jour avant est le "+(jour-1)+" / "+mois+" / "+annee);
												System.out.println("Le jour après est le "+(jour+1)+" / "+mois+" / "+annee);
											}
											else {
												if (jour==31 && (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10)) { // jour 31 
													System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
													System.out.println("Le jour avant est le "+(jour-1)+" / "+mois+" / "+annee);
													System.out.println("Le jour après est le 01 / "+(mois+1)+" / "+annee);
												}
												else {
													if (jour==31 && mois==12) { // 31 décembre
														System.out.println("Le jour encodé est le "+jour+" / "+mois+" / "+annee);
														System.out.println("Le jour avant est le "+(jour-1)+" / "+mois+" / "+annee);
														System.out.println("Le jour après est le 01 / 01 / ) "+(annee+1));
													}
												}
											}
										}

									}
								}
							}
						}
					}
				}
			}
		}
	}
}