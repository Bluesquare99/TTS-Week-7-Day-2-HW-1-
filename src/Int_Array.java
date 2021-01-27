import java.util.Scanner;
import java.util.ArrayList;

public class Int_Array {

    public static void main(String[] args){

        // Declare an array
        ArrayList<Integer> myArray = new ArrayList<>();

        // Allow user to input 5 numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a first number: ");
        int num1 = scanner.nextInt();
        myArray.add(num1);
        scanner.nextLine();
        System.out.print("Please enter a second number: ");
        int num2 = scanner.nextInt();
        myArray.add(num2);
        scanner.nextLine();
        System.out.print("Please enter a third number: ");
        int num3 = scanner.nextInt();
        myArray.add(num3);
        scanner.nextLine();
        System.out.print("Please enter a fourth number: ");
        int num4 = scanner.nextInt();
        myArray.add(num4);
        scanner.nextLine();
        System.out.print("Please enter a fifth number: ");
        int num5 = scanner.nextInt();
        myArray.add(num5);
        scanner.nextLine();

        // Sum function
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum = sum + myArray.get(i);
        }
        System.out.println("Sum is: " + sum);

        // Product function
        int product = 1;
        for(int i = 0; i < 5; i++) {
            product = product * myArray.get(i);
        }
        System.out.println("Product is: " + product);

        // Finding max
        int max = 0;
        for (int i = 0; i < 5; i++){
            if (max < myArray.get(i)) {
                max = myArray.get(i);
            }
        }
        System.out.println("The largest number is: " + max);

        // Finding min
        int min = num1;
        for (int i = 1; i < 5; i++){
            if (min > myArray.get(i)) {
                min = myArray.get(i);
            }
        }
        System.out.println("The smallest number is: " + min);
    }
}
