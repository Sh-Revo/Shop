package techSpec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeLife implements TechSpec {
    private String data;
    private double temp;
    private int day;
    private String buff;

    public TimeLife(String data, double temp, int day, String buff) {
        this.data = data;
        this.temp = temp;
        this.day = day;
        this.buff = buff;
    }
    public TimeLife(String data, double temp, int timeL) throws ParseException{
        this.data = data;
        this.temp = temp;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(data));
        calendar.add(Calendar.DATE,timeL);
        this.buff = sdf.format(calendar.getTime());
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getBuff() {
        return buff;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }
}
