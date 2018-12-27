import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;


public class Screen extends JPanel {

    private Point dot;
    private Queue<Point> pointQueue;


    public Screen(int screenWidth, int screenHeight, boolean buffer){
        super(buffer);
        setBackground(Color.BLACK);
        setSize(screenWidth,screenHeight);
        dot = new Point(screenHeight/2,screenWidth/2);
        pointQueue = new LinkedList<Point>();
        pointQueue.add(dot);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        for(Point point: pointQueue)
            g.fillOval((int) point.getX(), (int) point.getY(),2,2);
    }

    public void deflectDot(int dx, int dy) {
        dot.translate(dx,dy);
        if(pointQueue.size() == 150)
            pointQueue.remove();
        pointQueue.add(new Point((int) dot.getX() + dx, (int) dot.getY() + dy));
    }

}
