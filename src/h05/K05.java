package h05;

import java.applet.Applet;
import java.awt.*;

public class K05 extends Applet {
    Color opvullkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        breedte = 200;
        hoogte = 100;
        lijnkleur = Color.BLACK;
        opvullkleur = Color.MAGENTA;

    }


    public void paint(Graphics g) {
        g.drawLine(10, 10, 210, 10);
        g.drawString("lijn", 105, 20);
        g.drawRect(10, 40, breedte, hoogte);
        g.drawString("rechthoek", 90, 150);
        g.drawString("gevulde rechthoek met ovaal", 250, 150);
        g.drawOval(440, 40, breedte, hoogte);
        g.drawString("taartpunt met ovaal eromheen", 460, 150);
        g.drawRoundRect(10, 160, breedte, hoogte, 30, 30);
        g.drawString("afgeronde rechthoek", 60, 270);
        g.drawString("gevulde ovaal", 290, 270);
        g.drawOval(490, 160, 100, hoogte);
        g.drawString("cirkel", 530, 273);
        g.setColor(opvullkleur);
        g.fillOval(220, 160, breedte, hoogte);
        g.fillArc(440, 40, breedte, hoogte, 0, 45);
        g.fillRect(220, 40, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(220, 40, breedte, hoogte);
    }
}
