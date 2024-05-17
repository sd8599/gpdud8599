package chapter07_0517;

public class ProductExample {
	
	public static void main(String[] args) {
		Product<TV,String> product1 = new Product<>();
		product1.setKind(new TV());
		product1.setModel("스마트TV");
		
		TV tv = product1.getKind();//new TV()
		//chapter07_0517.TV@3d012ddd(패키지.클래스@해시코드)
		System.out.println(tv);
		
		String tvmodel = product1.getModel();//스마트TV
		System.out.println(tvmodel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		//chapter07_0517.Car@5e91993f(패키지.클래스@해시코드)
		System.out.println(car);
		
		String carModel = product2.getModel(); //디젤
		System.out.println(carModel);
	}
}
