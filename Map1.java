import java.util.*;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map m1=new HashMap();
		Map<Integer,String> m1=new HashMap<>();
		m1.put(3, "venkatesh");
		m1.put(2, "jayetri");
		m1.put(1, "Shoban");
//		for(Object m:m1.keySet()) use when type is not specified
//			{
//				System.out.println(m);
//			}
		
		for(Map.Entry m:m1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\nwithoutusing entrset");
		for(int i:m1.keySet())
		{
			System.out.println(i+" "+m1.get(i));
		}
		for(int i:m1.keySet())
		{
			System.out.println(i);
		}
		for(String s:m1.values())
		{
			System.out.println(s);
		}
//		System.out.println(m1.containsKey(5));
//		System.out.println(m1.containsValue("venkatesh"));
//		System.out.println(m1.size());
//		System.out.println(m1.entrySet());
//		System.out.println(m1.keySet());
//		System.out.println(m1.values());
//		System.out.println(m1);

	}

}
