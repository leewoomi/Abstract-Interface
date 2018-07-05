package interfaceTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 인터페이스로도 변수를 만들 수 있고
		// 인터페이스로 만든 변수는 자신을 implements 한 클래스의
		// 인스턴스의 주소를 저장할 수 있다.
		MemberService memberservice = new MemberServiceImpl();
		//인터페이스  =new 클래스();

		Scanner sc = new Scanner(System.in);
		String id = null;

		System.out.print("id : ");
		id = sc.next();
		boolean idCheck = memberservice.idCheck(id);
		if (idCheck == true) {
			System.out.println("사용가능한 아이디입니다.");
		} else {
			System.out.println("이미 존재하는 아이디입니다.");
		}

		String password = null;

		System.out.print("id : ");
		id = sc.next();
		System.out.println("password : ");
		password = sc.next();

		int loginCheck = memberservice.loginCheck(id, password);
		if (loginCheck == 0) {
			System.out.println("로그인 성공");
		} else if (loginCheck == 1) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("없는 아이디입니다.");
		}

		sc.close();

	}

}
