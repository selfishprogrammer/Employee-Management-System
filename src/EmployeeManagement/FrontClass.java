package EmployeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;


class Front extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JButton b1,b2;
	Container c;
	
	Front(){
		setTitle("EMPLOYEE MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.WHITE);
		
		
		
		l1=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.RED);
		Font font=new Font("Arial",Font.ROMAN_BASELINE,40);	
		l1.setFont(font);
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\employee2.jpg");
		Image img=image.getImage().getScaledInstance(1200,700,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		
		l2=new JLabel(img1);
		l2.setBounds(0,70,885,500);
		
		ImageIcon image2=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\iconemp.png");
		Image img2=image2.getImage().getScaledInstance(100,100,  Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2); 
		
		l3=new JLabel(img3);
		l3.setBounds(-1,0,105,70);
		
		
		b1=new JButton("LOGIN");
		b1.setBounds(788,0,100,70);
		b1.setBackground(Color.LIGHT_GRAY);
		c.add(b1);
		c.add(l3);
		c.add(l2);
		c.add(l1);
		
		b1.addActionListener(this);
		
		setVisible(true);
		while(true){
			l1.setVisible(false);
			try {
				Thread.sleep(1000);
			}catch(Exception e1) {}
			l1.setVisible(true);
			try {
				Thread.sleep(1000);
			}catch(Exception e1) {}
			
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	try {
		DataBase db=new DataBase();
			new Login().setVisible(true);
	setVisible(false);
	}catch(Exception e1) {
	
	}
	
		
	}
}

public class FrontClass {

	public static void main(String[] args) {
		Front fr=new Front();

	}

}
