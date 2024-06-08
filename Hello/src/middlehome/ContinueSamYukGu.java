package middlehome;

public class ContinueSamYukGu {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i%3==0) {
				String n = "짝";
				System.out.print(n+" ");	
			}else {				
				System.out.print(i+" ");				
			}
		}
	}
}
