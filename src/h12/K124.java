package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K124 extends Applet {
    boolean found;
    int[] zero ={1,2,3,4,5,6,7,8,9,10};
    int indexPositie;
    TextField txv;
    Button  bt;
    public void init() {
        txv = new TextField(5);
        bt = new Button("OK");
        add(txv);
        add(bt);
        bt.addActionListener(new banner());


    }

    public void paint(Graphics g) {
        if (found == true){
            g.drawString("waarde is gevonden",20,50);
        }
        else {g.drawString("waarde is niet gevonden",20,50);}
    }

    class banner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            found = false;
            int gegevenGetal = Integer.parseInt(txv.getText());
            for (int i = 0; i < zero.length; i++){
                if (zero[i] == gegevenGetal){
                    found = true;
                    indexPositie = i;
                    break;
                }

            }
            repaint();
        }
    }
}
