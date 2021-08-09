import java.util.*;
public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> s1=new TreeSet<>();
		s1.add(6);
		s1.add(3);
		s1.add(7);
		s1.add(8);
		s1.add(11);
		s1.add(2);
		
		System.out.println(s1);
		System.out.println("Descending order is");
		Iterator itr=s1.descendingIterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println(s1.descendingSet());
		System.out.println(s1.pollFirst());
		System.out.println(s1.pollLast());
		System.out.println(s1);
		System.out.println(s1.headSet(7));
		System.out.println(s1.tailSet(6));
		System.out.println(s1.subSet(6,8));
		

	}

}
