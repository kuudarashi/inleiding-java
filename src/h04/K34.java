package h04;

import java.applet.Applet;
import java.awt.*;

public class K34 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
g.drawRect(20,5,3,100);
g.setColor(Color.RED);
g.fillRect(20,5,60,10);
g.setColor(Color.WHITE);
g.fillRect(20,15,60,10);
g.setColor(Color.BLUE);
g.fillRect(20,25,60,10);


    }
}
