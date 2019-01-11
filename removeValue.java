class Solution {
    public int removeElement(int[] nums, int val) {
        //int i=0;
        int count = 0;
        int[] match = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
        
            if(nums[i]==val){
                count++;
                match[i]=1;
            }
            else{
                match[i]=0;
            }
        }
        int anticipatedLength = nums.length - count;
       int[] answer = new int[anticipatedLength];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                answer[k] = nums[i];
                k++;
            }
            
        }
        
        for(int i=0;i<anticipatedLength;i++){
            nums[i] = answer[i];
        }
        
        return answer.length;
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
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int val = Integer.parseInt(line);
            
            int ret = new Solution().removeElement(nums, val);
            String out = integerArrayToString(nums, ret);
            
            System.out.print(out);
        }
    }
}