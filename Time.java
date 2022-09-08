/*
Class: Time.Java
Author:Octavius Gaines
Version:1.0
Course:ITEC2140 Fall2022
Sept. 8, 2022


public class TimeCalc {
    public static void main(String[] args) {
       
        int hour = 23;
        int minute = 50;
        int second = 59;

         System.out.println("The time is "+hour+":"+minute+":"+second);

        int SEC_PER_MINUTE = 60;
        int SEC_PER_HOUR = 60 * SEC_PER_MINUTE;
        int SEC_PER_DAY = 24 * SEC_PER_HOUR;
        int secondsElapsedSinceMidnight = hour*SEC_PER_HOUR + minute*SEC_PER_MINUTE + second;
        System.out.println("Seconds since midnight: " + secondsElapsedSinceMidnight);

        
        System.out.println(SEC_PER_DAY - secondsElapsedSinceMidnight + " seconds remain.");

        
        System.out.println(secondsElapsedSinceMidnight * 100 / SEC_PER_DAY +
            "% of the day is over.");

    
        

    }
}
