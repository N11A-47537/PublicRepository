package MainPackage;

public class MyThread2 implements Runnable {
	int pace;
	int end;
	
	MyThread2(int x, int y){
		this.end=x;
		this.pace=y;
	}
	@Override
	public void run() {
		System.out.println("thread is running");
		this.countUp();
	}
	
	public void countUp() {

		for(int i=0;i<=this.end;i=i+this.pace) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(Thread.currentThread().getName()+" finished");
	}

}
