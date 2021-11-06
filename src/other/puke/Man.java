package other.puke;

import java.util.ArrayList;
import java.util.List;

public class Man {
    private String ident;
    private List<Object> list =new ArrayList<>();

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Man{" +
                "ident='" + ident + '\'' +
                ", list=" + list +
                '}';
    }
}
