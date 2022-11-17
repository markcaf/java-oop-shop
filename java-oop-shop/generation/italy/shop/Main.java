package generation.italy.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Metodo per far inserire i dati all'utente 
		 * 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Nome prodotto: ");
			String nome = sc.nextLine();
			
			System.out.print("Descrizione prodotto: ");
			String descrizione = sc.nextLine();
			
			System.out.print("Prezzo prodotto: ");
			int prezzo = sc.nextInt();
			
			Prodotto p = new Prodotto(nome, descrizione, prezzo);
			System.out.println(p);
		*
		*/
		
		Prodotto prodotto1 = new Prodotto(
				"FENDER Squier Classic Vibe '70s Telecaster Deluxe",
				"La Telecaster Deluxe anni '70 Classic Vibe è un fedele cenno all'evoluzione della Tele degli anni '70, che crea un suono imponente grazie ai doppi pickup humbucker Wide Range progettati da Fender.",
				420);
		
		Prodotto prodotto2 = new Prodotto(
				"FENDER Squier FSR Affinity",
				"Una superba porta d'accesso all'antica famiglia Fender, la Squier Affinity Series Telecaster HH offre un design leggendario ed il suono per eccellenza degli aspiranti eroi della chitarra di oggi.",
				299);
		
		System.out.println(prodotto1.toString());
		System.out.println();
		System.out.println(prodotto2.toString());
	}

}
