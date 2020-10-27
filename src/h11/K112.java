package h11;

import java.applet.Applet;
import java.awt.*;

public class K112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int int1;
        int int2=1;
        int int3;
        int x = 0;

        for ( int3 =0; int3 <500; ) {
            int1 = int2 ;
            int2 = int3;
            int3 = int1 +int2;
            x += 20;

            g.drawString("" + int3, 20,  x);
        }
    }
}
