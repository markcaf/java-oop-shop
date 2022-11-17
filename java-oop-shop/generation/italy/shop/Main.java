package generation.italy.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome prodotto: ");
		String nome = sc.nextLine();
		
		System.out.print("Descrizione prodotto: ");
		String descrizione = sc.nextLine();
		
		System.out.print("Prezzo prodotto: ");
		int prezzo = sc.nextInt();
		
		Prodotto p = new Prodotto(nome, descrizione, prezzo);
		System.out.println(p);

	}

}
