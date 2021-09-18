package suanfa.easy;

public class No557 {
    /**
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     * 示例：
     * 输入："Let's take LeetCode contest"
     * 输出："s'teL ekat edoCteeL tsetnoc"
     */
    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s).reverse();
        StringBuilder res=new StringBuilder();
        String[] strs=sb.toString().split(" ");
        for(int i=strs.length-1;i>=0;i--){
            res.append(strs[i]);
            res.append(" ");
        }
        return res.deleteCharAt(res.length()-1).toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest").length());
        System.out.println("s'teL ekat edoCteeL tsetnoc".length());
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
