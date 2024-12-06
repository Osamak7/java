import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> li = new LinkedList<Integer>();
		li.add(7);
		li.add(5);
		li.add(9);
		li.add(2);
		li.addFirst(1);
		System.out.println(li);
		Integer theBigOne = Collections.max(li);
		System.out.println(theBigOne);
		Collections.sort(li);
		System.out.println(li);
		
		Collections.shuffle(li);
		System.out.println(li);
		Ghepardo g1 = new Ghepardo(15, 60, 90.0);
		Ghepardo g2 = new Ghepardo(13, 66, 80.0);
		Ghepardo g3 = new Ghepardo(14, 50, 100.0);
		Ghepardo g4 = new Ghepardo(11, 55, 85.0);
		
		LinkedList<Ghepardo> liGh = new LinkedList<Ghepardo>();
		liGh.add(g1);
		liGh.add(g2);
		liGh.add(g3);
		liGh.add(g4);
		System.out.print(liGh );
		
		for (Ghepardo g: liGh) {
			System.out.println(g);
		}
		System.out.println();
		
		for (var g: liGh) {
			System.out.println(g);
		}
		Collections.sort(liGh);
		System.out.println();
		
		Collections.shuffle(liGh);
		liGh.sort(new Comparator<Ghepardo>() {
			public int compare(Ghepardo g1, Ghepardo g2) {
				return g1.getSpeed().compareTo(g2.getSpeed());
			}
		});
		
		LinkedList<Elephante> el = new LinkedList<Elephante>();
		el.add(new Elephante(5, 10, 4400.0));
		el.add(new Elephante(6, 11, 5500.0));
		el.add(new Elephante(7, 12, 6600.0));
		
		LinkedList<Mammifero> mf = new LinkedList<Mammifero>();
		mf.addAll(el);
		mf.addAll(liGh);
		
		// procedura merge usiamo due liste di interi gia ordinate
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.add(3);
		l1.add(4);
		l1.add(7);
		l1.add(1);
		
		l2.add(9);
		l2.add(3);
		l2.add(1);
		l2.add(10);
		
		LinkedList<Integer> lsorted = MergeList(l1, l2);
		
		
		
		
	}

	private static LinkedList<Integer> MergeList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		// TODO Auto-generated method stub
//		Iterator<Integer> it1 = l1.iterator();
//		while(it1.hasNext()) {
//			Integer num = it1.next();
//			System.out.println(num);
//		}
		
		LinkedList<Integer> lret = new LinkedList<Integer>();
		Iterator<Integer> it1 = l1.iterator();
		Iterator<Integer> it2 = l2.iterator();
		
		if not 
		Integer n1, n2;
		while (it1.hasNext() && it2.hasNext()) {
			n1 = it1.next();
			n2 = it2.next();
		}
		
		return null;
	}
	
	
	

}
