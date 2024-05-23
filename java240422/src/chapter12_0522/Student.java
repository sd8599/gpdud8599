package chapter12_0522;

public class Student {
	public String Name;
	public int Number;
	public String Department;
	
	@Override //to ctrl space 오버라이딩 나옴 //자동호출
	public String toString() {
		return("이름 : "+Name+"\n학번 : "+Number+"\n소속학과 : "+Department);
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
}
