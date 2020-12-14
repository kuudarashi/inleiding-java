package h12;

import java.applet.Applet;
import java.awt.*;


public class K121 extends Applet {
    Button[] knopjes = new Button[25];



    public void init() {
        int i = 0;
        while (i < 25) {
            knopjes[i] = new Button("knop" + i);
            add(knopjes[i]);
            i++;
        }
    }


    public void paint(Graphics g) {

    }
}
