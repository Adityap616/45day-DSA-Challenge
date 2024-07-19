class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: Finding the intersection point of the two runners.
        int slow = nums[0];
        int fast = nums[0];
        
        // Move slow pointer one step and fast pointer two steps until they meet.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Phase 2: Finding the entrance to the cycle.
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        // The point where they meet is the duplicate number.
        return slow;
    }
}
