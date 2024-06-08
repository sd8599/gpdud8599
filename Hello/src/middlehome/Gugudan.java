package middlehome;

public class Gugudan {
	public static void main(String[] args) {
		
		int gugu = 0;
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				gugu = i*j;
				System.out.print(i+"*"+j+" = "+gugu+"\t");
			}System.out.println();
		}
	}
}
