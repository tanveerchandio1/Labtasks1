import java.util.Scanner;
public class task2OddEven {
    

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } else {
            System.out.println("The number is negative");
        }
        sc.close();
        return;

    }

    
}
