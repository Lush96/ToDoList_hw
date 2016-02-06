package com.lclark.todolist;

/**
 * Created by Garrett on 2/5/2016.
 */
public class Day {

    private String name;
    private String plans;

/*A day is an object that stores the plans on that day. It has a name as well, to be able to refer to 
the specific day later*/


    public Day(String name) {
        this.name = name;
        plans = "";
    }

    public void setPlans(String plans)
    {
        this.plans = plans;
    }

    public String getPlans() {
        return plans;
    }
}
