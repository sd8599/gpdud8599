package cond;
/*회원 등급에 따라 다른 쿠폰을 바급하는 프로그램을 작성해야 한다.
 * 이 프로그램은 int grade라는 변수를 사용하며, 회원등급(grade)에 따라 쿠폰을 발급해야한다
 * 1등급 : 쿠폰 1000
 * 2등급 : 쿠폰 2000
 * 3등급 : 쿠폰 3000
 * 위의 등급이 아닐경우 : 쿠폰 500
 */
public class Switch1 {
		public static void main(String[] args) {
			int grade = 2;
			int coupon;
			
			if (grade==1) {
				coupon=1000;
				
			}else if (grade==2) {
				coupon=2000;
			}
			else if (grade==3) {
				coupon=3000;
				
			}else {
				coupon=500;
			}System.out.println("발급받은 쿠폰 "+coupon);
	}
}
