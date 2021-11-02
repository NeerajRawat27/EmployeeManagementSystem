
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
public class RemoveEmployee implements ActionListener{

	JFrame jf;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7;
	JTextField jtf;
	JButton jb1,jb2,jb3,jb4;
	
	RemoveEmployee()
	{
		jf=new JFrame("Remove Employee");
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("icons/remove.jpg"));
		JLabel lb=new JLabel(ic1);
		lb.setBounds(0,0,450,450);
		jf.add(lb);
		
		jl1=new JLabel("Employee Id");
		jl1.setFont(new Font("serif",Font.BOLD,22));
		jl1.setForeground(Color.WHITE);
		jl1.setBounds(30,30,150,30);
		lb.add(jl1);
		
		jtf=new JTextField();
		jtf.setBounds(200,30,150,30);
		jtf.setBorder(null);
		lb.add(jtf);
		
		jb1=new JButton("Search");
		jb1.setBounds(160,80,100,30);
		jb1.addActionListener(this);
		lb.add(jb1);
		
		jb2=new JButton("Back");
		jb2.setBounds(320,80,100,30);
		jb2.addActionListener(this);
		lb.add(jb2);
		
		jl2=new JLabel("Name:");
		jl2.setBounds(30,140,100,30);
		jl2.setForeground(Color.WHITE);
		jl2.setFont(new Font("serif",Font.BOLD,18));
		jl2.setVisible(false);
		lb.add(jl2);
		
		jl3=new JLabel();
		jl3.setBounds(160,140,100,30);
		jl3.setForeground(Color.WHITE);
		jl3.setFont(new Font("serif",Font.BOLD,18));
		jl3.setVisible(false);
		lb.add(jl3);
		
		jl4=new JLabel("Mobile No:");
		jl4.setBounds(30,200,100,30);
		jl4.setForeground(Color.WHITE);
		jl4.setFont(new Font("serif",Font.BOLD,18));
		jl4.setVisible(false);
		lb.add(jl4);
		
		jl5=new JLabel();
		jl5.setBounds(160,200,100,30);
		jl5.setForeground(Color.WHITE);
		jl5.setFont(new Font("serif",Font.BOLD,18));
		jl5.setVisible(false);
		lb.add(jl5);
		
		jl6=new JLabel("Email Id:");
		jl6.setBounds(30,260,100,30);
		jl6.setForeground(Color.WHITE);
		jl6.setFont(new Font("serif",Font.BOLD,18));
		jl6.setVisible(false);
		lb.add(jl6);
		
		jl7=new JLabel();
		jl7.setBounds(160,260,200,30);
		jl7.setForeground(Color.WHITE);
		jl7.setFont(new Font("serif",Font.BOLD,18));
		jl7.setVisible(false);
		lb.add(jl7);
		
		jb3=new JButton("Remove");
		jb3.setBounds(160,320,100,30);
		jb3.addActionListener(this);
		jb3.setVisible(false);
		lb.add(jb3);
		
		jb4=new JButton("Cancel");
		jb4.setBounds(320,320,100,30);
		jb4.addActionListener(this);
		jb4.setVisible(false);
		lb.add(jb4);
		
		jf.setSize(450,450);
		jf.setLocation(350,150);
		jf.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb1)
		{
			
			String q="select name,phone,email from employee where emp_id='"+jtf.getText()+"'";
			Conn c1=new Conn();
			try {
				ResultSet rs=c1.s.executeQuery(q);
				if(rs.next())
				{
					jl3.setText(rs.getString("name"));
					jl5.setText(rs.getString("phone"));
					jl7.setText(rs.getString("email"));
					
					jl2.setVisible(true);
					jl4.setVisible(true);
					jl6.setVisible(true);
					jl3.setVisible(true);
					jl5.setVisible(true);
					jl7.setVisible(true);
					jb3.setVisible(true);
					jb4.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter valid Employee Id");
								
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			if(ae.getSource()==jb2)
			{
				jf.setVisible(false);
				new Details();
			}
			if(ae.getSource()==jb3)
			{
				String delQ="delete from employee where emp_id='"+jtf.getText()+"'";
				Conn c1=new Conn();
				try {
					c1.s.executeUpdate(delQ);
					JOptionPane.showMessageDialog(null, "remove successfully");
					jl2.setVisible(false);
					jl4.setVisible(false);
					jl6.setVisible(false);
					jl3.setVisible(false);
					jl5.setVisible(false);
					jl7.setVisible(false);
					jb3.setVisible(false);
					jb4.setVisible(false);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(ae.getSource()==jb4)
			{
				jf.setVisible(false);
				new Details();
			}
			
		}
//	public static void main(String[] args) {
//		new RemoveEmployee();
//
//	}

}
