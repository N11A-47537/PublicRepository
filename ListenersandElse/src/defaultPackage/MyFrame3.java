package defaultPackage;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


//drag and drop tutorial

public class MyFrame3 extends JFrame {

	DragImage dragImage1 = new DragImage();
	MyFrame3(){
		this.setTitle("Drag & Drop Demo");
		this.setSize(640,640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(dragImage1);

		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
	
	
}
