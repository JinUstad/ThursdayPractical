public class StaAndIns {
    static  int a ;
    static {
        System.out.println("Hello Static Variable");
        a = 10;
    }
    static {
        System.out.println("Hello Static Variable");
    }
    {
        System.out.println("Hello Instance Section");
    }{
        System.out.println("Hello Instance Section");
    }
    public static void main(String[] args) {

//    StaAndIns s = new StaAndIns();
//    StaAndIns s1 = new StaAndIns();
    }
}
