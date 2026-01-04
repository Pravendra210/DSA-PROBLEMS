public class rotatearray {

    // Method to rotate array by k steps
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k > n

        // Reverse entire array
        reverse(nums, 0, n - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse part of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to test rotation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
} 