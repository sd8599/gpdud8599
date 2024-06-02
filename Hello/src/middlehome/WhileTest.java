package middlehome;

public class WhileTest {
	public static void main(String[] args) {
		
		int num=0;
		int sum = 0;
		
		while (num <100) {
			sum += num; //sum = sum+num; //sum에 숫자 더해서 출력
			num+=2; //num = num+2; 짝수로 출력
		}System.out.println(sum);
	}
}
