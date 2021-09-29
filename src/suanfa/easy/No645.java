package suanfa.easy;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class No645 {
    public static int[] findErrorNums(int[] nums) {
        int[] res=new int[2];
        int[] temp=new int[nums.length+1];
        for(int n:nums){
            temp[n]++;
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i]==2){
                res[0]=i;
            }else if(temp[i]==0){
                res[1]=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,3,4,2,6})));
    }
}
