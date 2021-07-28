package wkp;

import java.awt.*;

public class Gold extends object {//
    Gold(){
        this.x=(int)(Math.random()*1000);
        this.y=(int)(Math.random()*500+200);
        this.width=186;
        this.width=84;
        this.flag=false;
        this.m=30;
        this.count=5;
        this.img= Toolkit.getDefaultToolkit().getImage("picture/biggold.png");
    }

}
