import java.util.Scanner;

public class tips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate/1000);
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity+"and total is $" + total);

    }
}
