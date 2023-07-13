
public class sumOf2Aray {

    public static int[] sumArrays(int[] arr1, int[] arr2) {
        int[] sum = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] result = sumArrays(array1, array2);

        System.out.print("Sum of arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
