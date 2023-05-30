package MainPackage;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayouts {

	public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,500);
	frame.setLayout(new BorderLayout());
	
	MyPanel panel1 = new MyPanel(Color.red);
	MyPanel panel2 = new MyPanel(Color.black);
	MyPanel panel3 = new MyPanel(Color.white);
	MyPanel panel4 = new MyPanel(Color.green);
	MyPanel panel5 = new MyPanel(Color.orange);
	panel1.setPreferredSize(new Dimension(100,100));
	panel2.setPreferredSize(new Dimension(100,100));
	panel3.setPreferredSize(new Dimension(100,100));
	panel4.setPreferredSize(new Dimension(100,100));
	panel5.setPreferredSize(new Dimension(100,100));
	frame.add(panel1,BorderLayout.NORTH);
	frame.add(panel2,BorderLayout.SOUTH);
	frame.add(panel3,BorderLayout.EAST);
	frame.add(panel4,BorderLayout.WEST);
	frame.add(panel5,BorderLayout.CENTER);
	panel5.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
	panel5.add(new JButton("1"));
	panel5.add(new JButton("2"));
	panel5.add(new JButton("3"));
	panel5.add(new JButton("4"));
	panel5.add(new JButton("5"));
	panel5.add(new JButton("6"));
	panel5.add(new JButton("7"));
	panel5.add(new JButton("8"));
	panel5.add(new JButton("9"));
	

	
	
	frame.setVisible(true);
	}

	

}
