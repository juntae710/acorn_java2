package java2prj1.interfaceEx.myarrys;

public class Score implements MyComparable<Score>{
int kor;
int eng;

public Score() {
	// TODO Auto-generated constructor stub
}

public int getKor() {
	return kor;
}

public void setKor(int kor) {
	this.kor = kor;
}

public int getEng() {
	return eng;
}

public void setEng(int eng) {
	this.eng = eng;
}

@Override
public String toString() {
	return "Score [kor=" + kor + ", eng=" + eng + "]";
}

public Score(int kor, int eng) {
	super();
	this.kor = kor;
	this.eng = eng;
}

@Override
public int compareTO(Score other) {
	// TODO Auto-generated method stub
	return this.eng - other.eng;
}

//@Override
//public int compareTo(Score o) {
//	// TODO Auto-generated method stub
//	return this.eng - o.eng; //내가 크면 양수,작으면 음수,같으면 0
//}



}
