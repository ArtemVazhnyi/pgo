public class Main {
    public static int[] filterEvenIndexOddValue(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] filtered = filterEvenIndexOddValue(arr);

        for (int num : filtered) {
            System.out.print(num + " ");
        }
    }
}
