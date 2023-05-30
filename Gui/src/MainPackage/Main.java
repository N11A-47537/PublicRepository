package MainPackage;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
	/*JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(420,420);
	frame.setTitle("JFrame Tutorial");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	ImageIcon image = new ImageIcon("zdjecie.jpg");
	frame.setIconImage(image.getImage());
	frame.getContentPane().setBackground( new Color(0, 128, 108));
	*/
		
	//MyFrame myFrame = new MyFrame();
	MyFrame frame = new MyFrame(); //or new MYFrame();
	//Labes
	
	JLabel label = new JLabel("This is the first Label");
	ImageIcon image1 = new ImageIcon("zdjecie3.jpg");
	//or label.setText("trololo");
	Border border = BorderFactory.createLineBorder(Color.green,3);
	//MyPanel panel1 = new MyPanel(Color.black, 50,25,250,250);
	frame.add(label);
	//frame.setLayout(null);
	//label.setBounds(250,25,840,800);
	label.setIcon(image1);
	label.setHorizontalTextPosition(JLabel.CENTER);//left/center/right
	label.setVerticalTextPosition(JLabel.BOTTOM);//top/cente.bottom
	label.setForeground(new Color(255,0,120));
	label.setFont(new Font("MV Boli", Font.PLAIN,20));
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setIconTextGap(0);
	label.setBackground(Color.black);
	label.setOpaque(true);
	label.setBorder(border);
	//frame.add(panel1);
	frame.pack();
	//panels
	// See class Panels.java for Panelsexample
	
	
	}

}
