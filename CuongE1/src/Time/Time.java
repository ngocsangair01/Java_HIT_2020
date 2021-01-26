package Time;
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" + "hour=" + hour + ", minute=" + minute + ", second=" + second + '}';
    }
    public Time nextSecond(){
        Time x = new Time(12,12,12);
        if (second == 59){
            if (minute == 59){
                minute = 0;
                second = 0;
                hour = hour+1;
            }
            else{
                second = 0;
                minute = minute+1;
            }
        }
        else {
            second = second+1;
        }
        return x;
    }
    public Time previousSecond(){
        Time x = new Time(12,12,12);
        if (second == 0){
            if (minute == 0){
                minute = 59;
                second = 59;
                hour = hour-1;
            }
            else{
                second = 0;
                minute = minute-1;
            }
        }
        else {
            second = second-1;
        }
        return x;
    }
}
