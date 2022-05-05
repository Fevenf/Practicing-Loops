import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {

    Scanner multiply = new Scanner(System.in);
    System.out.print("Enter number:");
    int num = Integer.valueOf(multiply.nextLine());
        for(int i=1; i <= 10; i++)
        {
            System.out.println(num +" * "+i+" = "+num*i);
        }
    }
}


