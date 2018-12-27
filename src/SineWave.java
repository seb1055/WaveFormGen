
import javax.swing.Timer;

public class SineWave extends Wave {

    private int dy = 1;

    public SineWave( int amplitude, int freq) {

        super(amplitude, freq,0); //sine wave starts at zero
    }

    //TODO clean last line of move
    void move(){
        if(getY() == -getAmplitude())
            dy = -1;
        else if (getY() == getAmplitude())
            dy = 1;

        setY(getY()-dy);



        //System.out.println(getY());

    }



}
