import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input an integer from 1 to 10:   ");
        int n = scan.nextInt();


        if (n >= 1 && n <= 10) {

            System.out.println(n * n);

        } else {

            System.out.println("Your integer did not fit the parameters. ");
        }
    }
}