package suanfa.easy;



public class No476 {
    /**
     * 0和A异或为A
     * 1和A异或为非A
     * @param num
     * @return
     */
    public static int findComplement1(int num) {
        int tmp=num;
        int y=0;
        while(num>0){
            num>>=1;
            y=(y<<1) + 1;
        }
        return tmp^y;
    }
        public static int findComplement(int num) {
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            int n=num&1;
            if(n==1){
                sb.append(0);
            }else {
                sb.append(1);
            }
            num=num>>1;
        }
        return Integer.parseInt(sb.reverse().toString(),2);
    }

    public static void main(String[] args) {
        System.out.println(findComplement1(8));
    }
}
