import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// import javafx.scene.paint.*;
// import java.awt.color.*;
 class lab_task5 implements ActionListener
{
   JPanel jp=new JPanel(new FlowLayout());
   JPanel jp1=new JPanel(new FlowLayout());
JFrame jfrm=new JFrame("head lights");
JLabel jlab=new JLabel("");
JRadioButton red=new JRadioButton("red");

JRadioButton green=new JRadioButton("green");

JRadioButton Yellow=new JRadioButton("Yellow");
Font f1=new Font("Verdana",Font.CENTER_BASELINE , 100);

 lab_task5()
 {   
jfrm.setLayout(new GridLayout(2,1));
jfrm.setVisible(true);
jfrm.setSize(800, 600);
jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);

jfrm.add(jp);
jfrm.add(jp1);
jp.add(jlab);
jp1.add(red);
jp1.add(green);
jp1.add(Yellow);
jlab.setFont(f1);
red.setBackground(Color.RED);
green.setBackground(Color.green);
Yellow.setBackground(Color.YELLOW);
red.addActionListener(this);
green.addActionListener(this);
Yellow.addActionListener(this);


ButtonGroup bd=new ButtonGroup();
bd.add(red);
bd.add(green);
bd.add(Yellow);


 }
public void actionPerformed(ActionEvent e)
{
    if(e.getActionCommand()=="red")
    {
        jlab.setForeground(Color.red);
        jlab.setText("Stop");
    
    }
    if(e.getActionCommand()=="green")
    {
        jlab.setForeground(Color.green);
        jlab.setText("Go");

    }
    if(e.getActionCommand()=="Yellow")
    {
        jlab.setForeground(Color.yellow);
        jlab.setText("wait");

    }
}
public static void main(String[] args){
    new lab_task5();
  
  
}
}