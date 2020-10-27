package h11;

import java.applet.Applet;
import java.awt.*;

public class K116 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int loop;
        int h = 500;
        int l = 500;
        int x = 100;
        int y = 0;
        for (loop = 0;loop <50;loop++){
            h -= 10;
            l -= 10;
            x += 5;
            y += 5;
            g.drawOval(x,y,l,h);
        }
    }
}

