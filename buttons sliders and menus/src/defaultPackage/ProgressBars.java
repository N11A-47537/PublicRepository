package defaultPackage;
import java.awt.*;
import javax.swing.*;
public class ProgressBars {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	

	ProgressBars(){
		
		bar.setValue(0);
		bar.setBounds(10,10,390,60);
		bar.setFont(new Font("Arial", Font.BOLD, 18));
		bar.setForeground(Color.ORANGE);
		bar.setBackground(Color.black);
		frame.add(bar);
		bar.setStringPainted(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
	}
	
	ProgressBars(Color color, int max, int min, int pacing){

		bar.setValue(max);
		bar.setBounds(10,10,max,60);
		bar.setFont(new Font("Arial", Font.BOLD, 18));
		bar.setForeground(color);
		bar.setBackground(Color.black);
		frame.add(bar);
		bar.setStringPainted(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill(pacing, max, min);
		
	}
	
	public void fill() {
		int counter=0;
		while(counter<=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter+=4;//!
		}
		bar.setString("You have hacked the Government!");
		
	}
	public void fill(int pace, int max, int min) {
		int counter=max;
		while(counter>=min) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter-=pace;
		}
		bar.setString("You died");
		
	}
	
}
