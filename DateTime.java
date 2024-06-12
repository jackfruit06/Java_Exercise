package com.hus.oop.exercise05;

class DateTime extends Date{
    private Time time;

    public DateTime(int day, int month, int year, int hour, int minute, int second){
        super(day,month,year);
        this.time = new Time(hour,minute,second);
        formatTime();
    }
    private void formatTime(){
        if(this.time.getHour() > 23){
            super.setDay(this.getDay() + 1);
            time.setHour(time.getHour() - 24);

        }
    }
    public String toString(){
        return super.toString() + " " + this.time;
    }
}
