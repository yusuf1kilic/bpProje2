import java.util.Scanner;

public class Otopark {

    public static int genelToplam=0;
    public static int genelAracToplami=0;

    int acounter = 5, kcounter = 5;
    int[] acikOtopark = new int[6];
    int[] kapaliOtopark = new int[6];
    int saat;



    Otopark() {
        this.saat = saat;
        this.acikOtopark = acikOtopark;
        this.kapaliOtopark = kapaliOtopark;
        this.acounter = this.acounter;
        this.kcounter = kcounter;
        this.genelToplam=genelToplam;
        this.genelAracToplami=genelAracToplami;
    }



    public void ucretlendirme(int saat, int ucret) {

        int toplam = 0;

        if (saat <= 1) {
            System.out.println("1 saat ücretsizdir.. Güle Güle!!!!\n---------------------------------------------\n");
        } else {
            toplam = ucret * saat;
            genelToplam+=toplam;

            System.out.println("Saati " + ucret + " TL den Borcunuz = " + toplam);
            System.out.println("---------------------------------------------");
        }

    }

    public void kapasite() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kat seçimi yapın(1 : Kapalı otopark için , 0 : Açık otopark için) : ");

        int secim = input.nextInt();



        if (secim == 0) {
            System.out.println("!!!Açık otoparka giriş yaptınız.!!!");
            kapasite(0,this.acikOtopark);
            System.out.println("\nAçık Otoparkta Kalan Boş Alan Sayısı : " + (acounter+1));
            System.out.println("---------------------------------------");

        } else if (secim == 1) {
            System.out.println("!!!Kapalı otoparka giriş yaptınız.!!!");
            kapasite(1, this.kapaliOtopark);
            System.out.println("\nKapalı Otoparkta Kalan Boş Alan Sayısı : " + (kcounter+1));
            System.out.println("---------------------------------------");
        }else{
            System.out.println("lütfen geçerli bir değer giriniz");
        }

    }


    public void kapasite(int x,int[] dizi) {
        genelAracToplami++;


        if (x == 0) {


            if(acounter>=0){
                dizi[acounter] = 1;
                acounter--;
            }else if (acounter<0){
                acounter++;

                if(kcounter >= 0) {
                    acounter = 0;
                    kapasite(1,this.kapaliOtopark);
                    genelAracToplami--;
                    System.out.println("\nAçık Otoparkta yerimiz yok kapalı otaparka yönlendirildiniz.\n");
                    return;
                }else {
                    System.out.println("Otoparkın tüm katları doludur.");
                    acounter = kcounter = 0;
                }
            }
        }

        if (x == 1) {

            if(kcounter>=0){
                dizi[kcounter] = 1;
                kcounter--;
            }else if (kcounter<0){
                //kcounter;

                if(acounter >= 0) {
                    kcounter = 0;
                    kapasite(0,this.acikOtopark);
                    System.out.println("\nKapalı Otoparkta yerimıiz yok açık otaparka yönlendirildiniz.\n");
                    genelAracToplami--;
                    return;
                }else {
                    System.out.println("Otoparkın tüm katları doludur.");
                    acounter = kcounter = 0;

                }


            }
        }

        System.out.print("Açık otopark yer bilgileri = ");

        for (int i = 0; i < acikOtopark.length; i++) {

            int counter=0;
            if (this.acikOtopark[i]==0){
                System.out.print("bos, ");
            }else if (this.acikOtopark[i]==1){
                System.out.print("dolu, ");
            }


        }

        System.out.print("\nKapalı otopark yer bilgileri = ");

        for (int i = 0; i < kapaliOtopark.length; i++) {

            int counter=0;
            if (this.kapaliOtopark[i]==0){
                System.out.print("bos, ");
            }else if (this.kapaliOtopark[i]==1){
                System.out.print("dolu, ");
            }


        }
        System.out.println("\n");



    }
}
