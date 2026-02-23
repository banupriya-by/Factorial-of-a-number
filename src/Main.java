import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fact = 1;

        for (int i = num; i > 0; i--) {
            fact *= num;
            num--;
        }
        System.out.println(fact);
    }
}