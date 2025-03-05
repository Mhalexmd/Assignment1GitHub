import java.util.*;
public class AssignmentPerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to declare if its perfect or not: ");
        int n = input.nextInt();
        int s = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0) {
                s += i;
            }
        }
        if (s == n) {
            System.out.printf("%d is a perfect number\n",n);
        }else{
            System.out.format("%d is NOT a perfect number\n",n);
            }
    }
}
