package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K101 extends Applet {
    int high,score;
    TextField txt;
    Label lab;
    String tekst,tekst2;

    public void init() {
        setBackground(Color.DARK_GRAY);
        txt = new TextField("",5);
        txt.addActionListener(new vak ());
        txt.addActionListener(new vak2 ());
        tekst = "";
        tekst2 = "";

        lab = new Label("uw score");

        add(lab);
        add(txt);
    }


    public void paint(Graphics g) {
        g.drawString(tekst,50,45);
        g.drawString(tekst2,50,65);
    }

    class vak implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s =txt.getText();
            high = Integer.parseInt(s);

            if ( high > score){
                score = high;
                tekst = "high score = " + score;
                repaint();
            }
        }
    }


    class vak2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s =txt.getText();
            high = Integer.parseInt(s);

            if ( high < score){
                score = high;
                tekst2 = "lowest score = " + score;
                repaint();
            }
        }
    }
}
