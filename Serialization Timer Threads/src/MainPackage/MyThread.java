package MainPackage;

public class MyThread extends Thread {
	int pace;
	int end;
	
	MyThread(int x, int y){
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	System.out.println(Thread.currentThread().getName()+" finished");
}
}
