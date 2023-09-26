package java2prj2.lamda2;

import java.util.function.Consumer;

public class ConsumerTest {
public static void main(String[] args) {
	
	Consumer<String> c =str -> System.out.println("진짜"+str);
	c.accept("람다식 좋긴해");
	
	Consumer<String> c2 = new Consumer<>() {

		@Override
		public void accept(String t) {
			System.out.println(t+"만들어보기");
			
		}
		
	};
	c2.accept("익명함수로");
	
	class a implements  Consumer<String> {

		@Override
		public void accept(String t) {
			System.out.println(t+"만들어보기");
			
		}
		
	};
	a aa = new a();
	aa.accept("클래스 까지해서");
	
	
	
	Consumer<Integer> c3 = su->{
		int sum=0;
		for(int i=1; i<=su; i++) {
			sum+=i;
		}
		System.out.println("1~"+su+"까지의 합은"+sum);
	};
	c3.accept(3);
}
}
