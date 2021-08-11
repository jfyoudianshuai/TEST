package suanfa.easy;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

public class No224 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            // 判断nums[i+1]是否越界  &&  判断当前i的下一位是否是i的相邻数
            if(!(i+1<nums.length && nums[i]== nums[i+1]-1)){
               //下一位不是i的相邻数 在这里终止
                //如果sb的长度大于0， 说明sb之前已经有一个值了  需要拼接个->
                if(sb.length()>0) sb.append("->");
                //拼接当前数
                sb.append(nums[i]);
                list.add(sb.toString());
                sb=new StringBuffer();
            }else {
                //下一位和当前是相邻数。 如果sb没值得话 就拼接第一位，之后有值得话 就不拼接了
                if(sb.length()==0) sb.append(nums[i]);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{1, 2, 2, 4}));
    }
}
