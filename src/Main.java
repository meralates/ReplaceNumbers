import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter two numbers to replace");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("The replaced numbers are: ");
        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);
    }
}