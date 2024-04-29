package basic.useful.ch03;

public class NickNameMainTest {

	public static void main(String[] args) {
		
		NickName nickName = new NickName();
		
		String inputNick = null;
		inputNick = "김수한";
		nickName.setNick(inputNick);
		
		try {
			nickName.setNick(inputNick);
			
		} catch (NickNameException e) {
			System.out.println("정의 예외 발생");
		} catch (Exception e) {
			System.out.println("예외 발생" + e.getMessage());
		}
		
	}

}
