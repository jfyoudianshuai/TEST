package util;

import java.lang.reflect.Field;

public class BeanUtils {
    public static void copyPropertes(Object obj,Object org){
        Class clazz=org.getClass();
        Field[] orgfields=clazz.getDeclaredFields();
        Class objClass=obj.getClass();
        Field[] objfields=objClass.getDeclaredFields();
        for(Field orgf:orgfields){
            for(Field objf:objfields){
                if(orgf.getName().equals(objf.getName())){
                    objf.setAccessible(true);
                    orgf.setAccessible(true);
                    try {
                        objf.set(obj,orgf.get(org));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
