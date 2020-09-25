package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class K08 extends Applet {
    TextField tk;
    Button knop, knop1;

    public void init() {
        tk = new TextField("", 41);
        knop = new Button("oki");
        knop1 = new Button("reset");
        knop1.addActionListener( new knopo());
        knop.addActionListener( new KnopListener() );
        add(tk);
        add(knop);
        add(knop1);
    }

    public void paint(Graphics g) {
        g.drawString("Type something useful and save it with oki", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tk.setText("hate too break it too you bro but you just got bamboozled");
            repaint();
        }
    }
    class knopo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tk.setText("");
            repaint();
        }
    }
}