import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        // Girilen tutarın %18 KDV'sini veya %8'ini hesaplayacağız.

        double tutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvliTutar; // Ondalıklı olması için double tanımladık.
        Scanner input = new Scanner(System.in); // Scanner fonksiyonu (metodu) için import ettik.
        System.out.print("Lütfen Tutarı Giriniz:");
        tutar = input.nextDouble();

        kdvliTutar = tutar < 1000 ? (tutar * kdvOrani1 + tutar) : (tutar * kdvOrani2 + tutar);

        System.out.println("Tutar: " + tutar);
        System.out.println("1000 TL'ye kadar KDV Oranı: " + kdvOrani1);
        System.out.println("1000 TL ve sonrası için KDV Oranı: " + kdvOrani2);

        System.out.println("Girilen tutar için KDV'li fiyat: " + kdvliTutar);




    }
}
