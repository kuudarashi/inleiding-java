package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class K10 extends Applet {
    int high,score;
    TextField txt;
    Label lab;
    String tekst;

    public void init() {
        setBackground(Color.DARK_GRAY);
        txt = new TextField("",5);
        txt.addActionListener(new vak());
        tekst = "";

        lab = new Label("uw score");

        add(lab);
        add(txt);
    }


    public void paint(Graphics g) {
        g.drawString(tekst,50,45);
    }

    class vak implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s =txt.getText();
            high = Integer.parseInt(s);

            if ( high > score){
                score = high;
                tekst = "high score = " + score;

            }
            repaint();

        }
    }
}
