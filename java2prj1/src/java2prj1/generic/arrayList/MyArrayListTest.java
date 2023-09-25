package java2prj1.generic.arrayList;

public class MyArrayListTest {
public static void main(String[] args) {
	MyArrayList list = new MyArrayList();
	
	list.add("one");
	list.add("two");
	list.add("three");
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	list.forEach(new MyComsumer() {
		
		@Override
		public void accept(Object o) {
			System.out.println("hi forEach:" +  o);
			
		}
	});
}
}
