package innerclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx obj = new ThreadEx();
		obj.start();

		// Thread class의 Anonymous
		// 한번만 할 때 사용 두번이상이면 사용 안하는 것이 좋다.
		Thread th = new Thread() {
			public void run() {
				try {
					for (int i = 10; i < 20; i++) {
						System.out.println(i);
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		th.start();
	}

}
