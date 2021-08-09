import java.util.*;
class Employee
{
	int Id;
	String name;
	Employee(int Id,String name)
	{
		this.Id=Id;
		this.name=name;
	}
}
public class ArrList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(232,"venky");
Employee e2=new Employee(435,"kalyan");
ArrayList l1=new ArrayList();
l1.add(e1);
l1.add(e2);
Iterator itr=l1.iterator();
while(itr.hasNext())
{
	Employee e4=(Employee)itr.next();
	System.out.println("Name is "+e4.name+" Id is "+e4.Id);
}
	}

}
