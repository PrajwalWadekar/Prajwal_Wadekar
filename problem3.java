import java.util.Scanner;
public class problem3 {
    //print first n odd numbers
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        
        int count = (n % 2 == 0) ? (n - 1) : n;
        int num = 1;

        while (count > 0) {
            System.out.print(num);
            num += 2;
            count--;

            if (count > 0) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
