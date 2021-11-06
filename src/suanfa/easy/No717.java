package suanfa.easy;

public class No717 {
    public static boolean isOneBitCharacter(int[] bits) {
        if(bits[bits.length-1]==0){
            for(int i=bits.length-2;i>=0;i--){
                if(bits[i]==0){
                    if((bits.length-i)%2==0){
                        return true;
                    }else {
                        return false;
                    }
                }
            }
        }
        return bits.length%2==1;
    }
    public static boolean isOneBitCharacter2(int[] bits) {
        if(bits[bits.length-1]!=0) return false;
        int res=-1;
        for (int i = 0; i < bits.length; i++,res=i) {
            int bit = bits[i];
            boolean b=bit==1;
            if(b){
                i++;
            }
        }
        return res==bits.length;
    }

    public static void main(String[] args) {
        System.out.println(isOneBitCharacter2(new int[]{1,1,1,0}));
    }
}
