abstract class Wave {
    private int y; //pos on wave
    private int amplitude;
    private int freq;


    public Wave(int amplitude, int freq, int y){
        this.amplitude = amplitude;
        this.freq = freq;
        this.y = y;
    }


    public int getAmplitude() {
        return amplitude;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq){this.freq = freq;}

    public void setAmplitude(int amplitude) { this.amplitude = amplitude; }


    public void setY(int y) {
        this.y = y;
    }

    public int getY(){ return y; }

    abstract void move();



}
