package Leetcode.topQuestions;

 class Main {
    public static void main(String[] args) {
        
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        
        int uniqueCount = removeDuplicates(nums);
        
        System.out.println("Unique Count: " + uniqueCount);
        
        // Print the array after removing duplicates
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
     public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Start with the first element as unique
        int left = 0;

        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right]; // Update the next unique element
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
