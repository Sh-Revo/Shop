package techSpec;

public class ScreenDiagonal implements TechSpec{
    private double diagonal=6.4;

    public ScreenDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}
