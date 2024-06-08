package middleprocess;

import java.util.Scanner;

public class EmergencyMoney {
	
	private int household;
	private int hundreddollar;
	private int tendollar;
	
	public void process() {
		
		int money = 0;
		
		if (household==1) {
			money = 400000;
		} else if (household == 2){
			money = 600000;
		} else if (household == 3){
			money = 800000;
		} else {
			money = 1000000;
		}
		
	 	hundreddollar = money/1200/100;
	 	tendollar = money/1200%100/10;
	}
	
	
	public int getHousehold() {
		return household;
	}
	public void setHousehold(int household) {
		this.household = household;
	}
	public int getHundreddollar() {
		return hundreddollar;
	}
	public void setHundreddollar(int hundreddollar) {
		this.hundreddollar = hundreddollar;
	}
	public int getTendollar() {
		return tendollar;
	}
	public void setTendollar(int tendollar) {
		this.tendollar = tendollar;
	}

	public static void main(String[] args) {
		EmergencyMoney emergencyMoney = new EmergencyMoney();
		Scanner sc = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		emergencyMoney.setHousehold(sc.nextInt());
		emergencyMoney.process();
		System.out.println("100달러짜리 "+emergencyMoney.getHundreddollar()+"매");
		if (emergencyMoney.getTendollar()!=0) {			
			System.out.println("10달러짜리 "+emergencyMoney.getTendollar()+"매");
		
			sc.close();
		}
	}
}
