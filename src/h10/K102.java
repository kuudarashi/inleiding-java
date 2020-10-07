package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class K102 extends Applet {
    TextField txt;
    Label lab;
    String s, tekst;
    int maand;

    public void init() {
        txt = new TextField("", 20);
        lab = new Label("Type de maand en druk op enter");
        txt.addActionListener( new TekstvakListener() );
        tekst = "";
        add(lab);
        add(txt);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = txt.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "januari 31 dagen";
                    break;
                case 2:
                    tekst = "februari 28 dagen";
                    break;
                case 3:
                    tekst = "maart 31 dagen";
                    break;
                case 4:
                    tekst = "april 30 dagen";
                    break;
                case 5:
                    tekst = "mei 31 dagen";
                    break;
                case 6:
                    tekst = "juni 30 dagen";
                    break;
                case 7:
                    tekst = "juli 31 dagen";
                    break;
                case 8:
                    tekst = "augustus 31 dagen";
                    break;
                case 9:
                    tekst = "september 30 dagen";
                    break;
                case 10:
                    tekst = "oktober 31 dagen";
                    break;
                case 11:
                    tekst = "november 30 dagen";
                    break;
                case 12:
                    tekst = "december 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
