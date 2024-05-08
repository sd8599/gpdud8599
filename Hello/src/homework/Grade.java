package homework;
/**/
public class Grade {

	public static void Newgrade(String x,double a, double b,double c) {
		System.out.printf("%s의 평균점수 : %.2f%n",x,(a+b+c)/3.0);
	}
	
	public static void main(String[] args) {
		
		Newgrade("강백호",90.0,85.5,70.0);
		Newgrade("채치수",82.0,92.0,60.5);
			}
		}
	
/*강백호의 평균점수 : 81.83
채치수의 평균점수 : 78.17*/

