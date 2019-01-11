class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
       // int start;
        int end = nums.length-1;
        int mid =  (end+start)/2;
        while(mid%2==0 && mid!=0){
            mid = (end+start)/2;
            int midVal = nums[mid];
            if(target==midVal){
                return mid;
            }
            else{
                if(target<midVal){
                    start=0;
                    end = mid-1;
                }
                else{
                    start=mid+1;
                    end = nums.length-1;
                }
            }
        }
        //means not found
        int i=0;
        while(i<nums.length && target>nums[i]){
           i++;
        }
        return i;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int ret = new Solution().searchInsert(nums, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}