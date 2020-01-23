import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/*<applet code="App2" height=800 width=800    >
</applet>*/
public class App2 extends Applet 
{
    public void init()
    {
        addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseDragged(MouseEvent me)
        {int x1=me.getX();
            int y1=me.getY();
            showStatus("you are at "+x1+" "+y1);
            repaint();
        }
    
        });
    }
}