package techSpec;

public class GraficsCard extends CPU implements TechSpec{
    public GraficsRAM ram;
    public GraficsCard(int sizeOfCore, double frequency) {
        super(sizeOfCore, frequency);
    }

    public GraficsRAM getRam() {
        return ram;
    }

    public void setRam(GraficsRAM ram) {
        this.ram = ram;
    }
}
