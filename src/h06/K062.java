package h06;

import java.applet.Applet;
import java.awt.*;

public class K062 extends Applet {
int a,b,uit;

    public void init() {
        a = 2147483647;
        b = 5;
        uit = a + b;

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("positief+positief = negatief:" + uit,20,20);
    }
}
