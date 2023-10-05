package java2.변경에유리한코드;

public class Ex1 {
public static void main(String[] args) {
	Cat cat = new Cat();
	cat.bark();
	
	Dog dog = new Dog();
	dog.bark();
	
	Dog dog2 = new Dog();
	dog2.bark();
}
}
