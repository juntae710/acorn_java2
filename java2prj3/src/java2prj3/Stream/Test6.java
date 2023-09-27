package java2prj3.Stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	Arrays.stream(arr).forEach( n-> System.out.println(n) ) ;

	ArrayList<String> list = new ArrayList<>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	
	list.forEach(str-> System.out.println(str));
	list.stream().forEach( str -> System.out.println(str));
	
	
	list.stream().sorted().forEach( str -> System.out.println(str));
}
}
