import java.util.*;
public class AssignmentPalindromeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to declare if its palindrome or not: ");
        int n = input.nextInt();
        String Strn = Integer.toString(n);
        int nlength = Strn.length();
        for (int i = 0; i <= nlength/2; i++) {
            if (Strn.charAt(i)==Strn.charAt(nlength-1-i)) {
                System.out.printf("%d is a palindrome number\n",n);
                break;
            }else
                System.out.printf("%d is NOT a palindrome number\n",n);
            break;
                
        }
    }
}
