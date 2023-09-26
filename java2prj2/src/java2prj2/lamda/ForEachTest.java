package java2prj2.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachTest {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("장주원");
	list.add("이미현");
	list.add("김두식");
	list.add("전계도");
	list.add("프랭크");
	list.add("김봉석");
	list.add("장희수");
	list.add("이강훈");
	
	//출력
	System.out.println("****기본 포문****");
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	System.out.println("****forEach****");
	for (String name : list) {
		System.out.println(name);
	}
	
	//인터페이스를 구현하는 방법 1. 이름있는 클래스 작성 2. 익명클래스 3.람다식으로 작성
	//functional interface(한개의 추상 매서드만을 가지는 인터페이스)
	System.out.println("****forEach1****");
	class A implements Consumer<String>{

		@Override
		public void accept(String t) {
			System.out.print(t+",");
			
		}
		
	}
	list.forEach(new A());
	System.out.println("\n****forEach2****");
	list.forEach(new Consumer<String>(){

		@Override
		public void accept(String t) {
			System.out.println(t);
			
		}
		
	});
	System.out.println("****forEach3****");
	System.out.println("****ramda****");
	list.forEach(item -> System.out.println(item));

}
  
 






}
