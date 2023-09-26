package java2prj2.FoodBox;

public class FoodBox<T extends Food> {
	private Object[] obj;
	private int index;

	FoodBox() {
		obj = new Object[10];
		index = 0;
	}

	public void add(T food) {

		obj[index] = food;
		index++;
	}

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return (T) obj[index];
	}

}
