package h06;

import java.applet.Applet;
import java.awt.*;

public class KP6 extends Applet {
double a,b,c,d,e,uit,uit2,uit4,uit5;
int uit3;
    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        uit = (a + b + c ) / d;
        uit2 = e * uit;
        uit3= (int) uit2;
        uit4=  uit3;
        uit5= uit4 / e;


    }

    public void paint(Graphics g) {
        g.drawString("het gemiddelde is" + uit5,20,20);
    }
}
