import java.util.Scanner;

public class digitsOfNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int numberOfDigits = 0;
        int temp = n;

        while (temp!=0) {
            temp = temp/10;
            numberOfDigits++;
        }

        int div = (int)Math.pow(10, numberOfDigits - 1);
        while (div != 0) {
            int q = n/div;
            System.out.println(q);

            n = n % div;
            div = div / 10;

        }
    }
}
