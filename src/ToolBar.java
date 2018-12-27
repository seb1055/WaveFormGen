import javax.swing.*;

class ToolBar extends JPanel {

    public JSlider getXfreq() {
        return xfreq;
    }

    public JSlider getYfreq() {
        return yfreq;
    }

    public JSlider getXamp() {
        return xamp;
    }

    public JSlider getYamp() {
        return yamp;
    }

    public JButton getStart() {
        return start;
    }

    public JButton getStop() {
        return stop;
    }

    private JSlider xfreq, yfreq, xamp, yamp;
    private JButton start, stop;

    public ToolBar(){
        xfreq = new JSlider(1,50);
        yfreq = new JSlider(1,50);
        xamp = new JSlider(1,15);
        yamp = new JSlider(1,15);
        start = new JButton("Start");
        stop = new JButton("Stop");

        add(xfreq);
        add(yfreq);
        add(xamp);
        add(yamp);
        add(start);
        add(stop);
    }





}
