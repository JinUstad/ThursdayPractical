import java.util.Scanner;

public class jagged {
    public static void main(String... args){
        int[] arr[]= new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        int i,j;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("---------------DISPLAYING ARRAY ELEMENTS----------------");
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
