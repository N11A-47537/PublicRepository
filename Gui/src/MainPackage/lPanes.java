package MainPackage;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
public class lPanes {

	public static void main(String[] args) {
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640,640);
		frame.setLayout(null);
		frame.add(layeredPane);
		JLabel label1=new JLabel();
		JLabel label2=new JLabel();
		JLabel label3=new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.green);
		label1.setBounds(50,50,200,200);
		label2.setOpaque(true);
		label2.setBackground(Color.red);
		label2.setBounds(100,100,200,200);
		label3.setOpaque(true);
		label3.setBackground(Color.yellow);
		label3.setBounds(200,200,200,200);
		layeredPane.add(label1/*,JLayeredPane.DEFAULT_LAYER*/,Integer.valueOf(0));
		layeredPane.add(label2/*,JLayeredPane.DEFAULT_LAYER*/,Integer.valueOf(0));
		layeredPane.add(label3/*,JLayeredPane.DRAG_LAYER*/, Integer.valueOf(1));
		frame.setVisible(true);
		JButton button = new JButton();
		button.setBounds(100,100,250,100);
		frame.add(button);
		button.addActionListener(e -> new MyFrame2());
		button.addActionListener(e -> frame.dispose());
		button.setText("You wanna smash some buttons?");
	}

}
