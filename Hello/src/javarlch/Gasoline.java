package javarlch;
//가솔린 8.68L를 충전한 A자동차는 총 182.736KM를 운행할 수 있었다고 합니다.
//이차의 연비를 메소드를 사용해서 계산해주세요.
public class Gasoline {
	public static void main(String[] args) {
		double gasoline = 8.68;
		double drive = 182.736;
		double eff = cal(gasoline,drive);
		
		System.out.printf("연비 : %.2f km/L",eff);
	}
	public static double cal(double fuel, double drive) {
		return drive/fuel;
		
	}
}
//연비 : 21.05 km/L