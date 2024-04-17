package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	// 생성자 오버로딩이란
	// 생성자의 개수가 여러개 있다.
	
	// 기본 생성자 형태 만들어 보기
	public UserInfo() {}
	
	public UserInfo(String Id) {
		userId = Id;
	}
	
	public UserInfo(String Id, String Name) {
		userId = Id;
		userName = Name;
	}
	
	// 연습 문제 -
	// 1 - 매개변수 3개를 받는 생성자를 만들어 보세요
	public UserInfo(String Id, String Name, String Password) {
		userId = Id;
		userName = Name;
		userPassword = Password;
	}
	// 2- 매개변수 4개를 받는 생성자를 만들어 보세요
	public UserInfo(String Id, String Name, String Password, String Address) {
		userId = Id;
		userName = Name;
		userPassword = Password;
		userAddress = Address;
	}
	// 3 - 매개변수 5개를 받는 생성자를 만들어 보세요
	public UserInfo(String Id, String Name, String Password,  String Address, String phone) {
		userId = Id;
		userName = Name;
		userPassword = Password;
		userAddress = Address;
		phoneNumber = phone;
	}
	public void showInfo() {
		System.out.println("아이디 : " + userId);
		System.out.println("이름 : " + userName);
		System.out.println("비밀번호 : " + userPassword);
		System.out.println("주소 : " + userAddress);
		System.out.println("전화번호 : " + phoneNumber);
	}
}	// end of class
