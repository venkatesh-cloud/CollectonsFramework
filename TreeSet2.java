import java.util.*;
class Employee2 implements Comparable<Employee2>
{
	int Id;
	String name;
	public Employee2(int Id,String name)
	{
		this.Id=Id;
		this.name=name;
	}
	@Override
	public int compareTo(Employee2 e) {
		// TODO Auto-generated method stub
		if(Id>e.Id)
		{
			return 1;
		}
		else if(Id<e.Id)
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}
}
public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1=new Employee2(232,"venky");
		Employee2 e2=new Employee2(435,"kalyan");
		Employee2 e3=new Employee2(143,"Node");
		Set<Employee2> l1=new TreeSet<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		for(Employee2 e:l1)
		{
			System.out.println(e.Id+" : "+e.name);
		}
		
	}
	}


