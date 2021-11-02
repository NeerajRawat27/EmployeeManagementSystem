
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


import javax.swing.*;

public class PrintData implements ActionListener {

	JFrame jf;
	JLabel jl,jl1,data1,jl2,data2,jl3,data3,jl4,data4,jl5,data5,jl6,data6,jl7,data7,jl8,data8;
	String emp_id,name,fname,address,phn,email,edu,job;
	JButton jb1,jb2;
	
	PrintData(String str)
	{
//		System.out.println(str);
		String q="select * from employee where emp_id='"+str+"'";
		try {
			Conn c1=new Conn();
			ResultSet rs=c1.s.executeQuery(q);
				while(rs.next())
				{
					emp_id=rs.getString("emp_id");
					name=rs.getString("name");
					fname=rs.getString("fname");
					phn=rs.getString("phone");
					email=rs.getString("email");
					address=rs.getString("address");
					edu=rs.getString("education");
					job=rs.getString("post");
					
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		if(emp_id!=null)
		{
			
		
		jf=new JFrame("Print Data");
		jf.setLayout(null);
		jf.setBackground(Color.WHITE);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("icons/print.jpg"));
		JLabel lb=new JLabel(ic1);
		lb.setBounds(0,0,500,550);
		jf.add(lb);
		
		jl=new JLabel("Employee Details");
		jl.setBounds(50,10,200,30);
		jl.setFont(new Font("serif",Font.BOLD,22));
		jl.setForeground(Color.BLACK);
		lb.add(jl);
		
		jl1=new JLabel("Employee Id:");
		jl1.setBounds(40,70,150,20);
		jl1.setForeground(Color.BLACK);
		jl1.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(jl1);
		
		data1=new JLabel(emp_id);
		data1.setBounds(200,70,150,20);
		data1.setFont(new Font("Serif",Font.BOLD,16));
		data1.setForeground(Color.BLACK);
		lb.add(data1);
		
		jl2=new JLabel("Name:");
		jl2.setBounds(40,110,150,20);
		jl2.setForeground(Color.BLACK);
		jl2.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(jl2);
		
		data2=new JLabel(name);
		data2.setBounds(200,110,150,20);
		data2.setForeground(Color.BLACK);
		data2.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(data2);
		
		jl3=new JLabel("Father's Name:");
		jl3.setBounds(40,150,150,20);
		jl3.setForeground(Color.BLACK);
		jl3.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(jl3);
		
		data3=new JLabel(fname);
		data3.setBounds(200,150,150,20);
		data3.setForeground(Color.BLACK);
		data3.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(data3);
		
		jl4=new JLabel("Address:");
		jl4.setBounds(40,190,150,20);
		jl4.setForeground(Color.BLACK);
		jl4.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(jl4);
		
		data4=new JLabel(address);
		data4.setBounds(200,190,150,20);
		data4.setForeground(Color.BLACK);
		data4.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(data4);
		
		jl5=new JLabel("Mobile No:");
		jl5.setBounds(40,230,150,20);
		jl5.setForeground(Color.BLACK);
		jl5.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(jl5);
		
		data5=new JLabel(phn);
		data5.setBounds(200,230,150,20);
		data5.setForeground(Color.BLACK);
		data5.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(data5);
		
		jl6=new JLabel("Email Id:");
		jl6.setBounds(40,270,150,20);
		jl6.setForeground(Color.BLACK);
		jl6.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(jl6);
		
		data6=new JLabel(email);
		data6.setBounds(200,270,180,20);
		data6.setForeground(Color.BLACK);
		data6.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(data6);
		
		jl7=new JLabel("Education");
		jl7.setBounds(40,310,150,20);
		jl7.setForeground(Color.BLACK);
		jl7.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(jl7);
		
		data7=new JLabel(edu);
		data7.setBounds(200,310,150,20);
		data7.setForeground(Color.BLACK);
		data7.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(data7);
		
		jl8=new JLabel("Job Post");
		jl8.setBounds(40,350,150,20);
		jl8.setForeground(Color.BLACK);
		jl8.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(jl8);
		
		data8=new JLabel(job);
		data8.setBounds(200,350,150,20);
		data8.setForeground(Color.BLACK);
		data8.setFont(new Font("Serif",Font.BOLD,16));
		lb.add(data8);
		
		jb1=new JButton("Print");
		jb1.setBackground(Color.BLACK);
		jb1.setForeground(Color.white);
		jb1.setBounds(80,430,100,30);
		jb1.addActionListener(this);
		lb.add(jb1);
		
		jb2=new JButton("Cancel");
		jb2.setBackground(Color.BLACK);
		jb2.setForeground(Color.white);
		jb2.setBounds(210,430,100,30);
		jb2.addActionListener(this);
		lb.add(jb2);
		
		jf.setSize(500,550);
		jf.setLocation(400,100);
		jf.setVisible(true);
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Invalid id");	
			new ViewEmployee();
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb1)
		{
			JOptionPane.showMessageDialog(null, "Details Print Successfully");
			jf.setVisible(false);
			new Details();
		}
		if(ae.getSource()==jb2)
		{
			jf.setVisible(false);
			new ViewEmployee();
		}
	}

}
