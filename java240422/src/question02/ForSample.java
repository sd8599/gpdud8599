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


