package thread;

public class Thread_run extends Thread{

	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("スレッドから出力："+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
