import javax.swing.*;

public class ScreenController {

    private Wave xwave, ywave;
    private Screen screen;
    private Timer ytimer, xtimer;
    private ToolBar toolBar;
    private Boolean running = true;


    public ScreenController(Wave model, Wave model2, ToolBar toolBar, Screen view ){
        this.xwave = model2;
        this.ywave = model;
        this.screen = view;
        this.toolBar = toolBar;
        initToolBar();
    }

    public void startWave(){
        ytimer = new Timer((ywave.getFreq()), event-> {
            ywave.move();
            update();
        });
        ytimer.start();

        xtimer = new Timer(xwave.getFreq(), event-> {
            xwave.move();
            update();
        });
        xtimer.start();
    }

    public void stopWave(){
        ytimer.stop();
        xtimer.stop();
    }

    public void initToolBar(){

        toolBar.getXfreq().addChangeListener(e -> {
            xwave.setFreq(toolBar.getXfreq().getValue());
            stopWave();
            startWave();
        }
        );

        toolBar.getXamp().addChangeListener(e -> xwave.setAmplitude(toolBar.getXamp().getValue()));

        toolBar.getYfreq().addChangeListener(e -> {
            ywave.setFreq(toolBar.getYfreq().getValue());
            stopWave();
            startWave();
        });
        toolBar.getYamp().addChangeListener(e -> ywave.setAmplitude(toolBar.getYamp().getValue()));

        //fix start method
        toolBar.getStart().addActionListener(e -> {
            if(!running)
                startWave();
        });
        toolBar.getStop().addActionListener(e -> stopWave());
    }


   public void update(){
        screen.deflectDot(xwave.getY(),ywave.getY());
        screen.repaint();
   }
}
