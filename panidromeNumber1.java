class Solution {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        StringBuilder numberbuilder = new StringBuilder(number);
        numberbuilder = numberbuilder.reverse();
        String answer = numberbuilder.toString();
        try{
            int ans = Integer.parseInt(answer);
            if(ans == x){
                return true;
            }
            return false;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}

public class MainClass {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            boolean ret = new Solution().isPalindrome(x);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}