import java.util.*;

public class Compagnia {
	// uso (LinkedHashMap) e non (HashMap) per avere un ordine di stampa secondo
	// l'ordine di inserimento
	// cosa che (HasMaph) non garantisce
	private LinkedHashMap<String, HashMap<String, String>> voli = new LinkedHashMap<>();
	private LinkedHashMap<String, Integer> aerei = new LinkedHashMap<>();

	
	public void Crea_Volo(String nome_aereo, String partenza, String arrivo, String orario) {
		if (!aerei.containsKey(nome_aereo)) {
			System.out.println("Questo aereo non esiste");
		} else if (voli.containsKey(nome_aereo)) {
			System.out.println("questo aereo e gia registrato per un volo");
		} else {
			voli.put(nome_aereo, new LinkedHashMap<>() {{
					put("nome", nome_aereo);
					put("partenza", partenza);
					put("arrivo", arrivo);
					put("orario", orario);
				}});
		}

	}

	public void Cancella_volo(String nome_aereo) {
		if (voli.containsKey(nome_aereo)) {
			voli.remove(nome_aereo);
			System.out.println("hai eliminato il volo: " + nome_aereo);
		} else {
			System.out.println("il volo (" + nome_aereo + ") non esiste");
		}
	}

	public void Mostra_Voli() {
		if (voli.isEmpty()) {
			System.out.println("non ci sono voli");
		} else {
			// Azione per ogni coppia chiave-valore
			voli.forEach((nome_aereo, dettagli) -> {
				System.out.println("Nome Aereo: " + nome_aereo);
				dettagli.forEach((chiave, valore) -> {
					System.out.println("	" + chiave + ": " + valore);
				});
			});
		}
	}

	public void Aggiungi_aereo(String nome_aereo, Integer numero_posti) {
		if (aerei.containsKey(nome_aereo)) {
			System.out.println("L'aereo esiste gia ");
		} else {
			aerei.put(nome_aereo, numero_posti);
			System.out.println("hai inserito il volo (" + nome_aereo + ") con (" + numero_posti + ") posti");
		}
	}

	public void Elimina_aereo(String nome_aereo) {
		if (aerei.containsKey(nome_aereo)) {
			aerei.remove(nome_aereo);
			System.out.println("Hai eliminato l'aereo (" + nome_aereo + ")");
		} else {
			System.out.println("Aereo non trovato");
		}
	}
	public void Mostra_aerei() {
		if(aerei.isEmpty()) {
			System.out.println("Non ci cono aerei");
		}else {
			voli.forEach((nome_aereo, numero_posti) ->{
				System.out.println("Nome Aereo: "+nome_aereo+"\nnumero posti: "+numero_posti);
			});
		}
	}

}
