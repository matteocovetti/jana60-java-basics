package jana60;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// String nome = "Matteo";
		// String cognome = "Covetti";
		// String colorePreferito = "nero";
		// int giornoNascita = 18;
		// int meseNascita = 3;
		// int annoNascita = 1996;
		// int sommaDataNascita = giornoNascita + meseNascita + annoNascita;
		// String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataNascita;
		// System.out.println(password);
		
		// variabili utente
		
		// nome
		String nome;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci nome: ");
		nome = input.nextLine();
		
		// cognome
		String cognome;
		
		System.out.print("Inserisci cognome: ");
		cognome = input.nextLine();
		
		// colore
		String colorePreferito;
		
		System.out.print("Inserisci colore preferito: ");
		colorePreferito = input.nextLine();
		
		// giorno
		int giornoNascita;
		
		System.out.print("Inserisci giorno di nascita: ");
		giornoNascita = input.nextInt();
		
		// mese
		int meseNascita;
		
		System.out.print("Inserisci mese di nascita: ");
		meseNascita = input.nextInt();
		
		// anno
		int annoNascita;
		
		System.out.print("Inserisci mese di nascita: ");
		annoNascita = input.nextInt();
		
		// somma data nascita e password
		int sommaDataNascita = giornoNascita + meseNascita + annoNascita;
		String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataNascita;
		System.out.println(password);
		
		
		input.close();

	}

}
