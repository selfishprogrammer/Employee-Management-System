package EmployeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Add extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b1,b2,b3,b4;
	Container c;
	

	Add(){
		
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
	
	b1=new JButton("SUBMIT");
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
	
	c.add(l3);

	
		setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String a=t1.getText();
		String b=t2.getText();
		String c=t3.getText();
		String d=t4.getText();
		String k=t5.getText();
		String f=t6.getText();
		String g=t7.getText();
		String h=t8.getText();
		String i=t9.getText();
		String j=t10.getText();
		
		try {
			DataBase db=new DataBase();
			if(t1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, " Fill all Data ");
			
			}
			else {
			if(e.getSource()==b1) {
				
				String q="insert into addemp values('"+a+"','"+b+"','"+c+"','"+d+"','"+k+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
				db.s.executeUpdate(q);
				
				JOptionPane.showMessageDialog(null, " Your Data is Inserted ");
				
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
				
				
			}
			
			
			else if(e.getSource()==b2) {
				new Menu().setVisible(true);
				setVisible(false);
			}
			}
	}catch(Exception e1) {
		
	}
	}
}
public class AddClass {

	public static void main(String[] args) {
	Add add=new Add();

	}

}
