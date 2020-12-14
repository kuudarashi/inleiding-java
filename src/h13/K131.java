package h13;

import java.applet.Applet;
import java.awt.*;

import static java.awt.Color.*;

public class K131 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.setColor(red);
      redWall(g);
      g.setColor(BLACK);
        walLine(g);
    }

    void redWall (Graphics g){
        int x = 10;
        for(int o = 0;o < 5; o ++) {
            x += 40;

            g.fillRect(x, 10, 40, 20);
        }
        int x2 = 30;
        for (int K = 0;K < 5;K ++) {
            x2 += 40;
            g.fillRect(x2,30,40,20);
        }
        int x3 = 10;
        for(int o = 0;o < 5; o ++) {
            x3 += 40;

            g.fillRect(x3, 50, 40, 20);
        }

    }
    void walLine (Graphics g){
        int x = 10;
        for(int o = 0;o < 5; o ++) {
            x += 40;
            g.drawRect(x, 10, 40, 20);
        }
        int x2 = 30;
        for (int K = 0;K < 5;K ++) {
            x2 += 40;
            g.drawRect(x2,30,40,20);
        }
        int x3 = 10;
        for (int K = 0;K < 5;K ++) {
            x3 += 40;
            g.drawRect(x3,50,40,20);
        }

    }
}
