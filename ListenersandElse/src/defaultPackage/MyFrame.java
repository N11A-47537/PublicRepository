package defaultPackage;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
//keylistener Tutorial
public class MyFrame extends JFrame implements KeyListener {
	ImageIcon icon;
	JLabel label;
	int speed=10;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		this.getContentPane().setBackground(Color.GRAY);
		label=new JLabel();
		label.setBounds(0,0,50,50);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		
		icon = new ImageIcon("face.png");
		label.setIcon(icon);
		
		this.add(label);
		this.setVisible(true);
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {		
		//System.out.println("keyTyped "+e.getKeyChar());	//prints the key pressed
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-speed,label.getY());
		break;
		case 'd': label.setLocation(label.getX()+speed,label.getY());
		break;
		case 'w': label.setLocation(label.getX(),label.getY()-speed);
		break;
		case 's': label.setLocation(label.getX(),label.getY()+speed);
		break;
		
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {		//int output
		//System.out.println("button pressed "+e.getKeyChar());
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-speed,label.getY());
		break;
		case 39: label.setLocation(label.getX()+speed,label.getY());
		break;
		case 38: label.setLocation(label.getX(),label.getY()-speed);
		break;
		case 40: label.setLocation(label.getX(),label.getY()+speed);
		break;
	}
	}
	@Override
	public void keyReleased(KeyEvent e) {		//called when button is released
		//System.out.println("button released "+e.getKeyChar());
		
	}
}
