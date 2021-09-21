//Import scanner
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Declare and initialize the scanner for typed input
    Scanner s = new Scanner(System.in);

    //Problem 1:
    System.out.println("Problem 1: Selecting the largest number");
    System.out.println("Enter 3 integers:");
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    //Determine the largest number. Using >= to ensure this still works if two identical numbers are entered
    if (a >= b && a >= c){
      System.out.println("The largest number is " + a);
    }else if (b >= a && b >= c){
      System.out.println("The largest number is " + b);
    }else if (c >= a && c >= b){
      System.out.println("The largest number is " + c);
    }

    //Problem 2: 
    System.out.println("Problem 2: Counting up");
    int d;
    int e;
    //Get two different integers
    do {System.out.println("Enter 2 different integers:");
        d = s.nextInt();
        e = s.nextInt();
    } while (d == e); 
    //Find the smallest and largest of the two and counting up
    System.out.println("Counting up:");
    if (d < e) {
      for (int i = d; i <= e; i++) {
        System.out.println(i);
      }
    }else {
      for (int i = e; i <= d; i ++){
        System.out.println(i);
      }
    }

    //Problem 3: 
    System.out.println("Problem 3: Identifying a Leap Year");
    int year;
    //Get input and ensure it's a valid year
    do {System.out.println("Enter a positive, 4 digit year:");
        year = s.nextInt();
    } while (year < 1000 || year > 9999);
    //Check to see if it's a leap year
    if (year % 4 == 0 && year % 100 != 0) {
        System.out.println("The year " + year + " is a leap year");
    } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
        System.out.println("The year " + year + " is a leap year");
    } else {
        System.out.println("The year " + year + " is not a leap year");
    }

    // Problem 4:
    System.out.println("Problem 4: Listing out leap years");
    int yearA;
    int yearB;
    //Get the years from the user and ensure they are valid and unique
    do {System.out.println("Enter two different positive, 4 digit years:");
        yearA = s.nextInt();
        yearB = s.nextInt();
    } while (yearA < 1000 
             || yearA > 9999 
             || yearB < 1000 
             || yearB > 9999 
             || yearA == yearB);
    if (yearA < yearB) {
      System.out.println("The following years between " + yearA + " and " + yearB + " are leap years:");
      for (int i = yearA; i <= yearB; i++){
        if (i % 4 == 0 && i % 100 != 0) {
          System.out.println(i);
        } else if (i % 4 == 0 && i % 100 == 0 && i % 400 == 0) {
          System.out.println(i);
        }
      }
    } else {
      System.out.println("The following years between " + yearB + " and " + yearA + " are leap years:");
      for (int i = yearB; i <= yearA; i++){
        if (i % 4 == 0 && i % 100 != 0) {
          System.out.println(i);
        } else if (i % 4 == 0 && i % 100 == 0 && i % 400 == 0) {
          System.out.println(i);
        }
      }
    }
  }
}