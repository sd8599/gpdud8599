package loop;

public class For {
	public static void main(String[] args) {
		
		int sum = 0;
		//1,2,3,4
		for (int i = 0; i < 5; i++) {
			sum+=i;
			System.out.println(sum); //0,1,3,6,10
		}
		System.out.print(sum); //10
	}
}
