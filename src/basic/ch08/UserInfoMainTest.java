package basic.ch08;

public class UserInfoMainTest {

	public static void main(String[] args) {
		UserInfo userInfo1 = new UserInfo("slm12","유재석","123","서울", "01001000101" );
		userInfo1.showInfo();
		
		UserInfo userInfo2 = new UserInfo();
		userInfo2.userId = "nono12";
		userInfo2.userName = "박명수";
		userInfo2.userPassword = "456";
		userInfo2.userAddress = "부산";
		userInfo2.phoneNumber = "10011110";
		userInfo2.showInfo();
		
	} // end of main

} // end of class
