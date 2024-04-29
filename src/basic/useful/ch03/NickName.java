package basic.useful.ch03;

public class NickName {
	private String nick;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) throws NickNameException {

		if (nick == null) {
			throw new NickNameException("닉네임은 필수로 작성하셔야 합니다.");
		}
		if (nick.length() < 3 || nick.length() > 10) {
			throw new NickNameException("3글자 이상 10자 이하로 작성해주세요.");
		}
		if (nick.matches("[a-zA-Z0-9]*$")) {
			throw new NickNameException("한글로만 작성해주세요");
		}
		this.nick = nick;
	}

}
