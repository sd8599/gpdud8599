package cond;
/*"학점에 따른 성취도 출력하기"
 * String grade라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자
 *각 학점은 다음과 같은 성취도를 나타낸다.
 *"A" : "탁월한 성과입니다!"
 *"B" : "좋은 성과입니다!"
 *"C" : "준수한 성과입니다!"
 *"D" : "향상이 필요합니다."
 *"F" : "불합격입니다."
 *나머지 : "잘못된 학점입니다."
 */
public class GradeSwitch2 {
		public static void main(String[] args) {
			
			String grade = "B";
			
			String a = switch (grade) {
			case "A" -> "탁월한 성과입니다!";
			case "B" -> "좋은 성과입니다!";
			case "C" -> "준수한 성과입니다!";
			case "D" -> "향상이 필요합니다.";
			case "F" -> "불합격입니다.";
			default ->"잘못된 학점입니다.";
			
			};
			System.out.println(a);
		}
}

/*switch (grade) {
			case "A":
				grade = "탁월한 성과입니다!";
				break;
			case "B":
				grade = "좋은 성과입니다!";
				break;
			case "C":
				grade = "준수한 성과입니다!";
				break;
			case "D":
				grade = "향상이 필요합니다.";
				break;
			case "F":
				grade = "불합격입니다.";
				break;
			default:
				grade = "잘못된 학점입니다.";
				break;
			}*/