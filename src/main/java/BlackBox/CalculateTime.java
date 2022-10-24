package BlackBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Time {
    private int hour;
    private int minute;
    private int second;
    private String type;

    public Time() {
    }

    public Time(int hour, int minute, int second, String type) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (! (o instanceof Time)) {
            return false;
        }
        Time time = (Time) o;
        return getHour() == time.getHour() && getMinute() == time.getMinute() && getSecond() == time.getSecond() && getType().equals(time.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHour(), getMinute(), getSecond(), getType());
    }
}

public class CalculateTime {
    public Time calculate_time(Time time) {
        Time result = new Time();
        result.setType(time.getType());
        result.setSecond(time.getSecond());

        if (time.getHour() < 1 || time.getHour() > 12
                || time.getMinute() < 0 || time.getMinute() > 59
                || time.getSecond() < 0 || time.getSecond() > 59
                || (!Objects.equals(time.getType(), "AM")
                && !Objects.equals(time.getType(), "PM"))) {
            throw new IllegalArgumentException("Time not valid");
        } else {
            if (time.getHour() == 12) time.setHour(0);
            var hour = time.getHour();
            var minute = time.getMinute();
            if (time.getHour() <= 9) {
                if (time.getMinute() < 30) {
                    result.setHour(++hour);
                    result.setMinute(minute += 30);
                } else {
                    result.setHour(hour += 2);
                    result.setMinute(minute -= 30);
                }
            } else if (time.getHour() == 10) {
                if (time.getMinute() < 30) {
                    result.setHour(++hour);
                    result.setMinute(minute += 30);
                } else {
                    result.setHour(hour += 2);
                    result.setMinute(minute -= 30);
                    if (Objects.equals(time.getType(), "AM"))
                        result.setType("PM");
                    else result.setType("AM");
                }
            } else {
                if (time.getMinute() < 30) {
                    result.setHour(++hour);
                    result.setMinute(minute += 30);
                } else {
                    result.setHour(1);
                    result.setMinute(minute -= 30);
                }
                if (Objects.equals(time.getType(), "AM"))
                    result.setType("PM");
                else
                    result.setType("AM");
            }
        }
        return result;
    }
}