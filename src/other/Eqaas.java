package other;

import util.StringUtil;

public enum Eqaas {
    开放状态_开放("开放状态","01","开放"),
    基金类资产类型_货币基金("基金类资产类型","F01","货币基金"),
    基金类资产类型_非货币基金("基金类资产类型","F02","非货币基金"),
    基金类资产二级类型_债券基金("基金类资产二级类型","01","债券基金"),
    ;
    private String name;
   private String a;
   private String b;

    Eqaas(String name, String a, String b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }
//    public boolean equals(String s){
//        System.out.println("dfs");
//      return  StringUtil.equals(s,this.a);
//
//    }

    public static void main(String[] args) {
        System.out.println(Eqaas.基金类资产二级类型_债券基金.equals("01"));
    }
}
