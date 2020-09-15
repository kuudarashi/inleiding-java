package h04;

import java.applet.Applet;
import java.awt.*;

public class KP4 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawLine(10, 10, 210, 10);
        g.drawString("lijn", 105, 20);
        g.drawRect(10, 40, 200, 100);
        g.drawString("rechthoek", 90, 150);
        g.drawString("gevulde rechthoek met ovaal", 250, 150);
        g.drawOval(440, 40, 200, 100);
        g.drawString("taartpunt met ovaal eromheen", 460, 150);
        g.drawRoundRect(10, 160, 200, 100, 30, 30);
        g.drawString("afgeronde rechthoek", 60, 270);
        g.drawString("gevulde ovaal", 290, 270);
        g.drawOval(490, 160, 100, 100);
        g.drawString("cirkel", 530, 273);
        g.setColor(Color.MAGENTA);
        g.fillOval(220, 160, 200, 100);
        g.fillArc(440, 40, 200, 100, 0, 45);
        g.fillRect(220, 40, 200, 100);
        g.setColor(Color.BLACK);
        g.drawOval(220, 40, 200, 100);
    }
}
