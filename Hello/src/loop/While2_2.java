package loop;

public class While2_2 {
		public static void main(String[] args) {
			
				int sum = 0;
				int i = 1;
				int endNum = 3;
					
				while (i<=endNum) {
					sum = sum+i;
					System.out.println("i = "+i+",  sum = "+sum);
					i++;
				}
		}
}
//i = 1,  sum = 1
//i = 2,  sum = 3
//i = 3,  sum = 6
