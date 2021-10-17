package Tugas5_2;
import java.lang.Math;

public class Segitiga {

    public static void hitungLuasKelilingSegitiga(){

        System.out.println("Pilih informasi yang ingin anda masukkan\n1.Informasi berupa alas dan tinggi segitiga\n2.Informasi berupa alas dan sisi segitiga");
        int pilihan = Tugas5_2.iqbal.nextInt();

        switch (pilihan){
            case 1:
                System.out.println("Masukkan nilai alas");
                float alas = Tugas5_2.iqbal.nextFloat();
                System.out.println("Masukkan nilai tinggi");
                double tinggi = Tugas5_2.iqbal.nextDouble();
                hitungLuasKelilingSegitiga(alas, tinggi);
                break;
            case 2:
                System.out.println("Masukkan nilai alas");
                alas = Tugas5_2.iqbal.nextFloat();
                System.out.println("Masukkan nilai sisi");
                float sisi = Tugas5_2.iqbal.nextFloat();
                hitungLuasKelilingSegitiga(alas, sisi);
                break;
        }
    }

    public static void hitungLuasKelilingSegitiga(float alas, double tinggi){
        double hasilLuas = 0.5 * alas * tinggi;
        double hasilKeliling = alas + alas + alas;
        System.out.println("Hasil luas segitiga "+hasilLuas);
        System.out.println("Hasil keliling segitiga "+hasilKeliling);
    }

    public static void hitungLuasKelilingSegitiga(float alas, float sisi){
        double sqrt = (sisi * sisi)-(0.5 *(alas * alas));
        double tinggi = Math.sqrt(sqrt);
        double hasilLuas = alas * tinggi * 0.5;
        double hasilKeliling = alas + alas + alas;
        System.out.println("Hasil luas segitiga "+hasilLuas);
        System.out.println("Hasil keliling segitiga "+hasilKeliling);
    }
}
