package wkp;

import java.awt.*;

public class GoldMini extends Gold{
    GoldMini(){
        this.width=120;
        this.height=70;
        this.m=15;
        this.count=3;
        this.img= Toolkit.getDefaultToolkit().getImage("picture/littergold.png");
    }
}