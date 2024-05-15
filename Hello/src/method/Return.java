package method;

public class Return { 
	//호텔 전화번호
	public static String getPhonenumber() {
		String phoneNumber = "02-1234-5678";
		return phoneNumber;
	}
	//호텔 주소 
	public static String getAddress() {
		String address = "자바.co.kr";
		return address;
	}
	//호텔 액티비티
	public static String getActivite() {
		return "수영, 스파, 조식";
	}
	
	public static void main(String[] args) {
		//반환값, Return
		String contactNumber = getPhonenumber();
		System.out.println("호텔 전화번호 : "+contactNumber);

		String contactaddress = getAddress();
		System.out.println("호텔 전화번호 : "+contactaddress);
		
		String contactactivite = getActivite();
		System.out.println("호텔 전화번호 : "+contactactivite);
	}
}
