package stringEx0517;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//이름을4개입력받아ArrayList에 저장하고 모두 출력한 후제일긴이름을출력하라.
public class ArrayListEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >>");			
			String name = sc.next();
			
			list.add(name);
			}
		
			String big = "";
			
			for (int j = 0; j < list.size(); j++) {
				String str = list.get(j);
				System.out.print(str+" ");
				if (j==0) {
					big = str;
				}//if(a.get(j).length()<a.get(j).length())
				else if (list.get(j-1).length()<list.get(j).length()) {
					big = str;
				}
			}System.out.println();
			System.out.println("가장 긴 이름은 : "+big);
			sc.close();
	}
}
/*이름을 입력하세요 >>차랴햐
이름을 입력하세요 >>댜랴ㅓ
이름을 입력하세요 >>더ㅑㄹㄷ
이름을 입력하세요 >>더핻
차랴햐 댜랴ㅓ 더ㅑㄹㄷ 더핻 
가장 긴 이름은 : 더ㅑㄹㄷ
*/