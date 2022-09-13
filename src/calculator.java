import java.util.Scanner;
public class calculator {
    private double cal1;
    private double cal2;
    private double cal3;
    Scanner input = new Scanner(System.in);
    public calculator(double x, double y, double z){
        cal1 = x;
        cal2 = y;
        cal3 = z;
    }
    public void addNum(){
        double sum = cal1 + cal2;
        System.out.println(sum);
    }
    public void subtractNum(){
        double result = cal1 - cal2;
        System.out.println(result);
    }
    public void multiplyNum(){
        double product = cal1 * cal2;
        System.out.println(product);
    }
    public void divideNum(){
        double answer = cal1 / cal2;
        System.out.println(answer);
    }

}