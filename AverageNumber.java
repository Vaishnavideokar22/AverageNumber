import java.util.Scanner;
public class AverageNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Enter The Integer Number For a");
        a = sc.nextInt();

        int b;
        System.out.println("Enter The Integer Number For b");
        b = sc.nextInt();

        int c;
        System.out.println("Enter The Integer Number for c");
        c = sc.nextInt();

        int avg;
        avg = a+b+c/3;
        System.out.println("Average Of Three Numbers is:" + avg);
    }
    
}
