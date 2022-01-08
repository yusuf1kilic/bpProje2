import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Otopark park = new Otopark();
        Goruntuleme yazdirma=new Goruntuleme();

        park.kapasite();
        Arac arac = new Arac(4, "34BZ356", "Mavi", "Clio");
        arac.BilgileriGoster();
        System.out.print("Lütfen Kaç Saat Kalacağınızı Giriniz : ");
        Otomobil clio = new Otomobil();
        park.ucretlendirme(input.nextInt(), clio.getUcret());


        park.kapasite();
        Arac arac1 = new Arac(4, "45YK777", "Beyaz", "Suzuki");
        arac.BilgileriGoster();
        System.out.print("Lütfen Kaç Saat Kalacağınızı Giriniz : ");
        Kamyon suzuki = new Kamyon();
        park.ucretlendirme(input.nextInt(), suzuki.getUcret());


        park.kapasite();
        Arac arac2 = new Arac(2, "52AB978", "Siyah", "Harley Davidson");
        arac.BilgileriGoster();
        System.out.print("Lütfen Kaç Saat Kalacağınızı Giriniz : ");
        Motosiklet harley = new Motosiklet();
        park.ucretlendirme(input.nextInt(), harley.getUcret());


        park.kapasite();
        Arac arac3 = new Arac(2, "81AF542", "Gri", "Honda");
        arac.BilgileriGoster();
        System.out.print("Lütfen Kaç Saat Kalacağınızı Giriniz : ");
        Motosiklet honda = new Motosiklet();
        park.ucretlendirme(input.nextInt(), honda.getUcret());


        park.kapasite();
        Arac arac4 = new Arac(4, "60UZ874", "Beyaz", "Bugatti");
        arac.BilgileriGoster();
        System.out.print("Lütfen Kaç Saat Kalacağınızı Giriniz : ");
        Otomobil bugatti = new Otomobil();
        park.ucretlendirme(input.nextInt(), bugatti.getUcret());

        park.kapasite();
        Arac arac5 = new Arac(4, "34BIN635", "Beyaz", "mercedes");
        arac.BilgileriGoster();
        System.out.print("Lütfen Kaç Saat Kalacağınızı Giriniz : ");
        Otomobil mercedes = new Otomobil();
        park.ucretlendirme(input.nextInt(), mercedes.getUcret());

        park.kapasite();
        Arac arac6 = new Arac(4, "34KS6802", "Grı", "Volkswagen");
        arac.BilgileriGoster();
        System.out.print("Lütfen Kaç Saat Kalacağınızı Giriniz : ");
        Otomobil volkswagen = new Otomobil();
        park.ucretlendirme(input.nextInt(), volkswagen.getUcret());

        Goruntuleme.gunsonu();



    }
}
