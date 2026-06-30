public class selectionSort {
    static void SelectionSort(int [] nums) {
        int n = nums.length;

        for(int i = 0; i < n-1; i++) {
            int minIdx = i;
            for(int j = i+1;j < n;j++) {
                if(nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int [] nums = {64, 25, 12, 22, 11};

        SelectionSort(nums);

        for(int x : nums) {
            System.out.print(x + " ");
        }
    }
}
