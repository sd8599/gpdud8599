package arrays;
//1차원 배열
public class Array1_4 {
	public static void main(String[] args) {
		
//		int[] student; //배열 변수 선언
//		int[] student = new int[]{90,80,70,60,50}; //배열 생성과 초기화
		int[] student = {90,80,70,60,50,40,30,20,10}; //배열 생성과 초기화
								//학생의 점수를 추가해도 대괄호의 내용만 변경하면 된다.
									//배열의 길이		
		for (int i = 0; i < student.length; i++) {
			System.out.println("학생"+ (i+1) + "점수 : "+student[i]);			
		}
	}
}
