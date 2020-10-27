package h11;

import java.applet.Applet;
import java.awt.*;

public class K115 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int loop;
        int h = 120;
        int l = 120;
        int x = 80;
        int y = 80;
        for (loop = 0;loop <5;loop++){
            h -= 20;
            l -= 20;
            x += 10;
            y += 10;
            g.drawOval(x,y,l,h);
        }
    }
}
