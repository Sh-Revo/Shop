package techSpec;

public class RAM implements TechSpec {
    private int size=8192;
    private String name="DDR2";

    public RAM(String name, int size) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
