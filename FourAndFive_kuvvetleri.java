package patika;

import java.util.Scanner;

public class FourAndFive_kuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Sınır değeri giriniz:");
        n=sc.nextInt();
        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <n ; i*=4) {
            System.out.print(i+" ");
        }
        System.out.println("\n5'ün kuvvetleri:");
        for (int i = 1; i <n ; i*=5) {
            System.out.print(i+" ");
        }
    }
}
