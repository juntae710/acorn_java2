package java2prj2.lamda2;

public class RunnableTest {
public static void main(String[] args) {
	Runnable r = () -> System.out.println("람다식");
	r.run();
	
	Runnable r2 = new Runnable() {

		@Override
		public void run() {
			System.out.println("익명식");
		}
	};
	r2.run();
	
	class B implements Runnable{

		@Override
		public void run() {
			System.out.println("클래스 만들어서");
			
		}
	
}
	B b =new B();
	b.run();
	
	
	Runnable juntae = () ->System.out.println("다들 화이팅 ฅʕ•.•ʔฅ");
		
	juntae.run();
}}
