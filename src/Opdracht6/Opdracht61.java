package Opdracht6;

import java.awt.*;
import java.applet.*;

public class Opdracht61 extends Applet {

    int a, b;
    int uitkomst;



    public void init() {

        a = 113;
        b = 4;
        uitkomst = a / b ;
    }

    public void paint(Graphics g){

        g.drawString("Jan: " + uitkomst,20,20);
        g.drawString("Ali: " + uitkomst,20,40);
        g.drawString("Jeannette: " + uitkomst,20,60);
        g.drawString("Jij: " + uitkomst,20,80);
    }



}
