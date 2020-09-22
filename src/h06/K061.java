package h06;

import java.applet.Applet;
import java.awt.*;

public class K061 extends Applet {
int a,b,c,uit,uit1;
    public void init() {
        a = 60;
        b = 24;
        c = 365;
        uit = a * b;
        uit1 = uit * c;

    }


    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        g.setColor(Color.WHITE);
        g.drawString("seconden in een uur: " + a,20,20);
        g.drawString("seconden in een dag: " + uit,20,40);
        g.drawString("seconden in een jaar: " + uit1,20,60);

    }
}
