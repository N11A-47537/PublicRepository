package MainPackage;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame /*implements ActionListener*/{

	JButton button;
	MyFrame2(){
		

	this.setVisible(true);
	this.setSize(680, 680);
	this.setTitle("Pushing Button tutorial");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(true);
	this.setLayout(null);
	ImageIcon image = new ImageIcon("zdjecie.jpg");
	this.setIconImage(image.getImage());
	this.getContentPane().setBackground( new Color(0, 128, 108));
	JButton button = new JButton();
	button.setBounds(100,100,250,100);
	button.addActionListener(e -> System.out.println("buttonSmasher!"));
	button.setText("You wanna smash some buttons?");
	//button.setFocusable(false);
	button.setBackground(Color.lightGray);
	this.add(button);
	//button.setEnabled(false);
	
	}

	//@Override
	/*public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
	System.out.println("haha You are a buttonsmasher!");
*/	
		
	}	

