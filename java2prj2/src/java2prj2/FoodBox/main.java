package java2prj2.FoodBox;

public class main {
public static void main(String[] args) {
	FoodBox<Kimbab> list = new FoodBox<>();

	list.add(new Kimbab("땡초김밥", "3000"));
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	FoodBox<Bulgogi> list2 = new FoodBox<>();

	list2.add(new Bulgogi("양념 불고기", "18000"));
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list2.get(i));
	}
	
	//FoodBox<hanwo> list3 = new FoodBox<>();

}
}
