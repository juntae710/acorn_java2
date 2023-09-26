package java2prj2.실습;

import java.util.function.Consumer;

public class No2Consumer_준태 {
public static void main(String[] args) {
	Consumer<Integer> c = budget -> {
		int 굴소스 = 3500;
		int 차돌박이1kg = 15000;
		int 즉석밥12개입 = 10000;
		System.out.println("총액="+(굴소스+차돌박이1kg+즉석밥12개입));
		System.out.println("잔액="+(budget-(굴소스+차돌박이1kg+즉석밥12개입)));
		
	};
	c.accept(30000);
}
	
}
