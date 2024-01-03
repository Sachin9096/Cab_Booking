package Cab_Booking;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Update_Customer extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
	JButton bt1,bt2;
	JPanel p1,p2,p3;
	Font f,f1;
	Choice ch;
	
	Update_Customer()
	{
		super("Update Customer");
		setSize(740,700);
		setLocation(50,50);
		
		f=new Font("Arial",Font.BOLD,25);
		f1=new Font("Arial",Font.BOLD,18);
		ch=new Choice();
		
		try
		{
			 ConnectionClass obj=new ConnectionClass();
			 String q="select Username from customer";
			 ResultSet rest=obj.stm.executeQuery(q);
			 while(rest.next())
				 
			 {
				 ch.add(rest.getString("username"));
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		l1=new JLabel("Update Customer");
		l1.setHorizontalAlignment(JLabel.CENTER);
		
		l2=new JLabel("Username");
		l3=new JLabel("Name");
		l4=new JLabel("Age");
		l5=new JLabel("Date Of Birth");
		l6=new JLabel("Address");
		l7=new JLabel("Phone");
		l8=new JLabel("Gender");
		l9=new JLabel("EmailId");
		l10=new JLabel("Country");
		l11=new JLabel("Aadhar No");
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf7=new JTextField();
		tf8=new JTextField();
		tf9=new JTextField();
		
		bt1=new JButton("Update");
		bt2=new JButton("Back");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		
		l1.setFont(f);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		l10.setFont(f1);
		l11.setFont(f1);
		
		tf1.setFont(f1);
		tf2.setFont(f1);
		tf3.setFont(f1);
		tf4.setFont(f1);
		tf5.setFont(f1);
		tf6.setFont(f1);
		tf7.setFont(f1);
		tf8.setFont(f1);
		tf9.setFont(f1);
		bt1.setFont(f1);
		bt2.setFont(f1);
		
		
		ch.setFont(f1);
		
		bt1.setBackground(Color.BLACK);
		bt1.setForeground(Color.WHITE);
		 
		bt2.setBackground(Color.RED);
		bt2.setForeground(Color.WHITE);
		
		ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("man1.png"));
		Image img=ic.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
		ImageIcon ic1=new ImageIcon(img);
		l12=new JLabel(ic1);
		
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(1,1,10,10));
		p1.add(l1);
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(1,1,10,10));
		p2.add(l12);
		
		p3=new JPanel();
		p3.setLayout(new GridLayout(11,2,10,10));
		p3.add(l2);
		p3.add(ch);
		p3.add(l3);
		p3.add(tf1);
		p3.add(l4);
		p3.add(tf2);
		p3.add(l5);
		p3.add(tf3);
		p3.add(l6);
		p3.add(tf4);
		p3.add(l7);
		p3.add(tf5);
		p3.add(l8);
		p3.add(tf6);
		p3.add(l9);
		p3.add(tf7);
		p3.add(l10);
		p3.add(tf8);
		p3.add(l11);
		p3.add(tf9);
		p3.add(bt1);
		p3.add(bt2);
		
		setLayout(new BorderLayout(10,10));
		add(p1,"North");
		add(p2,"West");
		add(p3,"Center");
	}
		public void mouseClicked (MouseEvent arg0)
		{
			try
			{
					ConnectionClass obj2=new ConnectionClass();
					String Username=ch.getSelectedItem();
					String q1="select * from customer where Username'"+Username+"'";
					ResultSet rest1=obj2.stm.executeQuery(q1);
					while(rest1.next())
					{
						ch.getSelectedItem();
						tf1.setText(rest1.getString("Name"));
						tf2.setText(rest1.getString("Age"));
						tf3.setText(rest1.getString("DateOfBirth"));
						tf4.setText(rest1.getString("Address"));
						tf5.setText(rest1.getString("Phoneno"));
						tf6.setText(rest1.getString("Gender"));
						tf7.setText(rest1.getString("EmailId"));
						tf8.setText(rest1.getString("Country"));
						tf9.setText(rest1.getString("AadharNo"));
					}
				}
				catch(Exception exx)
				{
					exx.printStackTrace();
				}
		}
	
	 public void actionPerformed(ActionEvent e)
	 {
		 if(e.getSource()==bt1)
		 {
			 String Username=ch.getSelectedItem();
			 String Name=tf1.getText();
			 String Age=tf2.getText();
			 String DateOfBirth=tf3.getText();
			 String Address=tf4.getText();
			 String Pnoneno=tf5.getText();
			 String Gender=tf6.getText();
			 String EmailId=tf7.getText();
			 String Country=tf8.getText();
			 String Aadharno=tf9.getText();
			 
			 try
			 {
				 ConnectionClass obj3=new ConnectionClass();
				 String q1="update customer set name='"+Name+"',age='"+Age+"',DateOfBirth='"+DateOfBirth+"',address='"+Address+"',phoneno='"+Pnoneno+"',gender='"+Gender+"',emailid='"+EmailId+"',country='"+Country+"',aadharno='"+Aadharno+"'where username='"+Username+"'";
				 int aa=obj3.stm.executeUpdate(q1);
				 if(aa==1)
				 {
					 JOptionPane.showMessageDialog(null,"your data successfully updated","Show",JOptionPane.DEFAULT_OPTION);
					 this.setVisible(false);
					 new View_Customer().setVisible(true);
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null,"Please! fill all details carefully");
				 }
			 }
			 catch(Exception ee)
			 {
				 ee.printStackTrace();
			 }
		 }
		 if(e.getSource()==bt2)
		 {
			 this.setVisible(false);
		 }
	 }
	 public static void main(String args[])
	 {
		 new Update_Customer().setVisible(true);
	 }

}
