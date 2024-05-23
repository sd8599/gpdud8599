package homeworkhome;

public class WhileTest {
	public static void main(String[] args) {
		 
		int number = 0;
		int sum = 0;
		
		while (number<100) {
			sum+=number; //sum = sum+number;
			number+=2;
		}System.out.println(sum);
	}
}
