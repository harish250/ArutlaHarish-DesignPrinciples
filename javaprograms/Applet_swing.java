import java.awt.*;
import java.applet.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.*;

/*<applet code="Applet_swing"  height=600 width=600 >
</applet>*/
public class Applet_swing extends JApplet {
    JLabel jlb;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    makeGUI();
                }

            });
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void makeGUI() {
        setLayout(new FlowLayout());
        JLabel label = new JLabel("Click a Button");
        JButton jb1 = new JButton("alpha");
        JButton jb2 = new JButton("beta");
        add(jb1);
        add(jb2);
        add(label);
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent me) {
                label.setText("Alpha is pressed");
            }
        });
        jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("beta is pressed");
            }
        });
    }

}
