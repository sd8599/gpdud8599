package question02;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int sum = 0, i=0;
		
		do {sum+=i; i+=2; //if(i>99){break;} while(true);
		} while (i<=99); System.out.println(sum);
	}
}

//중급B 7 DoWhile (DoWhileTest.java)
//1
// DoWhile 을 이용하여 0부터 시작하여99까지의짝수들
//의합을계산하라.
// *.출력
// 2450