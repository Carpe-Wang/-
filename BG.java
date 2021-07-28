package wkp;

import javax.swing.*;
import java.awt.*;
    public class BG {//oop思想，创建背景类，我们只需要创建新的类并且调用方法就可以了
        static int count=0;
        Image bg=Toolkit.getDefaultToolkit().getImage("picture/bg.png");
        Image baitian=Toolkit.getDefaultToolkit().getImage("picture/baitian.png");
        Image people=Toolkit.getDefaultToolkit().getImage("picture/people.png");
        void paintSelf(Graphics g){

            g.drawImage(baitian,0,0,null);
            g.drawImage(people,450,50,null);
            g.drawImage(bg,0,200,null);
            g.setColor(Color.black);
            g.setFont(new Font("仿宋",Font.BOLD,30));
            g.drawString("积分:"+count,30,150);
        }
}
