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

    public static int findDominant(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 3, 3, 2, 2};
        int[] filtered = filterEvenIndexOddValue(arr);
        int[] filtered2 = filterEvenIndexOddValue(arr2);

        for (int num : filtered) {
            System.out.print(num + " ");
        }
    }
}
