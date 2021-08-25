package suanfa.easy;

public class No389 {
    /**
     *
     位运算本身是类似电路题，其中异或运算用处最大，异或运算主要是三个性质：
     (1)数字自身异或为0；
     (2)任何数字与0异或不变；
     (3)异或运算满足交换律。——可用于抵消偶次数出现的数字等
     */

    public char findTheDifference2(String s, String t) {
        // 两字符串转为字符数组
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int n = 0;
        int i;
        /**
         进行异或运算
         原理是：(1)数字自身异或为0
         (2)任何数字与0异或不变
         (3)异或运算满足交换律
         */
        for(i = 0;i < sc.length;++i){
            n ^= sc[i];
            n ^= tc[i];
        }
        n ^= tc[i];
        return (char)n;
    }
    public static char findTheDifference(String s, String t) {
        StringBuilder builder=new StringBuilder(s);
        for(int i=0;i<t.length();i++){
            int index=builder.indexOf(String.valueOf(t.charAt(i)));
            if(index==-1){
                return t.charAt(i);
            }else {
                builder=builder.deleteCharAt(index);
            }
        }
        return builder.toString().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","dfacb"));
    }
}
