/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2;

/**
 *
 * @author UsEr
 */
public class arithmophobia {
    public static boolean arithmophobia(String dayOfWeek, int number){
       switch (dayOfWeek.toLowerCase()){
           case "monday":
               return number == 12;
           case "tuesday":
               return number > 95;
           case "wednesday":
               return number == 34;
           case "thursday":
               return number == 0;
           case "friday":
               return number % 2 == 0;
           case "saturday":
               return number == 56;
           case "sunday":
               return number == 666 || number == -666;
           default:
               throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);
       } 
    }
    public static void main(String[] args) {
        System.out.println(arithmophobia("Monday", 12));
        System.out.println(arithmophobia("Tuesday", 100));
        System.out.println(arithmophobia("Wednesday", 34));
        System.out.println(arithmophobia("Thursday", 0));
        System.out.println(arithmophobia("Friday", 4));
        System.out.println(arithmophobia("Saturday", 56));
        System.out.println(arithmophobia("Sunday", 666));
        System.out.println(arithmophobia("Sunday", -666));
        System.out.println(arithmophobia("Monday", 13));
        System.out.println(arithmophobia("Tuesday", 50));
        System.out.println(arithmophobia("Wednesday", 35));
        System.out.println(arithmophobia("Thursday", 1));
        System.out.println(arithmophobia("Friday", 3));
        System.out.println(arithmophobia("Saturday", 57));
        System.out.println(arithmophobia("Sunday", 665));
    }
}