package h10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K104 extends Applet {
    double a,totaal, gemiddeld;
    int cijfers;
    TextField txt;
    Button butt;
    String tekst,txt2,gm,g;

    public void init() {
        butt = new Button("ok");
        add(butt);
        butt.addActionListener(new on ());
        txt = new TextField("", 5);
        add(txt);
        txt.addActionListener(new txv());
        tekst = "";
        totaal = 0.0;
        cijfers = 0;
        txt2 ="";
    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,50);
        g.drawString(gm + gemiddeld,50,70);
        g.drawString(txt2,50,90);
    }
    class txv implements ActionListener{
        public void actionPerformed(ActionEvent e) {

         g = txt.getText();
         a = Double.parseDouble(g);
         totaal += a;
         cijfers ++;


         if (a >= 5.5) {
             tekst = "voldoende";
         }
         else {
             tekst = "onvoldoende";
         }
         repaint();
        }
    }
    class on implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            gemiddeld = totaal / cijfers;
            gm = "gemiddelde: ";
            if (gemiddeld >= 5.5) {
                txt2 = "gefeliciteerd u bent geslaagd!";
            } else {
                txt2 = "helaas u bent gezakt";
            }
            repaint();
        }
    }
}
// dont forget to make null 0.0 disappear

