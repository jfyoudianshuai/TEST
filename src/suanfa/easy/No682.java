package suanfa.easy;

import java.util.Stack;

public class No682 {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        int res=0;
        for(int i=0;i<ops.length;i++){
            try{
                Integer socre=Integer.parseInt(ops[i]);
                stack.push(socre);
                res+=socre;
            }catch (NumberFormatException e){
                int nownum=0;
                switch (ops[i]){
                    case "C": res-=stack.pop();  break;
                    case "D": nownum=stack.peek()*2; res+=(nownum); stack.push(nownum); break;
                    case "+": int temp = stack.pop(); nownum=stack.peek()+temp;res+=(nownum);stack.push(temp);stack.push(nownum); break;
                    default:
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"1"}));
    }
}
