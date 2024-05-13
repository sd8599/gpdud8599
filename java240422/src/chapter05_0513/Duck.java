package chapter05_0513;
//생명1개, 날개2개, 걷다, 먹는다. +수영한다.
public class Duck extends Bird implements Swim2, interfaceFly {
	
	@Override
	public void swim() {
		System.out.println("ducks swim.");
	}

	@Override
	public void fly() {
		System.out.println("ducks swim.");
		
	}
}
