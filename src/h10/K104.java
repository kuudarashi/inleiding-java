package h10;
// dont forget to change
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K104 extends Applet {
    double a, b, c,totaal, gemiddeld;
    int cijfers;
    TextField txt;
    Button butt;
    String tekst,g;

    public void init() {
        butt = new Button("ok");
        add(butt);
        txt = new TextField("", 5);
        add(txt);
        txt.addActionListener(new txv());
        tekst = "";
        totaal = 0.0;
        cijfers = 0;
        gemiddeld= 0.0;
    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,50);
        g.drawString("het gemiddelde is: " + gemiddeld,50,70);
    }
    class txv implements ActionListener{
        public void actionPerformed(ActionEvent e) {

         g = txt.getText();
         a = Double.parseDouble(g);
         totaal += a;
         cijfers ++;
         gemiddeld = totaal / cijfers;

         if (a >= 5.5) {
             tekst = "voldoende";
         }
         else {
             tekst = "onvoldoende";
         }
         repaint();
        }
    }
}

