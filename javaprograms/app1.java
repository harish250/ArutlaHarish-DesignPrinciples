import java.applet.*;
import java.awt.*;
// <applet code="app1" width=650 height=600></applet>

public class app1 extends Applet implements Runnable
{
    String msg="Applet are used to develop web based java applications ";
    char ch;
    boolean stopflag=true;
    Thread t=null;
    public void start()
    {
        t = new Thread(this);
        stopflag=false;
        t.start();
    }
    public void run ()
    {
       
 while(true)
 {
     try  
      {
    Thread.sleep(100);
     repaint();
     ch=msg.charAt(0);
     msg=msg.substring(1,msg.length());
     msg=msg+ch;

 if(stopflag)
 break;
               }
catch(Exception e)
{
}
 }             
    }
public void stop()
{
    stopflag=false;
    t=null;

}

public void paint(Graphics g)
{
    Font f=new Font("Arial",Font.ITALIC,20);
    g.setFont(f);
    g.setColor(Color.GREEN);
    g.drawString(msg, 20, 570);
}

}