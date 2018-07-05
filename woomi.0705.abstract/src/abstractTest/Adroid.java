package abstractTest;

public class Adroid extends SmartPhone {

	public void call() {
		double x = 12.45;
		// 소수 첫 째 자리 반올림
		int y = (int) (x + 0.5);
		System.out.println("y : " + y);
		for(int i =0; i<y; i++) {
			System.out.println(i+"안드로이드에서 전화 걸기");
		}
		// 소수 두 째 자리 반올림
		System.out.println("x : " + (int) (x * 10 + 0.05) / 10.0);
		
	}
}
