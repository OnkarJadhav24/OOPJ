// Q 1 

import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        //Write your logic here
        if ((num1 == num2) && (num2 == num3) && (num3 == num4)){
        System.out.println("Equal");
        }
        else{
        System.out.println("Not Equal");
        }
    }
} 

// Q 2 

import java.util.Scanner;
 
public class Exercise5 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int num1 = in.nextInt();
  int num2 = in.nextInt();
   //Write your logic here
   //print product of num1 and num2
   System.out.println("num1*num2");
 }
}


// Q 3

import java.util.Scanner;
public class Exercise {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int num1 = in.nextInt();
  //Write your logic here
   int number = 5;

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println("result");
  }
 }
}

// Q 4

import java.util.Scanner;
public class Exercise{
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int num1 = in.nextInt();
  int num2 = in.nextInt();
  int num3 = in.nextInt();
  //Write your logic here
  int sum = (num1+num2+num3);
  int average = (sum/3);
  System.out.println("average")
  
 }
} 

//Q5

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        //Write your logic here
        boolean result = (n1 > 0 && n1 < 1) && (n2 > 0 && n2 < 1);
        
        System.out.println("Result: " + result);
    }
} 

//Q 6

import java.util.Scanner;
public class Exercise{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        //write your logic here
        if (number > 0){
            System.out.println("Positive")}
            else{
                System.out.println("Negative")
            }
        }
    }
}

//Q7

import java.util.Scanner;
public class Exercise{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int num1 = in.nextInt();
  int num2 = in.nextInt();
  int num3 = in.nextInt();
  //Write your logic here
  int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        
        System.out.println("The greatest number is: " + greatest);
 }
}

// Q 10

import java.util.Scanner;
public class Exercise{
  public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";
        int month = input.nextInt();
        //Write your logic here
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                default;
                System.out.println("month")
  }

}

//Q11

