package EmployeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class update extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JButton b1,b2,b3;

	Container c;
	update(){
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
	c.add(l1);
	
	
	l2=new JLabel("ADD NEW EMPLOYEE");
	l2.setBounds(250,70,900,50);
	l2.setForeground(Color.MAGENTA);
	
	l2.setFont(new Font("Arial",Font.ROMAN_BASELINE,40));
	c.add(l2);
	
	
	
	ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\employee2.jpg");
	Image img=image.getImage().getScaledInstance(1200,700,  Image.SCALE_DEFAULT);
	ImageIcon img1=new ImageIcon(img); 
	l3=new JLabel(img1);
	l3.setBounds(0,0,900,600);
	
	l15=new JLabel("EMPLOYEE ID  :");
	l15.setBounds(200,200,230,30);
	
	l15.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l15);
	
	b3=new JButton("SEARCH");
	b3.setBounds(630,200,100,30);
	c.add(b3);
	
	
	t11=new JTextField();
	t11.setBounds(410,200,200,30);
	t11.setFont(new Font("Arial",Font.BOLD,15));

	c.add(t11);
	
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
	

	
	
	
t1=new JTextField();
t1.setBounds(190,150,200,30);
t1.setFont(new Font("Arial",Font.BOLD,15));

c.add(t1);


t2=new JTextField();
t2.setBounds(190,190,200,30);
t2.setFont(new Font("Arial",Font.BOLD,15));

c.add(t2);


t3=new JTextField();
t3.setBounds(190,230,200,30);
t3.setFont(new Font("Arial",Font.BOLD,15));

c.add(t3);


t4=new JTextField();
t4.setBounds(190,270,200,30);
t4.setFont(new Font("Arial",Font.BOLD,15));

c.add(t4);


t5=new JTextField();
t5.setBounds(190,310,200,30);
t5.setFont(new Font("Arial",Font.BOLD,15));

c.add(t5);



t6=new JTextField();
t6.setBounds(680,150,200,30);
t6.setFont(new Font("Arial",Font.BOLD,15));

c.add(t6);

t7=new JTextField();
t7.setBounds(680,190,200,30);
t7.setFont(new Font("Arial",Font.BOLD,15));
c.add(t7);

t8=new JTextField();
t8.setBounds(680,230,200,30);
t8.setFont(new Font("Arial",Font.BOLD,15));

c.add(t8);



t9=new JTextField();
t9.setBounds(680,270,200,30);
t9.setFont(new Font("Arial",Font.BOLD,15));

c.add(t9);


t10=new JTextField();
t10.setBounds(680,310,200,30);
t10.setFont(new Font("Arial",Font.BOLD,15));



c.add(t10);

b1=new JButton("UPDATE");
b1.setBounds(280,380,100,30);
c.add(b1);


b2=new JButton("CANCEL");
b2.setBounds(480,380,100,30);
c.add(b2);


b1.setBackground(Color.BLACK);
b1.setForeground(Color.WHITE);
b2.setBackground(Color.BLACK);
b2.setForeground(Color.WHITE);

l14=new JLabel(":FILL WHOLE INFORMATION IN BLOCK LETTER:");

l14.setBounds(130,460,520,30);
l14.setFont(new Font("Arial",Font.BOLD,15));


c.add(l14);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

c.add(l3);


l1.setVisible(true);
l2.setVisible(true);
l3.setVisible(true);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);
l13.setVisible(false);
l14.setVisible(false);
t1.setVisible(false);
t2.setVisible(false);
t3.setVisible(false);
t4.setVisible(false);
t5.setVisible(false);
t6.setVisible(false);
t7.setVisible(false);
t8.setVisible(false);
t9.setVisible(false);
t10.setVisible(false);
b1.setVisible(false);
b2.setVisible(false);


	setVisible(true);
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			DataBase db=new DataBase();
			String q="select * from addemp where eid='"+t11.getText()+"'";
			ResultSet rs=db.s.executeQuery(q);
			if(rs.next()) {
				
				
				t1.setText(rs.getString("name"));
				t2.setText(rs.getString("email"));
				t3.setText(rs.getString("fname"));
				t4.setText(rs.getString("dob"));				
				t5.setText(rs.getString("address"));
				t6.setText(rs.getString("gender"));
				t7.setText(rs.getString("eid"));
				t8.setText(rs.getString("job"));
				t9.setText(rs.getString("adhar"));
				t10.setText(rs.getString("phone"));
				
				
				
				l1.setVisible(true);
				l2.setVisible(true);
				l3.setVisible(true);
				l4.setVisible(true);
				l5.setVisible(true);
				l6.setVisible(true);
				l7.setVisible(true);
				l8.setVisible(true);
				l9.setVisible(true);
				l10.setVisible(true);
				l11.setVisible(true);
				l12.setVisible(true);
				l13.setVisible(true);
				l14.setVisible(true);
				t1.setVisible(true);
				t2.setVisible(true);
				t3.setVisible(true);
				t4.setVisible(true);
				t5.setVisible(true);
				t6.setVisible(true);
				t7.setVisible(true);
				t8.setVisible(true);
				t9.setVisible(true);
				t10.setVisible(true);
				b1.setVisible(true);
				b2.setVisible(true);
				b3.setVisible(false);
				t11.setVisible(false);
				l15.setVisible(false);
				
				
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Wrong ID");
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		if(e.getSource()==b1) {
		try {
			
			DataBase db=new DataBase();
			String q1="update addemp set name='"+t1.getText()+"',email='"+t2.getText()+"',fname='"+t3.getText()+"',dob='"+t4.getText()+"',gender='"+t5.getText()+"',address='"+t6.getText()+"',eid='"+t7.getText()+"',job='"+t8.getText()+"',adhar='"+t9.getText()+"',phone='"+t10.getText()+"'";
			db.s.executeUpdate(q1);
			
			JOptionPane.showMessageDialog(null, "Data Updated");
			
			
		}catch(Exception e1) {
			e1.printStackTrace();
			
		}
		}
		else if(e.getSource()==b2) {
			new Menu().setVisible(true);
			setVisible(false);
		}
		
	}
}
public class UpdateClass {

	public static void main(String[] args) {
	
update up=new update();
	}

}
