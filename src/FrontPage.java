
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrontPage implements ActionListener{
    
    JFrame jf;
    JLabel jl1,jl2;
    JButton b;
    
    public FrontPage()
    {
        jf=new JFrame("Employee Management System");
        jf.setBackground(Color.RED);
        jf.setLayout(null);
        
        ImageIcon ic1=new ImageIcon(getClass().getResource("icons/front.jpg"));
        Image img=ic1.getImage().getScaledInstance(960, 500, Image.SCALE_DEFAULT);
        ImageIcon ic2=new ImageIcon(img);
        JLabel jl1=new JLabel(ic2);
        jl1.setBounds(0,100,1060,390);
        jf.add(jl1);
        
        b=new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(380,430,300,50);
        b.addActionListener(this);
        
        JLabel jl2=new JLabel();
        jl2.setBounds(0,0,1060,550);
        jl2.setLayout(null);
       
        JLabel jl3=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        jl3.setForeground(Color.RED);
        jl3.setFont(new Font("san-serif",Font.PLAIN,55));
        jl3.setBounds(50,10,1000,80);
        
        jl2.add(jl3);
        jl2.add(b);
        jf.add(jl2);
        
        jf.getContentPane().setBackground(Color.WHITE);
        
        jf.setSize(1060,550);
        jf.setLocation(200,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
        while(true)
        {
                jl3.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrontPage.class.getName()).log(Level.SEVERE, null, ex);
            }
                jl3.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrontPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
        {
            jf.setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new FrontPage();
    }
}