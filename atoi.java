class Solution {
    public int myAtoi(String str) {
        if(str.length()>0){
            StringBuilder sb = new StringBuilder();
            int symbolFlag = 0;
            int stopFlag=0;
            int i=0;
            
            while(i<str.length() && str.charAt(i)==' '){
                i++;
            }
           
            if(i<str.length()){
                if(((int)str.charAt(i)<48 && (int)str.charAt(i)>57) && i<str.length()){
                return 0;
            }
            else{
                while(i<str.length() &&(((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)  || str.charAt(i)=='-'||str.charAt(i)=='+')){
                   if(str.charAt(i)=='-'||str.charAt(i)=='+'){
                       if(symbolFlag==0 && sb.length()==0){
                           sb.append(str.charAt(i));
                           symbolFlag=1;
                       }
                       else{
                           if(sb.charAt(sb.length()-1)=='-'||sb.charAt(sb.length()-1)=='+')
                            return 0;
                           else{
                               if( sb.length()>0){
                                   stopFlag=1;
                               }
                           }
                       }
                   }
                   else{
                       if(i<str.length() &&(((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)))
                       if(stopFlag==0)
                        sb.append(str.charAt(i));
                        
                   }
                    
                   
                    i++;
                }
            }
            try{
                
                int answer = Integer.parseInt(sb.toString());
                return answer;
            }
            catch(NumberFormatException numberFormatException){
                if(sb.length()>1){
                    if(sb.toString().charAt(0)=='-'){
                   return -2147483648;
               }
               else{
                   return 2147483647;
               }
                }
               
            }
            catch(Exception e){
                return 0;
            }
            }
            
           
        }
       
       return 0;
       
    }
}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String str = stringToString(line);
            
            int ret = new Solution().myAtoi(str);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}