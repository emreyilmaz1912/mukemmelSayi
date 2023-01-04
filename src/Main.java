import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , total = 0;

        System.out.print("Lütfen mükemmel sayıyı bulmak için bir sayı giriniz :");
        n = input.nextInt();
        

        for (int i=1; i < n; i++){
            if (n%i==0){
                total += i;
            }

        }
        if (total == n){
            System.out.print(n + " mükemmel bir sayıdır.");
        }else System.out.print(n + " mükemmel bir sayı değildir.");

    }
}