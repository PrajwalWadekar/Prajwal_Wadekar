    import java.util.Scanner;
    public class problem1{
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the 1st number : ");
            double a = sc.nextDouble();
            System.out.println("Enter the 2nd number : ");
            double b = sc.nextDouble();
            System.out.println("Enter Your coice \n 1. Addition\t 2. Subtraction \n 3. Multiplication\t 4. Division\t");
            int c =sc.nextInt();
            double ans = 0.0;

            switch (c) {
                case 1:
                    ans= a+b;
                    System.out.println( "The addition is  " +ans);
                    break;
                case 2:
                    ans =a-b;
                    System.out.println("The subtraction is " +ans);
                    break;
                case 3:
                    ans =a*b;
                    System.out.println("The multiplication is "+ans);
                    break;
                case 4:
                    ans =a/b;
                    System.out.println("The division is "+ans);
                    break;
                default:
                    System.out.println("Invalid coice");
                    break;
            }
            
        }
    }