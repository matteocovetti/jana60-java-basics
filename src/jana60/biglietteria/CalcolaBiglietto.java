package jana60.biglietteria;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// costanti
		double costoAlKm = 0.21;
		double percScontoMinorenni = 0.20;
		double percScontoOver65 = 0.40;
		
		// variabili
		int etaPasseggero;
		double kmDaPercorrere;
		double prezzoFinale;
		
		System.out.print("Inserire l'età del passeggero: ");
		etaPasseggero = scanner.nextInt();
		
		System.out.println("Inserire il numero di km: ");
		kmDaPercorrere = scanner.nextDouble();
		
		// calcolo del prezzo base
		double prezzoBase = costoAlKm * kmDaPercorrere;
		
		//calcolo dello sconto
		if(etaPasseggero < 18) {
			double scontoMinorenni = prezzoBase * percScontoMinorenni;
			prezzoFinale = prezzoBase - scontoMinorenni;
			System.out.println("Hai diritto allo sconto minorenni");
		} else if(etaPasseggero >= 65) {
			double scontoOver65 = prezzoBase * percScontoOver65;
			prezzoFinale = prezzoBase - scontoOver65;
			System.out.println("Hai diritto allo sconto over 65");
		} else {
			prezzoFinale = prezzoBase;
		}
		
		System.out.println("Il prezzo del biglietto è " + prezzoFinale);
		
		// chiudo lo scanner
		scanner.close();
	}

}
