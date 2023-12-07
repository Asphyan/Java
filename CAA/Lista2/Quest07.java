public class Quest07 {
    public static int[] quadradosOrdenados(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int squareLeft = nums[left] * nums[left];
            int squareRight = nums[right] * nums[right];

            if (squareLeft > squareRight) {
                result[index] = squareLeft;
                left++;
            } else {
                result[index] = squareRight;
                right--;
            }
            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] resultado = quadradosOrdenados(nums);
        for (int num : resultado) {
            System.out.print(num + " ");
        }
        // Saída: [0, 1, 9, 16, 100]
    }
}
