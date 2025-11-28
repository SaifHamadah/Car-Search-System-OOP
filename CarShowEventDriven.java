package CarShowEventDriven;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CarShowEventDriven {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Car Show");
		frame1.setLayout(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(900,800);
		JLabel label1 = new JLabel("Welcome to the car show please fill the fields with your dream car options");
		label1.setBounds(180, 5, 500, 50);
		frame1.add(label1);
		
		JLabel label2 = new JLabel("Brand");
		label2.setBounds(30, 50, 500, 50);
		frame1.add(label2);
		String c1 [] = {"Mercedes-Benz","BMW","Lexus"};
		JComboBox combo1 = new JComboBox(c1);
		combo1.setBounds(300, 50, 100, 30);
		combo1.setSelectedIndex(1);
		frame1.add(combo1);
		
		JLabel label3 = new JLabel("Model");
		label3.setBounds(30, 100, 500, 50);
		frame1.add(label3);
		JTextField text1 = new JTextField();
		text1.setBounds(300, 100, 100, 30);
		frame1.add(text1);
		
		JLabel label4 = new JLabel("color");
		label4.setBounds(30, 150, 500, 50);
		frame1.add(label4);
		String c2 [] = {"Black","White","Red","Grey","Green","Brown","Silver"};
		JComboBox combo2 = new JComboBox(c2);
		combo2.setBounds(300, 150, 100, 30);
		combo2.setSelectedIndex(0);
		frame1.add(combo2);
		
		JLabel label5 = new JLabel("Top Speed");
		label5.setBounds(30, 200, 500, 50);
		frame1.add(label5);
		JTextField text2 = new JTextField();
		text2.setBounds(300, 200, 100, 30);
		frame1.add(text2);
		
		JLabel label6 = new JLabel("Engine Capacity");
		label6.setBounds(30, 250, 500, 50);
		frame1.add(label6);
		JTextField text3 = new JTextField();
		text3.setBounds(300, 250, 100, 30);
		frame1.add(text3);
		
		JLabel label7 = new JLabel("Engine Horse Power");
		label7.setBounds(30, 300, 500, 50);
		frame1.add(label7);
		JTextField text4 = new JTextField();
		text4.setBounds(300, 300, 100, 30);
		frame1.add(text4);
		
		JLabel label8 = new JLabel("Fuel Type");
		label8.setBounds(30, 350, 500, 50);
		frame1.add(label8);
		JCheckBox check1 = new JCheckBox("90");
		check1.setBounds(300, 350, 50, 30);
		frame1.add(check1);
		JCheckBox check2 = new JCheckBox("95");
		check2.setBounds(350, 350, 100, 30);
		frame1.add(check2);
		
		JLabel label9 = new JLabel("Type of Transmission");
		label9.setBounds(30, 400, 500, 50);
		frame1.add(label9);
		String c3 [] = {"Automatic","Manual"};
		JComboBox combo3 = new JComboBox(c3);
		combo3.setBounds(300, 400, 100, 30);
		combo3.setSelectedIndex(1);
		frame1.add(combo3);
		
		JLabel label10 = new JLabel("Manufacter name of the transmission");
		label10.setBounds(30, 450, 500, 50);
		frame1.add(label10);
		JRadioButton radio1 = new JRadioButton("ZF");
		JRadioButton radio2 = new JRadioButton("PDK");
		JRadioButton radio3 = new JRadioButton("CVT");
		ButtonGroup r123 = new ButtonGroup();
		r123.add(radio1);r123.add(radio2);r123.add(radio3);
		radio1.setBounds(300, 450, 100, 50);
		radio2.setBounds(400, 450, 100, 50);
		radio3.setBounds(500, 450, 100, 50);
		frame1.add(radio1);
		frame1.add(radio2);
		frame1.add(radio3);
		
		
				
		
		
		JLabel label11 = new JLabel("Speeds of the transmission");
		label11.setBounds(30, 500, 500, 50);
		frame1.add(label11);
		String c4 [] = {"1","4","5","6","7","8","9","10"};
		JComboBox combo4 = new JComboBox(c4);
		combo4.setBounds(300, 500, 100, 30);
		combo4.setSelectedIndex(2);
		frame1.add(combo4);
		
		JLabel label12 = new JLabel("Car Class");
		label12.setBounds(30, 550, 500, 50);
		frame1.add(label12);
		String c5 [] = {"Sedan","SUV","Coupe"};
		JComboBox combo5 = new JComboBox(c5);
		combo5.setBounds(300, 550, 100, 30);
		combo5.setSelectedIndex(1);
		frame1.add(combo5);
		
		JLabel label13 = new JLabel("Number of doors");
		label13.setBounds(30, 600, 500, 50);
		frame1.add(label13);
		String c6 [] = {"2","4","5"};
		JComboBox combo6 = new JComboBox(c6);
		combo6.setBounds(300, 600, 100, 30);
		combo6.setSelectedIndex(2);
		frame1.add(combo6);
		
		JLabel label14 = new JLabel("Number of seats");
		label14.setBounds(30, 650, 500, 50);
		frame1.add(label14);
		String c7 [] = {"2","4","5","7","8"};
		JComboBox combo7 = new JComboBox(c7);
		combo7.setBounds(300, 650, 100, 30);
		combo7.setSelectedIndex(2);
		frame1.add(combo7);
		
		JButton button1 = new JButton("Print");
		button1.setBounds(350, 700, 100, 40);
		frame1.add(button1);
		
		button1.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String info = "";
				info = "The brand is : "+combo1.getSelectedItem().toString()+"\n";
				info =info+ "The model of the "+combo1.getSelectedItem().toString()+" is : "+text1.getText()+"\n";
				info=info+ " The color is : "+combo2.getSelectedItem().toString()+"\n";
				info =info+ "Top Speed is : "+text2.getText()+"\n";
				info = info+"The engine Capacity : "+text3.getText()+"\n";
				info = info+"The engine horse power : "+text4.getText()+"\n";
				if(check1.isSelected())
					info = info +"The fuel type : 90"+"\n";
				if(check2.isSelected())
					info = info +"The fuel type : 95"+"\n";
				info = info+"The type of transmission : "+combo3.getSelectedItem().toString()+"\n";
				if(radio1.isSelected())
					info = info + "Manufacter name of the transmission : ZF"+"\n";
				else if(radio2.isSelected())
					info = info +"Manufacter name of the transmission : PDK"+"\n";
				else
					info = info+"Manufacter name of the transmission : CVT"+"\n";
				info = info +"Speeds of the transmission : "+combo4.getSelectedItem().toString()+"\n";
				info = info + "Class of car : "+combo5.getSelectedItem().toString()+"\n";
				info = info+"Number of Doors : "+combo6.getSelectedItem().toString()+"\n";
				info = info+"Number of Seats : "+combo7.getSelectedItem().toString()+"\n";
				
				
				JOptionPane.showMessageDialog(null, info,"Selected Car", JOptionPane.INFORMATION_MESSAGE);
				
				}
			
				});
		
		
		frame1.setVisible(true);
	}

}
