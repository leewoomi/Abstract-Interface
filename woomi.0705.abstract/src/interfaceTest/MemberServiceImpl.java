package interfaceTest;

import java.io.Serializable;

//MemberService 인터페이스를 implements한 클래스를 생성
//하나의 인터페이스를 implements한 클래스의 이름은 인터페이스 이름 뒤에
//Impl을 붙이는 것이 관례
public class MemberServiceImpl implements MemberService, Serializable {

	@Override
	public boolean idCheck(String id) {

		boolean result = false;

		// id가 root가 아니면 true
		if (id.equals("root") == false) {
			result = true;
		}
		return result;
	}

	@Override
	public int loginCheck(String id, String password) {

		int result = 2;
		// id가 root이고 password가 1234면 성공-0
		if (id.equals("root")) {
			if (password.equals("1234")) {
				result = 0;
				return result;
			}

			// id가 root이고 password가 1234가 아니면 비밀번호가 틀림-1
			else {
				result = 1;
				return result;
			}
		}
		// id가 root가 아니면 없는 id -2
		else {
			result = 2;
			return result;
		}
	}

}
