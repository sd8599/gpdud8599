package chapter03;

public class Ex_6 {
	public static void main(String[] args) {
		int[] arr = {88,76,92,68,55,48,82};
		int sum=0;
		
		//arr.length : 7이니까 index 6까지 반복
		for (int i = 0; i < arr.length; i++) {
			//arr[0]~arr[6]반복
			sum += arr[i];  //arr[i] : 배열원소(값)
		}
			System.out.println("총합 : "+sum); 
	}
}
