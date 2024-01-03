package Cab_Booking;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class View_Customer extends JFrame
{
	Font f;
	JTable t1;
	String x[]={"Username","Name","Age","DateOfBirth","Address","Phoneno","Gender","EmailId","Country","AadharNo"};
	String y[][]=new String [20][10];
	int i=0,j=0;
	
	View_Customer()
	{
		super("All Customer Details ");
		setSize(1300,400);
		setLocation(0,10);
		f=new Font("MS UI Gothic",Font.BOLD,17);
		
		try
		{
			 ConnectionClass obj=new ConnectionClass();
			 String q="select * from customer";
			 ResultSet rest=obj.stm.executeQuery(q);
			 
			 while(rest.next())
			 {
				 y[i][j++]=rest.getString("Username");
				 y[i][j++]=rest.getString("Name");
				 y[i][j++]=rest.getString("Age");
				 y[i][j++]=rest.getString("DateOfBirth");
				 y[i][j++]=rest.getString("Address");
				 y[i][j++]=rest.getString("Phoneno");
				 y[i][j++]=rest.getString("Gender");
				 y[i][j++]=rest.getString("EmailId");
				 y[i][j++]=rest.getString("Country");
				 y[i][j++]=rest.getString("AadharNo");
				 i++;
				 j=0;
			 }
			 t1=new JTable(y,x);
		}
		catch (Exception e)
		{
		//	System.out.println(e);
			e.printStackTrace();
		}
		t1.setFont(f);
		 t1.setBackground(Color.BLACK);
		 t1.setForeground(Color.WHITE);
		 

		 JScrollPane js=new JScrollPane(t1);
		 add(js);
		
	}
	public static void main(String args[])
	{
		new View_Customer().setVisible(true);
	}
}
