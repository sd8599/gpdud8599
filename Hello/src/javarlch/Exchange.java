package javarlch;

public class Exchange {
	public static void main(String[] args) {
		
		int euo = Integer.parseInt(args[0]);
		int dollar = Integer.parseInt(args[1]);
	
		double Sum = euo*1281.62664+dollar*1091.70306;
		
		//%.0f : 소수점이하 숫자만 출력
		System.out.printf("환전결과 : %.0f원",Sum);
		
		//출력시 소수점까지 출력 환전결과 : 101579.0832원
//		System.out.println("환전결과 : "+Sum+"원"); 
	
	}
}
//유로와 달러를 입력받아 원화로 환전한 결과를 출력해주세요. 환율은 아래와 같습니다.
//1유로 = 1281.62664원
//1달러 = 1091.70306원
//52유로,32달러