// Demonstrate JLabel and ImageIcon.

import java.awt.*;
import javax.swing.*;

/*
<applet code="swng10" width=250 height=200>
</applet>
*/

public class swng10 extends JApplet 
{
 public void init() 
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
    catch (Exception exc) 
    {
System.out.println("Can't create because of " + exc);
    }
  }
  private void makeGUI() 
  {
  ImageIcon ii = new ImageIcon("hourglass.png");
  JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);
  add(jl);
  }
}
