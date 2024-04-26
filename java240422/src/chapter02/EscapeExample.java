package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호이름직업");
//		백슬래쉬t : 탭만큼띄어줌
//		println : 엔터적용
		System.out.println("번호\t이름\t직업");
//		print : 엔터적용안됨
//		백슬리시n : 엔터(다음행)
		System.out.print("번호\t이름\t직업\n");
		System.out.print("번호\t이름\t직업");
		System.out.println();
//		System.out.println();엔터적용
		System.out.println("우리는 개발자 입니다.");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄여름가을겨울");
//		 \백슬래시 1개는 오류생성, \\백슬래시 1개시 \하나생성
		System.out.println("봄\\여름\\가을\\겨울");
	}
}
