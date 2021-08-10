import java.util.*;
public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String> t1=new Hashtable<>();
t1.put(3, "venkatesh");
t1.put(2, "jayetri");
t1.put(1, "Shoban");
//t1.put(null,"venky"); java.lang.NullPointerException
//t1.put(123, null); java.lang.NullPointerException
System.out.println(t1);

	}

}
