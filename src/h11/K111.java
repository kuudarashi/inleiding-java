package h11;

import java.applet.Applet;
import java.awt.*;

public class K111 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for (teller = 10; teller < 21; teller++) {
            x += 20;

            g.drawString("" + teller, 20, x);
        }

    }
}
