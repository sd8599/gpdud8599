package chapter10_0520;

public class ThreadMainEx {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();//현재 실행중인 스레드의 이름
		long id = Thread.currentThread().getId();//현재 실행중인 스레드의 고유한 번호
		//main메소드의 스레드 우선순위 초기값은 5
		int priorty = Thread.currentThread().getPriority();//현재 실행중인 스레드의 우선순위
		//RUNNABLE : 스레드 6가지 상태 중 하나
		Thread.State s = Thread.currentThread().getState();//현재 실행중인 스레드의 상태
		
		System.out.println("현재 스레드 이름 : "+name);
		System.out.println("현재 스레드 ID : "+id);
		System.out.println("현재 스레드 우선순위 값 : "+priorty);
		System.out.println("현재 스레드 상태 : "+s);
	}
}

//현재 스레드 이름 : main
//현재 스레드 ID : 1
//현재 스레드 우선순위 값 : 5
//현재 스레드 상태 : RUNNABLE
