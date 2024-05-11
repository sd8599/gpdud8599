package chapter05_0510;
//난수를 발생 Math클래스, Random클래스
	public class RandonNumber {
		public static void main(String[] args) {
		/*int rNumber;
		 * Random gernerator = new Random();
		 * gernerator.nextInt(); 
		 * 난수 발생 범위 int타입 범위 2의31승~2의31승-1
		 * gernerator.nextInt(10); 난수 발생 0~9의 정수 
		 * gernerator.nextInt(10)+1; 난수 발생 1~10의 정수 
		 * gernerator.nextInt(10)*(+1); 난수 발생 -9~0의 정수
		 *  gernerator.nextDouble()double범위 .nextFloat()float범위 
		 *  .nextLong();타입범위 .nextBoolean();참/거짓
		 */
			while (true) {
//			n = gernerator.nextInt(10)+1; 난수 발생 1~10의 정수 
			int n = rollDie();
			System.out.println(n);			
			if (n==7) {
				break;
			}
		}
	}
	
	public static int rollDie() {
	double x = 10 * Math.random();
	int temp = (int)x;
	return temp+1;

	}
}
/*상급7 1부터 10까지의 숫자 맞추기
main 메소드 설계, 변수들
rNumber : 1부터 10까지의 임의의 정수 
알고리즘
1부터10사이의 정수를 임의로 만든다.
숫자를 출력한다.
7이라는 숫자가 출력되면 종료한다.
	*/