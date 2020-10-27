package h11;

import java.applet.Applet;
import java.awt.*;

public class K117 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int loop;
        int h = 1000;
        int l = 1000;
        int x = 0;
        int y = 0;
        for (loop = 0;loop <1000;loop++){
            h -= 1;
            l -= 1;
            x += 0;
            y += 0;
            g.drawOval(x,y,l,h);
        }
    }
}
