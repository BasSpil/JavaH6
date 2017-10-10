package Opdracht6;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    double a;
    double b;
    double c;
    double uitkomst;


    public void init() {

        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a+b+c)/3;
        uitkomst = (int) (uitkomst * 10);
        uitkomst = uitkomst / 10;
    }

    public void paint(Graphics g){
        g.drawString("Eerste cijfer: " + a,20,20);
        g.drawString("Tweede cijfer: " + b,20,40);
        g.drawString("Derde cijfer: " + c,20,60);
        g.drawString("Gemiddelde is: " + uitkomst,20,100);
    }
}
