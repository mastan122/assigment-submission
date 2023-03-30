import java.util.Scanner;
class positive_negative
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= s.nextInt();
        if(number > 0)
        {
            System.out.println("The number is positive.");
        }
        else if(number < 0)
        {
            System.out.println("The number is negative.");
        } 

    }
}