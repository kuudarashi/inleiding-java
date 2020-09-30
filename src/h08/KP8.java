package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KP8 extends Applet {
    double a1,a2,uitkomst;
    TextField txt,txt2;
    Button p;
    Button m;
    Button x;
    Button d;


    public void init() {
        setBackground(Color.DARK_GRAY);
        p= new Button("+");
        m= new Button("-");
        x= new Button("X");
        d= new Button("/");
        p.addActionListener(new plus());
        m.addActionListener(new minus());
        x.addActionListener(new times());
        d.addActionListener(new divided());
        txt= new TextField(20);
        txt2= new TextField(20);
        txt.addActionListener(new nmbrs());
        txt2.addActionListener(new nmbrs());
        add(p);
        add(m);
        add(x);
        add(d);
        add(txt);
        add(txt2);

    }


    public void paint(Graphics g) {
        g.drawString("uitkomst:" + uitkomst,60,80);
    }

    class plus implements ActionListener{
        public void actionPerformed(ActionEvent e) {
         uitkomst= a1 + a2;
         repaint();
        }
    }

    class minus implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            uitkomst= a1 - a2;
            repaint();
        }
    }

    class times implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            uitkomst= a1 * a2;
            repaint();
        }
    }

    class divided implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            uitkomst= a1 / a2;
            repaint();
        }
    }

    class nmbrs implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            a1= Double.parseDouble(txt.getText());
            a2= Double.parseDouble(txt2.getText());
            repaint();
        }
    }
}
