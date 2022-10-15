import java.util.Arrays;

public class Time {
    int hours;
    int min;
    int sec;
    public Time(int hours1,int minutes,int sec1){
        this.hours=hours1;
        this.min=minutes;
        this.sec=sec1;

    }

    public Time(int totalSeconds) {
        this.hours=totalSeconds/60/60;
        this.min=totalSeconds%3600/60;
        this.sec=totalSeconds%3600%60;

    }
    public int getallseconds() {
        hours =60*60;
        min*=60;
        sec=60;
     return hours+min+sec;

    }




        public int getHours() {
        return hours;
    }

    public void setHours(int hour) {
        this.hours = hour;
    }

    public int getMin() {

        return min;
    }

    public void setMin(int min) {

        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {

        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }
}


