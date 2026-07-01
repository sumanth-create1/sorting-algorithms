public class insertionSort {
    static void InsertionSort(int [] nums) {
        int n = nums.length;
        for(int i = 1; i < n;i++) {
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int [] nums = {5, 2, 4, 6, 1, 3};

        InsertionSort(nums);

        for(int x : nums) {
            System.out.print(x + " ");
        }
    }
}
