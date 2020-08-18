package com.example.uiexplore;

public class ScheduleData {
    private String day;
    private String numOfClass;

    public ScheduleData(String day, String numOfClass) {
        this.day = day;
        this.numOfClass = numOfClass;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getNumOfClass() {
        return numOfClass;
    }

    public void setNumOfClass(String numOfClass) {
        this.numOfClass = numOfClass;
    }
}
