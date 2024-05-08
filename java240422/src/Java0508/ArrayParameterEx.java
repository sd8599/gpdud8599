package Java0508;

public class ArrayParameterEx {
//	공백을 쉼표로 바꾸는 메소드
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]==' ') {
				a[i]=',';
			}
		}
	}
	
	// 파라미터로 받은 배열원소 출력
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
			System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		}
}

/* 출력값
This is a pencil.
This,is,a,pencil.
 */
