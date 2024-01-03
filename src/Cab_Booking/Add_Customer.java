package Cab_Booking;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Add_Customer extends JFrame implements ActionListener
{
	JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13;
	JFrame f;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JButton b,b1;
	
	 Add_Customer()
	 {
		 	f=new JFrame("Add Employee");
			f.setBackground(Color.WHITE);
			f.setLayout(null);
			
			id=new JLabel();
			id.setBounds(0,0,900,600);
			id.setLayout(null);
			
			ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("travel.jpg"));
			Image img=ic.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
			ImageIcon ic1=new ImageIcon(img);
			id.setIcon(ic1);
			
			id1=new JLabel("New Customer Details");
			id1.setBounds(230,30,500,50);
			id1.setFont(new Font("Airal",Font.BOLD,30));
			id1.setForeground(Color.BLACK);
			id.add(id1);
			f.add(id);
			
			id2=new JLabel("Username");
			id2.setBounds(50,150,150,30);
			id2.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id2);
			id2.setForeground(Color.RED);
			
			t1=new JTextField();
			t1.setBounds(200,150,150,30);
			id.add(t1);
			
			
			
			id3=new JLabel("Name");
			id3.setBounds(450,150,200,30);
			id3.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id3);
			id3.setForeground(Color.RED);
		
			
			
			t2=new JTextField();
			t2.setBounds(600,150,150,30);
			id.add(t2);
			
			
			id4=new JLabel("Age");
			id4.setBounds(50,200,100,30);
			id4.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id4);
			id4.setForeground(Color.RED);
			
			
			t3=new JTextField();
			t3.setBounds(200,200,150,30);
			id.add(t3);
			
			
			id5=new JLabel("Date Of Birth");
			id5.setBounds(450,200,200,30);
			id5.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id5);
			id5.setForeground(Color.RED);
			
			
			t4=new JTextField();
			t4.setBounds(600,200,150,30);
			id.add(t4);
			
			
			id6=new JLabel("Address");
			id6.setBounds(50,250,100,30);
			id6.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id6);
			id6.setForeground(Color.RED);
			
			
			t5=new JTextField();
			t5.setBounds(200,250,150,30);
			id.add(t5);
			
			
			id7=new JLabel("Phone No");
			id7.setBounds(450,250,150,30);
			id7.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id7);
			id7.setForeground(Color.RED);
			
			
			
			t6=new JTextField();
			t6.setBounds(600,250,150,30);
			id.add(t6);
			
			
			id8=new JLabel("Email Id");
			id8.setBounds(50,300,100,30);
			id8.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id8);
			id8.setForeground(Color.RED);
			
			
			
			t7=new JTextField();
			t7.setBounds(200,300,150,30);
			id.add(t7);
			
			
			id9=new JLabel("Country");
			id9.setBounds(450,300,150,30);
			id9.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id9);
			id9.setForeground(Color.RED);
			
			
			
			t8=new JTextField();
			t8.setBounds(600,300,150,30);
			id.add(t8);
			
			
			id10=new JLabel("Gender");
			id10.setBounds(50,350,100,30);
			id10.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id10);
			id10.setForeground(Color.RED);
			
			
			
			t9=new JTextField();
			t9.setBounds(200,350,150,30);
			id.add(t9);
			
			
			id11=new JLabel("AadharNo");
			id11.setBounds(450,350,100,30);
			id11.setFont(new Font("Airal",Font.BOLD,20));
			id.add(id11);
			id11.setForeground(Color.RED);
			
			
			
			t10=new JTextField();
			t10.setBounds(600,350,150,30);
			id.add(t10);
			
			
			b=new JButton("Submit");
			b.setBackground(Color.BLACK);
			b.setForeground(Color.WHITE);
			b.setBounds(250, 500, 150, 40);
			id.add(b);
		
			
			b1=new JButton("Cancel");
			b1.setBackground(Color.RED);
			b1.setForeground(Color.WHITE);
			b1.setBounds(450, 500, 150, 40);
			id.add(b1);
			
			
			b.addActionListener(this);
			b1.addActionListener(this);
			
			
			f.setVisible(true);
			f.setSize(900,600);
			f.setLocation(300,100);
			
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 if(e.getSource()==b)
		 {
			 String Username=t1.getText();
			 String Name=t2.getText();
			 String Age=t3.getText();
			 String DateOfBirth=t4.getText();
			 String Address=t5.getText();
			 String Phoneno=t6.getText();
			 String Gender=t7.getText();
			 String EmailId=t8.getText();
			 String Country=t9.getText();
			 String AadharNo=t10.getText();
			 
			 try
			 {
				 ConnectionClass obj=new ConnectionClass();
				 String q="insert into customer values('"+Username+"','"+Name+"','"+Age+"','"+DateOfBirth+"','"+Address+"','"+Phoneno+"','"+Gender+"','"+EmailId+"','"+Country+"','"+AadharNo+"')";
				 int aa=obj.stm.executeUpdate(q);
				 if(aa==1)
				 {
					 JOptionPane.showMessageDialog(null,"Your data Successfully Inserted");
					 this.setVisible(false);
					 new Homepage();
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null,"Please !,Fill all Details Carefully");
					 this.setVisible(true);
				 }
			 }
			 catch(Exception ee)
			 {
				 ee.printStackTrace();
				 
			 }
			 
		 }
		 if(e.getSource()==b1)
		 {
			 f.setVisible(false);
		 }
		 
	 }
	 public static void main(String args[])
	 {
		 new Add_Customer();
	 }
}
