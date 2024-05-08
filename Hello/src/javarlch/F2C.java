package javarlch;

public class F2C {
	public static void main(String[] args) {
		
//		double fish = Integer.parseInt(args[0]); //입력값 : 77로 가능
		double fish = Double.parseDouble(args[0]); //입력값 : 77.0가능
		double water = (fish-32)/1.8;
		
		System.out.println(water);
	}
}
//화씨가 77F일때 섭씨C의 온도는?
//화씨(F)온도를 입력하면 섭씨(C) 온도로 변환하는 프로그램을 작성해 주세요
//변환공식은 아래와 같습니다.
//C = (F-32)/1.8