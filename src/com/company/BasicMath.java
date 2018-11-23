package com.company;


public class BasicMath {

    public static void main(String[] args) {

        int month = 13;
        String season;
        switch(month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Аutumn";
                break;
                default:
                    season = "Unknown season";
        }
        System.out.println("Month related to " + season + ".");
    }
}
