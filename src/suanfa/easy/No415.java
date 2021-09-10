package suanfa.easy;


public class No415 {
    public  static String addStrings1(String num1, String num2) {
        StringBuilder builder=new StringBuilder();
        int n1=num1.length();
        int n2=num2.length();
        int index=1;
        boolean b=false;
        while(index<=Math.max(n1,n2)) {
            if (index<=Math.min(n1,n2)) {
                Integer first1 = Integer.parseInt(String.valueOf(num1.charAt(n1-index)));
                Integer first2 = Integer.parseInt(String.valueOf(num2.charAt(n2-index)));
                if (b) {
                    if (first1 + first2 + 1 >= 10) {
                        builder.append((first1 + first2 + 1) % 10);
                    } else {
                        builder.append(first1 + first2 + 1);
                        b = false;
                    }
                } else {
                    if (first1 + first2 >= 10) {
                        builder.append((first1 + first2) % 10);
                        b = true;
                    } else {
                        builder.append(first1 + first2);
                    }
                }

            }else {
                if(!b) {
                    if (n1 > n2) {
                        builder.append(num1.charAt(num1.length() - index));
                    } else {
                        builder.append(num2.charAt(num2.length() - index));
                    }
                }else {
                    if (n1 > n2) {
                        Integer first1 = Integer.parseInt(String.valueOf(num1.charAt(n1-index)));
                        first1+=1;
                        if(first1<10){
                            b=false;
                        }
                        builder.append(first1%10);
                    } else {
                        Integer first2 = Integer.parseInt(String.valueOf(num2.charAt(n2-index)));
                        first2+=1;
                        if(first2<10){
                            b=false;
                        }
                        builder.append(first2%10);
                    }
                }
            }
            index++;
        }
        if(b){
            builder.append(1);
        }
        return builder.reverse().toString();
    }

    /**
     * ********
     * ☆☆☆☆☆☆☆☆☆
     * ☆☆☆☆☆☆
     * ☆☆☆☆☆☆
     * @param num1
     * @param num2
     * @return
     */
        public  static String addStrings(String num1, String num2) {
                StringBuilder sb = new StringBuilder();
                int carry = 0, i = num1.length()-1, j = num2.length()-1;
                while(i >= 0 || j >= 0 || carry != 0){
                    if(i>=0) carry += num1.charAt(i--)-'0';
                    if(j>=0) carry += num2.charAt(j--)-'0';
                    sb.append(carry%10);
                    carry /= 10;
                }
                return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(677+451);
        System.out.println(addStrings1("371","53"));

    }
}
