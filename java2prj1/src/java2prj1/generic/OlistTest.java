package java2prj1.generic;

public class OlistTest {
public static void main(String[] args) {
	OList list = new OList();
	list.add(new Score("허재혁", 100, 90));
	list.add(new Score("표준태", 100, 90));
	list.add(new Score("김길동", 100, 90));
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
		
		//Object toString -> Score toString()
		//오버라이딩된 메서드는 부모형태로 참조해도
		//실체 객체의 매서드가 동작한다 => 다향성
		Object obj =list.get(i);
		//Score s = (Score) obj;
		System.out.println(((Score)obj).getKor());
	}
	
}
}
