package myotome.git.essai;

import java.util.Scanner;

public class GitDriver {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Choisissez un chiffre");
		int choice = clavier.nextInt();
		
		GitMethod gm = new GitMethod();
		gm.faitUnTruc(choice);

		clavier.close();
	}

}
