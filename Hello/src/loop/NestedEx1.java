package loop;
/*구구단 출력
 * 중첩 for문을 사용해서 구구단을 완성해라.
 */
public class NestedEx1 {
	
		public static void main(String[] args) {
			
			int sum = 0;
			
			for (int i = 1; i <= 9 ; i++) {
				for (int j = 1; j <= 9 ; j++) {
					sum = i*j;
				System.out.println(i+" * "+j+" = " +sum);
						}		
				}
		}
}
