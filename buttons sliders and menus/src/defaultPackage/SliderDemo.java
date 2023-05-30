package defaultPackage;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class SliderDemo implements ChangeListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	SliderDemo(){
		frame=new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,25);
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setFont(new Font("Arial", Font.PLAIN, 14));
		slider.setOrientation(SwingConstants.VERTICAL);
		
		slider.addChangeListener(this);
		
		label.setText("°C "+ slider.getValue());
		label.setFont(new Font("Arial", Font.PLAIN, 16));

		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(620,620);
		frame.setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C "+ slider.getValue());
		
	}

	
}
