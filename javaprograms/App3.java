import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="App3" height=800 width =800 ></applet>*/
public class App3 extends Applet
{
    String msg;
    public void init()
    {
        addMouseListener(new test());
    }
    class test extends MouseAdapter
    {   
        public void mouseClicked(MouseEvent me)
        {
            msg="Mouse CLicked";
            repaint();
        }
        public void mouseReleased(MouseEvent me)
        {
            msg="mouse Released";
            repaint();
        }
        public void mouseEntered(MouseEvent me)
        {
            msg="Mouse enterred the  applet";
            repaint();
            
        }
        public void mouseExited(MouseEvent me)
        {
            msg="Mouse pointer exited";
            repaint();
        }
       
    }
    public void paint(Graphics g)
        {
            g.drawString(msg,400,400);
        }
}
