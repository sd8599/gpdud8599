package chapter07_0517;
//T=TV, M=String
public class Product <T,M> {
	//T=TV, M=String
	//3. new TV()
	private T kind;
	//3.model = "스마트TV"
	private M model;
	
	//T=TV가 메소드의 리턴타입
	public T getKind() {
		return kind;
	}
	//T=TV가 매개변수의 타입
	//1.TV kind = new TV()
	public void setKind(T kind) {
		this.kind = kind; // 2. new TV()
	}
	//T=TV가 메소드의 리턴타입
	public M getModel() {
		return model;
	}
	//T=TV가 매개변수의 타입
	//1.String model = "스마트TV"
	public void setModel(M model) {
		this.model = model; //2.model = "스마트TV"
	}
}
