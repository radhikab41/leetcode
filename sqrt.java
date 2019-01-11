class Solution {
    public int mySqrt(int x) {
        double n = (Math.sqrt(x));
        return (int)n;
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().mySqrt(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}