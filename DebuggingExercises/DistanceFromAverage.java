import java.util.*;
public class DistanceFromAverage
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[20];
        double userInput;
        double total = 0;
        double average = 0;
        final int QUIT = 99999;
        int x = 0, y;
        System.out.print("Enter a double, " +
                QUIT + " to quit ");
        userInput = input.nextDouble();
        while(userInput != QUIT && x < numbers.length)
        {
            numbers[x] = userInput;
            total += numbers[x];
            ++x;
            if(x < numbers.length)
            {
                System.out.print("Enter double, " +
                        QUIT + " to quit ");
                userInput = input.nextDouble();
            }
        }
        if(x == 0)
            System.out.println("Please enter a number");
        else
        {
            average = total / x;
            System.out.println("The average is " + average);
            for(y = 0; y < x; ++y)
                System.out.println(numbers[y] + " is " +
                        (numbers[y] - average) + " from the average");
        }
    }
}