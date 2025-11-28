package carShowSystemEvent;
import javax.swing.*;		//swing library
import java.awt.*;			//awt library
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class carShowSystemEvent {

	public static void main(String[] args) {
	
		JFrame frame1 = new JFrame("Car Show System");		//the frame and the title
		frame1.setLayout(null);		//we don't want the default layout
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//to make the behavior on the close operation
		frame1.setSize(900,800);		//the size of the frame
		
		
		JLabel label1 = new JLabel("Welcome to the car show system please fill the fields with the car that you are looking for");
		label1.setBounds(180, 5, 500, 50);		//for the size
		frame1.add(label1);						//add the object to the frame
		
		//Font f = new Font("Times New Roman", Font.BOLD, 24);  //to adjust the font
		JLabel label2 = new JLabel("Brand");
		label2.setBounds(30, 50, 500, 50);
		//label1.setFont(f);
		frame1.add(label2);		//add the object to the frame
		JTextField text1 = new JTextField();
		text1.setBounds(300, 50, 100, 30);
		frame1.add(text1);		//add the object to the frame
		
		
		JLabel label3 = new JLabel("Model");
		label3.setBounds(30, 100, 500, 50);
		frame1.add(label3);		//add the object to the frame
		JTextField text2 = new JTextField();
		text2.setBounds(300, 100, 100, 30);
		frame1.add(text2);		//add the object to the frame
		
		
		JLabel label4 = new JLabel("color");
		label4.setBounds(30, 150, 500, 50);
		frame1.add(label4);		//add the object to the frame
		String c1 [] = {"Black","White","Red","Grey","Green","Brown","Silver"};	//string for elements in the combo box
		JComboBox combo1 = new JComboBox(c1);
		combo1.setBounds(300, 150, 100, 30);
		combo1.setSelectedIndex(0);		//the element that we want to be visible on the combo box before we click on it
		frame1.add(combo1);		//add the object to the frame
		
		
		JLabel label5 = new JLabel("Year");
		label5.setBounds(30, 200, 500, 50);
		frame1.add(label5);		//add the object to the frame
		JTextField text3 = new JTextField();
		text3.setBounds(300, 200, 100, 30);
		frame1.add(text3);		//add the object to the frame
		
		
		JLabel label6 = new JLabel("Fuel Type");
		label6.setBounds(30, 250, 500, 50);
		frame1.add(label6);		//add the object to the frame
		JCheckBox check1 = new JCheckBox("90");
		check1.setBounds(300, 250, 50, 30);
		frame1.add(check1);		//add the object to the frame
		JCheckBox check2 = new JCheckBox("95");
		check2.setBounds(350, 250, 100, 30);
		frame1.add(check2);		//add the object to the frame
		
		
		JLabel label7 = new JLabel("Top Speed");
		label7.setBounds(30, 300, 500, 50);
		frame1.add(label7);		//add the object to the frame
		JTextField text4 = new JTextField();
		text4.setBounds(300, 300, 100, 30);
		frame1.add(text4);		//add the object to the frame
		JLabel mes1 = new JLabel("Km/h");
		mes1.setBounds(410, 300, 50, 30);
		frame1.add(mes1);		//add the object to the frame
		
		
		JLabel label8 = new JLabel("Transmission Type");
		label8.setBounds(30, 350, 500, 50);
		frame1.add(label8);		//add the object to the frame
		JRadioButton radio1 = new JRadioButton("Automatic");
		JRadioButton radio2 = new JRadioButton("Manual");
		JRadioButton radio3 = new JRadioButton("CVT");
		ButtonGroup r123 = new ButtonGroup();					//add the radio buttons on a group button
		r123.add(radio1);r123.add(radio2);r123.add(radio3);		//to mark only one radio
		radio1.setBounds(300, 350, 100, 50);
		radio2.setBounds(400, 350, 100, 50);
		radio3.setBounds(500, 350, 100, 50);
		frame1.add(radio1);		//add the object to the frame
		frame1.add(radio2);		//add the object to the frame
		frame1.add(radio3);		//add the object to the frame
		
		
		JLabel label9 = new JLabel("Engine Capacity");
		label9.setBounds(30, 400, 500, 50);
		frame1.add(label9);		//add the object to the frame
		JTextField text5 = new JTextField();
		text5.setBounds(300, 400, 100, 30);
		frame1.add(text5);		//add the object to the frame
		JLabel mes2 = new JLabel("cc");		//the unit
		mes2.setBounds(410, 400, 50, 30);
		frame1.add(mes2);		//add the object to the frame
		
		
		JLabel label10 = new JLabel("Engine HorsePower");
		label10.setBounds(30, 450, 500, 50);
		frame1.add(label10);		//add the object to the frame
		JTextField text6 = new JTextField();
		text6.setBounds(300, 450, 100, 30);
		frame1.add(text6);			//add the object to the frame
		JLabel mes3 = new JLabel("hp");		//the unit
		mes3.setBounds(410, 450, 50, 30);
		frame1.add(mes3);			//add the object to the frame
		
		
		JLabel label11 = new JLabel("Behavior");
		label11.setBounds(30, 500, 500, 50);
		frame1.add(label11);		//add the object to the frame
		JCheckBox check3 = new JCheckBox("Street Car");
		check3.setBounds(300, 500, 100, 30);
		frame1.add(check3);			//add the object to the frame
		JCheckBox check4 = new JCheckBox("Offroad Car");
		check4.setBounds(400, 500, 100, 30);
		frame1.add(check4);			//add the object to the frame
		
		
		JLabel label12 = new JLabel("Drive Type");
		label12.setBounds(30, 550, 500, 50);
		frame1.add(label12);		//add the object to the frame
		JRadioButton radio4 = new JRadioButton("Rear Wheel");
		JRadioButton radio5 = new JRadioButton("Front Wheel");
		JRadioButton radio6 = new JRadioButton("4-WD");
		ButtonGroup r456 = new ButtonGroup();				//add the radio buttons on a group button
		r456.add(radio4);r456.add(radio5);r456.add(radio6);	//to mark only one radio
		radio4.setBounds(300, 550, 100, 50);
		radio5.setBounds(400, 550, 100, 50);
		radio6.setBounds(500, 550, 100, 50);
		frame1.add(radio4);		//add the object to the frame
		frame1.add(radio5);		//add the object to the frame
		frame1.add(radio6);		//add the object to the frame
		
		JLabel label13 = new JLabel("Height");
		label13.setBounds(30, 600, 500, 50);
		frame1.add(label13);		//add the object to the frame
		JTextField text7 = new JTextField();
		text7.setBounds(300, 600, 100, 30);
		frame1.add(text7);			//add the object to the frame
		
		
		JButton button1 = new JButton("Print");	//the button object
		button1.setBounds(350, 700, 100, 40);
		frame1.add(button1);		//add the object to the frame
		
		
		button1.addActionListener(new ActionListener()		//the action listener for button1
				{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String info = "";		//getting the data from the objects and store them in a string to print them when we press the button
				info = "The brand is : "+text1.getText()+"\n";		//getting the text from text1 field
				info =info+ "The model of the "+text1.getText()+" is : "+text2.getText()+"\n";
				info=info+ " The year : "+text3.getText()+"\n";
				info=info+ " The color is : "+combo1.getSelectedItem().toString()+"\n";		//getting the selected item in combo1
				info = info + "Fuel Type : ";
				
				if(check1.isSelected())		//statement for the check box to get the selected item
					info = info +"90"+"\n";
				if(check2.isSelected())
					info = info +"95"+"\n";
				
				info =info+ "Top Speed is : "+text4.getText()+"\n";
				
				if(radio1.isSelected())		//statement for the radio button to get the selected item
					info = info + "Transmission Type : Automatic"+"\n";
				else if(radio2.isSelected())
					info = info + "Transmission Type : Manual"+"\n";
				else
					info = info + "Transmission Type : CVT"+"\n";
				
				info = info+"Eengine Capacity : "+text5.getText()+"\n";
				info = info+"Engine horse power : "+text6.getText()+"\n";
				info = info+"Behavior : ";
				
				if(check3.isSelected())		//statement for the check box to get the selected item
					info = info + "Street Car"+"\n";
				if(check4.isSelected())
					info = info + "Offroad car"+"\n";
				
				
				if(radio4.isSelected())		//statement for the radio button to get the selected item
					info = info + "Drive Type : Rear-WD"+"\n";
				else if(radio5.isSelected())
					info = info + "Drive Type : Front-WD"+"\n";
				else
					info = info + "Drive Type : 4-WD"+"\n";
				
				
				info = info + "Height : "+text7.getText()+"\n";
				
				JOptionPane.showMessageDialog(null, info,"Selected Car", JOptionPane.INFORMATION_MESSAGE);	//to show the message dialog for what we select
				
					
					
				
				
				
				
				
				
				
				
				
			}
			});
		
		
		
		
		
		
		frame1.setVisible(true);}		//to make the frame visible
	}


