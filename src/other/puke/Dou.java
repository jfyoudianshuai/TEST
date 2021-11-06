package other.puke;

public class Dou {
    private Man man1 =new Man();
    private Man man2=new Man();
    private Man boss=new Man();
    private Puke puke=new Puke();
    public Dou(){
        puke.givePu();
        puke.faPu(man1);
        puke.faPu(man2);
        puke.faPu(boss);
        System.out.println(man1.getList());
        System.out.println(man2.getList());
        System.out.println(boss.getList());
        System.out.println(puke.di);
    }

    public static void main(String[] args) {
        new Dou();
    }
}
