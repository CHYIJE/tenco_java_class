package basic.exercise.interfaces;

public interface IUserInfoDao {

	// C R U D
	// public abstract 생략 가능
	// TODO - 매개변수 수정 예정
	public abstract void insertUserInfo(UserInfo info);

	// 단 수정이 되면 안되는 것은 제외.
	public abstract void updateUserInof(UserInfo info);

	public abstract void deleteUserInof(int id);

	public abstract void seleteUserInof(); // 전체 조회
}
