package middle;

public class ForSample {
	public static void main(String[] args) {
		
		int count = 10;
		int sum = 0;
		
	for (int i = 1; i <= count; i++) {
		sum += i;
		System.out.print(i);
		if (i<10) {
			System.out.print("+");
		}
	}System.out.println("="+sum);
	
	}
}
