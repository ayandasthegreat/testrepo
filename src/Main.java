import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        double num1 = input.nextDouble();
        System.out.println("Enter another Number");
        double num2 = input.nextDouble();
        System.out.println("what operation would you like to do?");
        System.out.println("1 for addition, 2 for subtraction, 3 for division, 4 for multiplication");
        double num3 = input.nextDouble();
        calculator ye = new calculator(num1,num2,num3);
        if (num3 == 1){
            ye.addNum();
        }
        if (num3 == 2){
            ye.subtractNum();
        }
        if (num3 == 4){
            ye.multiplyNum();
        }
        if (num3 == 3){
            ye.divideNum();
        }



    }
}