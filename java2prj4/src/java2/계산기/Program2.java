package java2.계산기;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import java2.변경에유리한코드.Animal;

//Program
//Calculator(인터페이스) - ACalculator , BCalculator
//외부 설정파일을 이용해 A -> B로 코드의 변경없이 바뀔수 있도록 하겠다.
public class Program2 {

	int su1;
	int su2;
	
	Calculator calculator;
	
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	void run() {
		//동작코드
		//두 수를 입력받아서 덧셈을 하고 출력하기
		
		Scanner sc = new Scanner(System.in);
		this.su1 = sc.nextInt();
		this.su2 = sc.nextInt();
		
		int result = calculator.add(su2, su1);
		System.out.println(result);
	}
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		Program2 p = new Program2();
		p.setCalculator( getCalculator());
		p.run();
	}
	private static Calculator getCalculator() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Properties p = new Properties();
		p.load(new FileReader("src/java2/계산기/config.txt"));
		String className = p.getProperty("calculator");
		Class clazz = Class.forName(className);
		Calculator calculator = (Calculator)clazz.newInstance();
		return calculator;
	}
}
