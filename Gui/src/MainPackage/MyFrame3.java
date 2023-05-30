package MainPackage;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
public class MyFrame3 extends JFrame implements ActionListener {
JButton button;
JTextField textField;
JCheckBox checkBox;
MyFrame3(){
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
button = new JButton("submit");
button.addActionListener(this);
textField = new JTextField();
textField.setPreferredSize(new Dimension(400,70));
this.add(textField);
textField.setText("Type Your Input");
this.add(button);
checkBox = new JCheckBox("ok");
this.add(checkBox);
checkBox.setFocusable(false);
this.pack();
this.setVisible(true);

//checkBox.setIcon(object of ImageIcon)
//checBox.setSelectedIcon(object of ImageIcon)


	//07:35:34

}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
		System.out.println("Your Input is: "+textField.getText());
		System.out.println(checkBox.isSelected());
		textField.setEditable(false);
		button.setEnabled(false);

	}
	
	
}
}