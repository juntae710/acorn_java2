package java2.day4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class 클래스정보출력하기 {
public static void main(String[] args) throws ClassNotFoundException {
	Class clazz =Class.forName("java2.day4.Member");
	
	Field[] fields = clazz.getDeclaredFields();
	
	for(Field field : fields) {
		System.out.println(field);
	}
	
	Method[] methods = clazz.getDeclaredMethods();
	
	for(Method method : methods) {
		System.out.println(method);
	}
}
}
