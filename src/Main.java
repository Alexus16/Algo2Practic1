public class Main {
    public static void main(String[] args) {
        double currentEl = 0.0;
        for(int curIt = 1; curIt <= 10; curIt++)
        {
            currentEl += 1.0/curIt;
            System.out.print(String.format("%.4f ", currentEl));
        }
    }
}