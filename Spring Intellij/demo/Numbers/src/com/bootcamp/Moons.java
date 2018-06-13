package com.bootcamp;

import java.util.Date;
import java.util.GregorianCalendar;

public class Moons {

//    The moon goes through phases because it orbits the earth and the sun hits it differently at different places in its orbit.
//   This means that, depending on where it is in its orbit, you might see a full moon, right quarter moon, or even "no" moon (new moon) at all.
//   It takes 27.3 days for the moon to orbit the Earth, but the actual phase difference from one full moon to the
//  next is 29.5 days because the earth cruises a cool 45 million miles around the sun in that 27.3 days.
//   It takes 2.2 days for the the moon to make up for that distance and get all the way back to where you last saw a full moon.
//    Whenever the moon is full twice in one month, the second one is called a "blue moon.
//  " This last happened in July of 2015 on the 1st and 31st. The next time is January of 2018 (same days).
//    You can research the timing, otherwise you can assume midnight. Write a program that determines how many "blue moons"
//    there will be in third milenia (2000-2999)?
//   *** If you want to be really, really specific, the lunar month is actually 29 days, 12 hours, and 44 minutes.

    public static void main(String[] args){

    int x = numberOfBlueMoons(2000,0,1,0,0,2999);
        System.out.println(x);


    }
    public static int numberOfBlueMoons(int startYear, int startMonth, int startDate, int startHour, int startMinute, int endYear){
        int blueMoonCount = 0;
        GregorianCalendar calendar = new GregorianCalendar();
//        We created a Gregorian object. Now set the date.
//        For the date, use our function params.
        calendar.set(startYear,startMonth,startDate,startHour,startMinute);
       // System.out.println(calendar.get(GregorianCalendar.DAY_OF_YEAR);
        //Start a while loop, as long as the year of the current date we are on, is less than our endYear
        while(calendar.get(GregorianCalendar.YEAR) <= endYear) {
            int prevMonth = calendar.get(GregorianCalendar.MONTH);
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 29);
            calendar.add(GregorianCalendar.HOUR, 12);
            calendar.add(GregorianCalendar.MINUTE, 44);

//        So, our new calendar date is the date of the next full moon.
            //Check to see if this new date has the same month as prevMonth.
            if (prevMonth == calendar.get(GregorianCalendar.MONTH)) {
                blueMoonCount++;
            }
        }
    return blueMoonCount;
    }
}
