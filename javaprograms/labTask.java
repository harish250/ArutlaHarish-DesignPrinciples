import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class labTask
{
    int x,y,re;
    JLabel j=new JLabel("Perform Division operator");
    JTextField num1,num2,result;
 labTask()
 {
     JFrame jfrm=new JFrame("DIVISION");
    jfrm.setVisible(true);
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(jfrm.DISPOSE_ON_CLOSE);
    jfrm.setSize(800,600);
    num1 =new JTextField(20);
    num2 =new JTextField(20);
    result =new JTextField(20);

    num2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent me)
      {
        x=Integer.parseInt(num1.getText());
           y=Integer.parseInt(num2.getText());
           try
           {
             re= x/y;
             result.setText(""+re);
             
           }     
           catch(ArithmeticException e)
           {
               JOptionPane.showMessageDialog(jfrm,e.getMessage());
           }
          }

    });
    jfrm.add(num1);
    jfrm.add(num2);
    jfrm.add(result);

 }
public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable()
    {
     public void run()
     {
         new labTask();
     }
    });
}


}