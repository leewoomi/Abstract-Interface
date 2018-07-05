package abstractTest;

public class Main {

	public static void main(String[] args) {
		SmartPhone smartphone = new Iphone();
		smartphone.call();
		smartphone = new Adroid();
		smartphone.call();
		smartphone = new WinPhone();
		smartphone.call();
		// SmartPhone 인스턴스 생성
		// SmartPhone s =new SmartPhone();
		// Cannot instantiate the type SmartPhone
		
		//final 변수 - 값을 변경할 수 없다.
		//지역변수지만 전역변수처럼 메모리에서 소멸되지 않음.
		final int ZERO =0;
		//ZERO =1;
		//The final local variable ZERO cannot be assigned.
		//It must be blank and not using a compound assignment
	}

}
