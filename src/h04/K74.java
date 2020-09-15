package h04;

import java.applet.Applet;
import java.awt.*;

public class K74 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
      g.drawRoundRect(20,5,40,40,10,10);
      g.drawOval(25,10,5,5);
      g.drawOval(50,10,5,5);
      g.drawOval(25,35,5,5);
      g.drawOval(50,35,5,5);

    }
}
