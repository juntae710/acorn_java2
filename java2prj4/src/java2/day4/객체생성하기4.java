package java2.day4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 객체생성하기4 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("java2.day4.Member");
		Constructor c = (Constructor) clazz.getDeclaredConstructor();
		Member member = (Member) c.newInstance();
		member.printInfo();
	}
}
