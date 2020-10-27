package h11;

import java.applet.Applet;
import java.awt.*;

public class K114 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
    int y= 0;
    int x =0;
    int loop;
    for (loop =0;loop <5; loop++){
        y += 20;
        x += 20;
        g.drawRect(x,y,20,20);
    }

    }
}
