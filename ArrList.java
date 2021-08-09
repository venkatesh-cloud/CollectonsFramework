import java.util.*;
public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		for(int x:l1)
		{
			System.out.print(x+"\n");
		}
		l1.add(0, 7);//to add element at specified index
		System.out.println(l1);
		l1.set(0, 8);//to replace the item at specified index
		System.out.println(l1);
		System.out.println(l1.size());
		l1.sort(null);//you have to specify the comparator for specific order
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(l1.indexOf(2));//to get the index of an element
		System.out.println(l1.get(2)+"\n");//to get the element at specified index
		Iterator<Integer> itr=l1.iterator();
		System.out.println("Printing Through Iterator");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator<Integer> itr1=l1.listIterator();
		System.out.println("Printing Through ListIterator in forward order ");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("Printing Through ListIterator in reverse order");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		System.out.println("Printing Through forEach method");
		l1.forEach(element->{
			System.out.println(element);
		});
		
	}

}
