package middlehome;

public class ReturnArray2_1 {	
	public static int makeArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i]+100;
			System.out.print(sum+" ");
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int[] arry = new int[10];
		int vara = 0;
		
		for (int i = 0; i < arry.length; i++) {
			arry[i] = i+1;
			vara = arry[i];
		System.out.print(vara+" ");
		}
		System.out.println();
		int a = makeArray(arry);
	}
	}
