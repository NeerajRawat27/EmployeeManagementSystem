import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateEmployee implements ActionListener {

	JFrame jf;
	JLabel jl, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, jl10, jl11, jl12;
	JTextField jtf2, jtf3, jtf4, jtf5, jtf6, jtf7, jtf8, jtf9, jtf10, jtf11, jtf12;
	JButton b1, b2;
	String name, fname, age, dob, address, phone, email, edu, post, adhaar, emp_id, str;

	public UpdateEmployee(String str) {

		this.str = str;
		String q = "select*from employee where emp_id='" + str + "'";
		try {
			Conn c1 = new Conn();
			ResultSet rs = c1.s.executeQuery(q);
			if (rs.next()) {
				name = rs.getString(1);
				fname = rs.getString(2);
				age = rs.getString(3);
				dob = rs.getString(4);
				address = rs.getString(5);
				phone = rs.getString(6);
				email = rs.getString(7);
				edu = rs.getString(8);
				post = rs.getString(9);
				adhaar = rs.getString(10);
				emp_id = rs.getString(11);

		jf = new JFrame("Add Employee");
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg"));
		Image img = ic1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
		ImageIcon ic2 = new ImageIcon(img);
		JLabel lb = new JLabel(ic2);
		lb.setBounds(0, 0, 800, 600);
		jf.add(lb);

		jl = new JLabel("Update Employee Details");
		jl.setForeground(Color.BLACK);
		jl.setFont(new Font("san-serif", Font.ITALIC, 22));
		jl.setBounds(300, 20, 500, 50);
		lb.add(jl);

		jl2 = new JLabel("Name");
		jl2.setFont(new Font("san-serif", Font.BOLD, 16));
		jl2.setBounds(40, 100, 100, 30);
		lb.add(jl2);

		jtf2 = new JTextField(name);
		jtf2.setBounds(160, 100, 150, 30);
		lb.add(jtf2);

		jl3 = new JLabel("Age");
		jl3.setFont(new Font("san-serif", Font.BOLD, 16));
		jl3.setBounds(40, 150, 100, 30);
		lb.add(jl3);

		jtf3 = new JTextField(age);
		jtf3.setBounds(160, 150, 150, 30);
		lb.add(jtf3);

		jl4 = new JLabel("Email Id");
		jl4.setFont(new Font("san-serif", Font.BOLD, 16));
		jl4.setBounds(40, 200, 100, 30);
		lb.add(jl4);

		jtf4 = new JTextField(email);
		jtf4.setBounds(160, 200, 150, 30);
		lb.add(jtf4);

		jl5 = new JLabel("Address");
		jl5.setFont(new Font("san-serif", Font.BOLD, 16));
		jl5.setBounds(40, 250, 100, 30);
		lb.add(jl5);

		jtf5 = new JTextField(address);
		jtf5.setBounds(160, 250, 150, 30);
		lb.add(jtf5);

		jl6 = new JLabel("Job Post");
		jl6.setFont(new Font("san-serif", Font.BOLD, 16));
		jl6.setBounds(40, 300, 100, 30);
		lb.add(jl6);

		jtf6 = new JTextField(post);
		jtf6.setBounds(160, 300, 150, 30);
		lb.add(jtf6);

		jl7 = new JLabel("Employee Id");
		jl7.setFont(new Font("san-serif", Font.BOLD, 16));
		jl7.setBounds(40, 350, 100, 30);
		lb.add(jl7);

		jtf7 = new JTextField(emp_id);
		jtf7.setBounds(160, 350, 150, 30);
		lb.add(jtf7);

		jl8 = new JLabel("Father's Name");
		jl8.setFont(new Font("san-serif", Font.BOLD, 16));
		jl8.setBounds(360, 100, 150, 30);
		lb.add(jl8);

		jtf8 = new JTextField(fname);
		jtf8.setBounds(510, 100, 150, 30);
		lb.add(jtf8);

		jl9 = new JLabel("Date Of Birth");
		jl9.setFont(new Font("san-serif", Font.BOLD, 16));
		jl9.setBounds(360, 150, 150, 30);
		lb.add(jl9);

		jtf9 = new JTextField(dob);
		jtf9.setBounds(510, 150, 150, 30);
		lb.add(jtf9);

		jl10 = new JLabel("Phone");
		jl10.setFont(new Font("san-serif", Font.BOLD, 16));
		jl10.setBounds(360, 200, 150, 30);
		lb.add(jl10);

		jtf10 = new JTextField(phone);
		jtf10.setBounds(510, 200, 150, 30);
		lb.add(jtf10);

		jl11 = new JLabel("Education");
		jl11.setFont(new Font("san-serif", Font.BOLD, 16));
		jl11.setBounds(360, 250, 150, 30);
		lb.add(jl11);

		jtf11 = new JTextField(edu);
		jtf11.setBounds(510, 250, 150, 30);
		lb.add(jtf11);

		jl12 = new JLabel("Adhaar No");
		jl12.setFont(new Font("san-serif", Font.BOLD, 16));
		jl12.setBounds(360, 300, 150, 30);
		lb.add(jl12);

		jtf12 = new JTextField(adhaar);
		jtf12.setBounds(510, 300, 150, 30);
		lb.add(jtf12);

		b1 = new JButton("Update");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(200, 420, 150, 30);
		b1.addActionListener(this);
		lb.add(b1);

		b2 = new JButton("Cancel");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(400, 420, 150, 30);
		b2.addActionListener(this);
		lb.add(b2);

		jf.setSize(800, 520);
		jf.setLocation(250, 80);
		jf.setVisible(true);
		
		} else {
				JOptionPane.showMessageDialog(null, "Invalid Id");
				new SearchEmployee();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
			String q = "Update employee set name='" + jtf2.getText() + "',fname='" + jtf8.getText() + "',age='"
					+ jtf3.getText() + "',dob='" + jtf9.getText() + "',address='" + jtf5.getText() + "',phone='"
					+ jtf10.getText() + "',email='" + jtf4.getText() + "',education='" + jtf11.getText() + "',post='"
					+ jtf6.getText() + "',adhaar='" + jtf12.getText() + "',emp_id='" + jtf7.getText()
					+ "' where emp_id='" + str + "'";
			
			Conn c1=new Conn();
			try {
				c1.s.executeUpdate(q);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Employee details are updated");
			jf.setVisible(false);
			new SearchEmployee();
		}
		if(ae.getSource()==b2)
		{
			jf.setVisible(false);
			new Details();
		}

	}

//	public static void main(String... arg) {
//		new UpdateEmployee("1001");
//	}

}
