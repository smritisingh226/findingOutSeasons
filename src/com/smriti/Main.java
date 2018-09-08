package com.smriti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int month=0;
        String season = null;
        System.out.print("Enter the month for which you want to know the season: ");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        if(month==12||month==1||month==2)
            season= "Winter";
         else if(month==3||month==4||month==5)
        season= "Spring";
        else if(month==6||month==7||month==8)
        season= "Summer";
        else if (month==9||month==10||month==11)
        season ="Autumn";
        else
            season="Bogus Season";
        System.out.print("Season for the month "+month);
System.out.print(" is "+season);
    }
}
