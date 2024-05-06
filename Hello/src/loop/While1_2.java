package loop;

public class While1_2 {
		public static void main(String[] args) {
				
				int count = 0;
				
				while (count<3) { //거짓이 될 때까지 반복
					count = count+1; //count++; 도 가능
					System.out.println("현재 숫자는 : "+count); 
				}
		}
}
