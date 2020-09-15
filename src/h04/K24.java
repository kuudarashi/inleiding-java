package h04;

import java.applet.Applet;
import java.awt.*;

public class K24 extends Applet {

    public void init() {
    }


    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.RED);
        g.drawLine(600, 600, 650, 700);
        g.drawLine(600, 600, 550, 700);
        g.drawRect(550, 700, 100, 100);
        g.drawRect(610,760,20,40);
        g.drawRect(570,730,20,20);
        g.drawLine(570,740,590,740);
        g.drawLine(580,730,580,750);
        g.drawOval(612,780,5,5);
    }
}
