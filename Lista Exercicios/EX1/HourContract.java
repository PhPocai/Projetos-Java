package EX1;

import java.util.Date;

public class HourContract {
    private Date date;
    private double ValuePerHour;
    private Integer hours;

    public HourContract(){

    }

    public HourContract(Integer hours, double valuePerHour, Date date) {
        this.hours = hours;
        ValuePerHour = valuePerHour;
        this.date = date;
    }

    public double totalValue(){
        return ValuePerHour*hours;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return ValuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        ValuePerHour = valuePerHour;
    }
}
