public class Goruntuleme {


    int toplamAracSayisi;
    int toplamUcret;

    Goruntuleme() {
        this.toplamAracSayisi=Otopark.genelAracToplami;
        this.toplamUcret = Otopark.genelToplam;


    }

    public static void gunsonu(){
        System.out.println("Genel araç toplamı = " + Otopark.genelAracToplami);
        System.out.println("Genel ücret toplamı = " + Otopark.genelToplam);
    }


}
