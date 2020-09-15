package h04;

import java.applet.Applet;
import java.awt.*;

public class K54 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.YELLOW);
        g.fillArc(20, 20, 100, 50, 90, 360);
    }
}
