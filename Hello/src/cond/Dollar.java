package cond;
/*"환율계산하기"
 * 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자
 * 환율은 1달러당 1300원이라고 가정하고 다음과 같은 기준을 따른다.
 * 달러가 0미만이면 : "잘못된 금액입니다."
 * 달러가 0일때 : "환전할 금액이 없습니다."
 * 달러가 0초과 일때 : "환전 금액은 (계산된 원화 금액)원 입니다."
 * 금액은 변수(int dollar)로 지정하고, 해당 변수르 기반으로 한국 원으로의 환전 금액을 출력하자 
 */
public class Dollar {
		public static void main(String[] args) {
			
			int dollar = 33;
			
			if (dollar<0) {
				System.out.println("잘못된 금액입니다."); 
			} else if(dollar==0){
				System.out.println("환전할 금액이 없습니다."); 
			}else {				
				int won = dollar * 1300;
				System.out.println("환전금액은 "+won+"원 입니다.");
			}
			
		}
}
