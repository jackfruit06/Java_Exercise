package com.hus.oop.exercise05;

public class Time {
    private int second;
    private int minute;
    private int hour;

    public Time(int h, int m, int s){
        this.second = s;
        this.minute = m;
        this.hour = h;
    }
    public int getSecond(){
        return second;
    }
    public void setSecond(int s){
        this.second = s;
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int m){
        this.minute = m;
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int h){
        this.hour = h;
    }
    public int convertToSecond(){
        return hour * 3600 + minute * 60 + second;
    }
    private void format(){
        if(second >= 60){
            minute += second / 60;
            second %= 60;
        }
        if(minute >= 60){
            hour += minute/60;
            minute %= 60;
        }
        if(hour >= 24){
            hour %= 24;
        }
    }
    public void raiseSecond(int second){
        this.second += second;
        this.format();
    }
    public void raiseMinute(int minute){
        this.minute += minute;
        this.format();
    }
    public void raiseHour(int hour){
        this.hour += hour;
        this.format();
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
