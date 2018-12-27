import javax.swing.*;
import java.awt.*;


public class Scope {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Scope");
        frame.setSize(600,600);
        Screen screen = new Screen(500,500,true);
        ToolBar toolBar = new ToolBar();

        JPanel organizer = new JPanel(new BorderLayout());
        JPanel screenPanel = screen;
        JPanel toolbarPanel = toolBar;

        organizer.add(toolbarPanel, BorderLayout.SOUTH);
        organizer.add(screenPanel, BorderLayout.CENTER);


        frame.add(organizer);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ScreenController controller = new ScreenController(new SineWave(5,10),
                                                new SineWave(5,5),toolBar, screen);
        controller.startWave();



    }

}
