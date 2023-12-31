package java2prj1.generic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class 와일드문자로제한하기 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");

		print(list);
		print2(list);

		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("one");
		list2.add("two");
		list2.add("three");

		// print(list2);
		print2(list2);
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("one");
		list3.add("two");
		list3.add("three");

		
		//1.
		class aaa implements Consumer<String>{

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		}
		System.out.println("출력==>");
		list3.forEach(new aaa());
		
		//2.
	
		list3.forEach(new Consumer<>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		
		//3.
		//구현할 매서드가 하나뿐인 인터페이스를 functional Interface 라고 함
		// => 람다식으로 표현 가능
		System.out.println("== 람다식으로 사용");
		list3.forEach(t -> System.out.println(t));
		
		
		
		
		
		
		
		
	}

	public static void print(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
	//매서드 인자에서 제네릭 제한하기
	//? super String
	//? extends String
	public static void print2(ArrayList<? super String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
