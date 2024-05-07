package javarlch;
//라면을 끓이는 과정을 출력하시오
public class RaMyun {
	//
	public static void ramyunprocessing() {
		boil();
		buy(); 
		eat();
		put();
	}						//void : 리턴타입이없다
	public static void buy() {
		System.out.println("라면을 산다.");
	}
	public static void boil() {
		System.out.println("물을 끓인다.");
	}
	public static void put() {
		System.out.println("라면을 넣는다.");
	}
	public static void eat() {
		System.out.println("라면을 먹는다.");
	}
	//메인메소드
	public static void main(String[] args) {
		ramyunprocessing();
	}
}
