public class Arac {
    int tekerlekSayi;
    static String aracPlaka;
    static String renk;
    static String marka;
    int ucret;

    Arac(int tekerlekSayi, String aracPlaka, String renk, String marka) {
        this.tekerlekSayi = tekerlekSayi;
        this.aracPlaka = aracPlaka;
        this.renk = renk;
        this.marka = marka;
        this.ucret = ucret;
    }

    Arac() {

    }

    public int getTekerlekSayi() {
        return tekerlekSayi;
    }

    public int getUcret() {
        return ucret;
    }

    public void setTekerlekSayi(int tekerlekSayi) {
        this.tekerlekSayi = tekerlekSayi;
    }

    public static void setAracPlaka(String aracPlaka) {
        Arac.aracPlaka = aracPlaka;
    }

    public static void setMarka(String marka) {
        Arac.marka = marka;
    }

    public static String getAracPlaka() {
        return aracPlaka;
    }

    public static String getRenk() {
        return renk;
    }

    public static String getMarka() {
        return marka;
    }

    public void BilgileriGoster() {
        System.out.println("Giriş Yapan Aracın Plakası : " + getAracPlaka());
        System.out.println("Giriş Yapan Aracın Rengi : " + getRenk());
        System.out.println("Giriş Yapan Aracın Markası : " + getMarka());
        System.out.println("!!!Tespit Edilen Araç Otoparka Giriş Yapmıştır!!!");

    }

}

class Kamyon extends Arac {

    Kamyon() {
        tekerlekSayi = 4;
        ucret = 9;

    }

}

class Motosiklet extends Arac {

    Motosiklet() {
        tekerlekSayi = 2;
        ucret = 3;

    }
}

class Otomobil extends Arac {

    Otomobil() {
        tekerlekSayi = 4;
        ucret = 7;

    }

}
