package java2prj2.ToyBox;

public class Car  {
String name;
String price;
String age;

public Car() {
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public Car(String name, String price, String age) {
	super();
	this.name = name;
	this.price = price;
	this.age = age;
}

@Override
public String toString() {
	return "Book [name=" + name + ", price=" + price + ", age=" + age + "]";
}


}
