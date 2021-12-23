public class DiverseArray {
    public static void main(String[] args) throws Exception {
        System.out.println("Array practice");
        // 1. Complete a static method multiplesOf which takes two parameters.

        // 2. Complete a static method reverseArray that takes an int array parameter.

        // 3. Complete three static methods arraySum, rowSums, and isDiverse.
    }

    // multiplesOf
    public static int[] multipliesOf(int num, int count) {
        int Marray[] = new int[count];
        // offset by 1
        for (int i = 1; i < Marray.length; i++) {
            Marray[i - 1] = (i * num);
        }
        return Marray;

    }

    public static int arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }

    // RowSums
    public static int[] rowSums(int arr2D[][]) {
        int Larray[] = new int[arr2D.length];
        for (int i = 0; i < Larray.length; i++) {
            for (int j = 0; j < Larray.length; j++) {

            }
        }

        return Larray;
    }

}
