package middlehome;

public class IrregularArray {
	public static void main(String[] args) {
		
		int row = 4;
		int[][] number = new int[row][];
		
		number[0] = new int[3];
		number[1] = new int[2];
		number[2] = new int[3];
		number[3] = new int[2];
		
		int count = 10;
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print((number[i][j] = (i+1)*10+(j))+" ");
			}System.out.println();
		}
	}
}
//10 11 12 
//20 21 
//30 31 32 
//40 41 
