package java2prj1.generic.arrayList;

public class last {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		
		list.add("비행기");
		list.add("자동차");
		list.add("배");
		
		list.forEach(new MyComsumer() {
			
			@Override
			public void accept(Object o) {
				System.out.println(o);
				
			}
		});
		
		
		
		
		MyArrayListG<Vehicle> list2 =new MyArrayListG<>();
		list2.add(new Vehicle("수리온","코나","나룻배"));
		list2.add(new Vehicle("보잉기","g80","거북선"));
		list2.forEach(new MyConsumerG<Vehicle>() {
			
			@Override
			public void accept(Object o) {
				System.out.println(o);
				
			}
		});
		
		
	}
	

}
