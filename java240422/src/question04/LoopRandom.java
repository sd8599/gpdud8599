package question04;

public class LoopRandom {
	public static void main(String[] args) {
		
		int[] number = new int[6];
		int temp = 0;
		
	
			for (int i = 0; i < number.length; i++) {
				number[i] = (int)(Math.random()*45+1);
				System.out.print(number[i]+" ");

				if (number[i]!=number[0]) {					
				temp = number[0];
				number[0] = number[i];
				number[i] = temp;
				
				}
				
			
			}
		}
	}

