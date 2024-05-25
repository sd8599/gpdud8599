package middlehome;

public class IrregularArray2 {
	public static void main(String[] args) {
		int array[][] = new int[5][];
		
		array[0] = new int[5];
		array[1] = new int[1];
		array[2] = new int[4];
		array[3] = new int[2];
		array[4] = new int[3];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i+3)*10+5+j;
				System.out.print(array[i][j]+"\t");
			}System.out.println();
		}
	}
}

//35	36	37	38	39	
//45	
//55	56	57	58	
//65	66	
//75	76	77	
