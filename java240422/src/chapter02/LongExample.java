package chapter02;

public class LongExample {
public static void main(String[] args) {
	long var1=10;
//	long var2=10L; : L명시적으로 long 타입 리터럴(값)표시
	long var2=10L;
//	범위 벗어나면 오류(기본타입int)
//	long var3=100000000000;
	long var4=100000000000L;
	long var5=1000000000000000000L;
	long var6= 01011111L;
	
	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var4);
	System.out.println(var5);
	System.out.println(var6);
}
}





