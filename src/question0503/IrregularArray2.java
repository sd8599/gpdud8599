package question0503;

public class IrregularArray2 {
	public static void main(String[] args) {
		
		int n[][]=new int[5][];
		
		n[0] = new int [5];
		n[1] = new int [1];
		n[2] = new int [4];
		n[3] = new int [2];
		n[4] = new int [3];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = (i+3)*10+5+j;
				System.out.print(n[i][j]+" ");
			}System.out.println();
		}
	}
}
