package chapter05_0513;

//객체 생성시 멤버 5개
//public class Penguin extends Bird{
//extends Bird, Swim : 자바클래스 다중 상속 불가
//	public class Penguin extends Bird, Swim{//오류
//생명1개, 날개2개, 걷다, 먹는다. +수영한다.(인터페이스)
		public class Penguin extends Bird implements Swim2{
		@Override
		public void swim() {
		System.out.println("penguins swim.");
			
//	public void swim() {
//		System.out.println("penguins swim.");
//	}
		}
	}
