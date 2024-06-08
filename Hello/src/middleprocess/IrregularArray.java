package middleprocess;

public class IrregularArray {
	
	private int num[][];
	
	public int[][] getNum() {
		return num;
	}
	public void setNum(int[][] num) {
		this.num = num;
	}
	
	public void process() {
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print((num[i][j] = (i+1)*10+j)+" ");
			}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		
		IrregularArray irregularArray = new IrregularArray();
		int [][] num = new int[4][];
		num[0] = new int[3];
		num[1] = new int[2];
		num[2] = new int[3];
		num[3] = new int[2];
				
		irregularArray.setNum(num);
		irregularArray.process();

		
	}
}

