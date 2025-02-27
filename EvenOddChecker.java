import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
      
        int number = getIntegerInput();

       
        String result = checkEvenOrOdd(number);

       
        System.out.println(result);
    }

    
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

       
        System.out.print("Enter an integer: ");
        
        
        while (true) {
            try {
                
                number = Integer.parseInt(scanner.nextLine());
                break;  
            } catch (NumberFormatException e) {
               
                System.out.println("Invalid input. Please enter a valid integer.");
                System.out.print("Enter an integer: ");
            }
        }

        return number;
    }


    public static String checkEvenOrOdd(int number) {
       
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
