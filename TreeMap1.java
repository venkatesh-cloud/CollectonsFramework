import java.util.*;
class Book
{
	String Bookname,Author;
	int Qty;
	public Book(String Bookname,String Author,int Qty)
	{
		this.Bookname=Bookname;
		this.Author=Author;
		this.Qty=Qty;
	}
}
public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Maths","Ramana",5);
		Book b2=new Book("Science","Shiva",8);
		Book b3=new Book("Social","Herculus",9);
		Map<Integer,Book> m=new TreeMap<>();
		m.put(1,b1 );
		m.put(2,b2 );
		m.put(3, b3);
		for(int i:m.keySet())
		{
			Book b=m.get(i);
			System.out.println(i+" "+b.Author+" "+b.Bookname+" "+b.Qty);
		}
		for(Map.Entry<Integer, Book> entry:m.entrySet())
		{
			Book b4=entry.getValue();
			System.out.println(entry.getKey()+" "+b4.Author+" "+b4.Bookname+" "+b4.Qty);
		}

	}

}
