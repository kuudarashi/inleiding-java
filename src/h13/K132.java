package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K132 extends Applet {
Button a;
    public void init() {
        rodeMuur(a = new Button());
        a.addActionListener(new redWall());

    }


    public void paint(Graphics g) {

    }
 void rodeMuur (Button a) {
        a = new Button("rode muur");
        add(a);
 }
 class redWall implements ActionListener{
     public void actionPerformed(ActionEvent e) {

     }

 }

}
