import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsiusNumber = 0;
        double fahrenheitNumber = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter degrees in C: ");

            if (in.hasNextDouble())
            {
                celsiusNumber = in.nextDouble();
                in.hasNextLine();
                fahrenheitNumber = celsiusNumber * 1.8 + 32;
                System.out.println(celsiusNumber + " degrees in celsius is " + fahrenheitNumber + " degrees in fahrenheit");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which isn't a valid value");
            }
        }while(!done);
    }
}