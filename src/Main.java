import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5};
        int it = 0, minEl = Integer.MAX_VALUE, maxEl = Integer.MIN_VALUE, sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(it < mas.length)
        {
            mas[it] = scanner.nextInt();
            minEl = Integer.min(minEl, mas[it]);
            maxEl = Integer.max(maxEl, mas[it]);
            sum += mas[it];
        }
        System.out.println("Sum: " + sum + " Min: " + minEl + " Max: " + maxEl);
    }
}