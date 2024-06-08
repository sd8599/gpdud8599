package middleprocess;

import java.util.Scanner;

public class Tesla {
	
	private int Tesla;
	private int tendollar;
	private int onedollar;
	
	public void process() {
		
		Tesla *= 520;
		tendollar = Tesla/100;
		onedollar = Tesla%100/10;
	}
	
	public int getTesla() {
		return Tesla;
	}

	public void setTesla(int tesla) {
		Tesla = tesla;
	}

	public int getTendollar() {
		return tendollar;
	}

	public void setTendollar(int tendollar) {
		this.tendollar = tendollar;
	}

	public int getOnedollar() {
		return onedollar;
	}

	public void setOnedollar(int onedollar) {
		this.onedollar = onedollar;
	}

	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오 >>");
		tesla.setTesla(sc.nextInt());
		tesla.process();
		System.out.println("100달러짜리 "+tesla.getTendollar()+"매");
		if (tesla.getOnedollar()!=0) {			
			System.out.println("10달러짜리 "+tesla.getOnedollar()+"매");
		}
		sc.close();
	}
}




