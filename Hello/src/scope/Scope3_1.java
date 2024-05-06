package scope;

public class Scope3_1 {
		public static void main(String[] args) {
			
				int m = 10;
				int temp = 0; //if문 안에서만 사용하기 때문에 여기에 유지할 필요가 없다.
				
				if (m>0) {
					temp = m*2; //효율적메모리사용, 코드복잡성감소
					System.out.println("temp = "+temp);
				}
				System.out.println("m = "+m);
		}
}
