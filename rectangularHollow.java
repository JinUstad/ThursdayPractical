import java.util.Scanner;
public class rectangularHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
        for(int i=1 ;i<=4;i++){
            for (int j=1;j<=5;j++){
                if(i==1 || i == 4 || j == 1  || j == 5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
