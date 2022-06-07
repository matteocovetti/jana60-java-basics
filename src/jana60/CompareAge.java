package jana60;

import java.util.Scanner;

public class CompareAge {

	public static void main(String[] args) {
		/* chiedere all'utente gli anni di due persone e comunicare quale delle due � pi� grande */
		
		int agePerson1;
		int agePerson2;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("inserisci et� persona 1: ");
		agePerson1 = scan.nextInt();
		System.out.print("inserisci et� persona 2: ");
		agePerson2 = scan.nextInt();
		
		System.out.println("Et� persona 1: " + agePerson1);
		System.out.println("Et� persona 2: " + agePerson2);
		
		if (agePerson1 >= 0 && agePerson2 >= 0) {
			// persona 1 pi� grande
			if (agePerson1 > agePerson2) {
				System.out.println("persona 1 � pi� grande");
			} else if (agePerson2 > agePerson1) { // persona 2 pi� grande
				System.out.println("persona 2 � pi� grande");
			} else { // in tutti gli altri casi, cio� se sono uguali
				System.out.println("hanno la stessa et�");
			} 
		} else {
			System.out.println("Il valore dell'et� non pu� essere negativo. Riprova.");
		}
		
		
		/*
		 * casi di test:
		 * 1) persona1 25 anni, persona2 30 anni
		 * 2) persona1 30 anni, persona2 12 anni
		 * 3) persona1 25 anni, persona2 25 anni		
		 */
		
		scan.close();
	}

}
