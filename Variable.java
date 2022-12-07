public class Variable {
    static int a = 10;//class/static variable
    int b = 20;//instance variable
    public static void main(String... args){
        int c = 30;//local variable
        Variable obj = new Variable();
        System.out.println("a = "+a+"b = "+obj.b+"c = "+c);
    }

}
