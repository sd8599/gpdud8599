package javarlch;

public class Walking {
		
	public static double walkingkcal(int kcalcount) {
		return kcalcount*0.02;
	}
	
	public static void main(String[] args) {
		double kcal = walkingkcal(5000);
			System.out.println("소모 칼로리 : "+kcal+"kcal");
		}
}

//한걸음을 걸을 때마다 0.02kcal가 소모 된다고 합니다. 
//하루동안 5000걸음을 걸었다고 할때, 이를 통해 소모된
//칼로량을 메소드로 계산해주세요.