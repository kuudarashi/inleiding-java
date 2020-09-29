package h08;

import java.applet.Applet;
import java.awt.*;

public class KP8 extends Applet {
    int a1;
    TextField txt,txt2;
    Button p,m,x,d;


    public void init() {
        p= new Button("+");
        m= new Button("-");
        x= new Button("X");
        d= new Button("/");
        txt= new TextField(20);
        txt2= new TextField(20);
        add(p);
        add(m);
        add(x);
        add(d);
        add(txt);
        add(txt2);

    }


    public void paint(Graphics g) {

    }
}
