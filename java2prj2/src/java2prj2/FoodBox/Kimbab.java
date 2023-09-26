package java2prj2.FoodBox;

public class Kimbab extends Food{
String ingredient;
String price;
public Kimbab(String ingredient, String price) {
	super();
	this.ingredient = ingredient;
	this.price = price;
}

public Kimbab() {
	// TODO Auto-generated constructor stub
}

public String getIngredient() {
	return ingredient;
}

public void setIngredient(String ingredient) {
	this.ingredient = ingredient;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

@Override
public String toString() {
	return "kimbab [ingredient=" + ingredient + ", price=" + price + "]";
}

}
