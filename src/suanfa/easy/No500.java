package suanfa.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No500 {
    /**
     * 给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示
     * 美式键盘 中
     * 第一行由字符 "qwertyuiop" 组成。
     * 第二行由字符 "asdfghjkl" 组成。
     * 第三行由字符 "zxcvbnm" 组成。
     *输入：words = ["Hello","Alaska","Dad","Peace"]
     * 输出：["Alaska","Dad"]
     */
    public static String[] findWords(String[] words) {
        Queue<String> queue=new LinkedList<>();
        String[] qaz={"qwertyuiop","asdfghjkl","zxcvbnm"};
        for (int i = 0; i < words.length; i++) {
            word:for (int j = 0; j < qaz.length; j++) {
                boolean b=false;
                for(int k=0;k<words[i].length();k++) {
                    String first = String.valueOf(words[i].charAt(k)).toLowerCase();
                    if(qaz[j].indexOf(first)!=-1){
                        b=true;
                    }else if(b){
                        break word;
                    }else {
                        break ;
                    }
                 }
                if(b){
                    queue.add(words[i]);
                }
            }
        }
        return queue.toArray(new String[queue.size()]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}
