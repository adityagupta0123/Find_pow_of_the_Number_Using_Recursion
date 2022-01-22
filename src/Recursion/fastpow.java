package Recursion;

import java.util.Scanner;

public class fastpow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b : ");
        int b = sc.nextInt();
        System.out.println("Your Output : ");
        System.out.print(pow(a, b));
    }
    public static int pow(int x , int n){
        if(n==0)
            return 1;
        return (n%2 == 0) ? pow(x*x , n/2) : x * pow(x*x, n/2);

    }
}
