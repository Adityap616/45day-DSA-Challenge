class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int l = nums.length;
        for(int i = 0;i<l;i++){
            if (nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        for(int i = k;i<l;i++){
            nums[i] = 0;
        }
    }
}
