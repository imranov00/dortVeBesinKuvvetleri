import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz: ");
        n = inp.nextInt();


        System.out.println("Dört Sayısının Kuvvetleri: ");


        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i + ",");

        }
        System.out.println("Beş Sayısının Kuvvetleri : ");

        for (int b = 1 ; b <= n; b*=5){
            System.out.println(b + ";");
        }
    }
}