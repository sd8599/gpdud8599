package middlehome;

public class ForSample {
	public static void main(String[] args) {
		
		int sum = 0;
		int count = 10;
		String n = "+";
		
		for (int i = 1; i <= count; i++) {
			sum+=i;
			System.out.print(i);
			if (i<10) {
				System.out.print(n);
			}
		}System.out.println("="+sum);
	}
}
