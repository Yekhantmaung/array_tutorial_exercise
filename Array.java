import java.util.Scanner;
public class Array {
    public static void main(String []args){
        Scanner sca = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int size = sca.nextInt();
        int array[] = new int[size];

        for (int a = 0;a < size;a++) {
            System.out.print("Enter number : ");
            array[a] = sca.nextInt();
        }

        System.out.println("Even Number.");
        for (int num : array) {
            if (num % 2 == 0) {System.out.println(num + "");}
        }
        
        System.out.println("Odd Number.");
        for (int num : array) {
            if (num % 2 != 0) {System.out.println(num + "");}
        }
        sca.close();
    }
}