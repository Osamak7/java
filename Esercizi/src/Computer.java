
public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateComputer cmp1 = new CreateComputer(100.0 , 80.40 , 30.0 , 20.0 , 30.70,"Pinko",2000);
		System.out.println("prezzo = "+cmp1.getPrezzo());
		System.out.println("altezza = "+cmp1.getAltezza());
		System.out.println("anno di produzione = "+cmp1.getAnnoProduzione());
		System.out.println("larghezza = "+cmp1.getLarghezza());
		System.out.println("peso = "+cmp1.getPeso());
		System.out.println("produttore = "+cmp1.getProduttore());
		System.out.println("profondita = "+cmp1.getProfondita());
		
		CreateComputer cmp2 = new CreateComputer(10.0, 20.0 , 30.0, 40.0, 50.0, "Milka", 1996);
		System.out.println("\nprezzo = "+cmp2.getPrezzo());
		System.out.println("altezza = "+cmp2.getAltezza());
		System.out.println("anno di produzione = "+cmp2.getAnnoProduzione());
		System.out.println("larghezza = "+cmp2.getLarghezza());
		System.out.println("peso = "+cmp2.getPeso());
		System.out.println("produttore = "+cmp2.getProduttore());
		System.out.println("profondita = "+cmp2.getProfondita());
		
		CreateComputer cmp3 = new CreateComputer(30.0, 10.0 , 50.0, 50.0, 90.0, "Parmalat", 2008);
		System.out.println("\nprezzo = "+cmp3.getPrezzo());
		System.out.println("altezza = "+cmp3.getAltezza());
		System.out.println("anno di produzione = "+cmp3.getAnnoProduzione());
		System.out.println("larghezza = "+cmp3.getLarghezza());
		System.out.println("peso = "+cmp3.getPeso());
		System.out.println("produttore = "+cmp3.getProduttore());
		System.out.println("profondita = "+cmp3.getProfondita());
		
		System.out.println("\nnumeroComputer = "+CreateComputer.getNumeroComputer());
		
	}

}
