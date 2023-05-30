package MainPackage;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JPanel;


public class Panels {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		//JPanel redPanel = new JPanel();
		//redPanel.setBackground(Color.red);
		//redPanel.setBounds(0,0,250,250);
		//frame.add(redPanel);
		
		MyPanel panel1 = new MyPanel(Color.red, 0,0,125,125); 
		MyPanel panel2 = new MyPanel(Color.black, 125,0,125,125); 
		MyPanel panel3 = new MyPanel(Color.green, 0,125,350,350); 
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		JLabel label = new JLabel("Hi");
		ImageIcon image1 = new ImageIcon("thumbs.png");
		label.setIcon(image1);
		panel3.add(label);
		panel3.setLayout(new BorderLayout());
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(250,25,840,800);

		

	}

}
