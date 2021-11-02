
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SearchEmployee implements ActionListener{

	JFrame jf;
	JLabel jl;
	JTextField jtf;
	JButton b1,b2;	
	
	SearchEmployee()
	{
		jf=new JFrame("Search Employee");
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
		Image img=ic1.getImage().getScaledInstance(500, 270, Image.SCALE_DEFAULT);
		ImageIcon ic2=new ImageIcon(img);
		JLabel lb=new JLabel(ic2);
		lb.setBounds(0,0,500,270);
		jf.add(lb);
		
		jl=new JLabel("Employee Id");
		jl.setFont(new Font("SAN-SERIF",Font.BOLD,28));
		jl.setForeground(Color.white);
		jl.setBounds(40,50,200,40);
		lb.add(jl);
		
		jtf=new JTextField();
		jtf.setBounds(260,55,200,30);
		lb.add(jtf);
		
		b1=new JButton("Search");
		b1.setBounds(250,150,95,30);
		b1.addActionListener(this);
		lb.add(b1);
		
		b2=new JButton("Cancel");
		b2.setBounds(370,150,95,30);
		b2.addActionListener(this);
		lb.add(b2);
		
		jf.setSize(500,270);
		jf.setLocation(350,150);
		jf.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			jf.setVisible(false);
			new UpdateEmployee(jtf.getText());
		}
		if(ae.getSource()==b2)
		{
			jf.setVisible(false);
			new Details();
		}
	}
	
	public static void main(String[] args) {
		new SearchEmployee();

	}

}
