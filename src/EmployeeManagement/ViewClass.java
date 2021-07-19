package EmployeeManagement;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class view extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JButton b1,b2;
	Container c;
	
	view(){
		setTitle("EMPLOYEE MANAGEMENT");
		setBounds(100,100,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.GRAY);
		
		
		
		l1=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		l1.setBounds(100,10,350,50);
		l1.setForeground(Color.RED);
		Font font=new Font("Arial",Font.ROMAN_BASELINE,20);	
		l1.setFont(font);
		c.add(l1);
		
		

		l2=new JLabel("FIND EMPLOYEE");
		l2.setBounds(190,70,350,50);
		l2.setForeground(Color.MAGENTA);
		
		l2.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		c.add(l2);
		
		t1=new JTextField();
		t1.setBounds(220,160,200,30);
		
		t1.setFont(new Font("Arial",Font.ROMAN_BASELINE,15));
		c.add(t1);
		
		
		b1=new JButton("SUBMIT");
		b1.setBounds(170,210,100,30);
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.BLACK);
		c.add(b1);
		
		l3=new JLabel("EMPLOYEE ID :")	;	
		l3.setBounds(60,150,200,50);
		l3.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l3);
		
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\employee4.jpg");
		Image img=image.getImage().getScaledInstance(500,300,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		l4=new JLabel(img1);
		l4.setBounds(0,0,500,300);
		c.add(l4);
		b1.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a=t1.getText();
		
		try {
			DataBase db=new DataBase();
			
			String q="select * from addemp where eid ='"+a+"'";
			ResultSet rs=db.s.executeQuery(q);
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, "Your Data Is Selected and Inserted");
				new print(t1.getText()).setVisible(true);
				setVisible(false);
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
public class ViewClass {

	public static void main(String[] args) {
		 view v= new view();

	}

}
