package com.lclark.todolist;

import java.util.ArrayList;

/**
 * Created by Garrett on 2/5/2016.
 */
public class Week {

    /*A week uses ints from 0-6 to keep track of the day of the week by index.
    The index refers to the string of dayNames.The current day is initially
    set to 0 (Sunday). */



    private int currentDay;
    private String[] dayNames = {"Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"};
    private int nextDay;
    private int prevDay;
    
    /*Creates an arraylist of days that keep track of the plans on that day*/
    private ArrayList<Day> days;

    public Week() {
        for (int i = 0; i < 7; i++)
        {
            days.add(new Day(dayNames[i]));
        }
        currentDay = 0;
        nextDay = 1;
        prevDay = 6;
    }

    public void setCurrentDay(String day) {
        for (int i = 0; i < 7; i++) {
            if (day.equals(dayNames[i])) {
                currentDay = i;
                if (currentDay == 0) {
                    prevDay = 6;
                }
                else{
                    prevDay=currentDay-1;
                }
                if (currentDay == 6) {
                    nextDay = 0;
                }
                else
                {
                    nextDay=currentDay+1;
                }
            }
        }
    }

    public String getNextDay() {
        return dayNames[nextDay];
    }

    public String getPrevDay() {
        return dayNames[prevDay];
    }

    public String getCurrentDay() {
        return dayNames[currentDay];
    }

    public Day getDay() {
        return days.get(currentDay);
    }

    public String[] getDayNames() {
        return dayNames;
    }
}
