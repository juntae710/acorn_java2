package java2prj2.lamda2;

import java.util.function.Predicate;

public class PredicateTest {
public static void main(String[] args) {
	Predicate<Integer> p1 = (su) ->{
		if(su %2 == 0) {
			return true;
			}else {
				return false;
		}
	};
	
	boolean result = p1.test(2);
	System.out.println(result);
	
	
	//스탑인지
	Predicate<String> p2= (str) ->{
		if(str.equalsIgnoreCase("STOP")) {
			return true;
		}else {
			return false;
		}
	};
	boolean result2 = p2.test("STOP");
	System.out.println(result2);
}	
}
