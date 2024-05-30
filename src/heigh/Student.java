package heigh;

public class Student {
	String Name; //이름
	int Number; //학번
	String Department; //소속학과

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name =name;
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
	
	@Override
	public String toString() {
		return "이름 : "+Name+"\n학번 : "+Number+"\n소속학과 : "+Department;
	}
	
}
