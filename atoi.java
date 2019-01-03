class Solution {
    public int myAtoi(String str) {
        StringBuilder sb = new StingBuilder();
        int i=0;
        while(i<str.length() && str.charAt(i)==' '){
            i++;
        }
        if((int)str.charAt(i)>64 && (int)str.charAt(i)<123 ){
            return 0;
        }
        else{
            while(((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57) || str.charAt(i)=='-'||str.charAt(i)=='+'){

                sb.append(str.charAt(i));
                i++;
            }
        }
        int answer = Integer.parseInt(sb.toString());
        return answer;
    }
}