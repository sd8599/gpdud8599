package loop;

public class For2 {
	
		public static void main(String[] args) {
				
			int sum = 0;
			int endNum = 3; 
				
				for (int i = 1; i <= endNum; i++) {
					sum+=i;
					System.out.println("i = "+i+",  sum = "+sum);
				}
	}
}
//i = 1,  sum = 1
//i = 2,  sum = 3
//i = 3,  sum = 6
