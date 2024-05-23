package stringEx0517;

public class StringAnotherString {
	public static void main(String[] args) {
		 
		String java = "JAVA";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		System.out.println(res);
		if (res==0) {
			System.out.println("the same");
		}else if (res<0) {
				System.out.println(java+" < "+cpp); //음수
		}else {
				System.out.println(java+" > "+cpp); //양수
			}
		}
	}
