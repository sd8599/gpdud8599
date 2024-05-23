package question02;

public class ForSample {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			
			if (i<10) {
			System.out.print("+");
			//else{System.out.println(i+"=");}
			}
		} System.out.println("="+sum);
	}
}
//
//중급B 3 : for 문을 이용하여 1부터 10까지 합 출력 (ForSample)
//1
//for문을 이용하여 1부터 10까지 덧셈을표시하고합을구하시오.
//1+2+3+4+5+6+7+8+9+10=55

