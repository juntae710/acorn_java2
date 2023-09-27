package java2prj3.Stream;


	public class 예제2_Custmer {
		String id;
		String grade;
		int point;

		public 예제2_Custmer() {
			// TODO Auto-generated constructor stub
		}

		public 예제2_Custmer(String id, String grade, int point) {
			super();
			this.id = id;
			this.grade = grade;
			this.point = point;
		}

		@Override
		public String toString() {
			return "예제2_Custmer [id=" + id + ", grade=" + grade + ", point=" + point + "]";
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public int getPoint() {
			return point;
		}

		public void setPoint(int point) {
			this.point = point;
		}
}
