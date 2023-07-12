import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int wordCount = scn.nextInt();

    while (wordCount-->0) {
    
        String str = scn.next ();
        int length = str.length();

        if (length > 10 ) {
            System.out.println("" + str.charAt(0) + (length-2) + str.charAt (length-1));
        } else {
            System.out.println(str);
        }
    }

    }
}
