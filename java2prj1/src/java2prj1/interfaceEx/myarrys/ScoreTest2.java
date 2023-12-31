package java2prj1.interfaceEx.myarrys;

import java.util.Arrays;

public class ScoreTest2 {
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
	
	//국어 점수가 낮은 순으로 정렬(직접정렬,선택정렬)
	
	 Arrays.sort(list);
	 System.out.println("정렬후");
	 for(Score s : list) {
			System.out.println(s);
		}
}
}
