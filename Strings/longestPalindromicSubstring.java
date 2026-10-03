package Strings;

public class longestPalindromicSubstring {
    public static int expand(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static String longestPalindromicSubstring(String s){
        int maxLength=0;
        int start=0;
      for(int i=0;i<s.length();i++){
        int odd = expand(s,i,i);
        int even = expand(s, i, i+1);
        if(odd>maxLength){
            maxLength=odd;
            start = i-odd/2;
        }
        if(even>maxLength){
            maxLength=even;
            start = i-even/2+1;
        }
        
      }
      return s.substring(start, start+maxLength);
    }
    public static void main(String[] args) {
        String s = "aba";
        System.out.print(longestPalindromicSubstring(s));
    }
}
