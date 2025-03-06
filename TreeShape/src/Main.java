public class Main {
    public static void main(String[] args) {
        int n = 9;
        int i = 0, j = 0;
        int ns = 1, nb = n - 1;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < nb; j++)
            {
                System.out.print(" ");
            }
            for (j = 0; j < ns; j++)
            {
                System.out.print("*");
            }
            ns += 2;
            nb --;
            System.out.print("\n");
        }
        for (i = 0; i < 3; i++){
            for (j = 0; j < 8; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}