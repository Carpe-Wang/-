package wkp;

import java.awt.*;

public class Rock extends object {
    Rock(){
        this.x=(int)(Math.random()*1000);
        this.y=(int)(Math.random()*500+200);
        this.width=102;
        this.width=74;
        this.flag=false;
        this.m=50;
        this.count=2;
        this.img= Toolkit.getDefaultToolkit().getImage("picture/rock.png");
    }
}
