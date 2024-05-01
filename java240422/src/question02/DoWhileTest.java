package question02;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int sum = 0, i=0;
		
		do {sum+=i; i+=2; //if(i>99){break;} while(true);
		} while (i<=99); System.out.println(sum);
	}
}

