package Array.ElementsWeight;
import java.util.Scanner;
public class DriverCode {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int size=scan.nextInt();
        int[]array=new int[size];
        System.out.print("Enter the Array:");
        for(int iterator=0;iterator<size;iterator++) array[iterator]=scan.nextInt();
        new FindElementsWeight().output(size,array);
    }
    
}
