package chapter09_0520;

import java.util.Scanner;

public class RandomArray2 {
	//난수의 중복을 체크하는 메소드
	//int a[] : nNumber, to : 0, r : 23
	public static boolean exists(int a[],int to, int r) {
		//0 : 반복안함
//		0<1
		for (int i = 0; i < to; i++) {
//			a[0] : 23, rNumber : 33
			if (a[i]==r) {
				return true;
			}
		}
		return false;
	}
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개? >>");
		int number = sc.nextInt();
		int nNumber[] = new int[number];
		
		for (int i = 0; i < nNumber.length; i++) {
				int rNumber = (int)(Math.random()*100+1);//1~100 난수를 발생
//				i=0, rNumber=23/ i=1 rNumber=33
				if (exists(nNumber, i, rNumber)) {
					i--;
					continue;
				}
				//nNumber[i] = 23 
				nNumber[i] = rNumber;
							
				if (i == 0) {//첫번째는 엔터X
					System.out.print(nNumber[i]+" ");				
				} else {
					if (i%10 == 0) { //10번째 마다 엔터
						System.out.println();
					}
					//10번째 아닐때 마다 엔터X
					System.out.print(nNumber[i]+" ");
				}
			}
		}
	}

