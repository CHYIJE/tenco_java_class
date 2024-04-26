package basic.exercise.interfaces;

public class UserInfoClient {

	// main (메인 쓰레드 : 작업자 1 )
	public static void main(String[] args) {
		
		// 사용자에게 정보를 입력하세요 --> Scanner 활용
		String inputUserName = "홍길동";
		String inputUserPw = "asd123";
		
		// DTO : 데이터들을 받아서(취합해서, 가공ㅇㅇ) 전달하는 역할을 가지고 있는 인스턴스를 말한다.
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		// 데이터를 받아서 IUserInfoDao를 구현한 클래스에게 전달하고자 한다.
		// UserInfoMysqlDaoImpl, UserInfoOracleDaoImpl
//		IUserInfoDao iUserInfoDao1 = new UserInfoMysqlDaoImpl();
		 IUserInfoDao iUserInfoDao1 = new UserInfoOracleDaoImpl();
		
		iUserInfoDao1.insertUserInfo(userInfo);
		iUserInfoDao1.updateUserInof(userInfo);
		iUserInfoDao1.deleteUserInof(userInfo.getId());
		iUserInfoDao1.seleteUserInof();
	} // end of main

}	// end of class
