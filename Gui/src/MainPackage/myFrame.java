package MainPackage;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame{

	
	MyFrame(){
		

	this.setVisible(true);
	this.setSize(1240, 1240);
	this.setTitle("JFrame Tutorial");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(true);
	ImageIcon image = new ImageIcon("zdjecie.jpg");
	this.setIconImage(image.getImage());
	this.getContentPane().setBackground( new Color(0, 128, 108));
	
	}	
}
