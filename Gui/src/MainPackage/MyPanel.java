package MainPackage;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
public class MyPanel extends JPanel {
	int widthstart;
	int heightstart;
	int widthend;
	int heightend;
	Color color;
	
MyPanel(Color color, int xstart, int ystart, int xend, int yend){
	//this.widthstart=xstart;
	//this.heightstart=ystart;
	//this.widthend=xend;				//dont need it but I had problem with creating this constructor so I did it in 2 steps
	//this.heightend=yend;
	//this.color=color;
	this.setBackground(color);
	this.setBounds(xstart,ystart,xend,yend);
}
MyPanel(Color color){

	this.setBackground(color);

}

}