package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
//		float var1=3.14; 오류생성 F붙이면오류안남
//		오류 : 실수는 기본이 double
//		float var1=3.14f;
		float var1=3.14F;
		double var2=3.14;
		
//		값을 저장시 오류발생하지 않고, 출력시 짤림
		float var3=0.1234567890F;
		float var4=0.1234567891F;
		float var5=0.123456789123456789F;
		
//		소수점 자리수 제한 없이 값을 가지나 출력시 짤림(반올림 자리수는 double > float)
		double var6=0.123456789123456789;
		double var7=0.123456789123456789123456789;
		
		double var8=3e6;
		float var9=3e6F;
		float var10=2e-3F;
		double var11=2e-3;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("var9 : "+var9);
		System.out.println("var10 : "+var10);
		System.out.println("var11 : "+var11);
	}
}













