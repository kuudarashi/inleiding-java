package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class K122 extends Applet {
TextField[] txv = new TextField[5];
Button bt;
    public void init() {
        bt = new Button("ok");
        bt.addActionListener(new knopje());
        add(bt);
        for (int i = 0; i < 5; i ++) {

            txv[i] = new TextField("", 20);
            add(txv[i]);
        }


    }

    public void paint(Graphics g) {

    }
    class knopje implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int[] temp = new int[5];
            for (int i = 0; i < txv.length; i++){
                String tempie = txv[i].getText();
                temp[i] = Integer.parseInt(tempie);
            }
            Arrays.sort(temp);
            for (int i = 0; i < txv.length; i++){
                txv[i].setText(temp[i] + "");
            }
           repaint();
        }
    }
}
