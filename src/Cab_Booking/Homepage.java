package Cab_Booking;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Homepage extends JFrame implements ActionListener
{
	JLabel l1;
	Font f,f1,f2;
	JPanel p1,p2;
	
	
	Homepage()
	{
		super("Cab Booking Home Page");
		setLocation(0,0);
		setSize(1550,800);
		
		ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("cab.jpg"));
		Image img=ic.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT);
		ImageIcon ic1=new ImageIcon(img);
		l1=new JLabel(ic1);
		
		
		f=new Font("Lucida Fax",Font.BOLD,20);
		f1=new Font("Gadugi",Font.BOLD,35);
		f2=new Font("MS UI Gothic",Font.BOLD,18);
		
		JMenuBar m1=new JMenuBar();
		
		JMenu men1=new JMenu("Customer Profile");
		JMenuItem ment1=new JMenuItem("Add Customer Profile");
		JMenuItem ment2=new JMenuItem("View Customer Profile");
		
		JMenu men2=new JMenu(" Manage Customer");
		JMenuItem ment3=new JMenuItem("Update Customer Details");
		
		JMenu men3=new JMenu("Book Intracity Cab");
		JMenuItem ment5=new JMenuItem("Book Cab");
		JMenuItem ment6=new JMenuItem("View Booked Cab");
		
		JMenu men4=new JMenu("Book Intracity Cab");
		JMenuItem ment7=new JMenuItem("Book Intracity Cab");
		JMenuItem ment8=new JMenuItem(" View Book Intracity Cab");
		
		JMenu men5=new JMenu("Transport");
		JMenuItem ment9=new JMenuItem("Book Package");
		JMenuItem ment10=new JMenuItem("View Book Package");
		
		JMenu men6=new JMenu("Bill");
		JMenuItem ment11=new JMenuItem("Check Bill");
		
		JMenu men7=new JMenu("Delete");
		JMenuItem ment12=new JMenuItem("Delete Customer");
		
		JMenu men8=new JMenu("About");
		JMenuItem ment13=new JMenuItem("Exit");
		
		
		
		
		men1.add(ment1);
		men1.add(ment2);
		men2.add(ment3);
		men3.add(ment5);
		men3.add(ment6);
		men4.add(ment7);
		men4.add(ment8);
		men5.add(ment9);
		men5.add(ment10);
		men6.add(ment11);
		men7.add(ment12);
		men8.add(ment13);
		
		m1.add(men1);
		m1.add(men2);
		m1.add(men3);
		m1.add(men4);
		m1.add(men5);
		m1.add(men6);
		m1.add(men7);
		m1.add(men8);
		
		m1.setBackground(Color.BLACK);
		
		men1.setForeground(Color.GRAY);
		men2.setForeground(Color.GRAY);
		men3.setForeground(Color.GRAY);
		men4.setForeground(Color.GRAY);
		men5.setForeground(Color.GRAY);
		men6.setForeground(Color.GRAY);
		men7.setForeground(Color.GRAY);
		men8.setForeground(Color.RED);
		
		ment1.setBackground(Color.BLACK);
		ment2.setBackground(Color.BLACK);
		ment3.setBackground(Color.BLACK);
		ment5.setBackground(Color.BLACK);
		ment6.setBackground(Color.BLACK);
		ment7.setBackground(Color.BLACK);
		ment8.setBackground(Color.BLACK);
		ment9.setBackground(Color.BLACK);
		ment10.setBackground(Color.BLACK);
		ment11.setBackground(Color.BLACK);
		ment12.setBackground(Color.BLACK);
		ment13.setBackground(Color.BLACK);
		
		ment1.setForeground(Color.YELLOW);
		ment2.setForeground(Color.YELLOW);
		ment3.setForeground(Color.YELLOW);
		ment5.setForeground(Color.YELLOW);
		ment6.setForeground(Color.YELLOW);
		ment7.setForeground(Color.YELLOW);
		ment8.setForeground(Color.YELLOW);
		ment9.setForeground(Color.YELLOW);
		ment10.setForeground(Color.YELLOW);
		ment11.setForeground(Color.YELLOW);
		ment12.setForeground(Color.YELLOW);
		ment13.setForeground(Color.RED);
		
		
		
		
		ment1.addActionListener(this);
		ment2.addActionListener(this);
		ment3.addActionListener(this);
		ment5.addActionListener(this);
		ment6.addActionListener(this);
		ment7.addActionListener(this);
		ment8.addActionListener(this);
		ment9.addActionListener(this);
		ment10.addActionListener(this);
		ment11.addActionListener(this);
		ment12.addActionListener(this);
		ment13.addActionListener(this);
		
		setJMenuBar(m1);
		add(l1);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		String comnd=e.getActionCommand();
		if(comnd.equals("Add Customer Profile"))
		{
			new Add_Customer().setVisible(true);
		}
		else if(comnd.equals("View Customer Profile"))
		{
			new View_Customer().setVisible(true);
		}
		else if(comnd.equals("Update Customer Detail"))
		{
			new Update_Customer().setVisible(true);
		}
		else if(comnd.equals("Book Cab"))
		{
			new Book_Cab().setVisible(true);
		}
		else if(comnd.equals("View Booked Cab"))
		{
			new View_Booked_Cab().setVisible(true);
		}
		else if(comnd.equals("Book Intracity Cab"))
		{
			new View_Book_Intracity_Cab().setVisible(true);
		}
		else if(comnd.equals("Book Intracity Cab"))
		{
			new Book_Intracity_cab().setVisible(true);
		}
		else if(comnd.equals("Book Package"))
		{
			new Book_Package().setVisible(true);
		}
		
		else if(comnd.equals("View Booked Package"))
		{
			new View_Booked_Package().setVisible(true);
		}
		
		else if(comnd.equals("Check Bill"))
		{
			new Check_Bill ().setVisible(true);
		}
		else if(comnd.equals("Delete Customer"))
		{
			new Delete_Customer ().setVisible(true);
		}
		else if(comnd.equals("Exit"))
		{
			System.exit(0);
		}
		}
		catch(Exception r)
		{
			System.out.print(r);
		}
	}
	public static void main(String args[])
	{
		new Homepage ().setVisible(true); 
	}
}
