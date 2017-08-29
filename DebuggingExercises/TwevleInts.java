public class TwevleInts {
    public static void main (String args[])
    {
        int[] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99, 12, 13, 14};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}

