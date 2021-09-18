package suanfa.easy;

public class No507 {
    /**
     * 对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
     * 给定一个 整数 n， 如果是完美数，返回 true，否则返回 false
     * 示例 1
     * 输入：28
     * 输出：True
     * 解释：28 = 1 + 2 + 4 + 7 + 14
     * 1, 2, 4, 7, 和 14 是 28 的所有正因子。
     */
    public static boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int sum=1;
        for(int i=2;i<Math.ceil(Math.sqrt(num));i++){
            if(num%i==0){
                sum+=i;
                sum+=num/i;
            }
        }
        return sum==num;
    }

    public static void main(String[] args) {
        for(int i=1;i<30;i++) {
            System.out.println(i+"-->"+checkPerfectNumber(i));
        }
    }
}
