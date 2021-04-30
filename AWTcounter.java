/*<applet code="AWTcounter.class" width=300 height=300>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AWTcounter extends Applet implements ActionListener
{
int count=0;
Label l;TextField tf;Button b;
public void init()
{
l=new Label("counter");
tf=new TextField();
b=new Button("count");
b.addActionListener(this);
tf.addActionListener(this);
add(l);add(tf);add(b);
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
if(s.equals("count"))
{
count++;
tf.setText(Integer.toString(count));
}
}
}

