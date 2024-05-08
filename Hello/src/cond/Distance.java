package cond;
/*"거리에 따른 운송 수단 선택하기"
 * 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자
 * 거리가 1km이하면 : "도보"
 * 거리가 10km이하면 : "자전거"
 * 거리가 100km이하면 : "자동차"
 * 거리가 100km초과면 : "비행기"
 *//**/
public class Distance {
		public static void main(String[] args) {
			int distance = 30;
			String ride;
			
			if (distance<=1) {
				ride = "도보";
			} else if (distance<=10){
				ride = "자전거";
			}else if (distance<=100){
				ride = "자동차";
			}else{
				ride = "비행기";
			}
			System.out.println(ride+"를 이용하세요.");
	}
}
