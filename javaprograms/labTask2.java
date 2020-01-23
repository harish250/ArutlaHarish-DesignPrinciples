import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/*<applet code="labTask2" height=600 width=800 >
</applet>*/
public class labTask2 extends JApplet
{
    JTextField num,fac;
    int x;
long res;
    
    public  void init()
    {
     try
     {
         SwingUtilities.invokeAndWait(new Runnable()
        {

               public void run()
               {
                   makeGUI();
               } 
        });
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }

    void makeGUI()
    {
       setLayout(new FlowLayout());
       JLabel jl=new JLabel("Perform the factorial");
       JButton jb1=new JButton("compute");
       num=new JTextField(15);
       fac=new JTextField(15);
      jb1.addActionListener(new ActionListener()
      {
       public void actionPerformed(ActionEvent e)
       {
          x=Integer.parseInt(num.getText());
          res=fact(x);
          fac.setText(res+" ");
       }
      }); 
add(num);
add(jb1);
add(fac);
    }
    long fact(int num)
    {
        if(num==1 || num==0)
        {
            return 1;
        }
        else{
return num*fact(num-1);
        }
    }








}
