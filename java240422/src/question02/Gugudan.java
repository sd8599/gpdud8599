package question02;

public class Gugudan {
	public static void main(String[] args) {
		
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				/*System.out.println("@# i===>"+i);
				System.out.println();
				System.out.println("@# j===>"+j);*/
				//탭으로 띄워서 정렬되게 출력(\t)
			System.out.print(i+"x"+j+"="+i*j+"\t");	}	
			System.out.println(); //단이 끝날때 마다 엔터
		}
	}
}
