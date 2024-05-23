package stringEx0517;
/* String[] 배열을 전달받아 출력하는 printStringArray() 메소드와
배열속의“be” 문자열을 “eat”로 대치하는 replaceBe() 메소드
를작성하라*/

public class ArrayParameterEx {
	static void printStringArray(String a[]){
		//문자열 배열을 매개변수로 받아서 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	//문자열 배열을 매개변수로 받아서 "be" => "eat"으로 변경
	static void replaceBe(String a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("be")) {
				a[i] = "eat";
			}
		}
	}
	
	public static void main(String[] args) {
	
		String s[] = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
//		String d[] = {" ","be"," ","or"," ","not"," ","to"," ","be"};
		
		printStringArray(s);//to be or not to be
//		printStringArray(d);
		replaceBe(s);
		printStringArray(s);//to eat or not to eat
	}
}
//to be or not to be
//to eat or not to eat