package defaultPackage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;

//mouselistener tutorial



public class MyFrame2 extends JFrame implements MouseListener {
	JLabel label;
	
	MyFrame2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(500,500));
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		label.setPreferredSize(new Dimension(100,100));
		
		
		
		getContentPane().add(label);
		getContentPane().setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("clicked");
		label.setBackground(Color.green);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setBackground(Color.yellow);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println("released");
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("entered");
		label.setBackground(Color.pink);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setBackground(Color.red);
		
	}

}
