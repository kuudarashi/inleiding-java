package h12;

import java.applet.Applet;
import java.awt.*;

public class K12 extends Applet {
    double[] tabel = {1,2,3,4,5,6,7,8,9,10};
    double totaal = 0;
    public void init() {}


    public void paint(Graphics g) {
        for (int teller = 0; teller < tabel.length; teller ++) {
            g.drawString("" + tabel[teller], 50, 20 * teller + 20);

            totaal += tabel[teller];
        }
        double gemiddelde = totaal / tabel.length;
        g.drawString("gemiddelde : " + gemiddelde,50, tabel.length * 20 + 40);
    }
}
