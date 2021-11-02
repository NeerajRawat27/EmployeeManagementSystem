
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login implements ActionListener{
    
        JFrame jf;
        JLabel jl1,jl2;
        JButton b1,b2;
        JPasswordField jpf;
        JTextField jtf;
        
        public Login()
        {
            jf=new JFrame("Login");
            jf.setBackground(Color.WHITE);
            jf.setLayout(null);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            jl1=new JLabel("Username");
            jl1.setBounds(40,20,100,30);
            jf.add(jl1);
            
            jl2=new JLabel("Password");
            jl2.setBounds(40, 70, 100, 30);
            jf.add(jl2);
            
            jtf=new JTextField();
            jtf.setBounds(150,20,150,30);
            jf.add(jtf);
            
            jpf=new JPasswordField();
            jpf.setBounds(150,70,150,30);
            jf.add(jpf);
            
            b1=new JButton("Login");
            b1.setBounds(40,150,120,30);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            jf.add(b1);
            
            
            b2=new JButton("Cancel");
            b2.setBounds(180,150,120,30);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
            jf.add(b2);
            
            
            ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
            Image img=ic1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            ImageIcon ic2=new ImageIcon(img);
            JLabel lb=new JLabel(ic2);
            lb.setBounds(350,20,150,150);
            jf.add(lb);
            
            
            
            jf.setSize(600,300);
            jf.setLocation(400,200);
            jf.setVisible(true);
            
        }
        
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==b1)
            {
                try {
                String userName=jtf.getText();
                String userPass=jpf.getText();
//                    System.out.println(userName+"\n"+userPass);
                
                Conn c1=new Conn();
                String q="Select*from login where username='"+userName+"' and password='"+userPass+"'";
                ResultSet rs=c1.s.executeQuery(q);
                
                if(rs.next())
                {
                    new Details();
                    jf.setVisible(false);
                }else
                {
                    JOptionPane.showMessageDialog(null, "Invalid user try again");
//                    jf.setVisible(false);
                }
                
            } catch (Exception ex) {
                System.out.println(ex);
            }
            }
            
            
        }
    
//    public static void main(String[] args) {
//        new Login();
//    }
}
