import java.util.Scanner;
public class matrix_2d {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 2D Matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter the value of 2D Matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
