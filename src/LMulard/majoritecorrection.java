package LMulard;

import java.util.Scanner;

import sun.text.resources.cldr.ar.FormatData_ar_MA;

/**
 * premiere classe du programme
 * @author Laure
 *@version 0.0.1
 *
 */

public class majoritecorrection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tableau en 2D qui represente mes utilisateurs
		Object[][] infoUtilisateur = new Object[2][4];
		
		//je cree mon clavier
		Scanner clavier = new Scanner(System.in);
		
		//je declare sans initialiser mes 3 variables du meme type
		String nom, prenom, dateDeNaissance;
		
		//boucle pour creer mes 2 utilisateurs
		//on connait les bornes de la boucles donc utilisation de for
		for (int utilisateursCrees = 0; utilisateursCrees < 2; utilisateursCrees++ ) {
			prenom  = recupererPrenom(clavier);
			
			nom = recupererNom(clavier);
			
			dateDeNaissance = recupererdateDeNaissance(clavier);
			
			String dateAujourdHui = "15/03/2018";
			
			//on affiche l'age calculé
			byte age = calculerAge(dateAujourdHui,dateDeNaissance);
			System.out.println(age);
			
			//on demande si la personne est majeur ou non
			if (age<18) {
				System.out.println(nom + " " + prenom + " pas majeur");
			}
			else {
				System.out.println(nom + " " + prenom + " majeur");
			}
			
			//initialisation du tableau en fonction de l'utilisateur
			infoUtilisateur[utilisateursCrees][0] = nom;
			infoUtilisateur[utilisateursCrees][1] = prenom;
			infoUtilisateur[utilisateursCrees][2] = dateDeNaissance;
			infoUtilisateur[utilisateursCrees][3] = age;
			
			
		}
		//aficher tableau [y][x] soit [ligne][colonne]
			for (int index = 0; index<infoUtilisateur.length;index++) {
				for (Object info :  infoUtilisateur[index]) {
					System.out.println(info);
				}
			}
		
	}

	
/**
 * calculer l'age en faisant la différence entre 2 dates
 * @param dateAujourdHuiCopie date d'aujourd'hui 
 * @param dateDeNaissanceCopie date d'anniversaire
 * @return age calculé
 */
	private static byte calculerAge(String dateAujourdHuiCopie, String dateDeNaissanceCopie) {
	short anneeDeNaissance = Short.parseShort(dateDeNaissanceCopie.split("/")[2]);
	short anneeAujourdHui = Short.parseShort(dateAujourdHuiCopie.split("/")[2]);
		return (byte) (anneeAujourdHui -anneeDeNaissance);
	}

/**
 * recuperer la date de naissance d'une personne
 * @param clavierCopie objet de type scanner
 * @return date de naissance
 */
	private static String recupererdateDeNaissance(Scanner clavierCopie) {
		// TODO Auto-generated method stub
		String date;
		System.out.print("entrer votre de date de naissance (xx/xx/xxxx)");
		date = clavierCopie.nextLine();
		return date;
	}



	
	/**
	 * recuperer le prenom d'une personne
	 * @param clavierCopie Objet de type scanner
	 * @return prenom de l'utilisateur
	 */
	static String recupererPrenom(Scanner clavierCopie) {
		//verifier qu'un prenom est au bon format (utilisation uniquement de lettres)
		boolean verificateur = false;
		String firstName;
		
		//on doit au moins rentrer une fois dans la boucle
		//on boucle tant que le verificateur est faux
		do {
			System.out.print("entrer votre prenom : ");
			firstName = clavierCopie.nextLine();
		//Si le prenom est composé d'au moins 3 lettres
			if (firstName.length() >= 3 ) {
				// On verifie que les prenom ne contient que des lettres
				verificateur = firstName.chars().allMatch(Character :: isLetter);
			
			}
		} while (verificateur != true);
		
		return firstName;
		
	}
	
	/**
	 * permet de recuperer un nom
	 * @param clavierCopie objet de type scanner
	 * @return nom
	 */
	private static String recupererNom(Scanner clavierCopie) {
		// TODO Auto-generated method stub
		// meme fonction que pour le prenom
				boolean verificateur = false;
				String lastName;
				
				do {
					System.out.print("entrer votre nom : ");
					lastName = clavierCopie.nextLine();
				
					if (lastName.length() >= 3 ) {
						verificateur = lastName.chars().allMatch(Character :: isLetter);
					
					}
				} while (verificateur != true);
		return lastName;
	}
	
}
