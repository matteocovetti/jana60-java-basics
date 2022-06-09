package jana60.loops;

public class CalcoloSommaPrimiDieciNumeri {

	public static void main(String[] args) {
		// calcolare la somma dei primi 10 numeri naturali (da 1 a 10)
		
		int somma = 0;
		
		for (int i = 1; i <= 10; i++) {
			somma = somma + i;
		}
		
		System.out.println(somma);

	}

}
