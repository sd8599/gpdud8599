package arrays;
/*배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 
 * 출력하는 프로그램을 작성하세요.
 *신발 사이즈는 250부터 295까지 5단위로 증가
 *신발 사이즈 수는 총 10가지
 *출력예시>> 사이즈 250 (재고있음)
 *출력예시>> 사이즈 255 (재고있음)
 */
public class Quiz02 {
	public static void main(String[] args) {
		
			int size[] = {250,255,260,265,270,275,280,285,290,295};
			
			for (int i = 0; i < size.length; i++) {
				System.out.println("사이즈 "+size[i]+"(재고 있음)");
			}	
			
			System.out.println("===============");
	
			for (int i : size) {
				System.out.println("사이즈 "+i+"(재고 있음)");
			}
//			int size[] = new int[10];
//			for (int i = 0; i < size.length; i++) {
//				size[i] = 250+(5*i);
//			}
		}
}
