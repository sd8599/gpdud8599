package middleprocess;

public class Print2DArray {
	
	private int n[][];
	
	public void process() {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}System.out.println();
		}
	}
	
	public int[][] getN() {
		return n;
	}
	public void setN(int[][] n) {
		this.n = n;
	}

	public static void main(String[] args) {
		
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		Print2DArray print2dArray = new Print2DArray();
		print2dArray.setN(n);
		print2dArray.process();
	}
}
