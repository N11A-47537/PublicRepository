package defaultPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon=new ImageIcon("pizza.png");
		hamburgerIcon=new ImageIcon("hamburger.png");
		hotdogIcon=new ImageIcon("hotdog.png");
		
		ButtonGroup group1=new ButtonGroup();
		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		hotdogButton = new JRadioButton("HotDog");
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		group1.add(pizzaButton);
		group1.add(hamburgerButton);
		group1.add(hotdogButton);
		this.add(hotdogButton);
		this.add(hamburgerButton);
		this.add(pizzaButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered Pizza");
		} else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered Hamurger");
		} else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered Hotdog");
		
	} else {}
	}
}
