package LMulard;

import java.util.Scanner;

public class majorité {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);

		Object[][] identite = new Object[2][4];

		for (int i = 0; i < identite.length; i++) {

			System.out.print("nom:");
			String nom;
			nom = clavier.nextLine();
			identite[i][0] = nom;

			System.out.print("prenom:");
			String prenom;
			prenom = clavier.nextLine();
			identite[i][1] = prenom;

			System.out.print("age:");
			String age;
			age = clavier.nextLine();
			identite[i][2] = age;

			System.out.print("dateDeNaissance:");
			String dateDeNaissance;
			dateDeNaissance = clavier.nextLine();
			identite[i][3] = dateDeNaissance;
		
		if (Integer.parseInt(age)<18) {
			System.out.println("pas majeur");
		}
		else {
				System.out.println("majeur");

		}
		
			
		}


		for (int j = 0; j < identite.length; j++) {
			for (Object k : identite[j]) {
				System.out.println(k);
			}
			
					
		}

	}

	}


