package java2prj3.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test3 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	
	list.add("hi");
	list.add("hello");
	list.add("hello");		
	list.add("bye");
	list.add("hello");
	
	Stream<String> stream1 = list.stream();
	
	stream1.filter(str -> str.equals("hello")).forEach(s->System.out.println(s));
	//
	stream1 = list.stream();
	long result =stream1.filter(str-> str.equals("hello")).count();
	System.out.println(result);
	
	stream1 = list.stream();
	stream1.filter(str-> str.equals("hello")).limit(2).forEach(s-> System.out.println(s));
}
}
