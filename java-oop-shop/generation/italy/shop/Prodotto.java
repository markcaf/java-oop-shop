package generation.italy.shop;

import java.util.Random;

public class Prodotto {

	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva;
	
	public Prodotto(String nome, String descrizione, int prezzo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = 20;
		Random rnd = new Random();
		this.codice = rnd.nextInt(00000,99999);
	}
	
}
