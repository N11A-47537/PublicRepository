package defaultPackage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
//tutorial showed how to create menu and choose a file. I added the saving/loading functions and a text bar based on previous lessons
//so now this program can load a text file into a textbar, edit it and save it again to same or different textfile
//I would also probably use Switch instead of if/else if I had to do it again

public class MenuBarDemo extends JFrame implements ActionListener {

	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu helpMenu = new JMenu("Help");
	JLabel label = new JLabel();
	JButton button;
	JLabel label2;

	JMenuItem loadItem = new JMenuItem("Load");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	ImageIcon loadIcon = new ImageIcon("load.png");
	ImageIcon saveIcon = new ImageIcon("save.png");
	ImageIcon exitIcon = new ImageIcon("exit.png");

	JTextField textField;
	
	
	MenuBarDemo(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(400,70));
		this.add(textField);
		textField.setText("Type Your Input");
	
		JMenuBar menuBar = new JMenuBar();
		button = new JButton("set color");
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		button.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F);	//alt+f
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_Q);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		fileMenu.add(saveItem);
		fileMenu.add(loadItem);
		fileMenu.add(exitItem);
		label.setOpaque(true);
		label.setBackground(Color.green);
		label.setBounds(50,50,200,200);
		this.add(label);
		

		label2=new JLabel();
		label2.setOpaque(true);
		label2.setText("this is a text");
		label2.setFont(new Font("Arial", Font.BOLD,16));
		this.add(label2);
		this.add(button);
		this.setJMenuBar(menuBar);	//??
		this.setVisible(true);
	
		
	}
	
	
	
	@Override		
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem) {
			System.out.println("loading");
			label.setText("LOADING!");	
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			int response = fileChooser.showOpenDialog(null);
			if(response==JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());		
				System.out.println(file);
				try {
					FileReader reader = new FileReader(file);	//actually printing loaded file wasn`t in the tutorial but I tried it based on previous chapters
					int data = reader.read();
					String text="";
					while(data!=-1) {
						//System.out.print((char)data);
						text=text +(char)data;
						data = reader.read();
					}
					reader.close();
					System.out.println(text);
					//label.setText(text);		//this wasnt in the tutorial. I could add some formatting to this.
					textField.setText(text);
					}
				catch(FileNotFoundException a) {
					a.printStackTrace();
				} catch (IOException a) {
					
					a.printStackTrace();
				}

			}
			
		} else if(e.getSource()==saveItem) {
			System.out.println("saving");
			label.setText("SAVING!");
			
			try {		
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("."));
				int response = fileChooser.showOpenDialog(null);
				if(response==JFileChooser.APPROVE_OPTION) {
				
				String path = fileChooser.getSelectedFile().getAbsolutePath();
				System.out.println(path);
				FileWriter writer = new FileWriter(path);
				writer.write(textField.getText());

					writer.close();
				} 
				}catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				
			
		} else if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);
			label2.setForeground(color);
		}
		else {
			System.exit(0);
		}
		
	}

}
