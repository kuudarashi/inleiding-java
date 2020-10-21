package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KP10 extends Applet {
    int a;
    TextField txv;
    String txt;

    public void init() {
        setBackground(Color.DARK_GRAY);
        txv = new TextField("",5);
        txv.addActionListener(new txtfield ());
        add(txv);
        txt= "";

    }

    public void paint(Graphics g) {
        g.drawString(txt,50,50);
    }

    class txtfield implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            txt = txv.getText();
            a = Integer.parseInt(txt);
            switch (a) {
                case 1:
                    txt = "slecht";
                    break;
                case 2:
                    txt = "slecht";
                    break;
                case 3:
                    txt = "slecht";
                    break;
                case 4:
                    txt = "onvoldoende";
                    break;
                case 5:
                    txt = "matig";
                    break;
                case 6:
                    txt = "voldoende";
                    break;
                case 7:
                    txt = "voldoende";
                    break;
                case 8:
                    txt = "goed";
                    break;
                case 9:
                    txt = "goed";
                    break;
                case 10:
                    txt = "goed";
                    break;
                default:
                    txt= "geen geldig getal!";

            }
            repaint();
        }
    }
}
