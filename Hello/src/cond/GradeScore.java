package cond;
/*/**
 * 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자
 * 90점이상 : "A"
 * 80점 이상 90점 미만 : "B"
 * 70점 이상 80점 미만 : "C"
 * 60점 이상 70점 미만 : "D"
 * 60점 미만 : "F"
 */
public class GradeScore {
		public static void main(String[] args) {
			
			int score= 85;
			char grade;
			
			if (score>=90) {
				grade = 'A';
			} else if (score>=80&&score<90){
				grade = 'B';
			}
			else if (score>=70&&score<80){
				grade = 'C';
				}
			else if (score>=60&&score<70){
				grade = 'D';
				}else {
					grade = 'F';
				}
			System.out.println("학점은 "+grade+" 입니다.");
		}
}
