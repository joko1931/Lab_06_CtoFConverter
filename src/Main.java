import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsiusNumber = 0;
        double fahrenheitNumber = 0;

        System.out.println("Please enter degrees in C: ");

        if (in.hasNextDouble())
        {
            celsiusNumber = in.nextDouble();
            fahrenheitNumber = celsiusNumber * 1.8 + 32;
            System.out.println(celsiusNumber + " degrees C is " + fahrenheitNumber + " degrees F");

        }
    }
}