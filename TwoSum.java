class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
      //  Sysmtem.out.println("dsffafsd");
        for(int i=0;i<nums.length;i++){
           
                int a = nums[i];
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]+a == target){
                        indices[0]=i;
                        indices[1]=j;
                    }
                
            }
        }
        
        return indices;
        
    }
}