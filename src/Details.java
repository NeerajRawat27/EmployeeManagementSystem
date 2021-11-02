import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class Details implements ActionListener {

	JFrame jf;
	JLabel jl;
	JButton add,view,remove,update;
	
	public Details()
	{
		jf=new JFrame("Details");
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("icons/details.jpg"));
		Image img=ic1.getImage().getScaledInstance(700, 500 , Image.SCALE_DEFAULT);
		ImageIcon ic2=new ImageIcon(img);
		JLabel lb=new JLabel(ic2);
		lb.setBounds(0,0,700,500);
		jf.add(lb);
		
		jl=new JLabel("Employee Details");
		jl.setForeground(Color.BLACK);
		jl.setFont(new Font("serif",Font.BOLD,20));
		jl.setBounds(450,20,310,30);
		lb.add(jl);
		
		add=new JButton("Add");
		add.setFont(new Font("serif",Font.BOLD,12));
		add.setBounds(440,70,90,30);
		add.addActionListener(this);
		lb.add(add);
	
		view=new JButton("View");
		view.setFont(new Font("serif",Font.BOLD,12));
		view.setBounds(540, 70, 90, 30);
		view.addActionListener(this);
		lb.add(view);
		
		remove=new JButton("Remove");
		remove.setFont(new Font("serif",Font.BOLD,12));
		remove.setBounds(440,120,90,30);
		remove.addActionListener(this);
		lb.add(remove);
		
		update=new JButton("Update");
		update.setFont(new Font("serif",Font.BOLD,12));
		update.setBounds(540,120,90,30);
		update.addActionListener(this);
		lb.add(update);
		
		jf.setSize(700,500);
		jf.setLocation(450,100);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==add)
		{
			jf.setVisible(false);
			new AddEmployee();
		}
		if(ae.getSource()==view)
		{
			jf.setVisible(false);
			new ViewEmployee();
		}
		if(ae.getSource()==remove)
		{
			jf.setVisible(false);
			new RemoveEmployee();
		}
		if(ae.getSource()==update)
		{
			jf.setVisible(false);
			new SearchEmployee();
		}
	}
	
//	public static void main(String[] args) {
//	
//		new Details();
//	}

}
