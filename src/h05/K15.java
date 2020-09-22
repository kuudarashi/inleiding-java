package h05;

import java.applet.Applet;
import java.awt.*;

public class K15 extends Applet {
int  valerie, jeroen, hans;


    public void init() {
  valerie = 40;
  jeroen = 100;
  hans = 80;


    }

    public void paint(Graphics g) {
        g.drawLine(0,110,80,110);
        g.setColor(Color.MAGENTA);
        g.fillRect(0,70,20,valerie);
        g.setColor(Color.YELLOW);
        g.fillRect(30,10,20,jeroen);
        g.setColor(Color.GREEN);
        g.fillRect(60,30,20,hans);
        g.setColor(Color.BLACK);
        g.drawLine(80,10,80,110);
        g.setColor(Color.blue);
        g.drawString("-100",85,13);
        g.drawString("-80",85,33);
        g.drawString("-60",85,53);
        g.drawString("-40",85,73);
        g.drawString("-20",85,93);
        g.drawString("-0",85,113);
        g.setColor(Color.MAGENTA);
        g.drawString("valerie: 40 kg",0,125);
        g.setColor(Color.YELLOW);
        g.drawString("jeroen: 100 Kg",0,145);
        g.setColor(Color.GREEN);
        g.drawString("hans: 80 Kg",0,165);
    }
}
