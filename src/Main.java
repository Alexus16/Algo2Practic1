import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int[] mas = {1, 2, 3, 4};
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < mas.length; i++)
        {
            sum += (mas[i] = scanner.nextInt());
        }
        System.out.println("Sum: " + sum + " Avg: " + sum/mas.length);
    }
}