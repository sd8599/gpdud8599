package homeworkhome;

public class Grade {
	
		String name;
		double koreanScore;
		double englishScore;
		double mathScore;

		public Grade(String name, 
double koreanScore, double englishScore, 
double mathScore) {
			this.name = name;
			this.koreanScore = koreanScore;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public double calculateAverage() {
			return Math.round
(((koreanScore+englishScore+mathScore)/3.0)
*100.0)/100.0;
		}
	
	public static void main(String[] args) {
		
	Grade grade1= new Grade("강백호",90.0,85.5,70.0);
	Grade grade2= new Grade("채치수",82.0,92.0,60.5);
		
		System.out.println("강백호의 평균점수 : "+grade1.calculateAverage());
		System.out.println("채치수의 평균점수 : "+grade2.calculateAverage());
			}
		}
	
/*강백호의 평균점수 : 81.83
채치수의 평균점수 : 78.17*/

