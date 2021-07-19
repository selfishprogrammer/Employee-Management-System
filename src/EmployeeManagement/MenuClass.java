package EmployeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Menu extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3,b4;
	
	Container c;
	
	
	Menu(){
		setTitle("EMPLOYEE MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.BLACK);
		
		
		
		l1=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.RED);
		Font font=new Font("Arial",Font.ROMAN_BASELINE,40);	
		l1.setFont(font);
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\iconreal.jpg");
		Image img=image.getImage().getScaledInstance(200,200,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		l2=new JLabel(img1);
		l2.setBounds(0,160,200,200);
		l7=new JLabel("DETAILS");
		l7.setBounds(350,70,900,50);
		l7.setForeground(Color.GRAY);
		
		l2.setFont(new Font("Arial",Font.ROMAN_BASELINE,40));
		c.add(l2);
		l7.setFont(new Font("Arial",Font.ROMAN_BASELINE,40));
		ImageIcon image1=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\iconreal.jpg");
		Image img2=image1.getImage().getScaledInstance(200,200,  Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2); 
		l3=new JLabel(img3);
		l3.setBounds(227,160,200,200);
		
		ImageIcon image2=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\iconreal.jpg");
		Image img4=image2.getImage().getScaledInstance(200,200,  Image.SCALE_DEFAULT);
		ImageIcon img5=new ImageIcon(img4); 
		l4=new JLabel(img5);
		l4.setBounds(454,160,200,200);
		
		ImageIcon image3=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\iconreal.jpg");
		Image img6=image3.getImage().getScaledInstance(200,200,  Image.SCALE_DEFAULT);
		ImageIcon img7=new ImageIcon(img6); 
		l5=new JLabel(img7);
		l5.setBounds(681,160,200,200);
		
		
		b1=new JButton("ADD NEW");
		b2=new JButton ("UPDATE");
		b3=new JButton ("DELETE");
		b4=new JButton ("VIEW");
		
		b1.setBounds(0,380,200,30);
		b2.setBounds(227,380,200,30);
		b3.setBounds(454,380,200,30);
		b4.setBounds(681,380,200,30);
		
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);		
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(l5);
		c.add(l4);
		c.add(l3);
		c.add(l2);
		c.add(l1);
		c.add(l7);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setVisible(true);
		
		
		
		
		
//		while(true){
//			l1.setVisible(false);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e1) {}
//			l1.setVisible(true);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e1) {}
//			
//		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			new Add().setVisible(true);
			setVisible(false);
		}
		
		
		else if(e.getSource()==b2) {
			new update().setVisible(true);
			setVisible(false);
		}
		
		
		else if(e.getSource()==b3) {
			new remove().setVisible(true);
			setVisible(false);
		}
	else if(e.getSource()==b4) {
		new view().setVisible(true);
		setVisible(false);
		}
	}
}


public class MenuClass {
	
	


	public static void main(String[] args) {
		
Menu m=new Menu();
	}

}
