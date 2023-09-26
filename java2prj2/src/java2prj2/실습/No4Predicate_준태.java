package java2prj2.실습;

import java.util.function.Predicate;

public class No4Predicate_준태 {
public static void main(String[] args) {
	Predicate<String> p = food -> {
		if(food=="그냥집밥") {
		return true;	
		}else {
			return false;
		}
	};
	System.out.println(p.test("그냥집밥"));
}
}
