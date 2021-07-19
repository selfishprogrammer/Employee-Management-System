package EmployeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class remove extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JButton b1,b2;
String na,ed,jp;
JTextField t1;

Container c;
	
	remove(){
		setTitle("EMPLOYEE MANAGEMENT");
		setBounds(100,100,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.WHITE);
		
		
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Employee Management\\src\\EmployeeManagement\\employee4.jpg");
		Image img=image.getImage().getScaledInstance(500,300,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img);
		
		
		l8=new JLabel(img1);
		l8.setBounds(0,0,600,600);
		
		l9=new JLabel("EMPLOYEE ID :");
		l9.setBounds(20,90,200,30);
		l9.setFont(new Font("Arial",Font.BOLD,15));

		c.add(l9);
		
	
		l1=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		l1.setBounds(70,10,490,30);
		l1.setForeground(Color.BLACK);
		Font font=new Font("Arial",Font.ROMAN_BASELINE,25);	
		l1.setFont(font);
		c.add(l1);
		
		t1=new JTextField();
		t1.setBounds(180,90,200,30);
		
		t1.setFont(new Font("Arial",Font.ROMAN_BASELINE,15));
		c.add(t1);
	
	
		
		l2=new JLabel("Name");
		l3=new JLabel("Employee ID");
		l4=new JLabel("Job");
		l5=new JLabel(na);
		l6=new JLabel(ed);
		l7=new JLabel(jp);
		
		
		
		b1=new JButton("SEARCH");
		b1.setBounds(420,90,100,30);
		c.add(b1);
		
		
		b2=new JButton("DELETE");
		b2.setBounds(380,480,100,30);
		c.add(b2);
		l2.setBounds(20,60,100,30);
		l3.setBounds(20,120,100,30);
		l4.setBounds(20,180,100,30);
		l5.setBounds(320,60,100,30);
		l6.setBounds(320,120,100,30);
		l7.setBounds(320,180,100,30);
		
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l7);
		c.add(l6);
		
		
		
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
		l6.setVisible(false);
		l7.setVisible(false);
		b2.setVisible(false);

		b1.addActionListener(this);
		b2.addActionListener(this);
		c.add(l8);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			DataBase db=new DataBase();
			String emp=t1.getText();
			String q="select name,eid,job from addemp where eid='"+emp+"'";
			ResultSet rs=db.s.executeQuery(q);
			
			if(rs.next()) {
				na=rs.getString("name");
				ed=rs.getString("eid");
				jp=rs.getString("job");
						l5.setText(na);
				l6.setText(ed);

				l7.setText(jp);
				
				l2.setVisible(true);
				l3.setVisible(true);
				l4.setVisible(true);
				l5.setVisible(true);
				l6.setVisible(true);
				l7.setVisible(true);
				
		
				t1.setVisible(false);
				b1.setVisible(false);
				l9.setVisible(false);

				b2.setVisible(true);
			}
			
			
		
			}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
		try {
			DataBase db=new DataBase();
			if(e.getSource()==b2) {
				String q1="delete  from addemp where eid='"+t1.getText()+"' ";
				db.s.executeUpdate(q1);
				
				
				l2.setVisible(false);
				l3.setVisible(false);
				l4.setVisible(false);
				l5.setVisible(false);
				l6.setVisible(false);
				l7.setVisible(false);
				
				

				t1.setVisible(true);
				b1.setVisible(true);
				l9.setVisible(true);
				
				b2.setVisible(false);
				t1.setText("");

				JOptionPane.showMessageDialog(null, "Your Data has Been Deleted");
				new Menu().setVisible(true);
				setVisible(false);
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
public class RemoveClass {

	public static void main(String[] args) {
	
remove r=new remove();
	}

}
