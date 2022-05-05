import java.util.Scanner;

public class CounttoEleven {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number less than 11");
    int number = Integer.valueOf(scanner.nextLine());
    int input = 11;
    for (int i = number; i <= input; i++) {
            System.out.println(i);
    }
}
}