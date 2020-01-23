import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class swing1
{
JLabel jlab;
swing1()
{
    JLabel jlab =new JLabel("Press a Button.");
    JFrame jfrm =new JFrame("An event Example");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
    jfrm.setVisible(true);
    jfrm.setSize(800,600);
   

    JButton jbtnAlpha=new JButton("Alpha");
    JButton jbtnBeta=new JButton("Beta");
    jfrm.add(jbtnAlpha);
    jfrm.add(jbtnBeta);
    jfrm.add(jlab);
    jbtnAlpha.addActionListener(new ActionListener()
    {
public void actionPerformed(ActionEvent ae )
{
    jlab.setText("Alpha is pressed");
}

    });
    jbtnBeta.addActionListener(new ActionListener()
    {
public void actionPerformed(ActionEvent ae)
{
    jlab.setText("Beta is pressed");
}

    });
    
   
}
public static void main(String []args)
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
    new swing1();
}
});
}




}