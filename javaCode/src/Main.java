public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrTable = filterEvenIndexOddValue(arr);
    }

    public static int[] filterEvenIndexOddValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                if (array[i] % 2 != 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        return array;
    }

}