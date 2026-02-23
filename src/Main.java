import java.util.Scanner;

public class Main {

    //    using recursion
    public int fact(int num) {
        if (num == 0)
            return 1;
        return num * fact(num - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = num;

        Main m = new Main();
        System.out.println(m.fact(n));

        int fact = 1;

        for (int i = num; i > 0; i--) {
            fact *= num;
            num--;
        }
        System.out.println(fact);

    }
}