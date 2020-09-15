package h04;

import java.applet.Applet;
import java.awt.*;

public class K64 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(20,5,40,70);
        g.drawRect(34,75,10,120);
        g.setColor(Color.RED);
        g.fillOval(35,15,10,10);
        g.setColor(Color.YELLOW);
        g.fillOval(35,35,10,10);
        g.setColor(Color.GREEN);
        g.fillOval(35,55,10,10);
    }
}
