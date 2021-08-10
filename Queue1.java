import java.util.*;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> q1=new PriorityQueue<>();
q1.add("venky");
q1.add("arun");
q1.add("pavan");
q1.add("jamuna");
System.out.println(q1);
System.out.println("Head "+q1.peek());
System.out.println("Head "+q1.element());
System.out.println(q1);
q1.remove();
System.out.println(q1);
q1.poll();
System.out.println(q1);
q1.forEach(ele->{
	System.out.println(ele);
});
Deque<String> deque=new ArrayDeque<String>();  
deque.offer("arvind"); //adds element 
deque.offer("vimal");  
deque.add("mukul");  
deque.offerFirst("jai");//at first index  
System.out.println("After offerFirst Traversal..."); 
for(String s:deque){  
    System.out.println(s);  
}  
deque.remove();
System.out.println(deque);
	}
	

}
