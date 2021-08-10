import java.util.*;
public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s1=new Stack<>();
		s1.push("red ball");
		s1.push("blue ball");
		s1.push("green ball");
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.search("red ball"));
		

	}

}
