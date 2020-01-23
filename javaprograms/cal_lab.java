import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class cal_lab implements ActionListener
{
   JFrame jfrm;
   JTextField jtxt;
   JButton jb0,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jadd,jsub,jmul,jdiv,jequ,jdo,jclear; 
  int opera;
   double x,y,res;
   cal_lab()
   {
  jfrm=new JFrame("Simple Calculator");
  jfrm.setLayout(new GridLayout(4,4));
  jfrm.setVisible(true);
  jfrm.setSize(350,500);
  jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);


  jtxt=new JTextField(40);
  jb0 =new JButton("0");
  jb1 =new JButton("1");
  jb2 =new JButton("2");
  jb3 =new JButton("3");
  jb4 =new JButton("4");
  jb5 =new JButton("5");
  jb6 =new JButton("6");
  jb7 =new JButton("7");
  jb8 =new JButton("8");
  jb9 =new JButton("9");
  jadd =new JButton("+");
  jsub =new JButton("-");
  jmul =new JButton("*");
  jdiv =new JButton("/");
  jequ =new JButton("=");
  jdo =new JButton(".");
  jclear=new JButton("clear");
jb0.addActionListener(this);
jb1.addActionListener(this);
jb2.addActionListener(this);
jb3.addActionListener(this);
jb4.addActionListener(this);
jb5.addActionListener(this);
jb6.addActionListener(this);
jb7.addActionListener(this);
jb8.addActionListener(this);
jb9.addActionListener(this);
jadd.addActionListener(this);
jsub.addActionListener(this);
jmul.addActionListener(this);
jdiv.addActionListener(this);
jequ.addActionListener(this);
jdo.addActionListener(this);
jclear.addActionListener(this);

  jfrm.add(jtxt);
  jfrm.add(jb7);
  jfrm.add(jb8);
  jfrm.add(jb9);
  jfrm.add(jadd);

  jfrm.add(jb4);
  jfrm.add(jb5);
  jfrm.add(jb6);
  jfrm.add(jsub);

  jfrm.add(jb3);
  jfrm.add(jb4);
  jfrm.add(jb5);
  jfrm.add(jmul);

  jfrm.add(jb0);
  jfrm.add(jdo);
  jfrm.add(jdiv);
  jfrm.add(jequ);
  jfrm.add(jclear);
  
   }
   public void actionPerformed(ActionEvent e)
   {
  if(e.getSource().equals(jb0))
      jtxt.setText(jtxt.getText().concat("0"));
  if(e.getSource().equals(jb1))
      jtxt.setText(jtxt.getText().concat("1"));
  if(e.getSource().equals(jb2)))
      jtxt.setText(jtxt.getText().concat("2"));
  if(e.getSource().equals(jb3))
      jtxt.setText(jtxt.getText().concat("3"));
  if(e.getSource().equals(jb4))
      jtxt.setText(jtxt.getText().concat("4"));
  if(e.getSource().equals(jb5))
      jtxt.setText(jtxt.getText().concat("5"));
  if(e.getSource().equals(jb6))
      jtxt.setText(jtxt.getText().concat("6"));
  if(e.getSource().equals(jb7))
      jtxt.setText(jtxt.getText().concat("7"));
  if(e.getSource().equals(jb8))
      jtxt.setText(jtxt.getText().concat("8"));
  if(e.getSource().equals(jb9))
      jtxt.setText(jtxt.getText().concat("9"));
  if(e.getSource()==jdo )
      jtxt.setText(jtxt.getText().concat("."));
   if(e.getSource()==jadd)
   {
   x=Double.parseDouble(jtxt.getText());
   opera=1;
   jtxt.setText("");
   }
   if(e.getSource()==jsub)
   {
   x=Double.parseDouble(jtxt.getText());
   opera=2;
   jtxt.setText("");
   }
   if(e.getSource()==jmul)
   {
   x=Double.parseDouble(jtxt.getText());
   opera=3;
   jtxt.setText("");
   }
   if(e.getSource()==jdiv)
   {
   x=Double.parseDouble(jtxt.getText());
   opera=4;
   jtxt.setText("");
   }
   if(e.getSource()==jequ)
   {
       y=Double.parseDouble(jtxt.getText());
       switch (opera) {
           case 1:
           res=x+y;
               break;
            case 2:
               res=x-y;
                   break;
            case 3:
                   res=x*y;
                       break;
             case 4:
                   res=x/y;
                        break;       
           default:
           res=0;
               break;
       }
       jtxt.setText(""+res);
   }
   if(e.getSource()==jclear){
       jtxt.setText("");
   }
}
public static void main(String[] args) {
    new cal_lab();
}

}