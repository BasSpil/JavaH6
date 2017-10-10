package Opdracht6;

import java.awt.*;
import java.applet.Applet;


public class Opdracht63 extends Applet {

    int a;
    int b;
    int uitkomst;

    public void init(){

        a = 4;
        b = 5;
        uitkomst = -(a + b);


    }


    public void paint(Graphics g){
        g.drawString("De uitkomst is: " + uitkomst,20,20);



    }




}
