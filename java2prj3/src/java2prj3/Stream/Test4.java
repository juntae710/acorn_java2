package java2prj3.Stream;

import java.util.stream.IntStream;

public class Test4 {
public static void main(String[] args) {
	IntStream intStream = IntStream.range(1, 10);
	intStream.skip(3).limit(5).forEach(num -> System.out.println(num));
	
	//중복된거 제거
	IntStream intStream2 = IntStream.of(1,2,2,3,4,4,5,6,7);
	intStream2.distinct().forEach(num -> System.out.print(num+", "));
	
	//filter 조건에 맞는것만 생각
	System.out.println("\n 짝수출력");
	IntStream intStream3 = IntStream.range(1, 10);
	intStream3.filter(i -> i%2 == 0).forEach(num ->System.out.print(num+","));
}
}
