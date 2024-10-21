import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double weight;
        double height;
        double bmi;

        System.out.println("Enter your weight in kilograms: ");
        weight=scanner.nextDouble();
        System.out.println("Enter your height in meters: ");
        height=scanner.nextDouble();

        bmi=weight/(height*height);
        System.out.println("Your BMI is: "+bmi);
        if(bmi<18.5){
            System.out.println("You are underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("You are normal weight");
        }
        else if(bmi>=25 && bmi<=29.9){
            System.out.println("You are overweight");
        }
        else if(bmi>=30){
            System.out.println("You are obesity");
        }
    }
}
