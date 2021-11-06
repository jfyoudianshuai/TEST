package suanfa.easy;

public class No744 {
    /**
     * 给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。
     * 在比较时，字母是依序循环出现的。举个例子：
     * 如果目标字母 target = 'z' 并且字符列表为 letters = ['a', 'b']，则答案返回 'a'
     * 示例：
     * 输入:
     * letters = ["c", "f", "j"]
     * target = "a"
     * 输出: "c"
     * 输入:
     * letters = ["c", "f", "j"]
     * target = "c"
     * 输出: "f"
     */
    public static char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        for(char c:letters){
            if(c>target){
                return c;
            }
        }
       return res;
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'a','b'},'z'));
    }
}
