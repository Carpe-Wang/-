package wkp;

import java.awt.*;

public class object {//我们创建黄金和石头的父类
    boolean flag;
    int x;
    int y;
    int width;
    int height;
    Image img;
    int m;
    int count;
    void paintSelf(Graphics g){
        g.drawImage(img,x,y,null);
    }

    public int getWidth() {
        return width;
    }
}
