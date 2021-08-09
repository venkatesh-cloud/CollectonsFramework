import java.util.*;
public class ArrayToList {
public static void main(String[] args) {
String[] arr= {"hello","holo","now"};
System.out.println("Array is : "+Arrays.toString(arr));
List<String> l1=new ArrayList<>();
for(String ele:arr)
{
	l1.add(ele);
}
System.out.println("list array : "+l1);
List<String> l2=new ArrayList<>();
l2.add("hi");
l2.add("vekatesh");
l1.addAll(l2);
String[] arr1= new String[l1.size()];
l1.toArray(arr1);
System.out.println("Array is : "+Arrays.toString(arr1));
}
}
