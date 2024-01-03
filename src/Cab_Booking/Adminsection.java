package Cab_Booking;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Adminsection extends JFrame implements ActionListener 
{
	JLabel l1;
	JButton bt1,bt2,bt3,bt4;
	JPanel p1,p2,p3;
	Font f,f1;
	
	 Adminsection()
	 {
		 super("Admin Section");
		 setLocation(450,250);
		 setSize(450,270);
		 
		 f=new Font("Arial",Font.BOLD,20);
		 f1=new Font("Arial",Font.BOLD,15);
		 
		 l1=new JLabel("Admin Section");
		 bt1=new JButton("intracity_driver");
		 bt2=new JButton("intracity_driver_details");
		 bt3=new JButton("transport_driver");
		 bt4=new JButton("Signup");
		 
		 bt1.addActionListener(this);
		 bt2.addActionListener(this);
		 bt3.addActionListener(this);
		 bt4.addActionListener(this);
		 

		 l1.setHorizontalAlignment(JLabel.CENTER);
		 l1.setForeground(Color.RED);
		 
		
		 
		 bt1.setBackground(Color.BLACK);
		 bt1.setForeground(Color.WHITE);
			 
		 bt2.setBackground(Color.RED);
		 bt2.setForeground(Color.WHITE);
		 
		 bt3.setBackground(Color.BLACK);
		 bt3.setForeground(Color.WHITE);
			 
		 bt4.setBackground(Color.RED);
		 bt4.setForeground(Color.WHITE);
		 
	/*	 ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("car1.png"));
		 Image img=ic.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT);
		 ImageIcon ic1=new ImageIcon(img);
		 JLabel l2=new JLabel(ic1);
	*/
		 
		 l1.setFont(f);
		 bt1.setFont(f1);
		 bt2.setFont(f1);
		 bt3.setFont(f1);
		 bt4.setFont(f1);
		 
		 p1=new JPanel();
		 p1.setLayout(new GridLayout(5,1,10,10));
		 p1.add(l1);
		 p1.add(bt1);
		 p1.add(bt2);
		 p1.add(bt3);
		 p1.add(bt4);
		 
		 setLayout(new BorderLayout(10,10));
		 add(p1,"Center");
		 
		/* l2.add(bt1);
		 l2.add(bt2);
		 l2.add(bt3);
		 l2.add(bt4);
		 l2.add(l1);
		 
		
		 
		/* p2=new JPanel();
		 p2.setLayout(new GridLayout(1,1,10,10));
		 p2.add(l2);
		 
		 setLayout(new BorderLayout(10,10));
		 add(p2,"North");*/

		 
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 if(e.getSource()==bt1)
		 {
			 this.setVisible(false);
			 new Add_Intracity_Driver().setVisible(true);
			
		 }
		 if(e.getSource()==bt2)
		 {
			 this.setVisible(false);
			 new Add_Intracity_Driver_Details().setVisible(true);
			
		 }
		 if(e.getSource()==bt3)
		 {
			 this.setVisible(false);
			 new AddTransportdriver().setVisible(true);
			 
		 }
		 if(e.getSource()==bt4)
		 {
			 this.setVisible(false);
			 new Signup().setVisible(true);
			
		 }
	 }
	 public static void main(String args[])
	 {
		new Adminsection().setVisible(true);
	 }
}
