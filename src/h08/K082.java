package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class K082 extends Applet {
    double a1;
    Label lab;
    Button ok;
    TextField txt;

    public void init() {
        ok = new Button("OK");
        lab = new Label("prijs:");
        txt = new TextField(20);
        ok.addActionListener( new K082.KO());
        txt.addActionListener( new K082.XTX());
        add(ok);
        add(lab);
        add(txt);


    }

    public void paint(Graphics g) {
        g.drawString("prijs:" + a1,50,50);

    }
    class KO implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            a1= a1/100*121;
            repaint();
        }
    }

    class XTX implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a1= Double.parseDouble(txt.getText());
            repaint();
        }
    }
}