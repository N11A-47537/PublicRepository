package defaultPackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener{

	JComboBox comboBox;
	
	MyFrame2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		String[] animals = {"dog", "cat", "bird"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		//comboBox.setEditable(false);
		//comboBox.addItem("lion");
		comboBox.insertItemAt("Human",0);
		comboBox.setSelectedIndex(0);
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
		
	}
}
