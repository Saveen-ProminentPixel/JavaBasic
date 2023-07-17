package methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        int dueDay = sc.nextInt();
        int dueMonth = sc.nextInt();
        int dueYear = sc.nextInt();

        if(checkDate(day,month,year) == false || checkDate(dueDay,dueMonth,dueYear) == false){
            System.out.println("Invalid Date");
            return;
        }

        int fine = checkFine(day,month,year,dueDay,dueMonth,dueYear);
        System.out.println("Your total fine is : " + fine + " Hackos");


    }

    public static boolean checkDate(int day, int month, int year){

        if(year < 2000 || year > 2100 || month < 1 || month > 12 || day < 0 || day > 31){
            return false;
        }

        if(month == 2 && day > 28){return false;
        }

        if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){return false;
        }

        return true;
    }

    public static int checkFine(int day, int month, int year, int dueDay, int dueMonth, int dueYear){

        int fine = 0;

        if(dueYear > year){
            return 0;
        }
        if(dueYear == year && dueMonth > month){
            return 0;
        }
        if(dueYear == year && dueMonth == month && dueDay > day){
            return 0;
        }
        if(year > dueYear){
            return 10000;
        }

        if(dueMonth == month){
            int days = day - dueDay;
            fine = days * 15;
            return fine;
        }
        else{
            int days = findDays(day,month,dueDay,dueMonth);
            fine = days * 500;
            return fine;
        }

    }

    public static int findDays(int day, int month, int dueDay, int dueMonth){

        int days = 0;
        if(dueMonth == 2){
            days += 28 - dueDay;
        }
        else if(dueMonth == 4 || dueMonth == 6 || dueMonth == 9 || dueMonth == 11){
            days += 30 - dueDay;
        }
        else{
            days += 31 - dueDay;
        }

        days += day;

        for(int i = dueMonth + 1; i < month; i++){
            if(i == 2){
                days += 28;
            }
            else if(i == 4 || i == 6 || i == 9 || i == 11){
                days += 30;
            }
            else{
                days += 31;
            }
        }

        return days;
    }
}
