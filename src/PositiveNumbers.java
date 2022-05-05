import java.util.Scanner;
public class PositiveNumbers {
    
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    while (true) {
    System.out.println("Enter a number");
    int number = Integer.valueOf(scanner.nextLine());
    System.out.println("Number is " + number);
        if (number < 0) {
        System.out.println("Numbers must be a positive number");
        continue;
    }
    
         if (number == 0) {
        System.out.println("Process finished with exit code 0");
        break;
    }
         
}
    }

}