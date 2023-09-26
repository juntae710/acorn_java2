package java2prj2.실습;

import java.util.function.Function;

public class No5Function_준태 {
public static void main(String[] args) {
	Function<Integer,Integer> f = Dollar -> Dollar*1353;
	System.out.println(f.apply(200)+"원");
	
}

	
}
