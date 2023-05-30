package defaultPackage;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragImage extends JPanel {

	ImageIcon image1 = new ImageIcon("face.png");
	final int WIDTH = image1.getIconWidth();
	final int HEIGHT = image1.getIconHeight();
	Point imageCorner;
	Point prevPoint;
	
	DragImage(){
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();

		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);

		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image1.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());		

	}
	
	private class ClickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			prevPoint = e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currentPoint = e.getPoint();
			imageCorner.translate(
					(int)(currentPoint.getX()-prevPoint.getX()),
					(int)(currentPoint.getY()-prevPoint.getY())
					);
					prevPoint = currentPoint;
					repaint();
							
		}
	}
	}
