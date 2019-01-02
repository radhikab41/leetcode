class Solution {
    public int reverse(int x) {
      String s = Integer.toString(x);
      StringBuilder sb = new StringBuilder(s);
      sb = sb.reverse();
      String answer;
      if(x>=0){
           answer = sb.toString();
      }
      else{
          String ans = sb.toString();
           answer = ans.substring(0,ans.length()-1);

      }
      try{
          int finalAns = Integer.parseInt(answer);
          if(x<0){
              finalAns*=-1;
          }
          return finalAns;
      }
      catch(Exception e){
          return 0;
      }
      
     
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().reverse(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}