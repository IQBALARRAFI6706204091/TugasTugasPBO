package Tugas5_2;
import java.util.Scanner;

public class Tugas5_2 {

    public static Scanner iqbal =  new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = 0;

        while(pilihan!=2){
            System.out.println("\n1.Hitung luas dan keliling segitiga\n2.keluar\nMasukkan pilihan :");
            pilihan = iqbal.nextInt();
            switch (pilihan){
                case 1:
                    Segitiga.hitungLuasKelilingSegitiga();
                    break;
                case 2:
                    break;
            }
        }
    }
}
