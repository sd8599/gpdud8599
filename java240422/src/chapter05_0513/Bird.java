package chapter05_0513;
//생명 1개(객체 생성시 멤버 4개)
//추상 클래스에 추상메소드가 없어도 됨(객체 생성 안됨)
abstract class Bird extends Animal {
	public int wing = 2;
	public void walk() {
		System.out.println("walk");
	}
	public void eat() {
		System.out.println("eat");
	}
}
