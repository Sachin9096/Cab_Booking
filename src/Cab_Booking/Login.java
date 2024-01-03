package Cab_Booking;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
	JPanel Pannel;
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	JPasswordField pf1;
	JButton b1,b2;
	
	Login()
	{
		f=new JFrame("Login Account");
		f.setBackground(Color.WHITE);
		f.setLayout(null);
		
		l1=new JLabel();
		l1.setBounds(0, 0, 1500,800);
		f.setLayout(null);
		
		ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("cab.jpg"));
		Image i1=img.getImage().getScaledInstance(1500,800, Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(i1);
		l1.setIcon(img1);
		
		l2=new JLabel("Login Account");
		l2.setBounds(190, 30, 500, 50);
		l2.setFont(new Font("Airal",Font.BOLD,30));
		l2.setForeground(Color.PINK);
		l1.add(l2);
		f.add(l1);
		
		l3=new JLabel("Username");
		l3.setBounds(120, 120, 150, 30);
		l3.setFont(new Font("Airal",Font.BOLD,20));
		l3.setForeground(Color.ORANGE);
		l1.add(l3);
	
		l4=new JLabel("Password");
		l4.setBounds(120, 170, 150, 30);
		l4.setFont(new Font("Airal",Font.BOLD,20));
		l4.setForeground(Color.ORANGE);
		l1.add(l4);
		
		t1=new JTextField();
		t1.setBounds(320,120,150,30);
		l1.add(t1);
	
		
		pf1=new JPasswordField();
		pf1.setBounds(320,170,150,30);
		l1.add(pf1);
		
		b1=new JButton("Login");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(120, 220, 150, 40);
		
		b2=new JButton("Signup");
		b2.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);
		b2.setBounds(320, 220, 150, 40);
		
		l1.add(b1);
		l1.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.setVisible(true);
		f.setSize(550,350);
		f.setLocation(300,100);
		f.setResizable(true);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String name=t1.getText();
			String password=pf1.getText();
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cab_Booking","root","Sachin@123");
				Statement s=c.createStatement();
				
				String q="select * from login where username ='" +name+"' and password='"+password+"'";
				ResultSet rs=s.executeQuery(q);
				//ConnectionClass obj=new ConnectionClass();
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null,"You have entered  Succesfully ","Show",JOptionPane.DEFAULT_OPTION);
					Homepage n=new Homepage();
					n.setVisible(true);
					f.setVisible(false);
					new Homepage(); 
				}
				else
				{
					JOptionPane.showMessageDialog(null,"You have entered Wrong Username And Password");
					
				}
			}
			catch (SQLException s)
			{
				System.out.println(s);
				 
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b2)
		{
			f.setVisible(false);
			new Signup();
			
		}
	}
	public static void main(String args[])
	{
		new Login();
	}

}
