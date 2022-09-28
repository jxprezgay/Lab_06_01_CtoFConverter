import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double temp;
        double newTemp;
        String trash;

        System.out.print("What is your temperature in Celsius: ");
        if(in.hasNextDouble()){
            temp = in.nextDouble();
            in.nextLine();
            newTemp = (temp * 9/5) + 32;
            System.out.println("Your temperature in Fahrenheit is: " + newTemp);

        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input.");
        }

    }
}