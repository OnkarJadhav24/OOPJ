import java.util.Scanner;

public class Q1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
      //  int [] arr = {1,2,3,4,5};
      int size = scanner.nextInt();
      int [] arr = new int[size];

        System.out.println("Elements os array");
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
            System.out.println(arr[i]);
        }

    }
}
