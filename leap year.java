import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare variables
        int year;

        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);

        // take input of year
        System.out.print("Enter the year = ");
        year = sc.nextInt();

        // check if the year is a leap year or not
        if (year % 400 == 0)
            System.out.print(year + " is a leap year!");
        else {
            if (year % 100 == 0)
                System.out.print(year + " is not a leap year!");
            else if (year % 4 == 0)
                System.out.print(year + " is a leap year!");
            else
                System.out.print(year + " is not a leap year!");
        }
    }
}







