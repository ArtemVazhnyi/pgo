public class Main3 {

    public static int[] rotateArray(int[] arr, int positions) {
        if (arr == null || arr.length == 0 || positions == 0) {
            return arr;
        }

        positions = positions % arr.length;

        if (positions == 0) {
            return arr;
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[(i + positions) % arr.length] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int positions1 = 2;
        int[] rotatedArr1 = rotateArray(arr1, positions1);
        System.out.println(java.util.Arrays.toString(rotatedArr1));

        int[] arr2 = {1, 2, 3};
        int positions2 = 3;
        int[] rotatedArr2 = rotateArray(arr2, positions2);
        System.out.println(java.util.Arrays.toString(rotatedArr2));
    }
}
