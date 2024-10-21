import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number1;
        int number2;
        int sum,sub,mul,div;

        System.out.print("Enter number1: ");
        number1=input.nextInt();

        System.out.print("Enter number2: ");
        number2=input.nextInt();
        input.close();

        sum=number1+number2;
        sub=number1-number2;
        mul=number1*number2;
        div=number1/number2;

        System.out.printf("The sum is %d%n ",sum);
        System.out.printf("The subtraction is %d%n ",sub);
        System.out.printf("The multiplication is %d%n ",mul);
        System.out.printf("The division is %d%n ",div);
    }
}
