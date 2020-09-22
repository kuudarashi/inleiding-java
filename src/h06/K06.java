package h06;

import java.applet.Applet;
import java.awt.*;

public class K06 extends Applet {
double a,b,uitkomst;

    public void init() {
        a=113;
        b=4;
        uitkomst= a / b;

    }


    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        g.setColor(Color.RED);
        g.drawString("Jann:" + uitkomst,20,20);
        g.drawString("Ali:" + uitkomst, 20,40);
        g.drawString("Jeannette:" + uitkomst,20,60);
        g.drawString("O'nyll:" + uitkomst,20,80);

    }
}
