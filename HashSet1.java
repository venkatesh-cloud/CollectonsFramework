import java.util.*;
public class HashSet1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet<Integer> s1=new HashSet<>();
		s1.add(2);
		s1.add(3);
		s1.add(7);
		HashSet<Integer> s2=new HashSet<>();
		s2.add(2);
		s2.add(3);
		s2.add(7);
		s1.addAll(s2);
		s1.forEach(ele->{
			System.out.println(ele);
		});
	}

}
