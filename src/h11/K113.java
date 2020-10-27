package h11;

import java.applet.Applet;
import java.awt.*;

public class K113 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int drie =3;
        int keer;
        int uitkomst;
        int y = 0;

        for (keer = 1;keer<11;keer++){

            uitkomst = drie * keer;
            y += 20;

            g.drawString("" + uitkomst,20,y);
        }
    }
}
