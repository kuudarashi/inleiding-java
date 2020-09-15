package h04;

import java.applet.Applet;
import java.awt.*;

public class K04 extends Applet {

    public void init() {
    }


    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.RED);
        g.drawLine(300,300,350,400);
        g.drawLine(300,300,250,400);
        g.drawLine(250,400,350,400);
        g.drawLine(600,600,650,700);
        g.drawLine(600,600,550,700);
        g.drawRect(550,700,100,100);

    }
}
