package wkp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

public class GameWin extends JFrame {//创建窗口，并且初始化窗口信息
    List<object> objectList=new ArrayList<>();

    BG bg=new BG();
    Line line=new Line(this);
    Random random=new Random();
    int a=random.nextInt(7)+1;
    {
        for (int i = 0; i < a; i++) {
            double random=Math.random();
            if (random<0.4) {
                objectList.add(new Gold());
            }
            else{
                objectList.add(new GoldMini());
            }
        }
        for (int i = 0; i < a; i++) {
            objectList.add(new Rock());
        }
    }

    Image StopFlash;
    void start(){
        this.setVisible(true);//窗口是否可见
        this.setSize(1172,800);//设置窗口大小
        this.setLocationRelativeTo(null);//窗口集中
        this.setTitle("wkp简易版黄金矿工");//窗口标题
        setDefaultCloseOperation(EXIT_ON_CLOSE);//关闭窗口

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton()==1){
                    line.state=1;
                }
            }
        });
        while(true){
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //不加try catch的话，线会转的非常快，废显卡
            //此外以上的代码运行起来只能导致360度旋转
        }
    }
    public void paint(Graphics g){
        StopFlash=this.createImage(1172,800);
        Graphics gImage=StopFlash.getGraphics();
        bg.paintSelf(gImage);
        line.paintSelf(gImage);
        for (object obj:objectList) {
            obj.paintSelf(gImage);
        }
        g.drawImage(StopFlash,0,0,null);

    }
    public static void main(String[] args) {
        GameWin gameWin=new GameWin();
        gameWin.start();
    }
}
