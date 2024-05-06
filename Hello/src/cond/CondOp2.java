package cond;

public class CondOp2 {
		public static void main(String[] args) {
				int age = 10;									//참 : 거짓
				String status = (age>=18) ? "성인" : "미성년자";
				
				System.out.println("age = "+age+" status ="+status);
	}
}
