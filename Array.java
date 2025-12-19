import java.util.Scanner;
public class Array {
    public static void main(String []args){
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sca.nextInt();
        
        int[] arrayValue = new int[size];
        int sum = 0;
        
        for (int a = 0; a < size; a++) {
            while (true) {
                System.out.printf("Enter value array index of %d : ",a);
                int value = sca.nextInt();
            if (value >= 0 && value <= 50) {
                arrayValue[a] = value;
                sum += value; // sum = sum + value
                break;
            }else {
                System.out.println("Try Again!.");
            }
            }
        }
        System.out.println("The sum result is : "+sum);
        sca.close();
    }
}