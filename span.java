import java.util.Scanner;

public class span {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int span = scn.nextInt();
        int [] arr = new int[span];
       

        for(int i=0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++ ){
            if(arr[i] > max){
                max = arr[1];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int spanofarray = max- min;
        System.out.println(spanofarray);
    }
}
