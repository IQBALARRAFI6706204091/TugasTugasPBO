package Minggu2.Tugas2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tugas2_1{

    public static InputStreamReader scan = new InputStreamReader(System.in);
    public static BufferedReader iqbal = new BufferedReader(scan);

    public static ArrayList<Buku> test = new ArrayList<Buku>();

    public static void main(String[] args) throws IOException {
        int pilihan;
        do{
            System.out.println("1.Input data\n2.Cari/Ubah data\n3.Tampilkan data\n4.Hapus data\n5.Keluar");
            pilihan = Integer.parseInt(iqbal.readLine());
            switch (pilihan){
                case 1:
                    inputData();
                    break;
                case 2:
                    cariData();
                    break;
                case 3:
                    tampilkanData();
                    break;
                case 4:
                    hapusData();
                    break;
            }
        }while(pilihan != 5);
    }

    public static void inputData() throws IOException{
        System.out.println("Masukkan ISBN: ");
        String isbn = iqbal.readLine();
        System.out.println("Masukkan judul buku: ");
        String judulBuku = iqbal.readLine();
        System.out.println("Masukkan pengarang: ");
        String pengarang = iqbal.readLine();
        System.out.println("Masukkan tahun terbit: ");
        int tahunTerbit = Integer.parseInt(iqbal.readLine());
        System.out.println("Masukkan harga: ");
        float harga = Float.parseFloat(iqbal.readLine());
        System.out.println("Masukkan rating: ");
        float rating = Float.parseFloat(iqbal.readLine());
        test.add(new Buku(isbn,judulBuku,pengarang,tahunTerbit,harga,rating));
    }

    public static void cariData() throws IOException{
        System.out.println("1.Cari data\n2.Ubah data");
        int pilihan = Integer.parseInt(iqbal.readLine());
        System.out.println("Masukkan ISBN: ");
        String isbn = iqbal.readLine();
        for(Buku buku:test) {
            if (buku.getIsbn().equalsIgnoreCase(isbn)) {
                if (pilihan == 1) {
                    System.out.println(buku + "\n");
                }else if (pilihan == 2) {
                    System.out.println("Ubah judul buku: ");
                    buku.setJudulBuku(iqbal.readLine());
                    System.out.println("Ubah pengarang: ");
                    buku.setPengarang(iqbal.readLine());
                    System.out.println("Ubah tahun terbit: ");
                    buku.setTahunTerbit(Integer.parseInt(iqbal.readLine()));
                    System.out.println("Ubah harga: ");
                    buku.setHarga(Float.parseFloat(iqbal.readLine()));
                    System.out.println("Ubah rating: ");
                    buku.setRating(Float.parseFloat(iqbal.readLine()));
                }
            }
        }
    }
    public static void  tampilkanData(){
        System.out.println();
        for(Buku buku:test){
            System.out.println(buku);
        }
    }
    public static void hapusData() throws IOException{
        System.out.println("Masukkan ISBN: ");
        String isbn = iqbal.readLine();
        for(int i=0;i<test.size();i++){
            if(test.get(i).getIsbn().equalsIgnoreCase(isbn)){
                test.remove(i);
            }
        }
    }
}
