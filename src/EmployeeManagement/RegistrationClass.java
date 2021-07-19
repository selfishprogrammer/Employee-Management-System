package EmployeeManagement;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


class Reg extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5;
	JButton b1;
	JTextField t1,t2;
	JPasswordField p1;
	Container c;
	
	Reg(){
		setTitle("EMPLOYEE MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.GRAY);
		
		
		
		l1=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.RED);
		Font font=new Font("Arial",Font.ROMAN_BASELINE,40);	
		l1.setFont(font);
		c.add(l1);
		
		
		l2=new JLabel("REGISTRATION PAGE");
		l2.setBounds(250,70,900,50);
		l2.setForeground(Color.BLACK);
		
		l2.setFont(new Font("Arial",Font.ROMAN_BASELINE,40));
		c.add(l2);
		
		
		
		l4=new JLabel("EMAIL ID :");
		l4.setBounds(30,220,150,30);
		l4.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		c.add(l4);
		
		l4=new JLabel("PHONE NO :");
		l4.setBounds(30,380,180,30);
		l4.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		c.add(l4);
		
		l5=new JLabel("NAME :");
		l5.setBounds(30,300,150,30);
		l5.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		c.add(l5);
		
		
		t1=new JTextField();
		t1.setBounds(200,220,600,30);
		
		t1.setFont(new Font("Arial",Font.ROMAN_BASELINE,15));
		c.add(t1);
		
		
		

		p1=new JPasswordField();
		p1.setBounds(200,300,600,30);
		
		p1.setFont(new Font("Arial",Font.ROMAN_BASELINE,15));
		c.add(p1);
		
		
		t2=new JTextField();
		t2.setBounds(200,380,600,30);
		
		t2.setFont(new Font("Arial",Font.ROMAN_BASELINE,15));
		c.add(t2);
		
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		t1.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));


		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		t2.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		p1.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		b1=new JButton("SIGN IN");
		
		b1.setBounds(750,450,120,30);
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.BLACK);
		
		c.add(b1);
		b1.addActionListener(this);
		setVisible(true);	
		}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		Random random=new Random();
		long card3=(random.nextLong() % 9000000L)+ 1000L;
		long card4=Math.abs(card3);
			String a=t1.getText();
		String b=t2.getText();
		String c=p1.getText();
		
		try {
		DataBase db=new DataBase();
	
		
	
		
		String q="insert into login values('"+a+"','"+card4+"')";
		String q1="insert into registration values('"+a+"','"+b+"','"+c+"','"+card4+"')";
		
		db.s.executeUpdate(q);
		db.s.executeUpdate(q1);
		
		JOptionPane.showMessageDialog(null, "Your UserName :"+a+"/nPassword :"+card4);
		new Login().setVisible(true);
		setVisible(false);
	}catch(Exception e1) {
		e1.printStackTrace();
	}
	}
	
}
public class RegistrationClass {

	public static void main(String[] args) {
		
Reg rg= new Reg();
	}

}
