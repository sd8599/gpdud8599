package chapter03;

public class Ex_7 {
	public static void main(String[] args) {
		//선언에서 초기화까지
		int[] evens = {0,2,4,6,8,10,12,14,16,18};
		int[] primes = {2,3,5,7,11,13,17,19};
		
//		1.짝수배열을 메소드 매개변수로 호출
//		5.합계를 받아서 evenSum에 저장
		int evenSum = sum(evens); //타입을 맞춰야됨 int면 int로 '[]'는 가능
//		int evenSum = sum(evens[]); //오류, 보낼때는 대괄호빼기
		int primeSum = sum(primes); //타입을 맞춰야됨 int면 int로 '[]'는 가능
		
		
		System.out.println("짝수 배열의 합 : "+evenSum);
		System.out.println("소수 배열의 합 : "+primeSum);
	}
//		2.arr로 evens를 받는다.
//	sum : 배열을 받아서 합계를 구하는 메소드
	            //리턴타입        //파라미트
	public static int sum(int[] arr) { //합계구하기
//		public static int sum(int[] evens) { //같은 이름을 사용해도 무관 
//		public static int sum(int arr) {
		int sum = 0;
		
//		매개변수 배열의 크기만큼 반복하면서 sum에 합계를 누적
//		3. arr배열원소를 가지고 반복 {0,2,4,6,8,10,12,14,16,18}해서 합계 구함
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
//		4.합계를 반환
		return sum; //반환을 안해서 오류, return 입력
	}
}
