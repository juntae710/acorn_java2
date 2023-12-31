package java2prj2.lamda2;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> f1 = num -> num * 2;
		int result1 = f1.apply(10);
		System.out.println(result1);

		Function<Integer, Integer> f2 = new Function<>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * 2;
			}
		};
		int result2 = f2.apply(1000);
		System.out.println(result2);

		Function<Integer, String> f3 = num -> {
			String re = "";
			for (int i = 0; i < num; i++) {
				re += "람다좋아 ";
			}
			return re;
		};
		String result3 = f3.apply(5);
		System.out.println(result3);
	}
}