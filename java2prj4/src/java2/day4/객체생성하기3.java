package java2.day4;

public class 객체생성하기3 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException  {
	Class clazz =Class.forName("java2.day4.Member");
	Member member= (Member)clazz.newInstance();
	member.method2(3);
}
}
