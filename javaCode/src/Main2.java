public class Main2 {

    public static int findDominant(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int candidate = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == candidate) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return candidate;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2};
        System.out.println(findDominant(nums));
    }
}
