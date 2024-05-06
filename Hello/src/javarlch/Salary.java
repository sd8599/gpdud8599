package javarlch;

public class Salary {
	public static void main(String[] args) {
		
		//문자열 => int 타입으로 변경
		int salary = Integer.parseInt(args[0]);
		int hour = Integer.parseInt(args[1]);
		
		int money = salary*hour;
		
		System.out.println("총 급여 : "+money+"원");
	}
}
