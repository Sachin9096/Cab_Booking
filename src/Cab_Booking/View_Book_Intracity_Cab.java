package Cab_Booking;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class View_Book_Intracity_Cab extends JFrame
{
	Font f;
	JTable t1;
	String x[]={"Book Id","Username","Name","Driver Name","Source","Destination","Price","Car","Cartype"};
	String y[][]=new String [20][9];
	int i=0,j=0;


	View_Book_Intracity_Cab()
	{
		super("All Intracity Book Cab records ");
		setSize(1300,400);
		setLocation(0,10);
		f=new Font("MS UI Gothic",Font.BOLD,17);
		
		
		 try
		 { 
			 ConnectionClass obj=new ConnectionClass();
			 String q="select * from intecity_car";
			 ResultSet rest=obj.stm.executeQuery(q);
			 while(rest.next())
			 {
				 y[i][j++]=rest.getString("BookId");
				 y[i][j++]=rest.getString("Username");
				 y[i][j++]=rest.getString("name");
				 y[i][j++]=rest.getString("Drivername");
				 y[i][j++]=rest.getString("Source");
				 y[i][j++]=rest.getString("Destination");
				 y[i][j++]=rest.getString("Price");
				 y[i][j++]=rest.getString("Car");
				 y[i][j++]=rest.getString("Cartype");
				 i++;
				 j=0;
				 
			 }
			 t1=new JTable(y,x);
				
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		 
		t1.setFont(f);
		t1.setBackground(Color.BLACK);
		t1.setForeground(Color.WHITE);
		 

		 JScrollPane js=new JScrollPane(t1);
		 add(js);
		
		
	}
	public static void main(String args[])
	{
		new View_Book_Intracity_Cab ().setVisible(true);
	}
}
