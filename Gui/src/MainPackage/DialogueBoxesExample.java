package MainPackage;

import javax.swing.JOptionPane;

public class DialogueBoxesExample {

	public static void main(String[] args) {
	//JOptionPane.showMessageDialog(null, "This is my Message", "This is the title", JOptionPane.PLAIN_MESSAGE);
	//JOptionPane.showMessageDialog(null, "This is my Message", "This is the title", JOptionPane.INFORMATION_MESSAGE);
	//JOptionPane.showMessageDialog(null, "This is my Message", "This is the title", JOptionPane.QUESTION_MESSAGE);
	//JOptionPane.showMessageDialog(null, "This is my Message", "This is the title", JOptionPane.WARNING_MESSAGE);
	//JOptionPane.showMessageDialog(null, "This is my Message", "This is the title", JOptionPane.ERROR_MESSAGE);
	
	int answer = JOptionPane.showConfirmDialog(null, "another message","Titles are useless", JOptionPane.YES_NO_CANCEL_OPTION);
	if(answer==1) {
		JOptionPane.showMessageDialog(null, "Well, Your PC will be destroyed", "This is the title", JOptionPane.ERROR_MESSAGE);
	}
	String[] responses = {"Male", "Female"};
	String answerName= JOptionPane.showInputDialog("what is your name");
	System.out.printf("Your name is %s",answerName);
	int sexValue=JOptionPane.showOptionDialog(null, "Choose Your Sex", "Title is good", answer, answer, null, responses, 0);
	//male 0, female 1
	String sex;
	if(sexValue==0) {
		sex="Male";
	}else {
		sex="Female";
	}
	JOptionPane.showOptionDialog(null, "Your character is:\n"+answerName+"\n a "+sex, answerName, answer, JOptionPane.PLAIN_MESSAGE, null, args, 0);
	MyFrame3 frame = new MyFrame3();
	}

}
//07:15:01