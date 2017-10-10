package Opdracht6;

import java.awt.*;
import java.applet.*;

public class Opdracht62 extends Applet {

    int minuut;
    int uur;
    int dag;
    int jaar;



    public void init(){

       minuut = 60;
       uur = minuut * 60;
       dag = uur * 24;
       jaar = dag * 365;
    }

    public void paint(Graphics g){

        g.drawString("Seconden in een uur: " + uur,20,20);
        g.drawString("Seconden in een dag: " + dag,20,40);
        g.drawString("Seconden in een jaar: " + jaar,20,60);



    }
}
