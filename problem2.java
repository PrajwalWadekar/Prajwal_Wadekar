import java.util.Scanner;
public class problem2 {
    //print first n odd numbers
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:\n");
        int n =sc.nextInt();
        int count=n; 
        int num=1;
        while (count>0){
            System.out.print(num);
            num+=2;
            count=count-1;
            if (count>0){
                System.out.print(',');
            }
            
        }
    }
}
