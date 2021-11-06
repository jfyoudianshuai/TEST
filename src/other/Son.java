package other;

public class Son extends Father{
    private String name;
    private String age;
    public String getName() {
        return name;
    }
    public String getMoney(){
        System.out.println("son的money");
        return "";
    }
    public void setName(String name) {
        this.name = name;
    }
}
