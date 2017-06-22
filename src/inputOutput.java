/**
 * Created by teigenleonard on 6/22/17.
 */

import java.util.Scanner;

public class inputOutput
{
    public static void main(String args[])
    {
        int a;
        float b;
        String s;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a string\n");
        s = in.nextLine();
        System.out.printf("You entered string %s\n", s);
        System.out.printf("Enter an integer\n");
        a = in.nextInt();
        System.out.printf("You entered integer %s\n", a);
        System.out.printf("Enter a float\n");
        b = in.nextFloat();
        System.out.printf("You entered float %s\n", b);
    }
}
