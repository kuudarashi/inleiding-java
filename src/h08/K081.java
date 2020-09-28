package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K081 extends Applet{
    int count,count1,count2,count3,thot;
Button a1,a2,a3,a4;
    public void init() {
        setBackground(Color.DARK_GRAY);
        a1 = new Button("m");
        a2 = new Button("v");
        a3 = new Button("pms");
        a4 = new Button("pvs");
        a1.addActionListener( new K081.sopo());
        a2.addActionListener( new K081.popo());
        a3.addActionListener( new K081.nopo());
        a4.addActionListener( new K081.lopo());
        count = 0;
        count1 = 0;
        count2 = 0;
        count3 = 0;
        add(a1);
        add(a2);
        add(a3);
        add(a4);



    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("mannen" + count,40,60);
        g.drawString("vrouwen" + count1,40,80);
        g.drawString("potentiele mannelijke studenten" + count2,40,100);
        g.drawString("potentiele vrouwelijke studenten" + count3,40,120);
        g.drawString("totaal" + thot,40,140);
    }

    class sopo implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            count++;
            thot= count + count1 + count2 + count3;
            repaint();
        }
    }

    class popo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            count1++;
            thot= count + count1 + count2 + count3;
            repaint();
        }
    }

    class nopo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            count2++;
            thot = count + count1 + count2 + count3;
            repaint();
        }
    }
    class lopo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            count3++;
            thot= count + count1 + count2 + count3;
            repaint();
        }
    }
}