package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KP112 extends Applet {
    Button button;
    int meth = 1;

    public void init() {
        button = new Button("OK");
        button.addActionListener(new ButtonListener());
        add(button);

    }

    public void paint(Graphics g) {
        int y = 50,keer = 1, result;

        while(keer  <= 10 && meth <= 10) {
            y+= 20;
            result = keer * meth;
            g.drawString(keer + " x " + meth + " = " + result,50,y);
            keer++;
        }
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meth++;
            repaint();
        }
    }
}

