package middlehome;

public class DowhileTest {
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		do {
				sum += num;
				num+=2;
		} while (num<100);
		System.out.println(sum);
	}
}
