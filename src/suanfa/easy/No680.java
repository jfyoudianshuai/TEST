package suanfa.easy;

public class No680 {
    public static boolean validPalindrome(String s) {
        int start=0,end=s.length()-1;
        while(start<end){
          if(s.charAt(start)!=s.charAt(end)){
              return isRever(s,start+1,end) || isRever(s,start,end-1);
          }
          start++;
          end--;
        }
        return true;
    }

    private static boolean isRever(String s,int start,int end) {
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abccdba"));
    }
}
