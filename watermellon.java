
import java.util.Scanner;

public class watermellon  {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int weight = scn.nextInt();

        if (weight <= 2 || weight % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
