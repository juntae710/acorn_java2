package java2prj2.lamda;

public class LamdaPuls {
public static void main(String[] args) {
//1
	int max (int a, int b) {
		return a>b ? a:b;
	}
	==> (int a , int b ) -> {return a?b>a:b;}
	==> (a,b) -> a?b > a:b;
	
	
	//2
	int printVar(String name, int age) {
		System.out.println(name + "=" + age);
	}
	==>(String name,int age) -> {System.out.println(name+ "=" + age);}
	
	=>(name, age) -> System.out.println(name+ "=" + age);
	
	//3
	int squre(int x) {
		return x*x;
	}
	==>(int x) ->{ x*x;}
	=> x -> x*x;
	
	//4
	int getRandom() {
		return (int)(Math.random()*6);
		
	}
	==>() -> {return (int)(Math.random()*6);}
	=>()-> (int)(Math.random()*6);
	
}
}
