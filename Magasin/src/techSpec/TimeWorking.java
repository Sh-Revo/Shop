package techSpec;

public class TimeWorking implements TechSpec{
    int hour=30;

    public TimeWorking(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
