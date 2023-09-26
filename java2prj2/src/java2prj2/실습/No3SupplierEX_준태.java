package java2prj2.실습;

import java.util.function.Supplier;

public class No3SupplierEX_준태 {
public static void main(String[] args) {
	Supplier<String> s = () ->{
		System.out.println("1.파를 송송 썬다.");
		System.out.println("2.즉석밥을 양껏 돌린다.");
		System.out.println("3.파와 대페를 같이 달궈진 팬에 넣는다.");
		System.out.println("4.다익었으면 즉석밥과 굴소스를 넣고 쓰까 먹는다.");
		System.out.println("===오늘의 요리===");
		return "그냥집밥";
		
	};
	System.out.println(s.get());
}
}
