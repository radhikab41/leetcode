/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode head;
        ListNode t;
        if(l1!=null && l2!=null){
            if(t1.val<t2.val){
                 head = new ListNode(t1.val);
                t1 = t1.next;
            }
            else{
                 head = new ListNode(t2.val);
                t2 = t2.next;
            }
            t= head;
            
            while(t1!=null && t2!=null){
                if(t1.val<t2.val){
                    ListNode p = new ListNode(t1.val);
                    t.next = p;
                    t=p;
                    t1 = t1.next;
                }
                else{
                    ListNode p = new ListNode(t2.val);
                     t.next = p;
                    t=p;
                    t2 = t2.next;
                }
            }
            if(t1==null){
               while(t2!=null){
                    ListNode p = new ListNode(t2.val);
                     t.next = p;
                    t=p;
                    t2 = t2.next;
               } 
            }
            else{
                while(t1!=null){
                    ListNode p = new ListNode(t1.val);
                    t.next = p;
                    t=p;
                    t1 = t1.next;
                }
            }
            
        }
        else{
            if(t1==null){
                return l2;
            }
            else{
                return l1;
            }
        }
        return head;
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
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);
            
            ListNode ret = new Solution().mergeTwoLists(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}