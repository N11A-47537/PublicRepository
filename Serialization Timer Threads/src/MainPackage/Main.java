package MainPackage;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) throws InterruptedException {
/*		//Serialization
		User user = new User();
		user.name="Oskar";
		user.password="Koros1321";
		try {
			FileOutputStream fileOut = new FileOutputStream("userinfo.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(user);
			out.close();
			fileOut.close();
			System.out.println("Object info saved!");
		
		
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//Deserialization
	/*	User user =null;
		FileInputStream fileIn;
		try {
			fileIn = new FileInputStream("userinfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.sayHello();
		*/
		
		//Timers and TimerTasks
		/*
		Timer timer1 = new Timer();
		TimerTask task1 = new TimerTask() {
			int counter=10;
			@Override
			public void run() {
				if(counter>0) {
				System.out.println(counter+" seconds");
					counter--;
				}else {
					System.out.println("0 seconds\nHappy new Year!");
					timer1.cancel();
					}
				}
			
		};
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2023);
		date.set(Calendar.MONTH, Calendar.MAY);
		date.set(Calendar.DAY_OF_MONTH,14);
		date.set(Calendar.HOUR_OF_DAY, 16);
		date.set(Calendar.MINUTE,13);
		date.set(Calendar.SECOND,0);
		date.set(Calendar.MILLISECOND,0);
		System.out.println(date.getTime());
		//timer1.schedule(task1, date.getTime());
		timer1.scheduleAtFixedRate(task1,0,1000);
		
		*/
		
		//threads
		
		/*
		System.out.println(Thread.activeCount());
		Thread.currentThread().setName("Thread1");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		MyThread thread2 = new MyThread();
		thread2.start();
		
		
		  for(int i=3;i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
			
		
		}
*/
		//Multithreading
		System.out.println(Runtime.getRuntime().availableProcessors());
		Thread.sleep(5000);
		MyThread thread1 = new MyThread(20,2);
		MyThread thread2 = new MyThread(10,1);
		MyThread2 runnable1 = new MyThread2(10,1);
		MyThread2 runnable2 = new MyThread2(10,1);
		MyThread2 runnable3 = new MyThread2(10,1);
		MyThread2 runnable4 = new MyThread2(10,1);
		MyThread2 runnable5 = new MyThread2(10,1);
		MyThread2 runnable6 = new MyThread2(10,1);
		Thread thread3 = new Thread(runnable1);
		Thread thread4 = new Thread(runnable2);
		Thread thread5 = new Thread(runnable3);
		Thread thread6 = new Thread(runnable4);
		Thread thread7 = new Thread(runnable5);
		Thread thread8 = new Thread(runnable6);
		MyThread thread9 = new MyThread(20,2);
		MyThread thread10 = new MyThread(10,1);
		MyThread thread11 = new MyThread(20,2);
		MyThread thread12 = new MyThread(10,1);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		thread11.start();
		thread11.join(1000);
		thread12.start();
		


		
	}

}
