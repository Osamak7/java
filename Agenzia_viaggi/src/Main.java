
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Compagnia comp = new Compagnia();
		comp.Cancella_volo("aaa");
		comp.Crea_Volo("aaa", "Milano", "Reggio calabria","20:00");
		comp.Mostra_Voli();
		comp.Cancella_volo("aaa");
		comp.Mostra_Voli();
		comp.Aggiungi_aereo("twin", 77);
		comp.Crea_Volo("aaa", "Milanoo", "Reggio calabria","10:00");
		comp.Crea_Volo("aaa", "Milan", "Reggio calabria","11:25");
		comp.Mostra_Voli();
	}

}
