package java2.변경에유리한코드;

public class Ex2 {
public static void main(String[] args) {
//	Cat cat = new Cat();
//	cat.bark();
//	Dog dog = new Dog();
//	dog.bark();
	
	Animal animal = new Cat();
	animal.bark();
	
	animal = new Dog();
	animal.bark();
}
}
