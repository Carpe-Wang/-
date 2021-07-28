package wkp;

import java.awt.*;

public class Line {//钩子的线
    int x=586;
    int y=200;
    int endx=500;
    int endy=500;
    double length=100;
    double n=0;//这个是计算机中角度表述问题，可以去查看
    //为了不让转360度我们加参数
    int dir=1;

    //设置抓去
    int state;
    GameWin frame;

    Line(GameWin frame){
        this.frame=frame;
    }

    void logic(){
        for (object obj:this.frame.objectList){
            if (endx>obj.x&&endx<obj.x+obj.width
                    &&endy>obj.y&&endy<obj.y+obj.height){
                state=3;
                obj.flag=true;
            }
        }

    }



    void paintSelf(Graphics g){
        logic();
        switch (state){
            case 0:if (n<0) {
                dir=1;
            }
            else if (n>1){
                dir=-1;
            }
                n=n+0.005*dir;//让n变化，相当于线动起来
                endx=(int)(x+length*Math.cos(n*Math.PI));
                endy=(int)(y+length*Math.sin(n*Math.PI));
                //设置线的颜色，默认为黑色g.setColor(Color.red);
                g.drawLine(x,y,endx,endy);
                break;
            case 1:
                if (length<700) {
                    length = length + 5;
                    endx = (int) (x + length * Math.cos(n * Math.PI));
                    endy = (int) (y + length * Math.sin(n * Math.PI));
                    //设置线的颜色，默认为黑色g.setColor(Color.red);
                    g.drawLine(x, y, endx, endy);
                }else {//这个是能确定我们线演唱以后可以不消失
                    state=2;
                }
                    break;
            case 2:
                if (length>100){
                    length=length-5;
                    endx = (int) (x + length * Math.cos(n * Math.PI));
                    endy = (int) (y + length * Math.sin(n * Math.PI));
                    //设置线的颜色，默认为黑色g.setColor(Color.red);
                    g.drawLine(x, y, endx, endy);
                }else {
                    state=0;
                }
                break;
            case 3:
                int m=1;
                if (length>100){
                    length=length-5;
                    endx = (int) (x + length * Math.cos(n * Math.PI));
                    endy = (int) (y + length * Math.sin(n * Math.PI));
                    //设置线的颜色，默认为黑色g.setColor(Color.red);
                    g.drawLine(x, y, endx, endy);
                    for (object obj:this.frame.objectList){
                        if (obj.flag){
                            m=obj.m;
                            obj.x=endx-obj.getWidth()/2;
                            obj.y=endy;
                            if (length<=100){

                                obj.x=-3000;
                                obj.y=-3000;
                                BG.count+=obj.count;
                                obj.flag=false;
                                state=0;
                        }
                        }
                    }
                }
                try {
                    Thread.sleep(m);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

        }



    }
}
