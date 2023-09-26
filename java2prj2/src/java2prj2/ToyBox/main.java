package java2prj2.ToyBox;

public class main {
public static void main(String[] args) {
	ToyBox<Doll> list = new ToyBox<>();
	
	list.add(new Doll("아기상어인형","14999","0+"));
	list.add(new Doll("바비인형","32000","3+"));
	
ToyBox<Book> list2 = new ToyBox<>();
	
	list2.add(new Book("헝겁책","4000","2+"));
	list2.add(new Book("그림책","1500","3+"));
	
ToyBox<Car> list3 = new ToyBox<>();
	
	list3.add(new Car("소방차","5000","3+"));
	list3.add(new Car("구급차","5000","3+"));
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	for(int i=0; i<list2.size(); i++) {
		System.out.println(list2.get(i));
	}
	for(int i=0; i<list3.size(); i++) {
		System.out.println(list3.get(i));
	}
	
	
	
}
}
