public class AssignmentPrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int p = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i%j == 0)
                    p++;
            }
            if(p == 1 && i!=1)
                System.out.println(i);
        }
    }
}