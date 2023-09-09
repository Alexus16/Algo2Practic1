import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(fact(new Scanner(System.in).nextInt()));
    }

    private static int fact(int a)
    {
        int res = 1;
        for(int i = 1; i <= a; i++)
        {
            res *= i;
        }
        return res;
    }
}