package easy_part;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {

        Scanner evenOdd = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = evenOdd.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
