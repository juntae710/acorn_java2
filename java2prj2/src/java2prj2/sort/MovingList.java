package java2prj2.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;




public class MovingList {
public static void main(String[] args) {
	ArrayList<Moving> list = new ArrayList<>();
	
	list.add(new Moving("장주원","구룡포",100));
	list.add(new Moving("이미현","경기",80));
	list.add(new Moving("김두식","문산",90));
	list.add(new Moving("전영석","봉평",88));
	
	//이름순
	System.out.println(1);
	Collections.sort(list);
	list.forEach(m -> System.out.println(m));
	
	System.out.println(2);
	list.forEach(new Consumer<>() {

		@Override
		public void accept(Moving t) {
			System.out.println(t);
			
		}
	});
	
	System.out.println(3);
	class ConsumerImp implements Consumer<Moving>{

		@Override
		public void accept(Moving t) {
			System.out.println(t);
			
		}
		
	}
	list.forEach(new ConsumerImp());
	
	
	//코드순
	System.out.println("코드순");
	Collections.sort(list,new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			Moving m1 = (Moving)o1;
			Moving m2 = (Moving)o2;
			return m1.code.compareTo(m2.code);
		}

			
			 
		 });
	for(Moving s : list) {
		System.out.println(s);
	}
	

	
	Collections.sort(list,new Comparator<Moving>() {

		@Override
		public int compare(Moving o1, Moving o2) {
			// TODO Auto-generated method stub
			return o1.code.compareTo(o2.code);
		}});
	for(Moving s : list) {
		System.out.println(s);
	}
	
	
	//파워순
	System.out.println("파워순");
	Collections.sort(list,new Comparator<Moving>() {

		@Override
		public int compare(Moving o1, Moving o2) {
			// TODO Auto-generated method stub
			return o1.power-o2.power;
		}


			
			 
		 });
	for(Moving s : list) {
		System.out.println(s);
	}
	
}


}
