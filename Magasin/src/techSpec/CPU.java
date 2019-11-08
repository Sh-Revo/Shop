package techSpec;

public class CPU implements TechSpec {
    private int sizeOfCore;
    private double frequency;

    public CPU(int sizeOfCore, double frequency) {
        this.sizeOfCore = sizeOfCore;
        this.frequency = frequency;
    }

    public int getSizeOfCore() {
        return sizeOfCore;
    }

    public void setSizeOfCore(int sizeOfCore) {
        this.sizeOfCore = sizeOfCore;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
