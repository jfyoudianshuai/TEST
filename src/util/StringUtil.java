package util;

public class StringUtil {
    public static boolean equals(Object s1, Object s2) {
    if (!(s1 instanceof String)) {
        return false;
    }
    if (null != s1 && null != s2) {
        return s1.equals(s2);
    }
    return false;
}
}
