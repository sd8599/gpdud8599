package scope;

public class Scope3_2 {
		public static void main(String[] args) {
			
				int m = 10;
				if (m>0) {						//줄어든 스코프
					int temp = m*2; //효율적메모리사용, 코드복잡성감소
					System.out.println("temp = "+temp);
				}
				System.out.println("m = "+m);
		}
}
//temp = 20
//m = 10
