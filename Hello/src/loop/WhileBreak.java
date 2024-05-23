package loop;

public class WhileBreak {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		 
		while (true) {//무한반복문 for(;true;){}
			if (sum>100) 
				break;
				++i;
				sum+=i;
			
			}//end of while
			
			System.out.println("i = "+i);
			System.out.println("sum = "+sum);
		}
	}

