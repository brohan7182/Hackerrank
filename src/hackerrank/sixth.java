package hackerrank;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        for (int i=1;i<=10;i++){
            int result = N * i;
            System.out.printf("%d x %d = %d",N,i,result);
            System.out.println();
        }
    }
}
