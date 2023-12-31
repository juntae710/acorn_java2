package java2prj1.interfaceEx.myarrys;

import java.util.Arrays;
import java.util.Comparator;

public class ScoreTest3 {
public static void main(String[] args) {
	Score[] list = new Score[4];
	
	list[0] = new Score(100, 90);
	list[1] = new Score(80, 99);
	list[2] = new Score(99, 87);
	list[3] = new Score(70, 60);
	
	//객체배열 출력
	for(Score s : list) {
		System.out.println(s);
	}
	
	MyArrays.sort(list);
	//국어 점수가 낮은 순으로 정렬(직접정렬,선택정렬)
	

	 System.out.println("정렬후");
	 for(Score s : list) {
			System.out.println(s);
		}
	 
	 MyArrays.sort(list,new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			Score s1 = (Score) o1;
			Score s2 = (Score) o2;
			return s1.kor - s2.eng;
		}
		 
	 });
	 System.out.println("정렬후");
	 for(Score s : list) {
			System.out.println(s);
		}
	 class ComparatorImp implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Score s1 = (Score) o1;
			Score s2 = (Score) o2;
			return s1.kor - s2.kor;
		}
		 
	 }
	 MyArrays.sort(list, new ComparatorImp());
	 

	 System.out.println("정렬후");
	 for(Score s : list) {
			System.out.println(s);
		}
	 
}}
