package Tugas5_1;

public class Lingkaran {

    static int urutan=1;

    public static void luasKelilingLingkaran(float jejari){
        float hasilLuas = 3.14F * jejari * jejari;
        float hasilKeliling = 3.14F * 2 * jejari;
        System.out.println("Hasil luas lingkaran ke "+urutan+": "+hasilLuas);
        System.out.println("Hasil keliling lingkaran ke "+urutan+": "+hasilKeliling+"\n");
        urutan++;
    }
    public static void luasKelilingLingkaran(double diameter){
        double jejari= diameter/2;
        double hasilLuas = 3.14 * jejari * jejari;
        double hasilKeliling = 3.14 * diameter;
        System.out.println("Hasil luas lingkaran ke "+urutan+": "+hasilLuas);
        System.out.println("Hasil keliling lingkaran ke "+urutan+": "+hasilKeliling+"\n");
        urutan++;
    }
}
