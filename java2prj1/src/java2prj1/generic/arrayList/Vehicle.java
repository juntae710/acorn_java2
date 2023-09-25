package java2prj1.generic.arrayList;

public class Vehicle {
 String 비행기;
 String 자동차;
 String 배;
 public Vehicle() {
	// TODO Auto-generated constructor stub
}
 
public Vehicle(String 비행기, String 자동차, String 배) {
	super();
	this.비행기 = 비행기;
	this.자동차 = 자동차;
	this.배 = 배;
}

@Override
public String toString() {
	return "Vehicle [비행기=" + 비행기 + ", 자동차=" + 자동차 + ", 배=" + 배 + "]";
}
public String get비행기() {
	return 비행기;
}
public void set비행기(String 비행기) {
	this.비행기 = 비행기;
}
public String get자동차() {
	return 자동차;
}
public void set자동차(String 자동차) {
	this.자동차 = 자동차;
}
public String get배() {
	return 배;
}
public void set배(String 배) {
	this.배 = 배;
}
 
 
}
