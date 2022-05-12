import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        int n , r ;
        int totala = 1 , totalb = 1 , totalc = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Küme Eleman Sayısı : ");
        n = inp.nextInt();
        System.out.print("Alt Küme Eleman Sayısı : ");
        r = inp.nextInt();


        for ( int a = 1 ; a <= n ; a++) {
            totala = totala * a;
        }
        for ( int b = 1 ; b <= r ; b++) {
            totalb = totalb * b;
        }
        for ( int c = 1 ; c < n - r ; c++) {
            totalc = totalc * c;
        }

        System.out.println("n faktöriyel : " + totala);
        System.out.println("r faktöriyel : " + totalb);

        System.out.println("Kombinasyon : " + (totala / (totalb * (totalc))));
    }
}
