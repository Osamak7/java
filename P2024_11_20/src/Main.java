import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// definire una classe (CoppiaInt) che contiene due Integer
	
		Coppia <Integer, Double> ci1 = new Coppia<Integer, Double>(3, 7.0);
		Coppia <Integer, Double> ci2 = new Coppia<Integer, Double>(1, 2.0);
		
		//implementare un methodo SwampCoppia che scambia tra loro i contenuti di
		// due coppie di dati (es: in ci1 voglio ci2 e viceversa )
		System.out.println(ci1);
		System.out.println(ci2);

		SwapCoppia(ci1 , ci2);
		System.out.println();
		 
		System.out.println(ci1);
		System.out.println(ci2);

		LinkedList<Integer> li = new LinkedList<Integer>();
		li.addAll(Arrays.asList(new Integer [] {1,2,3,4,5,6,7}));
		
		System.out.println(li);
		Swap(li);
		System.out.println(li);
		
			
	}

//	private static void SwapCoppia(Coppia<Integer, Double> ci1, Coppia<Integer, Double> ci2) {
//		// TODO Auto-generated method stub
//		Coppia<Integer, Double> ci3 = new Coppia <Integer , Double>(ci1.getN1(), ci1.getN2());
//		ci1.setN1(ci2.getN1());
//		ci1.setN2(ci2.getN2());
//		
//		ci2.setN1(ci3.getN1());
//		ci2.setN2(ci3.getN2());
//	}
//	
	private static <T1, T2> void SwapCoppia(Coppia <T1, T2> ci1, Coppia <T1, T2> ci2) {
		Coppia<T1, T2> ci3 = new Coppia <T1, T2>(ci1.getN1(), ci1.getN2());
		ci1.setN1(ci2.getN1());
		ci1.setN2(ci2.getN2());
		
		ci2.setN1(ci3.getN1());
		ci2.setN2(ci3.getN2());
	}
	public static void Swap( LinkedList<Integer> li) {
//		// TODO Auto-generated method stub
		if (li.size()> 5 ) {
			Integer a = li.get(3);
			li.set(3, li.get(5));
			li.set(5, a);
		}
		
	}
		
}
