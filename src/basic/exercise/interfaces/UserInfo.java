package basic.exercise.interfaces;

public class UserInfo {

	public static int SERIAL_NUM = 0;
	private int id; // PK -> 홍길동, 나이 == 1, 2, 3
	private String userName;
	private String pw;

	public UserInfo(String userName, String pw) {
		this.userName = userName;
		this.pw = pw;
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPw() {
		return pw;
	}

	@Override
	public String toString() {
		return id + ", " + userName + ", " + pw;
	}

}
