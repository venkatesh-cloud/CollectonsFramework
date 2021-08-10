import java.util.*;

class Employee1 {
	int Id;
	String Name;

	Employee1(int Id, String name) {
		this.Id = Id;
		this.Name = name;
	}
}

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(232, "venky");
		Employee1 e2 = new Employee1(435, "kalyan");
		List<Employee1> l1 = new LinkedList<>();
		l1.add(e1);
		l1.add(e2);
		for (Employee1 e : l1) 
		{
			System.out.println(e.Name + " : " + e.Id);				

		}
	}

}
