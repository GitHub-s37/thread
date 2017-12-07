package thread;

public class Thread_runnnable implements Runnable{

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 10; i++) {
			System.out.println("スレッド2から出力："+i);
		}
	}

}
