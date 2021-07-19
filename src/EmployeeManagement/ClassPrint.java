package EmployeeManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

class print extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;
	String na,fa,em,dob,gend,addr,emid,jp,ad,ph;
	Container c;
	JButton b1,b2;

	print(String emp){
		

		setTitle("EMPLOYEE MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.WHITE);
		
		
		
		l1=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.BLACK);
		Font font=new Font("Arial",Font.ROMAN_BASELINE,40);	
		l1.setFont(font);
		c.add(l1);
		l2=new JLabel("ADD NEW EMPLOYEE");
		l2.setBounds(250,70,900,50);
		l2.setForeground(Color.BLACK);
		
		l2.setFont(new Font("Arial",Font.ROMAN_BASELINE,40));
		c.add(l2);
		l4=new JLabel("NAME :");
		l5=new JLabel("EMAIL ID :");
		l6=new JLabel("S/O :");
		l7=new JLabel("DATE OF BIRTH :");
		l8=new JLabel("GENDER :");
		l9=new JLabel("ADDRESS :");
		l10=new JLabel("EMLOYEE ID :");
		l11=new JLabel("JOB PROFESSION :");
		l12=new JLabel("AADHAR CARD :");
		l13=new JLabel("PHONE:");
		
		try {
			
			DataBase db=new DataBase();
			String q="select * from addemp where eid='"+emp+"'";
			
			ResultSet rs=db.s.executeQuery(q);
			
			while(rs.next()) {
				
				na=rs.getString("name");
				em=rs.getString("email");
				fa=rs.getString("fname");
				dob=rs.getString("dob");
				gend=rs.getString("gender");
				addr=rs.getString("address");
				emid=rs.getString("eid");
				jp=rs.getString("job");
				ad=rs.getString("adhar");
				ph=rs.getString("phone");
				
			}
				
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}	
l4.setBounds(20,150,130,30);
		
		l4.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l4);
		
		
l5.setBounds(20,190,130,30);
		
		l5.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l5);
		
		
l6.setBounds(20,230,130,30);
		
		l6.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l6);
		
		
l7.setBounds(20,270,180,30);
		
		l7.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l7);
		
		
l8.setBounds(20,310,130,30);
		
		l8.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l8);
		
		
l9.setBounds(490,150,130,30);
		
		l9.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l9);
		
		
l10.setBounds(490,190,180,30);
		
		l10.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l10);
		
		
l11.setBounds(490,230,210,30);
		
		l11.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l11);
		
		
l12.setBounds(490,270,180,30);
		
		l12.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l12);
		
		
l13.setBounds(490,310,130,30);
		
		l13.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l13);
		
		
		l14=new JLabel(na);
		l14.setBounds(190,150,200,30);
		l14.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l14);
				
		
		l15=new JLabel(em);
		l15.setBounds(190,190,200,30);
		l15.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l15);
		
		
		l16=new JLabel(fa);
		l16.setBounds(190,230,200,30);
		l16.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l16);
		
		
		
		l17=new JLabel(dob);
		l17.setBounds(190,270,200,30);
		l17.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l17);
		
		
		
		l18=new JLabel(gend);
		l18.setBounds(190,310,200,30);
		l18.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l18);
		
		
		
		l19=new JLabel(addr);
		l19.setBounds(680,150,200,30);
		l19.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l19);
		
		
		
		
		l20=new JLabel(emid);
		l20.setBounds(680,190,200,30);
		l20.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l20);
		
		
		l21=new JLabel(jp);
		l21.setBounds(680,230,200,30);
		l21.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l21);
		
		l22=new JLabel(ad);
		l22.setBounds(680,270,200,30);
		l22.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l22);
		
		
		
		l23=new JLabel(ph);
		l23.setBounds(680,310,200,30);
		l23.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(l23);
		
		b1=new JButton("PRINT");
		b1.setBounds(280,380,100,30);
		c.add(b1);
		
		
		b2=new JButton("CANCEL");
		b2.setBounds(480,380,100,30);
		c.add(b2);
		
		
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	setVisible(true);
		
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1) {		
	
	JOptionPane.showMessageDialog(null, "Printed Successfully");
	new Menu().setVisible(true);
	setVisible(false);
}

if(e.getSource()==b2) {
	new Add().setVisible(true);
	setVisible(false);
}
	}
}
public class ClassPrint {

	public static void main(String[] args) {
	print p=new print("emp");
	}

}
