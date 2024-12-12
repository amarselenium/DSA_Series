package StringManupalation;

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 3 == 0 && input % 5==0)
        {
            System.out.println("fizbuzz");
        } else if (input % 3 == 0) {
            System.out.println("Fizz");
        } else if (input % 5 == 0) {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println("Not a  valid number");
        }
    }
}
