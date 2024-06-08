package middleprocess;

import java.util.Scanner;

public class ChangeMoney {
	
	private int[] money;
	private int changemoney;
	private String[] mon;
	
	public void process() {
		
		for (int i = 0; i < money.length; i++) {
			if (changemoney>money[i]) {	
				int count = changemoney/money[i];
				System.out.println(mon[i]+count+"매");
			changemoney%= money[i];
			}
		}
	}
	
	public String[] getMon() {
		return mon;
	}
	public void setMon(String[] mon) {
		this.mon = mon;
	}
	public int getChangemoney() {
		return changemoney;
	}

	public void setChangemoney(int changemoney) {
		this.changemoney = changemoney;
	}
	public int[] getMoney() {
		return money;
	}
	public void setMoney(int[] money) {
		this.money = money;
	}

	public static void main(String[] args) {
		
		ChangeMoney changeMoney = new ChangeMoney();
		Scanner sc = new Scanner(System.in);
		int money[] = {50000,10000,1000,500,100,50,10,1};
		String mon[] = {"오만원권","만원권","천원권","오백원","백원","오십원","십원","일원"};
		
		changeMoney.setMoney(money);
		changeMoney.setMon(mon);
		
		System.out.print("금액을 입력하시오>>");
		changeMoney.setChangemoney(sc.nextInt());
		changeMoney.process();
		
		sc.close();
	}
}
