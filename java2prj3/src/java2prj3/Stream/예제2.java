package java2prj3.Stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class 예제2 {
	public static void main(String[] args) {
		예제2_Custmer c =new 예제2_Custmer();
		ArrayList<예제2_Custmer> list = new ArrayList<>();
		list.add(new 예제2_Custmer("감자", "vvip", 3001));
		list.add(new 예제2_Custmer("고구마", "vvip", 3501));
		list.add(new 예제2_Custmer("먹태", "bronze", 500));
		list.add(new 예제2_Custmer("옥수수", "vip", 2700));
		list.add(new 예제2_Custmer("새우", "vip", 2828));
		
		System.out.println("vvip 인원수 확인");
		long vvip=list.stream().filter( cus -> cus.getGrade().equals("vvip")).count();
		System.out.println(vvip);
		
		System.out.println("vip 인원 확인");
		list.stream().filter( cus -> cus.getGrade().equals("vip")).forEach(arr -> System.out.println(arr));
		
		System.out.println("포인트 순으로 정렬");
		list.stream().sorted((a, b) -> b.getPoint() - a.getPoint()).forEach(arr2 -> System.out.println(arr2)); 
	}
	
}
