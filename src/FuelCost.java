import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args)
    {


        //variables
        double gallonsInTank = 0;
        double mPG = 0;
        double costPerGallon = 0;
        double costPer100;
        double maxDistance;
        String wrongInput = "";

        Scanner in = new Scanner(System.in);

        //inputs for gas in tank
        System.out.println("Enter how many gallons you have in your tank ");
        if(in.hasNextDouble())
        {
            gallonsInTank = in.nextDouble();
        }
        //for any incorrect input
        else
        {
            wrongInput = in.nextLine();
            System.out.println("You entered " + wrongInput + " gallons");
            System.out.println("Run the program again and enter the gallons in your gas tank in numbers");
            System.exit(0);//Terminates the program
        }

        //input MPG of car
        System.out.println("Enter your cars MPG(miles per gallon) ");
        if(in.hasNextDouble())
        {
            mPG = in.nextDouble();
        }
        //for any incorrect input
        else
        {
            wrongInput = in.nextLine();
            System.out.println("You entered " + wrongInput + " MPG");
            System.out.println("Run the program again and enter the MPG in numbers in numbers");
            System.exit(0);//Terminates the program
        }
        //Cost of gas
        System.out.println("Enter price of gas per gallon ");
        if(in.hasNextDouble())
        {
            costPerGallon = in.nextDouble();
        }
        //for any incorrect input
        else
        {
            wrongInput = in.nextLine();
            System.out.println("You entered " + costPerGallon + " MPG");
            System.out.println("Run the program again and enter the MPG in numbers in numbers");
            System.exit(0);//Terminates the program
        }

            //Calculations for cost per 100 miles and Max distance of gas in tank
            costPer100 = 100/ mPG * costPerGallon;
            maxDistance = mPG * gallonsInTank;

            //output cost per 100 miles
            System.out.printf("Cost per 100 miles: %.2f\n", costPer100);

            //output max distance
            System.out.printf("Your max distance: %.2f\n", maxDistance);

    }
}