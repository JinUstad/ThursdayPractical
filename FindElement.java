import java.util.Scanner;

public class FindElement {
    public static void main(String... args){
        int arr[]={22,32,14,26,37,5,18,29};
        int i,se;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the array element to search : ");
        se = sc.nextInt();
        for(i=0;i<arr.length;i++){
            if(se==arr[i]){System.out.println(se+" Found at location "+(i+1));break;}
        }
        if(i==arr.length){System.out.println("Element not found");}
    }

}
