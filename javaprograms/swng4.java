// Paint lines to a panel.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// This class extends JPanel. It overrides
// the paintComponent() method so that random
// lines are plotted in the panel.

class PaintPanel extends JPanel 
{
 Insets ins; // holds the panel’s insets
 Random rand; // used to generate random numbers

 // Construct a panel.
 PaintPanel() 
 {
 // Put a border around the panel.
 setBorder(BorderFactory.createLineBorder(Color.RED,5));
 rand = new Random();
 }

 // Override the paintComponent() method.
 protected void paintComponent(Graphics g) 
 {
  // Always call the superclass method first.
  super.paintComponent(g);
  int x, y, x2, y2;
  // Get the height and width of the component.
  int height = getHeight();
  int width = getWidth();
  // Get the insets.
  ins = getInsets();
  // Draw ten lines whose endpoints are randomly generated.
  for(int i=0; i < 10; i++) 
  {
  // Obtain random coordinates that define
  // the endpoints of each line.
  x = rand.nextInt(width-ins.left);
  y = rand.nextInt(height-ins.bottom);
  x2 = rand.nextInt(width-ins.left);
  y2 = rand.nextInt(height-ins.bottom);
  // Draw the line.
  g.drawLine(x, y, x2, y2);
  }
 }
}


// Demonstrate painting directly onto a panel.
class swng4 
{
 JLabel jlab;
 PaintPanel pp;
 swng4() 
 {
  JFrame jfrm = new JFrame("Paint Demo");
  jfrm.setSize(200, 150);
  jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  pp = new PaintPanel();
  jfrm.add(pp);
  jfrm.setVisible(true);
 }
 public static void main(String args[]) 
 {
  SwingUtilities.invokeLater(new Runnable() 
  {
   public void run() 
   {
    new swng4();
   }
  });
 }
}
