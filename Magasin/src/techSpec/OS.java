package techSpec;

public class OS implements TechSpec{
    String os="Android";

    public OS(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
