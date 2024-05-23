package loop;

public class WhileSum {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		//i를 1씩 증가시켜서 sum에 계속 더한다.
		
		while (sum<=100) {//sum이100이하까지반복
			System.out.println(i+"-"+sum);
			sum+=i++;
//			sum+=++i;
		}
	}
}
//0-0
//1-0
//2-1
//3-3
//4-6
//5-10
//6-15
//7-21
//8-28
//9-36
//10-45
//11-55
//12-66
//13-78
//14-91
