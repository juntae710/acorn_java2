package java2.변경에유리한코드;

public class Ex3 {
public static void main(String[] args) {

	
	Animal animal = getAnimal();
	animal.bark();
	
	Animal animal2 = getAnimal();
	animal.bark();
	
	Animal animal3 = getAnimal();
	animal.bark();
}

private static Animal getAnimal() {
	return new Dog();
}
}
