package javarlch;
//주사위를 던져 나오는 눈의 수 만큼 달러를 획득하는 게임이 있다.
//주사위를 총 3번 던져 얻은 달러를 환전한 결과를 출력하시오
//뼈대코드 main()메소드를 그대로 사용할 것 
//Math.random() 1과 6사이의 숫자를 반환하는 dice()메소드를 구현할 것 
//1달러 환율을 1082.25108으로 할 것 
public class Gamble {
	public static void main(String[] args) {
		double dollar = dice()+dice()+dice();
		double won = exchange(dollar);
		
		System.out.printf("획득 금액 : $%.2f (%.0f원)",dollar,won);
	}
	public static int dice() {
		//Math.random : double값을 반환=>0.00..~0.99사이의 값을 반환
		return(int)(Math.random()*5)+1;
	}
		public static double exchange(double dollar) {
			return dollar*1082.25108;
		}
}
