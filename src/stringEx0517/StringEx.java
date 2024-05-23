package stringEx0517;

public class StringEx {
		public static void main(String[] args) {
			 String a = new String(" C#"); // heap 메모리에 저장
			 String b = new String(",C++ "); // heap 메모리에 저장

			 // length() : 문자열의 길이
			 System.out.println(a.length()); //C#의 길이는 3(스페이스 포함)
			 System.out.println(a.contains("#")); //contains : 문자열을 포함여부 /true출력
			 System.out.println(a.contains("*")); // false
			 
			 a = a.concat(b); //concat() : 문자열연결
			 System.out.println(a); //" C#,C++ " (새로운 문자열을 a가 가리킴)
			 
			 a = a.trim(); //trim() : 앞,뒤 공백제거
			 System.out.println(a);//C#,C++
			 
			 a = a.replace("C#", "Java"); //replace() : 문자열 대체
			 System.out.println(a); //Java,C++
			 
			 String s[] = a.split(","); //split() : 문자열을 분리
			 for (int i = 0; i < s.length; i++) {
				 /*
				  * 분리된 문자열0:Java
				  * 분리된 문자열1:C++
				  */
				 System.out.println("분리된 문자열"+i+":"+s[i]);
			}
			 	a = a.substring(5); //substring() : 인덱스값으로 시작하는 문자열
			 	System.out.println(a); //Java,C++ => C++
			 	
			 	char c = a.charAt(2); // charAt() : 인덱스에 해당하는 문자
			 	System.out.println(c); // C++ => +
		}
}





