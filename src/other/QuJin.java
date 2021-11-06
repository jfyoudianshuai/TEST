package other;

public class QuJin {
    /**
     *  除了头和尾去#号
     */
    public static String deletesofe(String s){
        int head=0,end=s.length()-1;
        while (s.charAt(head)=='#' || s.charAt(end)=='#'){
            if(s.charAt(head)=='#')head++;
            if(s.charAt(end)=='#')end--;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(0,head));
        for(int i=head;i<end;i++){
            if(s.charAt(i)!='#')sb.append(s.charAt(i));
        }
        sb.append(s.substring(end));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(deletesofe("###sa#k#jf###fd#k##"));
    }
}
