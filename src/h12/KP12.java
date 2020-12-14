package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KP12 extends Applet {
    int teller = 0;
    TextField namenTekstvak,telefoonNummersTekstvak;
    Button knop;
    String[] telefoonNummers, namen;


    public void init() {
        namen = new String[10];
        telefoonNummers = new String[10];
        namenTekstvak = new TextField ("naam", 8);
        telefoonNummersTekstvak = new TextField("nummer",11);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(namenTekstvak);
        add(telefoonNummersTekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        if(teller >=10) {
            int y = 70;
            for (int i = 0; i < 10;i++) {
                g.drawString(String.valueOf(namen[i]),30,y);
                g.drawString(String.valueOf(telefoonNummers[i]),100,y);
                y += 20;
            }
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String naam = namenTekstvak.getText();
            String telefoonNummer = telefoonNummersTekstvak.getText();
            if(teller <= namen.length) {
                namen[teller] = naam;
                telefoonNummers[teller] = telefoonNummer;
                teller++;
            }
            repaint();
        }
    }
}