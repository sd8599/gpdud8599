package chapter10_0520;

public class TimerThread extends Thread {
	int n = 0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000); //예외발생//1초마다실행
				//예외 발생할 때 e로 catch해서
			} catch (InterruptedException e) {
				// printStackTrace 메소드로 예외처리 기본 메시지를 출력
				e.printStackTrace();
			} 
		}

	}
	
}
