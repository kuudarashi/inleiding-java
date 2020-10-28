package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class KP11 extends Applet {
    TextField txv;
    Button button;
    int basic_math = 1;

    public void init() {
        txv = new TextField("", 5);
        button = new Button("OK");
        button.addActionListener(new ButtonListener());
        add(txv);
        add(button);

    }

    public void paint(Graphics g) {
        int y = 50,keer = 1, result;

        while(keer <= 10 && basic_math <= 10) {
            y+= 20;
            result = keer * basic_math;
            g.drawString(keer + " x " + basic_math + " = " + result,50,y);
            keer++;
        }
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = txv.getText();
            basic_math = Integer.parseInt(s);
            repaint();
        }
    }
}

